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
	$.getJSON("./ClickActplanButton",{
		 m_secId:m_secId,
	},function(json){			
		 city=json.length;
		 var catemp="";
		 for(var i=0;i<json.length;i=i+1){
			catemp+="<option id='"+json[i].m_secId+"' style='width:120px'>"+json[i].m_secName+"</option>"
		 }
		$("#city").append(catemp);
								
	})
})
var county="";	
var businesshall="";
var city="";
function check_city(){
	var m_secId2=$("#city option:selected").attr("id");
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId2,
	},function(json){
		county=json.length;
		var catemp="";
		for(var i=0;i<json.length;i=i+1){
			catemp+="<option id='"+json[i].m_secId+"'style='width:120px'>"+json[i].m_secName+"</option>"
		}
		$("#county").append(catemp);
	})	
}
function check_county(){
	var m_secId3=$("#county option:selected").attr("id");
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId3,
	},function(json){
		businesshall=json.length;
		var catemp="";
		for(var i=0;i<json.length;i=i+1){
			catemp+="<option id='"+json[i].m_secId+"'style='width:120px'>"+json[i].m_secName+"</option>"
		}
		$("#businesshall").append(catemp);
	})	
}
function search(){
	for(var i=0;i<city;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			city=json[i].m_secId;
		}
	}
	for(var i=0;i<county;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			county=json[i].m_secId;
		}
	}
	for(var i=0;i<businesshall;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			businesshall=json[i].m_secId;
		}
	}
	
	$.getJSON("./QueryMappingByBusSecId",{
		m_busSecId:$("#businesshall option:selected").attr("id")
	},function(json){
		
		for(var i=0;i<json.length;i=i+1){   
			var j=i+1;
			var caTemp="";
			caTemp="<tr style='text-align:center'><td height=10px >"
				+j+"</td><td>"
				+json[i].m_mapId+"</td><td>"
				+json[i].m_planId+"</td><td>"
				+json[i].m_userId+"</td><td>"
				+json[i].m_userName+"</td><td>"
				+json[i].m_cusId+"</td><td>"
				+json[i].m_cusName+"</td><tr>"
				$("#tb_activity").append(caTemp);
		}	
		

	})
	
}
