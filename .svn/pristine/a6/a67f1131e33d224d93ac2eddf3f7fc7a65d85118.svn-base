package com.Vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 活动回复表
 *
 */
@Entity
@SequenceGenerator(name="ActreturnSEQ", allocationSize=1, sequenceName="ActreturnSEQDB")
public class Actreturn {

	 private int m_retId;				//回复编号
	 private  int m_secId;				//阶层编号
	 private int m_planId;				//活动编号
	 private int m_userId;				//用户
	
	 
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="ActreturnSEQ")
	public int getM_retId() {
		return m_retId;
	}
	public void setM_retId(int m_retId) {
		this.m_retId = m_retId;
	}
	public int getM_secId() {
		return m_secId;
	}
	public void setM_secId(int m_secId) {
		this.m_secId = m_secId;
	}
	public int getM_planId() {
		return m_planId;
	}
	public void setM_planId(int m_planId) {
		this.m_planId = m_planId;
	}
	public int getM_userId() {
		return m_userId;
	}
	public void setM_userId(int m_userId) {
		this.m_userId = m_userId;
	}

	 
	 
}
