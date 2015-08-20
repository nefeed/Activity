<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'middlecity_publish.jsp' starting page</title>
    
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
	<script type="text/javascript" src="js/middlecity_publish.js"></script>

  </head>
  
 <body>
    <div>
	     <table  id="tb_activity" style="border-spacing:0px;font-size:13px;" width="100%" border="1" >
	         <tr  style="height:25px" >
	            <th >&nbsp;</th>
	            <th >活动名称</th>
	            <th >活动类型</th>
	            <th >发布状态</th>
	            <th >操作</th>
             </tr>
	     </table>
	</div> 
  </body>
</html>
