package com.dao;

import com.entity.JieyongguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieyongguihaiVO;
import com.entity.view.JieyongguihaiView;


/**
 * 借用归还
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface JieyongguihaiDao extends BaseMapper<JieyongguihaiEntity> {
	
	List<JieyongguihaiVO> selectListVO(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);
	
	JieyongguihaiVO selectVO(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);
	
	List<JieyongguihaiView> selectListView(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);

	List<JieyongguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);

	
	JieyongguihaiView selectView(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);
	

}
