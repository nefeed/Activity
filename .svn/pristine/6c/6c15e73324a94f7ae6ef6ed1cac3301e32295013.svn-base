package com.Bll;

import java.util.List;

import com.Dao.DaoHavedone;
import com.Factory.DaoFactory;
import com.Vo.Havedone;

public class BllHavedone extends BllAbstract{


	private DaoFactory daoFactory = DaoFactory.getDaoFactory();
	private DaoHavedone daoHavedone = daoFactory.getInstance(DaoHavedone.class);
	
	//省级以下部门发布活动时保存活动已发布活动表
	public boolean CreateHavedone(int m_planId, int m_userId) {
		// TODO Auto-generated method stub
		
		boolean check = daoHavedone.CreateHavedone(m_planId, m_userId);
		System.out.println("本次建立的Havedone表中m_planId:"+m_planId+"\nm_userId:"+m_userId);
		return check;
	}

	//通过userId查找PlanId
	public List<Havedone> QueryPlanIdByUserId(int m_userId) {
		// TODO Auto-generated method stub
		
		List<Havedone> havedone= daoHavedone.QueryPlanIdByUserId(m_userId);
		return havedone;
	}
	
}
