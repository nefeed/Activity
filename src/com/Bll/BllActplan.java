package com.Bll;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Dao.DaoActplan;
import com.Dao.DaoFormation;
import com.Dao.DaoReceive;
import com.Factory.DaoFactory;
import com.Vo.Actplan;
import com.Vo.Formation;
import com.Vo.Havedone;
import com.Vo.Receive;

public class BllActplan extends BllAbstract{
	private DaoFactory daoFactory = DaoFactory.getDaoFactory();
	private DaoActplan daoActplan = daoFactory.getInstance(DaoActplan.class);
	private DaoFormation daoFormation = daoFactory.getInstance(DaoFormation.class);
	private DaoReceive daoReceive = daoFactory.getInstance(DaoReceive.class);
	
	
	//创建活动
	public boolean CreateActplan(int m_createId,String m_planName,String m_planGoal,String m_planContent,String m_address,
			double m_planBudget,int m_publishId,Date m_createDate,int m_planType,int m_planMold, int m_secId,int[] m_receive){
		Actplan actplan = new Actplan();
		Formation formation = new Formation();
		Receive receive = new Receive();
		//创建活动计划表		
		actplan.setM_createId(m_createId);
		actplan.setM_planName(m_planName);
		actplan.setM_planGoal(m_planGoal);
		actplan.setM_planContent(m_planContent);
		actplan.setM_address(m_address);
		actplan.setM_planBudget(m_planBudget);
		actplan.setM_publishId(m_publishId);
		actplan.setM_createDate(m_createDate);	
		actplan.setM_planType(m_planType);
		actplan.setM_planMold(m_planMold);
		actplan.setM_secId(m_secId);
		
		boolean check = daoActplan.Save(actplan);	
			
		//创建活动结构表
		int m_parentId = 0;
		int m_childId = actplan.getM_planId();
		
		formation.setM_parentId(m_parentId);			
		formation.setM_childId(m_childId);
			
		daoFormation.Save(formation);
		
		//创建接收表Receive
		int m_planId = actplan.getM_planId();
		receive.setM_planId(m_planId);
		for(int i=0;i<m_receive.length;i++){
			receive.setM_secId(m_receive[i]);
			
			daoReceive.Save(receive);
		}
		return check;
	}

	//市局及以下发布活动
	public boolean PublishActplan(int m_planId, int m_createId,String m_planName, String m_planGoal, String m_planContent,
			String m_address, double m_planBudget, int m_publishId,Date m_createDate, int m_planType,int m_planMold, int m_secId,int[] m_receive) {
		
		Actplan actplan = new Actplan();
		Formation formation = new Formation();
		Receive receive = new Receive();
		
		//创建活动计划表		
		actplan.setM_createId(m_createId);
		actplan.setM_planName(m_planName);
		actplan.setM_planGoal(m_planGoal);
		actplan.setM_planContent(m_planContent);
		actplan.setM_address(m_address);
		actplan.setM_planBudget(m_planBudget);
		actplan.setM_publishId(m_publishId);
		actplan.setM_createDate(m_createDate);	
		actplan.setM_planType(m_planType);
		actplan.setM_planMold(m_planMold);
		actplan.setM_secId(m_secId);
		
		boolean check = daoActplan.Save(actplan);	
		
		//创建活动结构表
		int m_parentId = m_planId;
		int m_childId = actplan.getM_planId();
		
		formation.setM_parentId(m_parentId);			
		formation.setM_childId(m_childId);
			
		daoFormation.Save(formation);
		
		//创建接收表Receive
		int m_planId2 = actplan.getM_planId();
		receive.setM_planId(m_planId2);
		for(int i=0;i<m_receive.length;i++){
			receive.setM_secId(m_receive[i]);
			
			daoReceive.Save(receive);
		}
		
		return check;
	}

	public int QueryParentIdByChildId(int m_secId) {
		// TODO Auto-generated method stub
		
		int parentId = DaoFormation.QueryParentIdByChildId(m_secId);
		
		return parentId;
	}

