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
public class ServletQueryHaveFinishActplan extends HttpServlet{

	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_secId = Integer.parseInt(request.getParameter("m_secId"));
		int m_userId = Integer.parseInt(request.getParameter("m_userId"));
		
		System.out.println("本次查询使用的m_secId："+m_secId+"\n本次查询使用的m_userId："+m_userId);
		
		JSONArray json = JSONArray.fromObject(bllInterface.QueryPublishPlanBySecIdAndUserId(m_secId,m_userId));
		System.out.println("——————————遍历上层公布其能收到的且本局已活动信息——————————\n"+json);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
	}
}
