package com.Bll;

import java.util.List;


import com.Dao.DaoReceive;
import com.Factory.DaoFactory;
import com.Vo.Receive;

public class BllReceive extends BllAbstract{
	private DaoFactory daoFactory = DaoFactory.getDaoFactory();
	private DaoReceive daoReceive = daoFactory.getInstance(DaoReceive.class);
	
	//通过SecId查找能接收的活动编号
	public List<Receive> QueryReveiveBySecId(int m_childSecId) {
		// TODO Auto-generated method stub
		List<Receive> receive = daoReceive.QueryReceiveBySecId(m_childSecId);
		return receive;
	}

}