	//遍历上级发布，其能收到的活动表
	public List<Map<String, Object>> QueryById(List<Havedone> havedone,int m_secId) {
		// TODO Auto-generated method stub
		
		List<Receive> receive = daoReceive.QueryBySecId(havedone,m_secId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < receive.size(); i++) {

			List<Actplan> actplan = daoActplan.QueryById(receive.get(i).getM_planId());
	
			System.out.println("本次查询的planId:"+actplan.get(0).getM_planId());
			System.out.println("本次查询结果："+actplan);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("m_planId", actplan.get(0).getM_planId());
			map.put("m_createId", actplan.get(0).getM_createId());
			map.put("m_planName", actplan.get(0).getM_planName());
			map.put("m_planGoal", actplan.get(0).getM_planGoal());
			map.put("m_planContent", actplan.get(0).getM_planContent());
			map.put("m_address", actplan.get(0).getM_address());
			map.put("m_planBudget", actplan.get(0).getM_planBudget());
			map.put("m_publishId", actplan.get(0).getM_publishId());
			map.put("m_createDate", actplan.get(0).getM_createDate());
			map.put("m_planType", actplan.get(0).getM_planType());
			map.put("m_planMold", actplan.get(0).getM_planMold());
			map.put("m_secId", actplan.get(0).getM_secId());
				
			list.add(map);
		}
		
		return list;
	}
	//通过secId遍历上级发布的本级能收到的活动,再由userId去掉已经发布的活动
	public List<Map<String, Object>>QueryPublishPlanBySecIdAndUserI(List<Havedone> havedone,int m_secId) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < havedone.size(); i++) {

			
			List<Actplan> actplan = daoActplan.QueryById(havedone.get(i).getM_planId());
	
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("m_planId", actplan.get(0).getM_planId());
			map.put("m_createId", actplan.get(0).getM_createId());
			map.put("m_planName", actplan.get(0).getM_planName());
			map.put("m_planGoal", actplan.get(0).getM_planGoal());
			map.put("m_planContent", actplan.get(0).getM_planContent());
			map.put("m_address", actplan.get(0).getM_address());
			map.put("m_planBudget", actplan.get(0).getM_planBudget());
			map.put("m_publishId", actplan.get(0).getM_publishId());
			map.put("m_createDate", actplan.get(0).getM_createDate());
			map.put("m_planType", actplan.get(0).getM_planType());
			map.put("m_planMold", actplan.get(0).getM_planMold());
			map.put("m_secId", actplan.get(0).getM_secId());
				
			list.add(map);
		}
		
		return list;
	}
	//修改活动表信息
	public boolean UpdateActplan(int m_planId, int m_createId,
			String m_planName, String m_planGoal, String m_planContent,
			String m_address, double m_planBudget, int m_publishId,
			Date m_createDate, int m_planType,int m_planMold, int m_secId,int[] m_receive) {
		// TODO Auto-generated method stub
		Actplan actplan = new Actplan();
		Receive receive = new Receive();
		
		//修改活动计划表
		actplan.setM_planId(m_planId);
		actplan.setM_createId(m_createId);
		actplan.setM_planName(m_planName);
		actplan.setM_planGoal(m_planGoal);
		actplan.setM_planContent(m_planContent);
		actplan.setM_address(m_address);
		actplan.setM_planBudget(m_planBudget);
		actplan.setM_publishId(m_publishId);
		actplan.setM_createDate(m_createDate);	
		actplan.setM_planType(m_planType);
		actplan.setM_planMold(m_planMold);
		actplan.setM_secId(m_secId);
		
		boolean check = daoActplan.Update(actplan);	
		
		//更新接收表Receive(先删除原有所有本活动的接收表，重新生成)
		daoReceive.DeleteOld(m_planId);
		receive.setM_planId(m_planId);
		for(int i=0;i<m_receive.length;i++){
			receive.setM_secId(m_receive[i]);
			
			daoReceive.Save(receive);
		}
		
		
		return check;
	}
	//根据发布者ID和活动状态遍历活动
	public List<Map<String, Object>> QueryActplanByPlanType(int m_publishId,
			int m_planType) {
		// TODO Auto-generated method stub
		List<Actplan> actplan = daoActplan.QueryActplanByPlanType(m_publishId,m_planType);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < actplan.size(); i++) {
	
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("m_planId", actplan.get(0).getM_planId());
			map.put("m_createId", actplan.get(0).getM_createId());
			map.put("m_planName", actplan.get(0).getM_planName());
			map.put("m_planGoal", actplan.get(0).getM_planGoal());
			map.put("m_planContent", actplan.get(0).getM_planContent());
			map.put("m_address", actplan.get(0).getM_address());
			map.put("m_planBudget", actplan.get(0).getM_planBudget());
			map.put("m_publishId", actplan.get(0).getM_publishId());
			map.put("m_createDate", actplan.get(0).getM_createDate());
			map.put("m_planType", actplan.get(0).getM_planType());
			map.put("m_planMold", actplan.get(0).getM_planMold());
			map.put("m_secId", actplan.get(0).getM_secId());
				
			list.add(map);
		}
		
		return list;
	}
	//省局遍历自己创建的活动
	public List<Map<String, Object>> QueryMyActplan(int m_publishId) {
		// TODO Auto-generated method stub
		List<Actplan> actplan = daoActplan.QueryMyActplan(m_publishId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < actplan.size(); i++) {
	
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("m_planId", actplan.get(i).getM_planId());
			map.put("m_createId", actplan.get(i).getM_createId());
			map.put("m_planName", actplan.get(i).getM_planName());
			map.put("m_planGoal", actplan.get(i).getM_planGoal());
			map.put("m_planContent", actplan.get(i).getM_planContent());
			map.put("m_address", actplan.get(i).getM_address());
			map.put("m_planBudget", actplan.get(i).getM_planBudget());
			map.put("m_publishId", actplan.get(i).getM_publishId());
			map.put("m_createDate", actplan.get(i).getM_createDate());
			map.put("m_planType", actplan.get(i).getM_planType());
			map.put("m_planMold", actplan.get(i).getM_planMold());
			map.put("m_secId", actplan.get(i).getM_secId());
				
			list.add(map);
		}
		
		return list;
	}
	//省局结束自己的活动
	public boolean FinishActplan(int m_planId) {
		// TODO Auto-generated method stub
		boolean check = daoActplan.FinishActplan(m_planId);
		return check;
	}
	
	//通过活动Id查找活动详情
	public List<Map<String, Object>> QueryActplanByPlanId(int m_planId) {
		// TODO Auto-generated method stub
		List<Actplan> actplan = daoActplan.QueryActplanByPlanId(m_planId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("m_planId", actplan.get(0).getM_planId());
		map.put("m_createId", actplan.get(0).getM_createId());
		map.put("m_planName", actplan.get(0).getM_planName());
		map.put("m_planGoal", actplan.get(0).getM_planGoal());
		map.put("m_planContent", actplan.get(0).getM_planContent());
		map.put("m_address", actplan.get(0).getM_address());
		map.put("m_planBudget", actplan.get(0).getM_planBudget());
		map.put("m_publishId", actplan.get(0).getM_publishId());
		map.put("m_createDate", actplan.get(0).getM_createDate());
		map.put("m_planType", actplan.get(0).getM_planType());
		map.put("m_planMold", actplan.get(0).getM_planMold());
		map.put("m_secId", actplan.get(0).getM_secId());
			
		list.add(map);
		return list;
	}
	//查找本用户创建的最大的活动Id
	public int MaxPlanId(int m_userId) {
		// TODO Auto-generated method stub
		return daoActplan.MaxPlanId(m_userId);
	}


}
