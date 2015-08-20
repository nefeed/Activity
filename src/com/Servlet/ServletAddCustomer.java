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
public class ServletAddCustomer extends HttpServlet{
	private BllFacadeFactory bllFactory = BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String m_cusName = new String(request.getParameter("m_cusName").getBytes("ISO-8859-1"),"utf-8");
		int m_cusType = 0;
		String m_cusAddress = new String(request.getParameter("m_cusAddress").getBytes("ISO-8859-1"),"utf-8");
		String m_cusTel = new String(request.getParameter("m_cusTel").getBytes("ISO-8859-1"),"utf-8");
		int m_secId = Integer.parseInt(request.getParameter("m_secId"));
		
		boolean check = bllInterface.AddCustomer(m_cusName,m_cusType,m_cusAddress,m_cusTel,m_secId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("check",check);
		JSONObject json = JSONObject.fromObject(map);
		System.out.println(check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
