package com.entity.model;

import com.entity.XueshenglingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生领取
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public class XueshenglingquModel  implements Serializable {
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
	 * 设备类型
	 */
	
	private String shebeileixing;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 存放位置
	 */
	
	private String cunfangweizhi;
		
	/**
	 * 功能
	 */
	
	private String gongneng;
		
	/**
	 * 借用时间
	 */
	
	private String jieyongshijian;
		
	/**
	 * 借出用途
	 */
	
	private String jiechuyongtu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 归还状态
	 */
	
	private String guihaizhuangtai;
		
	/**
	 * 领取时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lingqushijian;
				
	
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
	 * 设置：设备类型
	 */
	 
	public void setShebeileixing(String shebeileixing) {
		this.shebeileixing = shebeileixing;
	}
	
	/**
	 * 获取：设备类型
	 */
	public String getShebeileixing() {
		return shebeileixing;
	}
				
	
	/**
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：存放位置
	 */
	 
	public void setCunfangweizhi(String cunfangweizhi) {
		this.cunfangweizhi = cunfangweizhi;
	}
	
	/**
	 * 获取：存放位置
	 */
	public String getCunfangweizhi() {
		return cunfangweizhi;
	}
				
	
	/**
	 * 设置：功能
	 */
	 
	public void setGongneng(String gongneng) {
		this.gongneng = gongneng;
	}
	
	/**
	 * 获取：功能
	 */
	public String getGongneng() {
		return gongneng;
	}
				
	
	/**
	 * 设置：借用时间
	 */
	 
	public void setJieyongshijian(String jieyongshijian) {
		this.jieyongshijian = jieyongshijian;
	}
	
	/**
	 * 获取：借用时间
	 */
	public String getJieyongshijian() {
		return jieyongshijian;
	}
				
	
	/**
	 * 设置：借出用途
	 */
	 
	public void setJiechuyongtu(String jiechuyongtu) {
		this.jiechuyongtu = jiechuyongtu;
	}
	
	/**
	 * 获取：借出用途
	 */
	public String getJiechuyongtu() {
		return jiechuyongtu;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：归还状态
	 */
	 
	public void setGuihaizhuangtai(String guihaizhuangtai) {
		this.guihaizhuangtai = guihaizhuangtai;
	}
	
	/**
	 * 获取：归还状态
	 */
	public String getGuihaizhuangtai() {
		return guihaizhuangtai;
	}
				
	
	/**
	 * 设置：领取时间
	 */
	 
	public void setLingqushijian(Date lingqushijian) {
		this.lingqushijian = lingqushijian;
	}
	
	/**
	 * 获取：领取时间
	 */
	public Date getLingqushijian() {
		return lingqushijian;
	}
			
}