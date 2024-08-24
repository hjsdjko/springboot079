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

import com.entity.DiscussshebeixinxiEntity;
import com.entity.view.DiscussshebeixinxiView;

import com.service.DiscussshebeixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:41
 */
@RestController
@RequestMapping("/discussshebeixinxi")
public class DiscussshebeixinxiController {
    @Autowired
    private DiscussshebeixinxiService discussshebeixinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshebeixinxiEntity discussshebeixinxi,
		HttpServletRequest request){
        EntityWrapper<DiscussshebeixinxiEntity> ew = new EntityWrapper<DiscussshebeixinxiEntity>();

		PageUtils page = discussshebeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshebeixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshebeixinxiEntity discussshebeixinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussshebeixinxiEntity> ew = new EntityWrapper<DiscussshebeixinxiEntity>();

		PageUtils page = discussshebeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshebeixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshebeixinxiEntity discussshebeixinxi){
       	EntityWrapper<DiscussshebeixinxiEntity> ew = new EntityWrapper<DiscussshebeixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshebeixinxi, "discussshebeixinxi")); 
        return R.ok().put("data", discussshebeixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshebeixinxiEntity discussshebeixinxi){
        EntityWrapper< DiscussshebeixinxiEntity> ew = new EntityWrapper< DiscussshebeixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshebeixinxi, "discussshebeixinxi")); 
		DiscussshebeixinxiView discussshebeixinxiView =  discussshebeixinxiService.selectView(ew);
		return R.ok("查询设备信息评论表成功").put("data", discussshebeixinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshebeixinxiEntity discussshebeixinxi = discussshebeixinxiService.selectById(id);
        return R.ok().put("data", discussshebeixinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshebeixinxiEntity discussshebeixinxi = discussshebeixinxiService.selectById(id);
        return R.ok().put("data", discussshebeixinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshebeixinxiEntity discussshebeixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussshebeixinxi);
        discussshebeixinxiService.insert(discussshebeixinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshebeixinxiEntity discussshebeixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussshebeixinxi);
        discussshebeixinxiService.insert(discussshebeixinxi);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussshebeixinxiEntity discussshebeixinxi = discussshebeixinxiService.selectOne(new EntityWrapper<DiscussshebeixinxiEntity>().eq("", username));
        return R.ok().put("data", discussshebeixinxi);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussshebeixinxiEntity discussshebeixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshebeixinxi);
        discussshebeixinxiService.updateById(discussshebeixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshebeixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussshebeixinxiEntity discussshebeixinxi, HttpServletRequest request,String pre){
        EntityWrapper<DiscussshebeixinxiEntity> ew = new EntityWrapper<DiscussshebeixinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussshebeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshebeixinxi), params), params));
        return R.ok().put("data", page);
    }










}
