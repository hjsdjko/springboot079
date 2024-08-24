package com.dao;

import com.entity.JieyonglingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieyonglingquVO;
import com.entity.view.JieyonglingquView;


/**
 * 借用领取
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface JieyonglingquDao extends BaseMapper<JieyonglingquEntity> {
	
	List<JieyonglingquVO> selectListVO(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);
	
	JieyonglingquVO selectVO(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);
	
	List<JieyonglingquView> selectListView(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);

	List<JieyonglingquView> selectListView(Pagination page,@Param("ew") Wrapper<JieyonglingquEntity> wrapper);

	
	JieyonglingquView selectView(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);
	

}
