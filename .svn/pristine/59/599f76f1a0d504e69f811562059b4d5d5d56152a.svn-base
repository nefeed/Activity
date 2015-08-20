package com.Bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.Dao.DaoAccessory;
import com.Factory.DaoFactory;
import com.Factory.HibernateSessionFactory;
import com.Vo.Accessory;

public class BllAccessory extends BllAbstract{
	private DaoFactory daoF = DaoFactory.getDaoFactory();
	private DaoAccessory daoAccessory = daoF.getInstance(DaoAccessory.class);
	
	//遍历本活动回复表的所有附件
	public List<Map<String, Object>> QueryAccessoryByRetId(int m_retId) {
		// TODO Auto-generated method stub
		List<Accessory> accessory = daoAccessory.QueryAccessoryByRetId(m_retId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int i=0;i<accessory.size();i++){
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("m_accId", accessory.get(0).getM_accId());
			map.put("m_accImage", accessory.get(0).getM_accImage());
			map.put("m_accDescribe", accessory.get(0).getM_accDescribe());
			map.put("m_accAddress", accessory.get(0).getM_accAddress());
			map.put("m_accContent", accessory.get(0).getM_accContent());
			map.put("m_accType", accessory.get(0).getM_accType());
			map.put("m_createTime", accessory.get(0).getM_createTime());
			
			list.add(map);
			
		}
		return list;
	}
	//修改反馈表信息
	public boolean UpdateAccessory(Accessory accessory) {
		// TODO Auto-generated method stub
		Session s = HibernateSessionFactory.getSession();
		try{
			s.clear();
			s.beginTransaction();
			s.update(accessory);
			s.getTransaction().commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
