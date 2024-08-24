package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实验室预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:39
 */
@TableName("shiyanshiyuyue")
public class ShiyanshiyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshiyuyueEntity() {
		
	}
	
	public ShiyanshiyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 实验室号
	 */
					
	private String shiyanshihao;
	
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
	 * 设备详情
	 */
					
	private String shebeixiangqing;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 预约账号
	 */
					
	private String yuyuezhanghao;
	
	/**
	 * 预约人
	 */
					
	private String yuyueren;
	
	/**
	 * 用户类型
	 */
					
	private String yonghuleixing;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：实验室号
	 */
	public void setShiyanshihao(String shiyanshihao) {
		this.shiyanshihao = shiyanshihao;
	}
	/**
	 * 获取：实验室号
	 */
	public String getShiyanshihao() {
		return shiyanshihao;
	}
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
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：预约账号
	 */
	public void setYuyuezhanghao(String yuyuezhanghao) {
		this.yuyuezhanghao = yuyuezhanghao;
	}
	/**
	 * 获取：预约账号
	 */
	public String getYuyuezhanghao() {
		return yuyuezhanghao;
	}
	/**
	 * 设置：预约人
	 */
	public void setYuyueren(String yuyueren) {
		this.yuyueren = yuyueren;
	}
	/**
	 * 获取：预约人
	 */
	public String getYuyueren() {
		return yuyueren;
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
