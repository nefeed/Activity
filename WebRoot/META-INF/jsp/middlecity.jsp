<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>市县局欢迎界面</title>
    
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
	<script type="text/javascript" src="js/middlecity.js"></script>

  </head>
  
  <body>
       <div id="content">
	     <div id="top">
	         <div style="font-size:48px"></div>
	         <div id="welcome"style="float:right;margin-left:-50px;width:200px;height:20px">欢迎</div>
	     </div>
	     <div style="margin-top:-20px; ">
	       <a href="" style="float:right;text-decoration:none;color:white;margin-right:45px;cursor:hand">退出</a>
	    </div>
	    <div class="contain">  
	     <div class="left">
	        <div  style="width:225px;height:460px;margin-left:12.5px;">   
                  <div class="view_a">
                     <input type="button" class="btn" value="未发布活动" onclick="ActplanList()" id="admin"/></div>
                  <div class="view_a">
                     <input type="button" class="btn" value="已发布活动" onclick="HavePublishedActplan()" id="admin"/></div>
                  <div class="view_a">
                     <input type="button" class="btn" value="下属单位" onclick="subordinate()" id="admin"/></div>
	    	</div>
	     </div>
	     <div class="right">
	          <div class="inner" >
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
	     </div> 
	    </div>     
    </div>
  </body>
</html>
