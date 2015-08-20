<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%String planId=request.getParameter("planId"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>走访活动详情</title>
    
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
	<script type="text/javascript" src="js/actplan_talk.js"></script>
    
    <script type="text/javascript">
      var planId=<%="'"+planId+"'"%>
    </script>
  </head>
  
   <body>
   <div style="width:100%;height:40%;">
		    <div id="fsb">活动内容</div>
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
	          <label>预算:</label>
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
     <table>
        <tr>
           <td>选择市</td>
           <td>
             <select id="city" style="width:150px"onchange="check_city()"><option style='width:120px'></option></select>
		   </td>
		   <td>选择县</td>
		   <td>
             <select id="county" style="width:150px"onchange="check_county()"><option style='width:120px'></option></select>
		   </td>
		   <td>选择营业厅</td>
		   <td>
             <select id="businesshall" style="width:150px"><option style='width:120px'></option></select>
		   </td>
		   <td><input type="button" value="查找" onclick="search()"/></td>
        </tr>
     </table>
     <div>
        <table  id="tb_activity" style="border-spacing:0px;font-size:13px;" width="100%" border="1" >
		   <tr  style="height:25px" >
		     <th >&nbsp;</th>
		     <th >对应编号</th>
		     <th >活动编号</th>
		     <th >员工编号</th>
		     <th >员工名字</th>
		     <th >客户编号</th>
		     <th >客户名字</th>
		   </tr>
		</table>
     </div>
      
  </body>
</html>
