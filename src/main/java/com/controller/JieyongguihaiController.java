package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JieyongguihaiEntity;
import com.entity.view.JieyongguihaiView;

import com.service.JieyongguihaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 借用归还
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@RestController
@RequestMapping("/jieyongguihai")
public class JieyongguihaiController {
    @Autowired
    private JieyongguihaiService jieyongguihaiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JieyongguihaiEntity jieyongguihai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jieyongguihai.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JieyongguihaiEntity> ew = new EntityWrapper<JieyongguihaiEntity>();

		PageUtils page = jieyongguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyongguihai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JieyongguihaiEntity jieyongguihai, 
		HttpServletRequest request){
        EntityWrapper<JieyongguihaiEntity> ew = new EntityWrapper<JieyongguihaiEntity>();

		PageUtils page = jieyongguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyongguihai), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JieyongguihaiEntity jieyongguihai){
       	EntityWrapper<JieyongguihaiEntity> ew = new EntityWrapper<JieyongguihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jieyongguihai, "jieyongguihai")); 
        return R.ok().put("data", jieyongguihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JieyongguihaiEntity jieyongguihai){
        EntityWrapper< JieyongguihaiEntity> ew = new EntityWrapper< JieyongguihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jieyongguihai, "jieyongguihai")); 
		JieyongguihaiView jieyongguihaiView =  jieyongguihaiService.selectView(ew);
		return R.ok("查询借用归还成功").put("data", jieyongguihaiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JieyongguihaiEntity jieyongguihai = jieyongguihaiService.selectById(id);
        return R.ok().put("data", jieyongguihai);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JieyongguihaiEntity jieyongguihai = jieyongguihaiService.selectById(id);
        return R.ok().put("data", jieyongguihai);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JieyongguihaiEntity jieyongguihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieyongguihai);
        jieyongguihaiService.insert(jieyongguihai);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JieyongguihaiEntity jieyongguihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieyongguihai);
        jieyongguihaiService.insert(jieyongguihai);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JieyongguihaiEntity jieyongguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jieyongguihai);
        jieyongguihaiService.updateById(jieyongguihai);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<JieyongguihaiEntity> list = new ArrayList<JieyongguihaiEntity>();
        for(Long id : ids) {
            JieyongguihaiEntity jieyongguihai = jieyongguihaiService.selectById(id);
            jieyongguihai.setSfsh(sfsh);
            jieyongguihai.setShhf(shhf);
            list.add(jieyongguihai);
        }
        jieyongguihaiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jieyongguihaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
