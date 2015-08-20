package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Accessory;

public class DaoAccessory extends DaoAbstract{
	//遍历附件表
	@SuppressWarnings("unchecked")
	public List<Accessory> QueryByRetId(int m_retId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			String sql = "from Accessory where m_retId="+m_retId;
			
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql);
			List<Accessory> accessory = query.list();
			return accessory;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//保存附件表
	public boolean Save(Accessory accessory) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			s.save(accessory);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//根据retId遍历所有本活动回复的附件
	@SuppressWarnings("unchecked")
	public List<Accessory> QueryAccessoryByRetId(int m_retId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Accessory where m_retId="+m_retId+"by m_accId desc";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql);
			List<Accessory> accessory = query.list();
			s.getTransaction().commit();
			return accessory;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
