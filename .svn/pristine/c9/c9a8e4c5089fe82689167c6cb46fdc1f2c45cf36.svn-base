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
public class ServletDeleteCustomer extends HttpServlet{
	
	private BllFacadeFactory bllFacadeFactory= BllFacadeFactory.getbBllFactoryInstance();
	BllInterface bllInterface = bllFacadeFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		String c = new String(request.getParameter("m_cusId"));
		System.out.println("本次修改状态的客户Id："+c);
		int m_cusId = Integer.parseInt(c);      //客户ID
		boolean check = bllInterface.DeleteCustomer(m_cusId);
		Map<String, Object> map =  new HashMap<String, Object>();
		map.put("check", check);
		JSONObject json = JSONObject.fromObject(map);
		System.out.println("客户修改："+check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
		
	}
}
