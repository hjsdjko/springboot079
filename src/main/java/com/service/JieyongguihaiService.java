package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieyongguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieyongguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieyongguihaiView;


/**
 * 借用归还
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface JieyongguihaiService extends IService<JieyongguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieyongguihaiVO> selectListVO(Wrapper<JieyongguihaiEntity> wrapper);
   	
   	JieyongguihaiVO selectVO(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);
   	
   	List<JieyongguihaiView> selectListView(Wrapper<JieyongguihaiEntity> wrapper);
   	
   	JieyongguihaiView selectView(@Param("ew") Wrapper<JieyongguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieyongguihaiEntity> wrapper);

   	

}

