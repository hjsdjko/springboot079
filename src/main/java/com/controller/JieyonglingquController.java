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

import com.entity.JieyonglingquEntity;
import com.entity.view.JieyonglingquView;

import com.service.JieyonglingquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 借用领取
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@RestController
@RequestMapping("/jieyonglingqu")
public class JieyonglingquController {
    @Autowired
    private JieyonglingquService jieyonglingquService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JieyonglingquEntity jieyonglingqu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jieyonglingqu.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JieyonglingquEntity> ew = new EntityWrapper<JieyonglingquEntity>();

		PageUtils page = jieyonglingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyonglingqu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JieyonglingquEntity jieyonglingqu, 
		HttpServletRequest request){
        EntityWrapper<JieyonglingquEntity> ew = new EntityWrapper<JieyonglingquEntity>();

		PageUtils page = jieyonglingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyonglingqu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JieyonglingquEntity jieyonglingqu){
       	EntityWrapper<JieyonglingquEntity> ew = new EntityWrapper<JieyonglingquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jieyonglingqu, "jieyonglingqu")); 
        return R.ok().put("data", jieyonglingquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JieyonglingquEntity jieyonglingqu){
        EntityWrapper< JieyonglingquEntity> ew = new EntityWrapper< JieyonglingquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jieyonglingqu, "jieyonglingqu")); 
		JieyonglingquView jieyonglingquView =  jieyonglingquService.selectView(ew);
		return R.ok("查询借用领取成功").put("data", jieyonglingquView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JieyonglingquEntity jieyonglingqu = jieyonglingquService.selectById(id);
        return R.ok().put("data", jieyonglingqu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JieyonglingquEntity jieyonglingqu = jieyonglingquService.selectById(id);
        return R.ok().put("data", jieyonglingqu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JieyonglingquEntity jieyonglingqu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieyonglingqu);
        jieyonglingquService.insert(jieyonglingqu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JieyonglingquEntity jieyonglingqu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieyonglingqu);
        jieyonglingquService.insert(jieyonglingqu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JieyonglingquEntity jieyonglingqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jieyonglingqu);
        jieyonglingquService.updateById(jieyonglingqu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jieyonglingquService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
