<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%String planId = request.getParameter("planId"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>市县局发布活动</title>
    
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
    <script type="text/javascript" src="js/PushActplan.js"></script>
    <script type="text/javascript">
      var planId=<%="'"+planId+"'"%>
    </script>

  </head>
  
  <body>
     <div style="background-color:white;width:100%;height:100%;border:2px solid #ADD8E6">
		    <div id="fsb">活动内容</div>
		    <hr style="color:#ADD8E6"/>
	        <div id="fg">
	          <label>活动名称:</label>
	          <input id="m_planName" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动目的:</label>
	          <input id="m_planGoal" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动计划内容:</label>
	          <input id="m_planContent" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>地&nbsp;&nbsp;&nbsp;&nbsp;址:</label>
	          <input id="m_address" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>预算:</label>
	          <input id="m_planBudget" type="text" disabled="disabled"/>
	        </div>
	        
	        
	        
	        <div id="fg">&nbsp; &nbsp; <br> 
	        </div>
	        <div id="subordinate"></div>
	        <div style="margin-top:200px;margin-left:800px">
	            <input type="button" value="发布" onclick="submit()"/>
	        </div>
        </div>
  </body>
</html>
