var j="";
var m_receive="";
var m_mapSub="";
var m_mapCus="";
var pass="";
var m_planId="";
//获得活动信息
$(function(){
	m_planId = planId;
	$.getJSON("./QueryActplanByPlanId",{
		m_planId:m_planId,
	},function(json){
		var m_createId=json[0].m_createId;
		$("#m_planName").val(json[0].m_planName);
		$("#m_planGoal").val(json[0].m_planGoal);
		$("#m_planContent").val(json[0].m_planContent);
		$("#m_address").val(json[0].m_address);
		$("#m_planBudget").val(json[0].m_planBudget);
		var m_planMold=json[0].m_planMold;
	})
})
$(function(){
	//获得下属信息
	var catemp="";
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			catemp+="<option name='subordinate' id='"+json[i].m_userId+"' value='"+json[i].m_userId+','+json[i].m_secId+"'>"+json[i].m_userName+"</option>";
		}
		$("#Subordinates").append(catemp);
	});
})
$(function(){
	//获得客户信息
	var catemp="";
	$.getJSON("./QueryCustomerBySecId",{
		m_secId:m_secId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			catemp+="<input type='checkBox' id='"+json[i].m_cusId+"' value='"+json[i].m_cusId+"'/>"+json[i].m_cusName;
		}
		$("#Customers").append(catemp);
	});
})
function submit(){
	var m_planName=$("#m_planName").val();
	var m_planGoal=$("#m_planGoal").val();
	var m_planContent=$("#m_planContent").val();
	var m_address=$("#m_address").val();
	var m_planBudget=$("#m_planBudget").val();
	mapSub=document.getElementsByName("Subordinates");
	var objCus=document.getElementsByName("Customers");
	j=objCus.length;
	alert(j);
	for(var i=0;i<j-1;i=i+1){
		if(objCus[i].checked){
			m_mapCus+=objCus[i].value+",";
		}
	}
	if(objCus[j-1].checked){
		m_mapCus+=objCus[i].value+",";
	}
	
	if(m_planName==""){
		alert("请输入活动名称");
		$("#m_planName").focus();
		return false;
	}else if(m_planGoal==""){
		alert("请输入活动目的");
		$("#m_planGoal").focus();
		return false;
	}else if(m_planContent==""){
		alert("请输入计划内容");
		$("#m_planContent").focus();
		return false;
	}else if(m_address==""){
		alert("请输入地址");
		$("#m_address").focus();
		return false;
	}else if(m_planBudget==""){
		alert("请输入预算");
		$("#m_planBudget").focus();
		return false;
	}
	$.getJSON("./PublishActplan",{
		m_planId:m_planId,
		m_createId:m_createId,
		m_planName:m_planName,
		m_planGoal:m_planGoal,
		m_planContent:m_planContent,
		m_address:m_address,
		m_planBudget:m_planBudget,
		m_publishId:m_userId,
		m_planMold:m_planMold,
		m_secId:m_secId,
		m_receive:m_receive
	},function(json){
		if(json.check){
			alert("提交任务成功！");
		}else{
			alert("提交失败！");
		}
	});
	$.getJSON("./MaxPlanId",{
		m_userId:m_userId,
	},function(json){
		m_planId=json.m_planId;
	})
	$.getJSON("./AddMapping",{
		m_planId:m_planId,
		m_secId:m_secId,
		m_mapSub:m_mapSub.value,
		m_mapCus:m_mapCus,
	},function(json){
		if(json.check){
			alert("委派任务成功！");
		}else{
			alert("委派任务失败！");
		}
	})	
}