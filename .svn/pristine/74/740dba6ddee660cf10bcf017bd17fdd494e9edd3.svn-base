package com.Vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 * 
 * 员工表
 *
 */
@Entity
@SequenceGenerator(name="UserSEQ", allocationSize=1, sequenceName="UserSEQDB")
public class User {

	private int m_userId;			//用户编号
	private String m_userPhone;		//用户账号
	private String m_userPwd;       //密码
	private String m_userName;      //用户名称
	private int m_userStatr;		//用户状态
	private int m_secId;			//阶层编号
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="UserSEQ")
	public int getM_userId() {
		return m_userId;
	}
	public void setM_userId(int m_userId) {
		this.m_userId = m_userId;
	}
	public String getM_userPhone() {
		return m_userPhone;
	}
	public void setM_userPhone(String m_userPhone) {
		this.m_userPhone = m_userPhone;
	}
	public String getM_userPwd() {
		return m_userPwd;
	}
	public void setM_userPwd(String m_userPwd) {
		this.m_userPwd = m_userPwd;
	}
	public String getM_userName() {
		return m_userName;
	}
	public void setM_userName(String m_userName) {
		this.m_userName = m_userName;
	}
	public int getM_userStatr() {
		return m_userStatr;
	}
	public void setM_userStatr(int m_userStatr) {
		this.m_userStatr = m_userStatr;
	}
	public int getM_secId() {
		return m_secId;
	}
	public void setM_secId(int m_secId) {
		this.m_secId = m_secId;
	}
}
