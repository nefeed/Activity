package com.Bll;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Dao.DaoAccessory;
import com.Dao.DaoActreturn;
import com.Dao.DaoSection;
import com.Dao.DaoUser;
import com.Factory.DaoFactory;
import com.Vo.Accessory;
import com.Vo.Actreturn;
import com.Vo.Section;

public class BllActreturn extends BllAbstract{
	private DaoFactory daoF = DaoFactory.getDaoFactory();
	private DaoActreturn daoActreturn = daoF.getInstance(DaoActreturn.class);
	private DaoAccessory daoAccessory = daoF.getInstance(DaoAccessory.class);
	private DaoSection daoSection = daoF.getInstance(DaoSection.class);
	private DaoUser daoUser = daoF.getInstance(DaoUser.class);
	//根据用户Id和活动Id来遍历回复表
	public List<Map<String, Object>> QueryByPlanId(int m_secId,int m_planId) {
		// TODO Auto-generated method stub
		List<Section> section = daoSection.QueryChildInfoByParentId(m_secId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int i = 0;i<section.size();i++){
			List<Actreturn> actreturn = daoActreturn.QueryBySecIdAndPlanId(section.get(i).getM_secId(),m_planId);
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("m_retId", actreturn.get(0).getM_retId());
			map.put("m_secId", actreturn.get(0).getM_secId());
			map.put("m_planId", actreturn.get(0).getM_planId());
			map.put("m_userName", daoUser.QueryUserNameByUserId(actreturn.get(0).getM_userId()));
				
			list.add(map);
			
		}
		return list;
	}
	//发表附件表，附属在活动回复表中
	public boolean UpActreturn(int m_secId, int m_planId,int m_userId,
			String m_accAddress, String m_accContent, int m_accType,
			Date m_createTime, String m_accImage, String m_accDescribe) {
		// TODO Auto-generated method stub
		
		Actreturn actreturn = new Actreturn();
		Accessory accessory = new Accessory();
		boolean check1 = true;
		if(daoActreturn.BooleanContainSameActreturn(m_userId, m_planId)){
			actreturn.setM_secId(m_secId);
			actreturn.setM_planId(m_planId);
			actreturn.setM_userId(m_userId);
			
			check1 = daoActreturn.Save(actreturn);

		}
		//取得依附的活动回复表的m_retId
		int m_retId = daoActreturn.GetM_retId(m_userId,m_planId);
		accessory.setM_accImage(m_accImage);
		accessory.setM_retId(m_retId);
		accessory.setM_accDescribe(m_accDescribe);
		accessory.setM_accAddress(m_accAddress);
		accessory.setM_accContent(m_accContent);
		accessory.setM_accType(m_accType);
		accessory.setM_createTime(m_createTime);
		
		
		boolean check2 = daoAccessory.Save(accessory);
		
		if(check1==true&&check2==true){
			return true;
		}else{
			return false;
		}
	}
}
