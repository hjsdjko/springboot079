package com.entity.view;

import com.entity.JieyongguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 借用归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@TableName("jieyongguihai")
public class JieyongguihaiView  extends JieyongguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JieyongguihaiView(){
	}
 
 	public JieyongguihaiView(JieyongguihaiEntity jieyongguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, jieyongguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
