package com.Dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Factory.HibernateSessionFactory;
import com.Vo.Customer;

public class DaoCustomer extends DaoAbstract{
	//增加客户表内容
	public boolean Save(Customer customer) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			s.save(customer);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	//修改客户表信息
	public boolean UpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		
		s.clear();
		s.beginTransaction();
		s.update(customer);
		s.getTransaction().commit();
		
		return true;
	}
	//根据客户Id返回客户Name
	@SuppressWarnings("unchecked")
	public String QueryCusNameByCusId(int m_cusId){
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Customer where m_cusId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_cusId);
			List<Customer> customer = query.list();
			return customer.get(0).getM_cusName(); 
		}catch(Exception e){
			e.printStackTrace();
			return "查无此人";
		}
	}
	//查询本营业厅所有客户
	@SuppressWarnings("unchecked")
	public List<Customer> QueryCustomerBySecId(int m_secId){
		Session s = HibernateSessionFactory.getSession();
		String sql = "from Customer where m_secId=?";
		try{
			s.clear();
			s.beginTransaction();
			Query query = s.createQuery(sql).setInteger(0, m_secId);
			List<Customer> customer = query.list();
			s.getTransaction().commit();
			return customer;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//修改客户状态为1
	public boolean DeleteCustomer(int m_cusId){
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			Customer customer = (Customer) s.get(Customer.class, m_cusId);
			customer.setM_cusType(1);
			s.update(customer);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
