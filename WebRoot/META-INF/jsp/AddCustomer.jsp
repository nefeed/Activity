<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加客户信息界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="css/activity.css">
    <script type="text/javascript" src="js/AddCustomer.js"></script>

  </head>
  
  <body>
      <div style="background-color:white;width:100%;height:100%;border:2px solid #ADD8E6">
		    <div id="fsb">客户信息</div>
		    <hr style="color:#ADD8E6"/>
	        
	        
	        <div id="fg">
	          <label>客户姓名:</label>
	          <input id="m_cusName" type="text" />
	        </div>
	        <div id="fg">
	          <label>地址:</label>
	          <input id="m_cusAddress" type="text" />
	        </div>
	        <div id="fg">
	          <label>联系电话:</label>
	          <input id="m_cusTel" type="text"/>
	        </div>
	       
	        
	            <input type="button" value="提交" onclick="submit()"/>
	        </div>
  </body>
</html>
