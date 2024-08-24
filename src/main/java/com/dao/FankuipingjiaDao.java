package com.dao;

import com.entity.FankuipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FankuipingjiaVO;
import com.entity.view.FankuipingjiaView;


/**
 * 反馈评价
 * 
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface FankuipingjiaDao extends BaseMapper<FankuipingjiaEntity> {
	
	List<FankuipingjiaVO> selectListVO(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);
	
	FankuipingjiaVO selectVO(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);
	
	List<FankuipingjiaView> selectListView(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);

	List<FankuipingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);

	
	FankuipingjiaView selectView(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);
	

}
