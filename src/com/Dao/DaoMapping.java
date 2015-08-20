package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Mapping;

public class DaoMapping extends DaoAbstract{
	
	//保存员工客户对应关系
	public boolean Save(Mapping[] mapping) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			for(int i=0;i<mapping.length;i++){
				s.clear();
				s.beginTransaction();
				s.save(mapping[i]);
				s.getTransaction().commit();			
			}
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//修改员工客户对应关系
	public boolean Update(Mapping mapping) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			s.update(mapping);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//遍历客户员工对应关系
	@SuppressWarnings("unchecked")
	public List<Mapping> QueryMappingByPlanId(int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Mapping where m_planId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_planId);
			List<Mapping> mapping = query.list();
			s.getTransaction().commit();
			return mapping;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//通过营业厅secId遍历员工客户对应关系
	@SuppressWarnings("unchecked")
	public List<Mapping> QueryMappingByBusSecId(int m_busSecId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Mapping where m_busSecId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_busSecId);
			List<Mapping> mapping = query.list();
			s.getTransaction().commit();
			return mapping;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
