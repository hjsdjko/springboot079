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

import com.entity.XueshenglingquEntity;
import com.entity.view.XueshenglingquView;

import com.service.XueshenglingquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生领取
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@RestController
@RequestMapping("/xueshenglingqu")
public class XueshenglingquController {
    @Autowired
    private XueshenglingquService xueshenglingquService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshenglingquEntity xueshenglingqu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshenglingqu.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshenglingquEntity> ew = new EntityWrapper<XueshenglingquEntity>();

		PageUtils page = xueshenglingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenglingqu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshenglingquEntity xueshenglingqu, 
		HttpServletRequest request){
        EntityWrapper<XueshenglingquEntity> ew = new EntityWrapper<XueshenglingquEntity>();

		PageUtils page = xueshenglingquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenglingqu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshenglingquEntity xueshenglingqu){
       	EntityWrapper<XueshenglingquEntity> ew = new EntityWrapper<XueshenglingquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshenglingqu, "xueshenglingqu")); 
        return R.ok().put("data", xueshenglingquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshenglingquEntity xueshenglingqu){
        EntityWrapper< XueshenglingquEntity> ew = new EntityWrapper< XueshenglingquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshenglingqu, "xueshenglingqu")); 
		XueshenglingquView xueshenglingquView =  xueshenglingquService.selectView(ew);
		return R.ok("查询学生领取成功").put("data", xueshenglingquView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshenglingquEntity xueshenglingqu = xueshenglingquService.selectById(id);
        return R.ok().put("data", xueshenglingqu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshenglingquEntity xueshenglingqu = xueshenglingquService.selectById(id);
        return R.ok().put("data", xueshenglingqu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshenglingquEntity xueshenglingqu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshenglingqu);
        xueshenglingquService.insert(xueshenglingqu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshenglingquEntity xueshenglingqu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshenglingqu);
        xueshenglingquService.insert(xueshenglingqu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshenglingquEntity xueshenglingqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshenglingqu);
        xueshenglingquService.updateById(xueshenglingqu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshenglingquService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
