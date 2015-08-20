var j;
$(function(){
	var m_planId=planId;
	$.getJSON("./",{
		m_planId:m_planId,
	})
	$.getJSON("./",function(){
		var catemp="";
		j=json.length;
		for(i=0;i<json.length;i++){
			catemp+="<input type='radio' id='"+json[i].m_secId+"' value='"+json[i].m_secName+"'/>"
		}
		$("#xiasu").append(catemp);
	});
})

function submit(){
	var m_planId=$("#m_planId").val();
	var m_createId=$("#m_createId").val();
	var m_planName=$("#m_planName").val();
	var m_planGoal=$("#m_planGoal").val();
	var m_planContent=$("#m_planContent").val();
	var m_address=$("#m_address").val();
	var m_planBudget=$("#m_planBudget").val();
	var m_publishId=$("#m_publishId").val();
	var m_createDate=$("#m_createDate").val();
	var m_planType=$("#m_planType").val();
	var m_secId=$("#m_secId").val();
	var m_recriveAble;
	
	for(i=0;i<j-1;i++){
		if(document.getElementById("json[i].m_secId").checked) {
			m_receiveAble+=json[i].m_secId+","
		}
	}
	if(document.getElementById("json[j-1].m_secId").checked) {
		m_receiveAble+=json[i].m_secId
	}
	
	if(m_planId==""){
		alert("请输入计划编号");
		$("#m_planId").focus();
		return false;
	}else if(m_createId==""){
		alert("请输入创建者编号");
		$("#m_createId").focus();
		return false;
	}else if(m_planName==""){
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
	}else if(m_publishId==""){
		alert("请输入发布者编号");
		$("#m_publishId").focus();
		return false;
	}else if(m_createDate==""){
		alert("请输入创建时间");
		$("#m_createDate").focus();
		return false;
	}else if(m_planTypet==""){
		alert("请输入发布状态");
		$("#m_planType").focus();
		return false;
	}else if(m_secId==""){
		alert("请输入所属层编号");
		$("#m_secId").focus();
		return false;
	}
	
	$.getJSON("json/plan.json",{
		m_planId:m_planId,
		m_createId:m_createId,
		m_planName:m_planName,
		m_planGoal:m_planGoal,
		m_planContent:m_planContent,
		m_address:m_address,
		m_planBudget:m_planBudget,
		m_publishId:m_publishId,
		m_createDate:m_createDate,
		m_planType:m_planType,
		m_secId:m_secId,
		m_receiveAble:m_receiveAble,
	},function(json){
		if(json[0].check){
			alert("提交成功！");
			$("#body").load("jsp/shengju.jsp",function(){})
		}else{
			alert("提交失败！");
		}
	})
}