<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>市县局活动详情页面</title>
    
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
	<script type="text/javascript" src="js/middlecity_actplan.js"></script>

  </head>
  
  <body>
    <div style="background-color:white;width:100%;height:100%;border:2px solid #ADD8E6；overflow:auto; " >
	    <div style="width:100%;height:40%;">
		    <div id="fsb">上级活动</div>
		    <hr style="color:#ADD8E6"/>
	        <div id="fg">
	          <label>计划编号:</label>
	          <input id="m_planId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>创建者编号:</label>
	          <input id="m_createId" type="text" disabled="disabled"/>
	        </div>
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
	          <label>预&nbsp;&nbsp;&nbsp;&nbsp;算:</label>
	          <input id="m_planBudget" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>发布者编号:</label>
	          <input id="m_publishId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>创建时间:</label>
	          <input id="m_createDate" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>发布状态:</label>
	          <input id="m_planType" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>所属层编号:</label>
	          <input id="m_secId" type="text" disabled="disabled"/>
	        </div>
        </div>
        <div style="width:100%;height:40%;">
            <hr style="border:1px solid #ADD8E6;margin-top:20px"/>
		    <div id="fsb">本级活动</div>
		    <hr style="color:#ADD8E6"/>
	        <div id="fg">
	          <label>计划编号:</label>
	          <input id="m_planId1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>创建者编号:</label>
	          <input id="m_createId1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动名称:</label>
	          <input id="m_planName1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动目的:</label>
	          <input id="m_planGoal1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动计划内容:</label>
	          <input id="m_planContent1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>地&nbsp;&nbsp;&nbsp;&nbsp;址:</label>
	          <input id="m_address1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>预&nbsp;&nbsp;&nbsp;&nbsp;算:</label>
	          <input id="m_planBudget1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>发布者编号:</label>
	          <input id="m_publishId1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>创建时间:</label>
	          <input id="m_createDate1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg" >
	          <label>发布状态:</label>
	          <input id="m_planType1" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>所属层编号:</label>
	          <input id="m_secId1" type="text" disabled="disabled"/>
	        </div>
        </div>
        <div style="width:100%;height:60%;">
            <hr style="border:1px solid #ADD8E6;margin-top:20px"/>
	        <div id="fsb">反馈</div>
		    <hr style="color:#ADD8E6"/>
		    <table  id="tb_activity" style="border-spacing:0px;font-size:13px;" width="100%" border="1" >
		         <tr  style="height:25px" >
		            <th >&nbsp;</th>
		            <th >回复编号</th>
		            <th >所属层名称</th>
		            <th >活动计划名称</th>
		            <th >用户名称</th>
		            <th>附件</th>
	             </tr>
		     </table>
	     </div>
     </div>
  </body>
</html>
