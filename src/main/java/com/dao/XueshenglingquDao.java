package com.dao;

import com.entity.XueshenglingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshenglingquVO;
import com.entity.view.XueshenglingquView;


/**
 * 学生领取
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface XueshenglingquDao extends BaseMapper<XueshenglingquEntity> {
	
	List<XueshenglingquVO> selectListVO(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);
	
	XueshenglingquVO selectVO(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);
	
	List<XueshenglingquView> selectListView(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);

	List<XueshenglingquView> selectListView(Pagination page,@Param("ew") Wrapper<XueshenglingquEntity> wrapper);

	
	XueshenglingquView selectView(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);
	

}
