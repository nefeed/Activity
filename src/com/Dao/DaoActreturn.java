package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Actreturn;

public class DaoActreturn extends DaoAbstract{

	//判断是否已经存在依附的活动回复表
	public boolean BooleanContainSameActreturn(int m_userId,int m_planId){
		String sql = "from Actreturn where m_planId="+m_planId+" and m_userId="+m_userId;
		Session s = HibernateSessionFactory.getSession();
		s.clear();
		Query query = s.createQuery(sql);
		if(query.list().size()==0){
			return true;
		}else{
			return false;
		}
	}
	//得到活动回复表的m_retId
	@SuppressWarnings("unchecked")
	public int GetM_retId(int m_userId, int m_planId) {
		// TODO Auto-generated method stub
		String sql = "from Actreturn where m_userId=? and m_planId=?";
		Session s = HibernateSessionFactory.getSession();
		s.clear();
		Query query = s.createQuery(sql).setInteger(0, m_userId).setInteger(1, m_planId);
		List<Actreturn> actreturn = query.list();
		
		return actreturn.get(0).getM_retId();
	}
	//根据m_planId来遍历所有反馈
	@SuppressWarnings("unchecked")
	public List<Actreturn> QueryBySecIdAndPlanId(int m_secId,int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			String sql = "from Actreturn where m_secId="+m_secId+" m_planId="+m_planId+"by m_retId desc";
			
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql);
			List<Actreturn> actreturn = query.list();
			return actreturn;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//保存活动反馈
	public boolean Save(Actreturn actreturn) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			s.save(actreturn);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
