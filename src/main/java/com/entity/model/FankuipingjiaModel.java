package com.entity.model;

import com.entity.FankuipingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 反馈评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public class FankuipingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 设备图片
	 */
	
	private String shebeitupian;
		
	/**
	 * 使用情况
	 */
	
	private String shiyongqingkuang;
		
	/**
	 * 设备评价
	 */
	
	private String shebeipingjia;
		
	/**
	 * 反馈时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fankuishijian;
		
	/**
	 * 反馈账号
	 */
	
	private String fankuizhanghao;
		
	/**
	 * 反馈人
	 */
	
	private String fankuiren;
		
	/**
	 * 用户类型
	 */
	
	private String yonghuleixing;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备图片
	 */
	 
	public void setShebeitupian(String shebeitupian) {
		this.shebeitupian = shebeitupian;
	}
	
	/**
	 * 获取：设备图片
	 */
	public String getShebeitupian() {
		return shebeitupian;
	}
				
	
	/**
	 * 设置：使用情况
	 */
	 
	public void setShiyongqingkuang(String shiyongqingkuang) {
		this.shiyongqingkuang = shiyongqingkuang;
	}
	
	/**
	 * 获取：使用情况
	 */
	public String getShiyongqingkuang() {
		return shiyongqingkuang;
	}
				
	
	/**
	 * 设置：设备评价
	 */
	 
	public void setShebeipingjia(String shebeipingjia) {
		this.shebeipingjia = shebeipingjia;
	}
	
	/**
	 * 获取：设备评价
	 */
	public String getShebeipingjia() {
		return shebeipingjia;
	}
				
	
	/**
	 * 设置：反馈时间
	 */
	 
	public void setFankuishijian(Date fankuishijian) {
		this.fankuishijian = fankuishijian;
	}
	
	/**
	 * 获取：反馈时间
	 */
	public Date getFankuishijian() {
		return fankuishijian;
	}
				
	
	/**
	 * 设置：反馈账号
	 */
	 
	public void setFankuizhanghao(String fankuizhanghao) {
		this.fankuizhanghao = fankuizhanghao;
	}
	
	/**
	 * 获取：反馈账号
	 */
	public String getFankuizhanghao() {
		return fankuizhanghao;
	}
				
	
	/**
	 * 设置：反馈人
	 */
	 
	public void setFankuiren(String fankuiren) {
		this.fankuiren = fankuiren;
	}
	
	/**
	 * 获取：反馈人
	 */
	public String getFankuiren() {
		return fankuiren;
	}
				
	
	/**
	 * 设置：用户类型
	 */
	 
	public void setYonghuleixing(String yonghuleixing) {
		this.yonghuleixing = yonghuleixing;
	}
	
	/**
	 * 获取：用户类型
	 */
	public String getYonghuleixing() {
		return yonghuleixing;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
