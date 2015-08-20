package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * 
 * 活动结构表
 *
 */
@Entity
@SequenceGenerator(name="FormationSEQ", allocationSize=1, sequenceName="FormationSEQDB")
public class Formation {

	private int m_formId;		//结构编号
	private int m_parentId;		//父节点编号
	private int m_childId;		//子节点编号
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="FormationSEQ")
	public int getM_formId() {
		return m_formId;
	}
	public void setM_formId(int m_formId) {
		this.m_formId = m_formId;
	}
	public int getM_parentId() {
		return m_parentId;
	}
	public void setM_parentId(int m_parentId) {
		this.m_parentId = m_parentId;
	}
	public int getM_childId() {
		return m_childId;
	}
	public void setM_childId(int m_childId) {
		this.m_childId = m_childId;
	}
	
	
}
