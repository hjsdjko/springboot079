package com.dao;

import com.entity.DiscussshebeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshebeixinxiVO;
import com.entity.view.DiscussshebeixinxiView;


/**
 * 设备信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:41
 */
public interface DiscussshebeixinxiDao extends BaseMapper<DiscussshebeixinxiEntity> {
	
	List<DiscussshebeixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);
	
	DiscussshebeixinxiVO selectVO(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);
	
	List<DiscussshebeixinxiView> selectListView(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);

	List<DiscussshebeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);

	
	DiscussshebeixinxiView selectView(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);
	

}
