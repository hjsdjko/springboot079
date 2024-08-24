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

import com.entity.XueshengguihaiEntity;
import com.entity.view.XueshengguihaiView;

import com.service.XueshengguihaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生归还
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@RestController
@RequestMapping("/xueshengguihai")
public class XueshengguihaiController {
    @Autowired
    private XueshengguihaiService xueshengguihaiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengguihaiEntity xueshengguihai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengguihai.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengguihaiEntity> ew = new EntityWrapper<XueshengguihaiEntity>();

		PageUtils page = xueshengguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengguihai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengguihaiEntity xueshengguihai, 
		HttpServletRequest request){
        EntityWrapper<XueshengguihaiEntity> ew = new EntityWrapper<XueshengguihaiEntity>();

		PageUtils page = xueshengguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengguihai), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengguihaiEntity xueshengguihai){
       	EntityWrapper<XueshengguihaiEntity> ew = new EntityWrapper<XueshengguihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengguihai, "xueshengguihai")); 
        return R.ok().put("data", xueshengguihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengguihaiEntity xueshengguihai){
        EntityWrapper< XueshengguihaiEntity> ew = new EntityWrapper< XueshengguihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengguihai, "xueshengguihai")); 
		XueshengguihaiView xueshengguihaiView =  xueshengguihaiService.selectView(ew);
		return R.ok("查询学生归还成功").put("data", xueshengguihaiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengguihaiEntity xueshengguihai = xueshengguihaiService.selectById(id);
        return R.ok().put("data", xueshengguihai);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengguihaiEntity xueshengguihai = xueshengguihaiService.selectById(id);
        return R.ok().put("data", xueshengguihai);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengguihaiEntity xueshengguihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshengguihai);
        xueshengguihaiService.insert(xueshengguihai);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengguihaiEntity xueshengguihai, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshengguihai);
        xueshengguihaiService.insert(xueshengguihai);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengguihaiEntity xueshengguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengguihai);
        xueshengguihaiService.updateById(xueshengguihai);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<XueshengguihaiEntity> list = new ArrayList<XueshengguihaiEntity>();
        for(Long id : ids) {
            XueshengguihaiEntity xueshengguihai = xueshengguihaiService.selectById(id);
            xueshengguihai.setSfsh(sfsh);
            xueshengguihai.setShhf(shhf);
            list.add(xueshengguihai);
        }
        xueshengguihaiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengguihaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
