package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.Factory.BllFacadeFactory;
import com.Interface.BllInterface;

@SuppressWarnings("serial")
public class ServletMaxPlanId extends HttpServlet{
	private BllFacadeFactory bllFactory = BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_userId = Integer.getInteger(request.getParameter("m_userId"));
		int m_planId = bllInterface.MaxPlanId(m_userId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("m_planId", m_planId);
		JSONObject json = JSONObject.fromObject(map);
		System.out.println(map);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
		
	}
}
