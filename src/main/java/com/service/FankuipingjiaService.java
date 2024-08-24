package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FankuipingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FankuipingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FankuipingjiaView;


/**
 * 反馈评价
 *
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public interface FankuipingjiaService extends IService<FankuipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuipingjiaVO> selectListVO(Wrapper<FankuipingjiaEntity> wrapper);
   	
   	FankuipingjiaVO selectVO(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);
   	
   	List<FankuipingjiaView> selectListView(Wrapper<FankuipingjiaEntity> wrapper);
   	
   	FankuipingjiaView selectView(@Param("ew") Wrapper<FankuipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuipingjiaEntity> wrapper);

   	

}

