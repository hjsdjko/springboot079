package com.entity.view;

import com.entity.FankuipingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 反馈评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@TableName("fankuipingjia")
public class FankuipingjiaView  extends FankuipingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FankuipingjiaView(){
	}
 
 	public FankuipingjiaView(FankuipingjiaEntity fankuipingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, fankuipingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
