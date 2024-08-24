package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshebeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshebeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshebeixinxiView;


/**
 * 设备信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:41
 */
public interface DiscussshebeixinxiService extends IService<DiscussshebeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshebeixinxiVO> selectListVO(Wrapper<DiscussshebeixinxiEntity> wrapper);
   	
   	DiscussshebeixinxiVO selectVO(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);
   	
   	List<DiscussshebeixinxiView> selectListView(Wrapper<DiscussshebeixinxiEntity> wrapper);
   	
   	DiscussshebeixinxiView selectView(@Param("ew") Wrapper<DiscussshebeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshebeixinxiEntity> wrapper);

   	

}

