package com.dao;

import com.entity.DiscussshiyanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshiyanshiVO;
import com.entity.view.DiscussshiyanshiView;


/**
 * 实验室评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:41
 */
public interface DiscussshiyanshiDao extends BaseMapper<DiscussshiyanshiEntity> {
	
	List<DiscussshiyanshiVO> selectListVO(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);
	
	DiscussshiyanshiVO selectVO(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);
	
	List<DiscussshiyanshiView> selectListView(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);

	List<DiscussshiyanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);

	
	DiscussshiyanshiView selectView(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);
	

}
