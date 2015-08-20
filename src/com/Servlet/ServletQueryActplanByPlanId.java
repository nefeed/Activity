package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.Factory.BllFacadeFactory;
import com.Interface.BllInterface;

@SuppressWarnings("serial")
public class ServletQueryActplanByPlanId extends HttpServlet{

	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String p = new String(request.getParameter("m_planId"));
		System.out.println(p);
		int m_planId = Integer.parseInt(p);
		
		JSONArray json = JSONArray.fromObject(bllInterface.QueryActplanByPlanId(m_planId));
		System.out.println("——————————遍历上层公布其能收到的活动信息——————————\n"+json);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
