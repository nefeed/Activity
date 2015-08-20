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
public class ServletFinishActplan extends HttpServlet{
	
	private BllFacadeFactory bllFacadeFactory= BllFacadeFactory.getbBllFactoryInstance();
	BllInterface bllInterface = bllFacadeFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		int m_planId = Integer.parseInt(request.getParameter("m_planId"));      //活动计划ID
		boolean check = bllInterface.FinishActplan(m_planId);
		Map<String, Object> map =  new HashMap<String, Object>();
		map.put("check", check);
		JSONObject json = JSONObject.fromObject(map);
		System.out.println("活动结束："+check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
		
	}
}
