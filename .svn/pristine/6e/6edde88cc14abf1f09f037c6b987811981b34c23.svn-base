package com.Tools;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.Bll.BllActplan;
import com.Bll.BllActreturn;
import com.Bll.BllHavedone;
import com.Factory.HibernateSessionFactory;
import com.Vo.Havedone;
import com.Vo.Mapping;
public class test {
	
	@Test
	public void test1(){
		Mapping m = new Mapping();
		Session s = HibernateSessionFactory.getSession();
		s.clear();
		s.beginTransaction();
		m.setM_cusId(1);
		m.setM_mapId(1);
		m.setM_planId(1);
		m.setM_userId(1);
		s.save(m);
		s.getTransaction().commit();
		
	}
	
	@Test
	public void delete(){
		Session s = HibernateSessionFactory.getSession();
		s.clear();
		s.beginTransaction();
		String sql = "delete from Receive where m_planId=2";
		Query query = s.createQuery(sql);
		int row = query.executeUpdate();
		System.out.println("Delete Receive remove count:"+row);
		s.getTransaction().commit();
	}
	
	@Test
	public void addActplan(){
		BllActplan bllActplan = new BllActplan();
		int m_createId = 1;
		String m_planName = "把4G带进高校";
		String m_planGoal = "实现大学生4G风潮";
		String m_planContent = "实现4G占比达到30%";
		String m_address = "宁波全地区";
		double m_planBudget = 50000;
		int m_publishId = 1;
		Date m_createDate = new Date();
		int m_planType = 1;
		int m_planMold = 0;
		int m_secId = 1;
		int[] m_receive = new int[3];
		m_receive[0] = 2;
		boolean check = bllActplan.CreateActplan(m_createId, m_planName, m_planGoal, m_planContent, m_address,
				m_planBudget, m_publishId, m_createDate, m_planType, m_planMold, m_secId, m_receive);
		System.out.println(check);
	}	
	@Test
	public void UpdateActplan(){
		BllActplan bllActplan = new BllActplan();
		int m_planId = 6;
		int m_createId = 1;
		String m_planName = "把4G带进高校";
		String m_planGoal = "我就改改看";
		String m_planContent = "看看改成功了没";
		String m_address = "宁波全地区";
		double m_planBudget = 50000;
		int m_publishId = 1;
		Date m_createDate = new Date();
		int m_planType = 1;
		int m_planMold = 0;
		int m_secId = 1;
		int[] m_receive = new int[1];
		m_receive[0] = 3;
		boolean check = bllActplan.UpdateActplan(m_planId, m_createId, m_planName, m_planGoal, m_planContent,
				m_address, m_planBudget, m_publishId, m_createDate, m_planType, m_planMold, m_secId, m_receive);
		System.out.println(check);
	}
	@Test
	public void UpActreturn(){
		BllActreturn bllActreturn = new BllActreturn();
		int m_secId = 7;
		int m_planId = 6;
		int m_userId = 5;
		String m_accAddress = "宁工西校区";
		String m_accContent = "活动圆满结束";
		int m_accType = 1;
		Date m_createTime = new Date();
		String m_accImage = "D:\\shishi.jpg";
		String m_accDescribe = "活动照片";
		boolean check = bllActreturn.UpActreturn(m_secId, m_planId, m_userId, m_accAddress, m_accContent, 
				m_accType, m_createTime, m_accImage, m_accDescribe);
		System.out.println(check);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void TestHavedone(){
		BllHavedone bllHavedone = new BllHavedone();
		Session s = HibernateSessionFactory.getSession();
		s.clear();
		s.beginTransaction();
		String sql = "from Havedone";
		Query query = s.createQuery(sql);
		List<Havedone> havedone = query.list();
		System.out.println(havedone.get(0).getM_planId());
		s.getTransaction().commit();
		
	}

}
