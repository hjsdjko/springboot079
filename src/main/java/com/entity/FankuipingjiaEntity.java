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
 * 反馈评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@TableName("fankuipingjia")
public class FankuipingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FankuipingjiaEntity() {
		
	}
	
	public FankuipingjiaEntity(T t) {
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
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
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
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
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
