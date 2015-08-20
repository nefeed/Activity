<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'middlecityupload.jsp' starting page</title>
    
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
	<script type="text/javascript" src="js/middlecityupload.js"></script>

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
	        <a id="submit" style="margin-left:50px;margin-top:250px;"></a>
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
	        <a id="submit" style="margin-left:50px;margin-top:250px;"></a>
        </div>
        <div style="width:100%;height:60%;">
            <hr style="border:1px solid #ADD8E6;margin-top:20px"/>
	        <div id="fsb">反馈</div>
		    <hr style="color:#ADD8E6"/>
		    <div id="fg">
	          <label>回复编号:</label>
	          <input id="m_retId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>所属层编号:</label>
	          <input id="m_secId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>活动计划编号:</label>
	          <input id="m_planId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	          <label>用户编号:</label>
	          <input id="m_userId" type="text" disabled="disabled"/>
	        </div>
	        <div id="fg">
	           <div>附件</div>
	           <select id="back" style="width:60px;margin-top:-36px;margin-left:45px"> </select>
	           <input type="button" value="查看" onclick="back()"style="margin-top:-45px;margin-left:0px"/>
	        </div>
	     </div>
	     <div style="width:100%;height:60%;">
            <hr style="border:1px solid #ADD8E6;margin-top:20px"/>
	        <div id="fsb">上传反馈</div>
		    <hr style="color:#ADD8E6"/>
		    <div id="fg">
	          <label>附件编号:</label>
	          <input id="m_accId" type="text" />
	        </div>
	        <div id="fg">
	          <label>附件存储地址:</label>
	          <input id="m_accImage" type="text" />
	        </div>
	        <div id="fg">
	          <label>回复编号:</label>
	          <input id="m_retId" type="text" />
	        </div>
	        <div id="fg">
	          <label>附件描述:</label>
	          <input id="m_accDescribe" type="text" />
	        </div>
	        <div id="fg">
	          <label>地点:</label>
	          <input id="m_accAdress" type="text" />
	        </div>
	        <div id="fg">
	          <label>文字描述:</label>
	          <input id="m_accContent" type="text" />
	        </div>
	        <div id="fg">
	          <label>状态:</label>
	          <input id="m_accType" type="text" />
	        </div>
	        <div id="fg">
	          <label>创建时间:</label>
	          <input id="m_createTime" type="text" />
	        </div>
	        <input type="button" value="上传"onclick="upload()"/>
	     </div>
     </div>
  </body>
</html>
