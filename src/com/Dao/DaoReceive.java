package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Havedone;
import com.Vo.Receive;

public class DaoReceive extends DaoAbstract{

	//保存活动接收表
	public void Save(Receive receive) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		
		try{
			s.clear();
			s.beginTransaction();
			s.save(receive);
			s.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//自动删除已经无用的接受关系
	@SuppressWarnings("unused")
	public void DeleteOld(int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "delete from Receive where m_planId="+m_planId;
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql);
			s.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//通过SecId查找能接收的活动编号
	@SuppressWarnings("unchecked")
	public List<Receive> QueryBySecId(List<Havedone> havedone,int m_secId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Receive where m_secId=?";
		for(int i=0;i<havedone.size();i++){
			sql += " and m_planId<>"+havedone.get(i).getM_planId();
		}
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			List<Receive> receive = query.list();
			s.getTransaction().commit();
			return receive;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//通过SecId查找能接收的活动编号
	@SuppressWarnings("unchecked")
	public List<Receive> QueryReceiveBySecId(int m_childSecId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Receive where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_childSecId);
			List<Receive> receive = query.list();
			s.getTransaction().commit();
			return receive;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//通过secId遍历上级发布的本级能收到的活动,再由userId去掉已经发布的活动
	@SuppressWarnings("unchecked")
	public List<Receive> QueryPublishPlanBySecId(List<Havedone> havedone,
			int m_secId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Receive where m_secId=?";
		for(int i=0;i<havedone.size();i++){
			sql += " and m_planId="+havedone.get(i).getM_planId();
		}
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			List<Receive> receive = query.list();
			s.getTransaction().commit();
			return receive;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
