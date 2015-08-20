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

/**
 * 
 * 点击发布活动选项即反馈底下管辖部门
 *
 */
@SuppressWarnings("serial")
public class ServletClickActplanButton extends HttpServlet{
	
	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_secId = Integer.parseInt(request.getParameter("m_secId"));
		
		JSONArray json = JSONArray.fromObject(bllInterface.ClickButton(m_secId));
		
		System.out.println("——————————遍历下属部门信息——————————\n"+json);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
