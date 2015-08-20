package com.Facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Bll.BllAccessory;
import com.Bll.BllActplan;
import com.Bll.BllActreturn;
import com.Bll.BllCustomer;
import com.Bll.BllHavedone;
import com.Bll.BllMapping;
import com.Bll.BllSection;
import com.Bll.BllUser;
import com.Factory.BllFactory;
import com.Interface.BllInterface;
import com.Vo.Accessory;
import com.Vo.Customer;
import com.Vo.Havedone;
import com.Vo.Mapping;


public class BllFacade implements BllInterface{

	//单例
	private static BllFacade bllFacade = new BllFacade();
	
	private BllFacade(){};
	
	public static BllFacade getBllFacadeInstance(){
		return bllFacade;
	}

	//调用Bll层   单例模式
	private BllFactory bllFactory = BllFactory.getBllFactory();

	//通过m_userPhone遍历用户，验证登入
	@Override
	public Map<String, Object> QueryByUserPhone(String m_userPhone, String m_userPwd) {
		// TODO Auto-generated method stub
		BllUser bllUser = bllFactory.getInstance(BllUser.class);

		Map<String, Object> map = new HashMap<String, Object>();
		map = bllUser.QueryByPhone(m_userPhone, m_userPwd);
		return map;
	}
	//根据用户secId返回secType
	@Override
	public int CheckUser(int m_secId) {
		// TODO Auto-generated method stub
		BllUser bllUser = bllFactory.getInstance(BllUser.class);
		return bllUser.CheckUser(m_secId);
	}
	//根据m_planId遍历活动反馈
	@Override
	public List<Map<String, Object>> QueryActreturnByPlanId(int m_secId,int m_planId) {
		// TODO Auto-generated method stub
		BllActreturn bllActreturn = bllFactory.getInstance(BllActreturn.class);
		List<Map<String, Object>> list = bllActreturn.QueryByPlanId(m_secId,m_planId);
		return list;
	}
	//创建新活动
	@Override
	public Map<String, Object> CreateActplan(int m_createId, String m_planName,
			String m_planGoal, String m_planContent, String m_address,
			double m_planBudget, int m_publishId, Date m_createDate,
			int m_planType,int m_planMold, int m_secId,int[] m_receive) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		boolean check = bllActplan.CreateActplan(m_createId, m_planName, m_planGoal, m_planContent, 
				m_address, m_planBudget, m_publishId, m_createDate, m_planType,m_planMold, m_secId,m_receive);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("check", check);
		return map;
	}
	//修改活动
	@Override
	public boolean UpdateActplan(int m_planId, int m_createId,
			String m_planName, String m_planGoal, String m_planContent,
			String m_address, double m_planBudget, int m_publishId,
			Date m_createDate, int m_planType,int m_planMold, int m_secId,int[] m_receive) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		boolean check = bllActplan.UpdateActplan(m_planId, m_createId, m_planName, m_planGoal, m_planContent, m_address, 
				m_planBudget, m_publishId, m_createDate, m_planType,m_planMold, m_secId,m_receive);
		return check;
	}
	//发布活动
	@Override
	public boolean PublishActplan(int m_planId, int m_createId,
			String m_planName, String m_planGoal, String m_planContent,
			String m_address, double m_planBudget, int m_publishId,
			Date m_createDate, int m_planType,int m_planMold, int m_secId,int[] m_receive) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		BllHavedone bllHavedone = bllFactory.getInstance(BllHavedone.class);
		boolean check2 = bllHavedone.CreateHavedone(m_planId,m_publishId);
		boolean check = bllActplan.PublishActplan(m_planId, m_createId, m_planName, m_planGoal, m_planContent, 
				m_address, m_planBudget, m_publishId, m_createDate, m_planType,m_planMold, m_secId,m_receive);
		if(check2==true&&check==true){
			return true;
		}else{
			return false;
		}	
	}
	//上传活动反馈
	@Override
	public boolean UpActreturn(int m_secId, int m_planId,
			int m_userId, String m_accAddress, String m_accContent,
			int m_accType, Date m_createTime, String m_accImage,
			String m_accDescribe) {
		// TODO Auto-generated method stub
		BllActreturn bllActreturn = bllFactory.getInstance(BllActreturn.class);
		boolean check = bllActreturn.UpActreturn(m_secId, m_planId, m_userId, m_accAddress,
				m_accContent, m_accType, m_createTime, m_accImage, m_accDescribe);
		return check;
	}
	//修改反馈表信息
	@Override
	public boolean UpdateAccessory(Accessory accessory) {
		// TODO Auto-generated method stub
		BllAccessory bllAccessory = bllFactory.getInstance(BllAccessory.class);
		boolean check = bllAccessory.UpdateAccessory(accessory); 
		return check;
	}
	//通过子节点查找父节点，返回secId
	@Override
	public int QueryParentIdByChildId(int m_secId) {  
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		int parentId = bllActplan.QueryParentIdByChildId(m_secId);
		return parentId;
	}
	//通过secId遍历上级发布的本级能收到的活动,再由userId去掉已经发布的活动
	@Override
	public List<Map<String, Object>> QueryBySecIdAndUserId(int m_secId,int m_userId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		BllHavedone bllHavedone = bllFactory.getInstance(BllHavedone.class);
		List<Havedone> havedone= bllHavedone.QueryPlanIdByUserId(m_userId);
		
		List<Map<String, Object>> list = bllActplan.QueryById(havedone,m_secId);
		return list;
	}
	//通过secId遍历上级发布的本级能收到的活动,再由userId去掉已经发布的活动
	@Override
	public List<Map<String, Object>> QueryPublishPlanBySecIdAndUserId(int m_secId,int m_userId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		BllHavedone bllHavedone = bllFactory.getInstance(BllHavedone.class);
		List<Havedone> havedone= bllHavedone.QueryPlanIdByUserId(m_userId);
		
		List<Map<String, Object>> list = bllActplan.QueryPublishPlanBySecIdAndUserI(havedone,m_secId);
		return list;
	}
	//查询用户的下属部门
	@Override
	public List<Map<String, Object>> ClickButton(int m_secId) {
		// TODO Auto-generated method stub
		BllSection bllsection = bllFactory.getInstance(BllSection.class);
		List<Map<String, Object>> list = bllsection.getChildInfo(m_secId);
		return list;
	}
	//遍历所有本活动回复表的附件表
	@Override
	public List<Map<String, Object>> QueryAccessory(int m_retId) {
		// TODO Auto-generated method stub
		BllAccessory bllAccessory = bllFactory.getInstance(BllAccessory.class);
		List<Map<String, Object>> list = bllAccessory.QueryAccessoryByRetId(m_retId);
		return list;
	}
	//增加客户表内容
	@Override
	public boolean AddCustomer(String m_cusName, int m_cusType,
			String m_cusAddress, String m_cusTel,int m_secId) {
		// TODO Auto-generated method stub
		BllCustomer bllCustomer = bllFactory.getInstance(BllCustomer.class);
		boolean check = bllCustomer.AddCustomer(m_cusName,m_cusType,m_cusAddress,m_cusTel,m_secId); 
		return check;
	}
	//修改客户表信息
	@Override
	public boolean UpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		BllCustomer bllCustomer = bllFactory.getInstance(BllCustomer.class);
		boolean check = bllCustomer.UpdateCustomer(customer);
		return check;
	}
	//增加客户员工对应
	@Override
	public boolean AddMapping(Mapping[] mapping) {
		// TODO Auto-generated method stub
		BllMapping bllMapping = bllFactory.getInstance(BllMapping.class);
		boolean check = bllMapping.AddMapping(mapping);
		return check;
	}
	//修改客户员工对应
	@Override
	public boolean UpdateMapping(Mapping mapping) {
		// TODO Auto-generated method stub
		BllMapping bllMapping = bllFactory.getInstance(BllMapping.class);
		boolean check = bllMapping.UpdateMapping(mapping);
		return check;
	}
	//遍历本活动客户员工对应信息
	@Override
	public List<Map<String, Object>> QueryMapping(int m_planId) {
		// TODO Auto-generated method stub
		BllMapping bllMapping = bllFactory.getInstance(BllMapping.class);
		List<Map<String, Object>> list = bllMapping.QueryMappingByPlanId(m_planId);
		return list;
	}
	//根据发布者ID和活动状态遍历活动
	@Override
	public List<Map<String, Object>> QueryActplanByPlanType(int mPublishId,
			int mPlanType) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		List<Map<String, Object>> list = bllActplan.QueryActplanByPlanType(mPublishId,mPlanType);
		return list;
	}
	//省局遍历自己创建的活动
	@Override
	public List<Map<String, Object>> QueryMyActplan(int m_publishId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		List<Map<String, Object>> list = bllActplan.QueryMyActplan(m_publishId);
		return list;
	}

	//省局结束自己的活动
	@Override
	public boolean FinishActplan(int m_planId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		boolean check = bllActplan.FinishActplan(m_planId);
		return check;
	}
	
	//通过活动Id查找活动详情
	@Override
	public List<Map<String, Object>> QueryActplanByPlanId(int m_planId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		List<Map<String, Object>> list = bllActplan.QueryActplanByPlanId(m_planId);
		return list;
	}
	//通过营业厅secId遍历员工客户对应关系
	@Override
	public List<Map<String, Object>> QueryMappingByBusSecId(int m_busSecId) {
		// TODO Auto-generated method stub
		BllMapping bllMapping = bllFactory.getInstance(BllMapping.class);
		List<Map<String, Object>> list = bllMapping.QueryMappingByBusSecId(m_busSecId);
		return list;
	}
	//通过下级部门的SecId查找上级部门的SecId
	@Override
	public int SelectParentSecId(int m_childSecId) {
		// TODO Auto-generated method stub
		BllSection bllSection = bllFactory.getInstance(BllSection.class);
		int parentSecId = bllSection.SelectParentSecId(m_childSecId);
		return parentSecId;
	}

	//查询本营业厅所有客户
	@Override
	public List<Map<String, Object>> QueryCustomerBySecId(int m_secId) {
		// TODO Auto-generated method stub
		BllCustomer bllCustomer = bllFactory.getInstance(BllCustomer.class);
		List<Map<String, Object>> list = bllCustomer.QueryCustomerBySecId(m_secId);
		return list;
	}

	//修改客户状态为1
	@Override
	public boolean DeleteCustomer(int m_cusId) {
		// TODO Auto-generated method stub
		BllCustomer bllCustomer = bllFactory.getInstance(BllCustomer.class);
		boolean check = bllCustomer.DeleteCustomer(m_cusId);
		return check;
	}
	//查找本用户创建的最大的活动Id
	@Override
	public int MaxPlanId(int m_userId) {
		// TODO Auto-generated method stub
		BllActplan bllActplan = bllFactory.getInstance(BllActplan.class);
		return bllActplan.MaxPlanId(m_userId);
	}

	
}
