package com.Vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 活动计划表
 *
 */
@Entity
@SequenceGenerator(name="ActplanSEQ", allocationSize=1, sequenceName="ActplanSEQDB")
public class Actplan {

	private int m_planId;				//计划编号
	private int m_createId;				//创建者编号(省局的编号）
	private String m_planName;			//活动名称
	private String m_planGoal;			//活动目的
	private String m_planContent;		//活动计划内容
	private String m_address;			//地址
	private double m_planBudget;		//预算
	private int m_publishId;			//发布者编号  （发布这条活动的用户Id)
	private Date m_createDate;			//创建时间
	private int m_planType;			    //发布状态  0未发布 1已发布 2已结束
	private int m_planMold;             //活动类型 0普通活动 1走访活动
	private int m_secId;			    //阶层编号
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="ActplanSEQ")
	public int getM_planId() {
		return m_planId;
	}
	public void setM_planId(int m_planId) {
		this.m_planId = m_planId;
	}
	
	public int getM_createId() {
		return m_createId;
	}
	public void setM_createId(int m_createId) {
		this.m_createId = m_createId;
	}
	public String getM_planName() {
		return m_planName;
	}
	public void setM_planName(String m_planName) {
		this.m_planName = m_planName;
	}
	public String getM_planGoal() {
		return m_planGoal;
	}
	public void setM_planGoal(String m_planGoal) {
		this.m_planGoal = m_planGoal;
	}
	public String getM_planContent() {
		return m_planContent;
	}
	public void setM_planContent(String m_planContent) {
		this.m_planContent = m_planContent;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public double getM_planBudget() {
		return m_planBudget;
	}
	public void setM_planBudget(double m_planBudget) {
		this.m_planBudget = m_planBudget;
	}
	public int getM_publishId() {
		return m_publishId;
	}
	public void setM_publishId(int m_publishId) {
		this.m_publishId = m_publishId;
	}
	public Date getM_createDate() {
		return m_createDate;
	}
	public void setM_createDate(Date m_createDate) {
		this.m_createDate = m_createDate;
	}
	public int getM_planType() {
		return m_planType;
	}
	public void setM_planType(int m_planType) {
		this.m_planType = m_planType;
	}
	
	public int getM_secId() {
		return m_secId;
	}
	public void setM_secId(int m_secId) {
		this.m_secId = m_secId;
	}
	public int getM_planMold() {
		return m_planMold;
	}
	public void setM_planMold(int m_planMold) {
		this.m_planMold = m_planMold;
	}
	
	
	
	
}
