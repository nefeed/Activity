package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Havedone;

public class DaoHavedone extends DaoAbstract{
	
	
	//省级以下部门发布活动时保存活动已发布活动表
	public boolean CreateHavedone(int m_planId,int m_userId){
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			Havedone havedone = new Havedone();
			havedone.setM_planId(m_planId);
			havedone.setM_userId(m_userId);
			s.save(havedone);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//通过userId查找PlanId
	@SuppressWarnings("unchecked")
	public List<Havedone> QueryPlanIdByUserId(int m_userId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Havedone where m_userId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_userId);
			List<Havedone> havedone = query.list();
			s.getTransaction().commit();
			return havedone;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
