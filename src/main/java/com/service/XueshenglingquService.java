package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshenglingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshenglingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshenglingquView;


/**
 * 学生领取
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface XueshenglingquService extends IService<XueshenglingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshenglingquVO> selectListVO(Wrapper<XueshenglingquEntity> wrapper);
   	
   	XueshenglingquVO selectVO(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);
   	
   	List<XueshenglingquView> selectListView(Wrapper<XueshenglingquEntity> wrapper);
   	
   	XueshenglingquView selectView(@Param("ew") Wrapper<XueshenglingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshenglingquEntity> wrapper);

   	

}

