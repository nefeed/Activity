package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Section;

public class DaoSection extends DaoAbstract{
	
	//通过子阶层SecId查父阶层SecId
	@SuppressWarnings("unchecked")
	public List<Section> QueryChildInfoByParentId(int m_secId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Section where m_secParentId=?";
		try{
			
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			
			List<Section> section = query.list();
			s.getTransaction().commit();
			return section;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//通过SecId查询SecType
	@SuppressWarnings("unchecked")
	public int QuerySecTypeBySecId(int m_secId){
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Section where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			
			List<Section> section = query.list();
			
			s.getTransaction();
			return section.get(0).getM_secType();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	//通过SecId查SecName和SecType
	@SuppressWarnings("unchecked")
	public List<Section> QueryInfoBySecId(int m_secId){
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Section where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			
			List<Section> section = query.list();
			
			s.getTransaction();
			return section;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//得到本Id的所属层 0：省局 1：市局 2：县局 3：营业点 4：营业员个人
	@SuppressWarnings("unchecked")
	public int GetSecType(int m_secId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Section where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			List<Section> section = query.list();
			return section.get(0).getM_secType();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	//通过下级部门的SecId查找上级部门的SecId
	@SuppressWarnings("unchecked")
	public int SelectParentSecId(int m_childSecId) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Section where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_childSecId);
			List<Section> section = query.list();
			return section.get(0).getM_secParentId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
}
