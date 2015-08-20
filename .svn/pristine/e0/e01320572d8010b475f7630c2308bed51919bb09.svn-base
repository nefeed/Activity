var j;
$(function(){
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId,
	},function(json){
		var catemp="";
		j=json.length;
		for(var i=0;i<json.length;i=i+1){
			catemp+="<input type='checkbox'name='subordinate' id='"+json[i].m_secId+"' value='"+json[i].m_secId+"'/>"+json[i].m_secName
		}
		$("#subordinate").append(catemp);
	});
})
//提交自动发布
function submit(){
	var m_planName=$("#m_planName").val();
	var m_planGoal=$("#m_planGoal").val();
	var m_planContent=$("#m_planContent").val();
	var m_address=$("#m_address").val();
	var m_planBudget=$("#m_planBudget").val();
	var m_planMold=$("#m_planMold").val();
	var m_receive=""; 
	var obj=document.getElementsByName("subordinate");
	
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
	
	$.getJSON("./AddActplan",{
		m_createId:m_userId,
		m_planName:m_planName,
		m_planGoal:m_planGoal,
		m_planContent:m_planContent,
		m_address:m_address,
		m_planBudget:m_planBudget,
		m_publishId:m_userId,
		m_planType:1,
		m_planMold:m_planMold,
		m_secId:m_secId,
		m_receive:m_receive,
	},function(json){
		if(json.check){
			alert("提交成功！");
			$("#body").load("jsp/province.jsp")
		}else{
			alert("提交失败！");
		}
	})
}