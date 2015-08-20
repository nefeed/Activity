package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 已发布活动表
 *
 */
@Entity

@SequenceGenerator(name="HavedoneSEQ", allocationSize=1, sequenceName="HavedoneSEQDVB")
public class Havedone {
	private int m_haveId;
	private int m_userId;
	private int m_planId;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="HavedoneSEQ")
	public int getM_haveId() {
		return m_haveId;
	}
	public void setM_haveId(int mHaveId) {
		m_haveId = mHaveId;
	}
	public int getM_userId() {
		return m_userId;
	}
	public void setM_userId(int mUserId) {
		m_userId = mUserId;
	}
	public int getM_planId() {
		return m_planId;
	}
	public void setM_planId(int mPlanId) {
		m_planId = mPlanId;
	}
	
}
