package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.Factory.BllFacadeFactory;
import com.Interface.BllInterface;

@SuppressWarnings("serial")
public class ServletUpdateActplan extends HttpServlet{
	
	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_planId = Integer.parseInt(request.getParameter("m_planId"));      //活动计划ID
		int m_createId = Integer.parseInt(request.getParameter("m_createId"));  //创建者编号，获取省局ID
		String m_planName = new String(request.getParameter("m_planName").getBytes("ISO-8859-1"),"utf-8");		//活动名称
		String m_planGoal = new String(request.getParameter("m_planGoal").getBytes("ISO-8859-1"),"utf-8");		//活动目的
		String m_planContent = new String(request.getParameter("m_planContent").getBytes("ISO-8859-1"),"utf-8");//活动计划内容
		String m_address = new String(request.getParameter("m_address").getBytes("ISO-8859-1"),"utf-8");		//地址
		double m_planBudget = Double.parseDouble(request.getParameter("m_planBudget")); //预算
		int m_publishId = Integer.parseInt(request.getParameter("m_publishId"));		//发布者编号，获取帐号ID
		
		Date m_createDate = new Date();											//创建时间
		
		int m_planType = Integer.parseInt(request.getParameter("m_planType"));  //发布状态
		int m_planMold = Integer.parseInt(request.getParameter("m_planMold"));  //活动类型 0：普通活动 1：走访活动
		int m_secId = Integer.parseInt(request.getParameter("m_secId"));//阶层编号，获取帐号的阶层编号
		String m_receiveAbleId = new String(request.getParameter("m_receive").getBytes("ISO-8859-1"),"utf-8");  //能接单的单位Id
		String[] s = m_receiveAbleId.split(",");
		int[] m_receive = new int[s.length];
		for(int i=0;i<s.length;i++){
			m_receive[i] = Integer.valueOf(s[i]).intValue();
		}
		
		boolean check = bllInterface.UpdateActplan(m_planId,m_createId, m_planName, m_planGoal, m_planContent, m_address,
				m_planBudget, m_publishId, m_createDate, m_planType,m_planMold, m_secId,m_receive);
		System.out.println(check);
		JSONObject json = JSONObject.fromObject(check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
