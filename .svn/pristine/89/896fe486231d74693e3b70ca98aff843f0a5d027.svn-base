package com.Bll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Dao.DaoSection;
import com.Dao.DaoUser;
import com.Factory.DaoFactory;
import com.Vo.Section;
import com.Vo.User;

public class BllUser extends BllAbstract{
	private DaoFactory daoF = DaoFactory.getDaoFactory();
	private DaoUser daoUser = daoF.getInstance(DaoUser.class);
	private DaoSection daoSection = daoF.getInstance(DaoSection.class);
	
	//登入匹配
	public Map<String, Object> QueryByPhone(String m_userPhone,String m_userPwd){
		int result = 4;
		Map<String, Object> map = new HashMap<String, Object>();
		List<User> userLogin = daoUser.UserLogin(m_userPhone);
		if(userLogin.size()>0){
			if(userLogin.get(0).getM_userPwd().equals(m_userPwd)){
				result = 1;
			}else{
				result = 2;
			}
		}else{
			result = 3;
		}
		try{
			int m_secId = userLogin.get(0).getM_secId();
			List<Section> section = daoSection.QueryInfoBySecId(m_secId);
			map.put("result", result);
			map.put("m_userId",userLogin.get(0).getM_userId());
			map.put("m_userName", userLogin.get(0).getM_userName());
			map.put("m_secId", m_secId);
			map.put("m_secName", section.get(0).getM_secName());
			map.put("m_secType", section.get(0).getM_secType());

			return map;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//通过获取的信息确定返回的用户的所属层（省局，市局，县局，营业点）
	public int CheckUser(int userid){
		return daoUser.CheckSecIdByUserId(userid);
	}
}
