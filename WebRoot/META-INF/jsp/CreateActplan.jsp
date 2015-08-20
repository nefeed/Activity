<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>省局创建活动功能页面</title>
    
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
    <script type="text/javascript" src="js/CreateActplan.js"></script>

  </head>
  
  <body>
      <div style="background-color:white;width:100%;height:100%;border:2px solid #ADD8E6">
		    <div id="fsb">活动内容</div>
		    <hr style="color:#ADD8E6"/>
	        
	        
	        <div id="fg">
	          <label>活动名称:</label>
	          <input id="m_planName" type="text" />
	        </div>
	        <div id="fg">
	          <label>活动目的:</label>
	          <input id="m_planGoal" type="text" />
	        </div>
	        <div id="fg">
	          <label>活动计划内容:</label>
	          <input id="m_planContent" type="text"/>
	        </div>
	         <div id="fg">
	          <label>活动类型:</label>
	          <input id="m_planMold" type="text"/><br>
	          <label >（0普通活动，1走访活动）</label>
	        </div>
	        <div id="fg" >
	          <label>地&nbsp;&nbsp;&nbsp;&nbsp;址:</label>
	          <input id="m_address" type="text" />
	        </div>
	        
	        <div id="fg" > 
	          <label>预&nbsp;&nbsp;&nbsp;&nbsp;算:</label> 
	          <input type="text" id="m_planBudget"><br>&nbsp;</div>
	        <div style="margin-top:120px;margin-left:100px">
	          <label>指定可接受下属部门：</label>
	          <div id="subordinate"></div>
	        </div>
	        <div style="margin-top:75px;margin-left:870px">
	        
	            <input type="button" value="提交" onclick="submit()"/>
	        </div>
        </div>
  </body>
</html>
