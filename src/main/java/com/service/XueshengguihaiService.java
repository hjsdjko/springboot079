package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengguihaiView;


/**
 * 学生归还
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface XueshengguihaiService extends IService<XueshengguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengguihaiVO> selectListVO(Wrapper<XueshengguihaiEntity> wrapper);
   	
   	XueshengguihaiVO selectVO(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);
   	
   	List<XueshengguihaiView> selectListView(Wrapper<XueshengguihaiEntity> wrapper);
   	
   	XueshengguihaiView selectView(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengguihaiEntity> wrapper);

   	

}

