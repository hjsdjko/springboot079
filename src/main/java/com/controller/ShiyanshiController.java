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

import com.entity.ShiyanshiEntity;
import com.entity.view.ShiyanshiView;

import com.service.ShiyanshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 实验室
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:39
 */
@RestController
@RequestMapping("/shiyanshi")
public class ShiyanshiController {
    @Autowired
    private ShiyanshiService shiyanshiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiEntity shiyanshi,
		HttpServletRequest request){
        EntityWrapper<ShiyanshiEntity> ew = new EntityWrapper<ShiyanshiEntity>();

		PageUtils page = shiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshiEntity shiyanshi, 
		HttpServletRequest request){
        EntityWrapper<ShiyanshiEntity> ew = new EntityWrapper<ShiyanshiEntity>();

		PageUtils page = shiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiEntity shiyanshi){
       	EntityWrapper<ShiyanshiEntity> ew = new EntityWrapper<ShiyanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshi, "shiyanshi")); 
        return R.ok().put("data", shiyanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiEntity shiyanshi){
        EntityWrapper< ShiyanshiEntity> ew = new EntityWrapper< ShiyanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshi, "shiyanshi")); 
		ShiyanshiView shiyanshiView =  shiyanshiService.selectView(ew);
		return R.ok("查询实验室成功").put("data", shiyanshiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiEntity shiyanshi = shiyanshiService.selectById(id);
		shiyanshi.setClicknum(shiyanshi.getClicknum()+1);
		shiyanshiService.updateById(shiyanshi);
        shiyanshi = shiyanshiService.selectView(new EntityWrapper<ShiyanshiEntity>().eq("id", id));
        return R.ok().put("data", shiyanshi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiEntity shiyanshi = shiyanshiService.selectById(id);
		shiyanshi.setClicknum(shiyanshi.getClicknum()+1);
		shiyanshiService.updateById(shiyanshi);
        shiyanshi = shiyanshiService.selectView(new EntityWrapper<ShiyanshiEntity>().eq("id", id));
        return R.ok().put("data", shiyanshi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShiyanshiEntity shiyanshi = shiyanshiService.selectById(id);
        if(type.equals("1")) {
        	shiyanshi.setThumbsupnum(shiyanshi.getThumbsupnum()+1);
        } else {
        	shiyanshi.setCrazilynum(shiyanshi.getCrazilynum()+1);
        }
        shiyanshiService.updateById(shiyanshi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshi);
        shiyanshiService.insert(shiyanshi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshi);
        shiyanshiService.insert(shiyanshi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshi);
        shiyanshiService.updateById(shiyanshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
