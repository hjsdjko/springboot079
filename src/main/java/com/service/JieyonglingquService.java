package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieyonglingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieyonglingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieyonglingquView;


/**
 * 借用领取
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface JieyonglingquService extends IService<JieyonglingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieyonglingquVO> selectListVO(Wrapper<JieyonglingquEntity> wrapper);
   	
   	JieyonglingquVO selectVO(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);
   	
   	List<JieyonglingquView> selectListView(Wrapper<JieyonglingquEntity> wrapper);
   	
   	JieyonglingquView selectView(@Param("ew") Wrapper<JieyonglingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieyonglingquEntity> wrapper);

   	

}

