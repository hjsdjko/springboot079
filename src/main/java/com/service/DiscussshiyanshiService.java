package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiyanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiyanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiyanshiView;


/**
 * 实验室评论表
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:41
 */
public interface DiscussshiyanshiService extends IService<DiscussshiyanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyanshiVO> selectListVO(Wrapper<DiscussshiyanshiEntity> wrapper);
   	
   	DiscussshiyanshiVO selectVO(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);
   	
   	List<DiscussshiyanshiView> selectListView(Wrapper<DiscussshiyanshiEntity> wrapper);
   	
   	DiscussshiyanshiView selectView(@Param("ew") Wrapper<DiscussshiyanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiyanshiEntity> wrapper);

   	

}

