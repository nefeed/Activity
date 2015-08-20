$(function(){
	var m_planId=planId;
	$.getJSON("./Login",{
		m_planId:m_planId,
	},function(json){
		if(json[0].check){
			alert("显示成功！");
			$("#m_planId").val(json[0].m_planId);
			$("#m_createId").val(json[0].m_createId);
			$("#m_planName").val(json[0].m_planName);
			$("#m_planGoal").val(json[0].m_planGoal);
			$("#m_planContent").val(json[0].m_planContent);
			$("#m_address").val(json[0].m_address);
			$("#m_planBudget").val(json[0].m_planBudget);
			$("#m_publishId").val(json[0].m_publishId);
			$("#m_createDate").val(json[0].m_createDate);
			$("#m_planType").val(json[0].m_planType);
			$("#m_secId").val(json[1].m_secId);
			$("#m_planId1").val(json[1].m_planId);
			$("#m_createId1").val(json[1].m_createId);
			$("#m_planName1").val(json[1].m_planName);
			$("#m_planGoal1").val(json[1].m_planGoal);
			$("#m_planContent1").val(json[1].m_planContent);
			$("#m_address1").val(json[1].m_address);
			$("#m_planBudget1").val(json[1].m_planBudget);
			$("#m_publishId1").val(json[1].m_publishId);
			$("#m_createDate1").val(json[1].m_createDate);
			$("#m_planType1").val(json[1].m_planType);
			$("#m_secId1").val(json[0].m_secId);
			
			var $ca=$("#tb_activity");
			var catemp="";
			for(var i=0;i<json.length;i=i+1){
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+json[i].m_retId+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_secName+"</td><td height='8%' style='text-align:center;width:15%'>"	
					+json[i].m_planName+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_userName+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"<select id='"+json[i].m_retId+"' style='width:60px;margin-top:-36px;margin-left:45px'> </select>"
					+"<input type='button'value='查看' onclick='back("+json[i].m_retId+")'style='margin-top:-45px;margin-left:0px'/>"+"</td></tr>"
			}
		}else{
			alert("显示失败！");
		}
	})
})
//显示选中的附件
function back(m_retId){
	var obj = document.getElementById("m_retId");
}




