var j="";
var m_planId="";
var m_createId="";
var m_publishId=m_userId;
var m_planMold="";
var m_receive="";
$(function(){
	m_planId = planId;
	$.getJSON("./QueryActplanByPlanId",{
		m_planId:m_planId,
	},function(json){
		$("#m_planName").val(json[0].m_planName);
		$("#m_planGoal").val(json[0].m_planGoal);
		$("#m_planContent").val(json[0].m_planContent);
		$("#m_address").val(json[0].m_address);
		$("#m_planBudget").val(json[0].m_planBudget);
		m_createId=json[0].m_createId;
		m_planMold=json[0].m_planMold;
	});
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId,
	},function(json){
		var catemp="";
		j=json.length;
		for(var i=0;i<json.length;i=i+1){
			catemp+="<input type='checkbox'name='subordinate' id='"+json[i].m_secId+"' value='"+json[i].m_secId+"'/>"+json[i].m_secName;
		}
		$("#subordinate").append(catemp);
	});

});

function submit(){
	var m_planName=$("#m_planName").val();
	var m_planGoal=$("#m_planGoal").val();
	var m_planContent=$("#m_planContent").val();
	var m_address=$("#m_address").val();
	var m_planBudget=$("#m_planBudget").val();
	var obj=document.getElementsByName("subordinate");
	
	j=obj.length;
	alert(j);
	for(var i=0;i<j-1;i=i+1){
		if(obj[i].checked) {
			m_receive+=obj[i].value+",";
		}
	}
	if(obj[j-1].checked) {
		m_receive+=obj[j-1].value;
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
		m_publishId:m_publishId,
		m_planMold:m_planMold,
		m_secId:m_secId,
		m_receive:m_receive
	},function(json){
		if(json.check){
			alert("提交成功！");
			if(m_secType==0){
				$("#body").load("jsp/province.jsp");
			}else if(m_secType==1||m_secType==2){
				$("#body").load("jsp/middlecity.jsp");
			}else if(m_secType==3){
				$("#body").load("jsp/businesshall.jsp");
			}else if(m_secTyep==4){
				$("#body").load("jsp/assistant.jsp");
			}
		}else{
			alert("提交失败！");
		}
	});
}