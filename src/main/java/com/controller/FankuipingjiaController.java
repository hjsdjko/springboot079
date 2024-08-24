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

import com.entity.FankuipingjiaEntity;
import com.entity.view.FankuipingjiaView;

import com.service.FankuipingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 反馈评价
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@RestController
@RequestMapping("/fankuipingjia")
public class FankuipingjiaController {
    @Autowired
    private FankuipingjiaService fankuipingjiaService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FankuipingjiaEntity fankuipingjia,
		HttpServletRequest request){
        if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
            fankuipingjia.setUserid((Long)request.getSession().getAttribute("userId"));
        }
        EntityWrapper<FankuipingjiaEntity> ew = new EntityWrapper<FankuipingjiaEntity>();

		PageUtils page = fankuipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuipingjia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FankuipingjiaEntity fankuipingjia, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		fankuipingjia.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<FankuipingjiaEntity> ew = new EntityWrapper<FankuipingjiaEntity>();

		PageUtils page = fankuipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuipingjia), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FankuipingjiaEntity fankuipingjia){
       	EntityWrapper<FankuipingjiaEntity> ew = new EntityWrapper<FankuipingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fankuipingjia, "fankuipingjia")); 
        return R.ok().put("data", fankuipingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FankuipingjiaEntity fankuipingjia){
        EntityWrapper< FankuipingjiaEntity> ew = new EntityWrapper< FankuipingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fankuipingjia, "fankuipingjia")); 
		FankuipingjiaView fankuipingjiaView =  fankuipingjiaService.selectView(ew);
		return R.ok("查询反馈评价成功").put("data", fankuipingjiaView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FankuipingjiaEntity fankuipingjia = fankuipingjiaService.selectById(id);
        return R.ok().put("data", fankuipingjia);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FankuipingjiaEntity fankuipingjia = fankuipingjiaService.selectById(id);
        return R.ok().put("data", fankuipingjia);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FankuipingjiaEntity fankuipingjia, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fankuipingjia);
    	fankuipingjia.setUserid((Long)request.getSession().getAttribute("userId"));
        fankuipingjiaService.insert(fankuipingjia);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FankuipingjiaEntity fankuipingjia, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fankuipingjia);
    	fankuipingjia.setUserid((Long)request.getSession().getAttribute("userId"));
        fankuipingjiaService.insert(fankuipingjia);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FankuipingjiaEntity fankuipingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fankuipingjia);
        fankuipingjiaService.updateById(fankuipingjia);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fankuipingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
