package com.Dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Actplan;

public class DaoActplan extends DaoAbstract{

	public boolean Save(Actplan actplan) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.clear();
		try{
			session.beginTransaction();
			session.save(actplan);
			session.getTransaction().commit();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	//通过活动Id接收活动
	@SuppressWarnings("unchecked")
	public List<Actplan> QueryById(int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			String sql = "from Actplan where m_planId=? and m_planType=1";
			
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_planId);
			List<Actplan> actplan = query.list();
			s.getTransaction().commit();
			
			return actplan;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	//修改活动
	public boolean Update(Actplan actplan) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.beginTransaction();
			s.update(actplan);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//根据发布者ID和活动状态遍历活动
	@SuppressWarnings("unchecked")
	public List<Actplan> QueryActplanByPlanType(int m_publishId,
			int m_planType) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Actplan where m_publishId=? and m_planType=?";
		try{
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_publishId).setInteger(0, m_planType);
			List<Actplan> actplan = query.list();
			s.getTransaction().commit();
			return actplan;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//省局遍历自己创建的活动
	@SuppressWarnings("unchecked")
	public List<Actplan> QueryMyActplan(int m_publishId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Actplan where m_publishId=?";
		try{
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_publishId);
			List<Actplan> actplan = query.list();
			s.getTransaction().commit();
			return actplan;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//省局结束自己的活动
	@SuppressWarnings("unchecked")
	public boolean FinishActplan(int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Actplan where m_planId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_planId);
			List<Actplan> list = query.list();
			s.getTransaction().commit();
			
			s.clear();
			s.beginTransaction();
			System.out.println(list);
			Actplan actplan = new Actplan();
			actplan.setM_planId(m_planId);
			actplan.setM_createId(list.get(0).getM_createId());
			actplan.setM_planName(list.get(0).getM_planName());
			actplan.setM_planGoal(list.get(0).getM_planGoal());
			actplan.setM_planContent(list.get(0).getM_planContent());
			actplan.setM_address(list.get(0).getM_address());
			actplan.setM_planBudget(list.get(0).getM_planBudget());
			actplan.setM_publishId(list.get(0).getM_publishId());
			actplan.setM_createDate(list.get(0).getM_createDate());
			actplan.setM_planMold(list.get(0).getM_planMold());
			actplan.setM_planType(2);
			actplan.setM_secId(list.get(0).getM_secId());
			s.update(actplan);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//通过活动Id查找活动详情
	@SuppressWarnings("unchecked")
	public List<Actplan> QueryActplanByPlanId(int m_planId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Actplan where m_planId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_planId);
			List<Actplan> actplan = query.list();
			s.getTransaction();
			return actplan;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//查找本用户创建的最大的活动Id
	@SuppressWarnings("unchecked")
	public int MaxPlanId(int m_userId){
		Session s = HibernateSessionFactory.getSession();
		String sql = "select max(m_planId) as m_planId from Actplan where m_publishId="+m_userId;
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql);
			List<Actplan> actplan =query.list();
			return actplan.get(0).getM_planId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
}
