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
import com.Vo.Mapping;

@SuppressWarnings("serial")
public class ServletAddMapping extends HttpServlet{
	private BllFacadeFactory bllFactory = BllFacadeFactory.getbBllFactoryInstance();
	private BllInterface bllInterface = bllFactory.getInterface();
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int m_planId = Integer.getInteger(request.getParameter("m_planId"));
		int m_busSecId = Integer.getInteger(request.getParameter("m_secId"));
		String m_mapSubAble = new String(request.getParameter("m_mapSub").getBytes("ISO-8859-1"),"utf-8"); //被委派任务的员工的userId
		String m_mapCusAble = new String(request.getParameter("m_mapCus").getBytes("ISO-8859-1"),"ust-8"); //员工对应的客户的cusId
		System.out.println("员工的userId："+m_mapSubAble);
		System.out.println("客户的cusId："+m_mapCusAble);
		
		int m_userId=Integer.valueOf(m_mapSubAble);
		
		String[] s = m_mapCusAble.split(",");
		Mapping[] mapping = new Mapping[s.length];
		for(int i=0;i<s.length;i++){
			mapping[i].setM_planId(m_planId);
			mapping[i].setM_userId(m_userId);
			mapping[i].setM_cusId(Integer.valueOf(s[i]).intValue());
			mapping[i].setM_busSecId(m_busSecId);
		}
		
		
		boolean check = bllInterface.AddMapping(mapping);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("check", check);
		JSONObject json = JSONObject.fromObject(map);
		System.out.println(check);
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.close();
		
	}
}
