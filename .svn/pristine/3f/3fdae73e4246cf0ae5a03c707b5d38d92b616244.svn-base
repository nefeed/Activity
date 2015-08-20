package com.Bll;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Dao.DaoCustomer;
import com.Dao.DaoMapping;
import com.Dao.DaoUser;
import com.Factory.DaoFactory;
import com.Vo.Mapping;

public class BllMapping extends BllAbstract{
	private DaoFactory daoFactory = DaoFactory.getDaoFactory();
	private DaoMapping daoMapping = daoFactory.getInstance(DaoMapping.class);
	private DaoUser daoUser = daoFactory.getInstance(DaoUser.class);
	private DaoCustomer daoCustomer = daoFactory.getInstance(DaoCustomer.class);
	
	//保存客户员工对应
	public boolean AddMapping(Mapping[] mapping) {
		// TODO Auto-generated method stub
		boolean check = daoMapping.Save(mapping);
		return check;
	}
	//修改客户员工对应
	public boolean UpdateMapping(Mapping mapping) {
		// TODO Auto-generated method stub
		boolean check = daoMapping.Update(mapping);
		return check;
	}
	public List<Map<String, Object>> QueryMappingByPlanId(int m_planId) {
		// TODO Auto-generated method stub
		List<Mapping> mapping = daoMapping.QueryMappingByPlanId(m_planId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int i=0;i<mapping.size();i++){
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("m_mapId", mapping.get(0).getM_mapId());
			map.put("m_userId", mapping.get(0).getM_userId());
			map.put("m_userName", daoUser.QueryUserNameByUserId(mapping.get(0).getM_userId()));
			map.put("m_cusId", mapping.get(0).getM_cusId());
			map.put("m_cusName", daoCustomer.QueryCusNameByCusId(mapping.get(0).getM_cusId()));
			map.put("m_busSecId", mapping.get(0).getM_busSecId());
			
			list.add(map);
		}
		return list;
	}
	//通过营业厅secId遍历员工客户对应关系
	public List<Map<String, Object>> QueryMappingByBusSecId(int m_busSecId) {
		// TODO Auto-generated method stub
		List<Mapping> mapping = daoMapping.QueryMappingByBusSecId(m_busSecId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int i=0;i<mapping.size();i++){
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("m_mapId", mapping.get(i).getM_mapId());
			map.put("m_planId", mapping.get(i).getM_planId());
			map.put("m_userId", mapping.get(i).getM_userId());
			map.put("m_userName", daoUser.QueryUserNameByUserId(mapping.get(i).getM_userId()));
			map.put("m_cusId", mapping.get(i).getM_cusId());
			map.put("m_cusName", daoCustomer.QueryCusNameByCusId(mapping.get(i).getM_cusId()));
			map.put("m_busSecId", mapping.get(i).getM_busSecId());
			
			list.add(map);
		}
		return list;
	}

}
