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
public class ServletUpActreturn extends HttpServlet{
	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		int m_secId = Integer.parseInt(request.getParameter("m_secId"));
		int m_planId = Integer.parseInt(request.getParameter("m_planId"));
		int m_userId = Integer.parseInt(request.getParameter("m_userId"));
		String m_accAddress = new String(request.getParameter("m_accAddress").getBytes("ISO-8859-1"),"utf-8");
		String m_accContent = new String(request.getParameter("m_accContent").getBytes("ISO-8859-1"),"utf-8");
		int m_accType = Integer.parseInt(request.getParameter("m_accType"));
		Date m_createTime = new Date();
		String m_accImage = new String(request.getParameter("m_accImage").getBytes("ISO-8859-1"),"utf-8"); //附件存储地址
		String m_accDescribe = new String(request.getParameter("m_accdescribe").getBytes("ISO-8859-1"),"utf-8"); //附件描述
		
		boolean check = bllInterface.UpActreturn(m_secId,m_planId,m_userId,m_accAddress,
				m_accContent,m_accType,m_createTime,m_accImage,m_accDescribe);
		System.out.println(check);
		JSONObject json = JSONObject.fromObject(check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
			
	}
}
