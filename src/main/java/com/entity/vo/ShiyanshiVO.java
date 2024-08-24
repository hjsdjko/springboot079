package com.entity.vo;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验室
 * @author 
 * @email 
 * @date 2024-04-13 18:41:39
 */
public class ShiyanshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 实验室类型
	 */
	
	private String shiyanshileixing;
		
	/**
	 * 规模
	 */
	
	private String guimo;
		
	/**
	 * 实验室地点
	 */
	
	private String shiyanshididian;
		
	/**
	 * 实验室状态
	 */
	
	private String shiyanshizhuangtai;
		
	/**
	 * 设备详情
	 */
	
	private String shebeixiangqing;
		
	/**
	 * 实验室详情
	 */
	
	private String shiyanshixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：实验室类型
	 */
	 
	public void setShiyanshileixing(String shiyanshileixing) {
		this.shiyanshileixing = shiyanshileixing;
	}
	
	/**
	 * 获取：实验室类型
	 */
	public String getShiyanshileixing() {
		return shiyanshileixing;
	}
				
	
	/**
	 * 设置：规模
	 */
	 
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	
	/**
	 * 获取：规模
	 */
	public String getGuimo() {
		return guimo;
	}
				
	
	/**
	 * 设置：实验室地点
	 */
	 
	public void setShiyanshididian(String shiyanshididian) {
		this.shiyanshididian = shiyanshididian;
	}
	
	/**
	 * 获取：实验室地点
	 */
	public String getShiyanshididian() {
		return shiyanshididian;
	}
				
	
	/**
	 * 设置：实验室状态
	 */
	 
	public void setShiyanshizhuangtai(String shiyanshizhuangtai) {
		this.shiyanshizhuangtai = shiyanshizhuangtai;
	}
	
	/**
	 * 获取：实验室状态
	 */
	public String getShiyanshizhuangtai() {
		return shiyanshizhuangtai;
	}
				
	
	/**
	 * 设置：设备详情
	 */
	 
	public void setShebeixiangqing(String shebeixiangqing) {
		this.shebeixiangqing = shebeixiangqing;
	}
	
	/**
	 * 获取：设备详情
	 */
	public String getShebeixiangqing() {
		return shebeixiangqing;
	}
				
	
	/**
	 * 设置：实验室详情
	 */
	 
	public void setShiyanshixiangqing(String shiyanshixiangqing) {
		this.shiyanshixiangqing = shiyanshixiangqing;
	}
	
	/**
	 * 获取：实验室详情
	 */
	public String getShiyanshixiangqing() {
		return shiyanshixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
