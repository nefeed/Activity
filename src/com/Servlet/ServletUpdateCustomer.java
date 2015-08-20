package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.Factory.BllFacadeFactory;
import com.Interface.BllInterface;
import com.Vo.Customer;

@SuppressWarnings("serial")
public class ServletUpdateCustomer extends HttpServlet{
	private BllFacadeFactory bllFactory = BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Customer customer = new Customer();
		
		customer.setM_cusId(Integer.getInteger(request.getParameter("m_cusId")));
		customer.setM_cusName(new String(request.getParameter("m_cusName").getBytes("ISO-8859-1"),"utf-8"));
		customer.setM_cusType(Integer.getInteger(request.getParameter("m_cusType")));
		customer.setM_cusAddress(new String(request.getParameter("m_cusAddress").getBytes("ISO-8859-1"),"utf-8"));
		customer.setM_cusTel(new String(request.getParameter("m_cusTel").getBytes("ISO-8859-1"),"utf-8"));
		
		boolean check = bllInterface.UpdateCustomer(customer);
		JSONObject json = JSONObject.fromObject(check);
		System.out.println(check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
