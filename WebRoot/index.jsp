<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% String m_userId="";
   String m_secId="";
   String m_secName="";
   String m_userName="";
   String m_secType="";
   try{ 
		m_userId=session.getAttribute("m_userId").toString();
		m_secId=session.getAttribute("m_secId").toString();
		m_secName=session.getAttribute("m_secName").toString();
		m_userName=session.getAttribute("m_userName").toString();
		m_secType=session.getAttribute("m_secType").toString();
		System.out.println("---------"+ m_userId + m_secId + m_secName+ m_userName+m_secType);
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript">
		var m_userId=<%="'"+m_userId+"'"%>
		var m_userName=<%="'"+m_userName+"'"%>
		var m_secId=<%="'"+m_secId+"'"%>
		var m_secName=<%="'"+m_secName+"'"%>
		var m_secType=<%="'"+m_secType+"'"%>
		</script>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
  </head>
  
  <body>
  <div id="body">
  </div>
  </body>
</html>
