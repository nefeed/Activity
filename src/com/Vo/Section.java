package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * 
 * 阶层表
 *
 */
@Entity
@SequenceGenerator(name="SectionSEQ", allocationSize=1, sequenceName="SectionSEQDB")
public class Section {

	private int m_secId;	 	//阶层编号
	private String m_secName;	//阶层名称
	private int m_secType;		//所属曾 0省局 1市局 2县局 3营业点管理员 4营业员
	private int m_secParentId;  //�ϴ����
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="SectionSEQ")				
	public int getM_secId() {
		return m_secId;
	}
	public void setM_secId(int m_secId) {
		this.m_secId = m_secId;
	}
	public String getM_secName() {
		return m_secName;
	}
	public void setM_secName(String m_secName) {
		this.m_secName = m_secName;
	}
	public int getM_secType() {
		return m_secType;
	}
	public void setM_secType(int m_secType) {
		this.m_secType = m_secType;
	}
	
	public int getM_secParentId() {
		return m_secParentId;
	}
	public void setM_secParentId(int m_secParentId) {
		this.m_secParentId = m_secParentId;
	}
}
