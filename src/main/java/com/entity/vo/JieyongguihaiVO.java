package com.entity.vo;

import com.entity.JieyongguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 借用归还
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
public class JieyongguihaiVO  implements Serializable {
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
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 领取时间
	 */
	
	private String lingqushijian;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：领取时间
	 */
	 
	public void setLingqushijian(String lingqushijian) {
		this.lingqushijian = lingqushijian;
	}
	
	/**
	 * 获取：领取时间
	 */
	public String getLingqushijian() {
		return lingqushijian;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
