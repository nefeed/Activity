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
public class ServletQueryMappingByBusSecId extends HttpServlet{
	
	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_busSecId = Integer.parseInt(request.getParameter("m_busSecId"));
		
		JSONArray json = JSONArray.fromObject(bllInterface.QueryMappingByBusSecId(m_busSecId));
		System.out.println("——————————遍历本营业厅客户员工对应信息——————————"+json);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
