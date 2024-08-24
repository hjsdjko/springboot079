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

import com.entity.ShiyanshiyuyueEntity;
import com.entity.view.ShiyanshiyuyueView;

import com.service.ShiyanshiyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室预约
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-13 18:41:39
 */
@RestController
@RequestMapping("/shiyanshiyuyue")
public class ShiyanshiyuyueController {
    @Autowired
    private ShiyanshiyuyueService shiyanshiyuyueService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiyuyueEntity shiyanshiyuyue,
		HttpServletRequest request){
        if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
            shiyanshiyuyue.setUserid((Long)request.getSession().getAttribute("userId"));
        }
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();

		PageUtils page = shiyanshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshiyuyueEntity shiyanshiyuyue, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		shiyanshiyuyue.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();

		PageUtils page = shiyanshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiyuyue), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiyuyueEntity shiyanshiyuyue){
       	EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshiyuyue, "shiyanshiyuyue")); 
        return R.ok().put("data", shiyanshiyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiyuyueEntity shiyanshiyuyue){
        EntityWrapper< ShiyanshiyuyueEntity> ew = new EntityWrapper< ShiyanshiyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshiyuyue, "shiyanshiyuyue")); 
		ShiyanshiyuyueView shiyanshiyuyueView =  shiyanshiyuyueService.selectView(ew);
		return R.ok("查询实验室预约成功").put("data", shiyanshiyuyueView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiyuyueEntity shiyanshiyuyue = shiyanshiyuyueService.selectById(id);
        return R.ok().put("data", shiyanshiyuyue);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiyuyueEntity shiyanshiyuyue = shiyanshiyuyueService.selectById(id);
        return R.ok().put("data", shiyanshiyuyue);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshiyuyueEntity shiyanshiyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshiyuyue);
    	shiyanshiyuyue.setUserid((Long)request.getSession().getAttribute("userId"));
        shiyanshiyuyueService.insert(shiyanshiyuyue);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiyuyueEntity shiyanshiyuyue, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshiyuyue);
    	shiyanshiyuyue.setUserid((Long)request.getSession().getAttribute("userId"));
        shiyanshiyuyueService.insert(shiyanshiyuyue);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanshiyuyueEntity shiyanshiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiyuyue);
        shiyanshiyuyueService.updateById(shiyanshiyuyue);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShiyanshiyuyueEntity> list = new ArrayList<ShiyanshiyuyueEntity>();
        for(Long id : ids) {
            ShiyanshiyuyueEntity shiyanshiyuyue = shiyanshiyuyueService.selectById(id);
            shiyanshiyuyue.setSfsh(sfsh);
            shiyanshiyuyue.setShhf(shhf);
            list.add(shiyanshiyuyue);
        }
        shiyanshiyuyueService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanshiyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        List<Map<String, Object>> result = shiyanshiyuyueService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = shiyanshiyuyueService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        List<Map<String, Object>> result = shiyanshiyuyueService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = shiyanshiyuyueService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        List<Map<String, Object>> result = shiyanshiyuyueService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,ShiyanshiyuyueEntity shiyanshiyuyue, HttpServletRequest request){
        EntityWrapper<ShiyanshiyuyueEntity> ew = new EntityWrapper<ShiyanshiyuyueEntity>();
        int count = shiyanshiyuyueService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiyuyue), params), params));
        return R.ok().put("data", count);
    }



}
