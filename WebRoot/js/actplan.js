$(function(){
	var m_planId = planId;
	$.getJSON("./QueryActplanByPlanId",{
		m_planId:m_planId,
	},function(json){
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
		$("#m_secId").val(json[0].m_secId);
	})
})
function back(){
	var m_accId=document.getElementById("back");
	$.getJSON("./",{
		m_accId:m_accId,
	})	
}





