package com.Bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.Dao.DaoSection;
import com.Dao.DaoUser;
import com.Factory.DaoFactory;
import com.Vo.Section;
import com.Vo.User;

public class BllSection extends BllAbstract{
	
	private DaoFactory daoFactory = DaoFactory.getDaoFactory();
	private DaoSection daoSection = daoFactory.getInstance(DaoSection.class);
	private DaoUser daoUser = daoFactory.getInstance(DaoUser.class);
	
	//得到下属部门的信息
	public List<Map<String, Object>> getChildInfo(int m_secId) {
		// TODO Auto-generated method stub
		List<Section> section = daoSection.QueryChildInfoByParentId(m_secId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		for(int i=0;i<section.size();i++){
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<User> user = daoUser.QueryUserBySecId(m_secId);
			for(int j=0;j<user.size();j++){
				map.put("m_userId", user.get(j).getM_userId());
				map.put("m_userName", user.get(j).getM_userName());
				map.put("m_secId", section.get(i).getM_secId());
				map.put("m_secName", section.get(i).getM_secName());
			}
			list.add(map);
		}
		return list;
	}
	//得到本Id的所属层 0：省局 1：市局 2：县局 3：营业点 4：营业员个人
	public int getSecType(int m_secId){
		int m_secType = daoSection.GetSecType(m_secId);
		return m_secType;
	}
	//通过下级部门的SecId查找上级部门的SecId
	public int SelectParentSecId(int m_childSecId) {
		// TODO Auto-generated method stub
		int m_parentSecId = daoSection.SelectParentSecId(m_childSecId);
		return m_parentSecId;
	}
}
