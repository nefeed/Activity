<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/login.js"></script>
  </head>
  
  <body>
    <div  id="body" style="width:100%;height:100%;border:1px solid blue">
        <div  style="margin-top:15%;margin-left:55%;border:1px solid red;width:500px;height:300px">
            <div style="margin-top:50px;margin-left:150px">账号&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="userPhone"/></div>
            <div style="margin-top:50px;margin-left:150px">密码&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" id="userPwd"/></div>
            <input type="button" value="登录" onclick="Login();" style="margin-top:50px;margin-left:200px"/>
        </div>
    </div>
  </body>
</html>