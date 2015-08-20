package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;

import com.Factory.BllFacadeFactory;
import com.Interface.BllInterface;

@SuppressWarnings("serial")
public class ServletLogin extends HttpServlet{
	
	private BllFacadeFactory bllFactory =  BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String m_userPhone = new String(request.getParameter("m_userPhone").getBytes("ISO-8859-1"),"utf-8");
		String m_userPwd = new String(request.getParameter("m_userPwd").getBytes("ISO-8859-1"),"utf-8");
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = request.getSession();
		
		map = bllInterface.QueryByUserPhone(m_userPhone, m_userPwd);
		
		JSONObject json = JSONObject.fromObject(map);
		
		if(json.get("result").toString().equals("1")){
			session.setAttribute("m_userId", json.get("m_userId"));
			session.setAttribute("m_secId", json.get("m_secId"));
			session.setAttribute("m_userName", json.get("m_userName"));
			session.setAttribute("m_secName", json.get("m_secName"));
			session.setAttribute("m_secType", json.get("m_secType"));
		}
	
		System.out.println("result结果1成功2密码错误3没有该帐号4登入错误");
		System.out.println("结果为"+json.get("result"));
		PrintWriter pw = response.getWriter();
		pw.print(json);
		System.out.println(json);
		pw.close();
	}	
}
