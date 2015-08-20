package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 客户表
 *
 */
@Entity
@SequenceGenerator(name="CustomerSEQ", allocationSize=1, sequenceName="CustomerSEQDB")
public class Customer {
	private int m_cusId;		 //客户编号
	private String m_cusName;	 //客户姓名
	private int m_cusType;		 //客户状态 0正常 1已删除
	private String m_cusAddress; //地址
	private String m_cusTel;	 //联系电话
	private int m_secId; 		 //所属哪个营业厅管辖
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="CustomerSEQ")
	public int getM_cusId() {
		return m_cusId;
	}
	public void setM_cusId(int m_cusId) {
		this.m_cusId = m_cusId;
	}
	public String getM_cusName() {
		return m_cusName;
	}
	public void setM_cusName(String m_cusName) {
		this.m_cusName = m_cusName;
	}
	public int getM_cusType() {
		return m_cusType;
	}
	public void setM_cusType(int m_cusType) {
		this.m_cusType = m_cusType;
	}
	public String getM_cusAddress() {
		return m_cusAddress;
	}
	public void setM_cusAddress(String m_cusAddress) {
		this.m_cusAddress = m_cusAddress;
	}
	public String getM_cusTel() {
		return m_cusTel;
	}
	public void setM_cusTel(String m_cusTel) {
		this.m_cusTel = m_cusTel;
	}
	public int getM_secId() {
		return m_secId;
	}
	public void setM_secId(int mSecId) {
		m_secId = mSecId;
	}
}
