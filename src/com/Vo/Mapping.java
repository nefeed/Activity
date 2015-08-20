package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 员工客户对应表
 *
 */
@Entity
@SequenceGenerator(name="MappingSEQ", allocationSize=1, sequenceName="MappingSEQDVB")
public class Mapping {
	private int m_mapId;	    //对应编号
	private int m_planId;		//活动编号
	private int m_userId;		//员工编号
	private int m_cusId;		//客户编号
	private int m_busSecId;    //营业厅阶层编号
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="MappingSEQ")
	public int getM_mapId() {
		return m_mapId;
	}
	public void setM_mapId(int m_mapId) {
		this.m_mapId = m_mapId;
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
	public int getM_cusId() {
		return m_cusId;
	}
	public void setM_cusId(int m_cusId) {
		this.m_cusId = m_cusId;
	}
	public int getM_busSecId() {
		return m_busSecId;
	}
	public void setM_busSecId(int mBusSecId) {
		m_busSecId = mBusSecId;
	}
}
