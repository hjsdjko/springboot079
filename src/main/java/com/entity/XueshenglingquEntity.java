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
 * 学生领取
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-13 18:41:40
 */
@TableName("xueshenglingqu")
public class XueshenglingquEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshenglingquEntity() {
		
	}
	
	public XueshenglingquEntity(T t) {
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
