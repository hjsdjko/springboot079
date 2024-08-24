package com.dao;

import com.entity.XueshengguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengguihaiVO;
import com.entity.view.XueshengguihaiView;


/**
 * 学生归还
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface XueshengguihaiDao extends BaseMapper<XueshengguihaiEntity> {
	
	List<XueshengguihaiVO> selectListVO(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);
	
	XueshengguihaiVO selectVO(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);
	
	List<XueshengguihaiView> selectListView(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);

	List<XueshengguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);

	
	XueshengguihaiView selectView(@Param("ew") Wrapper<XueshengguihaiEntity> wrapper);
	

}
