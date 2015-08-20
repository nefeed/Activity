package com.Vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 附件表
 *
 */
@Entity
@SequenceGenerator(name="AccessorySEQ", allocationSize=1, sequenceName="AccessorySEQDB")
public class Accessory {

	private int m_accId;			 //附件编号
	private String m_accImage;		 //附件存储地址
	private int m_retId;			 //回复编号
	private String m_accDescribe;	 //附件描述
	private String m_accAddress;     //回复地点
	private String m_accContent;     //附件描述
	private int m_accType;           //状态 0未发布 1已发布
	private Date m_createTime;       //创建时间
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="AccessorySEQ")
	public int getM_accId() {
		return m_accId;
	}
	public void setM_accId(int m_accId) {
		this.m_accId = m_accId;
	}
	public String getM_accImage() {
		return m_accImage;
	}
	public void setM_accImage(String m_accImage) {
		this.m_accImage = m_accImage;
	}
	public int getM_retId() {
		return m_retId;
	}
	public void setM_retId(int m_retId) {
		this.m_retId = m_retId;
	}
	public String getM_accDescribe() {
		return m_accDescribe;
	}
	public void setM_accDescribe(String m_accDescribe) {
		this.m_accDescribe = m_accDescribe;
	}
	public String getM_accAddress() {
		return m_accAddress;
	}
	public void setM_accAddress(String m_accAddress) {
		this.m_accAddress = m_accAddress;
	}
	public String getM_accContent() {
		return m_accContent;
	}
	public void setM_accContent(String m_accContent) {
		this.m_accContent = m_accContent;
	}
	public int getM_accType() {
		return m_accType;
	}
	public void setM_accType(int m_accType) {
		this.m_accType = m_accType;
	}
	public Date getM_createTime() {
		return m_createTime;
	}
	public void setM_createTime(Date m_createTime) {
		this.m_createTime = m_createTime;
	}
}
