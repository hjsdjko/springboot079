package com.entity.view;

import com.entity.XueshengguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学生归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@TableName("xueshengguihai")
public class XueshengguihaiView  extends XueshengguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengguihaiView(){
	}
 
 	public XueshengguihaiView(XueshengguihaiEntity xueshengguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
