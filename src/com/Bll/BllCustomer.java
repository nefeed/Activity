package com.Bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Dao.DaoCustomer;
import com.Factory.DaoFactory;
import com.Vo.Customer;

public class BllCustomer extends BllAbstract{
	private DaoFactory daoF = DaoFactory.getDaoFactory();
	private DaoCustomer daoCustomer = daoF.getInstance(DaoCustomer.class);
	//增加客户表内容
	public boolean AddCustomer(String m_cusName, int m_cusType,
			String m_cusAddress, String m_cusTel,int m_secId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setM_cusName(m_cusName);
		customer.setM_cusType(m_cusType);
		customer.setM_cusAddress(m_cusAddress);
		customer.setM_cusTel(m_cusTel);
		customer.setM_secId(m_secId);
		
		boolean check = daoCustomer.Save(customer);
		return check;
	}
	//修改客户表信息
	public boolean UpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		boolean check = daoCustomer.UpdateCustomer(customer);
		return check;
	}
	//查询本营业厅所有客户
	public List<Map<String, Object>> QueryCustomerBySecId(int m_secId){
		List<Customer> customer = daoCustomer.QueryCustomerBySecId(m_secId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int i=0;i<customer.size();i++){
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("m_cusId", customer.get(i).getM_cusId());
			map.put("m_cusName", customer.get(i).getM_cusName());
			map.put("m_cusAddress", customer.get(i).getM_cusAddress());
			map.put("m_cusTel", customer.get(i).getM_cusTel());
			map.put("m_cusType", customer.get(i).getM_cusType());
			map.put("m_secId", customer.get(i).getM_secId());
			
			list.add(map);
		}
		
		return list;
	}
	//修改客户状态为1
	public boolean DeleteCustomer(int m_cusId){
		boolean check = daoCustomer.DeleteCustomer(m_cusId);
		return check;
	}

}
