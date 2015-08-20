$(function(){
	var m_planId=planId;
	$.getJSON("json/plan.json",{
		m_planId:m_planId,
	},function(json){
		if(json[0].check){
			alert("提交成功！");
			$("#m_planId1").val(json[0].m_planId1);
			$("#m_createId1").val(json[0].m_createId1);
			$("#m_planName1").val(json[0].m_planName1);
			$("#m_planGoal1").val(json[0].m_planGoal1);
			$("#m_planContent1").val(json[0].s_class1);
			$("#m_address1").val(json[0].m_address1);
			$("#m_planBudget1").val(json[0].m_planBudget1);
			$("#m_publishId1").val(json[0].m_publishId1);
			$("#m_createDate1").val(json[0].m_createDate1);
			$("#m_planType1").val(json[0].m_planType1);
			$("#m_secId1").val(json[0].m_secId1);
			
			$("#m_planId2").val(json[0].m_planId2);
			$("#m_createId2").val(json[0].m_createId2);
			$("#m_planName2").val(json[0].m_planName2);
			$("#m_planGoal2").val(json[0].m_planGoal2);
			$("#m_planContent2").val(json[0].s_class2);
			$("#m_address2").val(json[0].m_address2);
			$("#m_planBudget2").val(json[0].m_planBudget2);
			$("#m_publishId2").val(json[0].m_publishId2);
			$("#m_createDate2").val(json[0].m_createDate2);
			$("#m_planType2").val(json[0].m_planType2);
			$("#m_secId2").val(json[0].m_secId2);
			if(m_secType==1){
				var city=document.getElementById('city');
				city.style.display= 'none';
				$.getJSON("./",{m_secId:m_secId},function(json){
					var catemp="";
					county=json.length;
					for(var i=0;i<json.length;i=i+1){
						catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
					}
					$("#county").append(catemp);
				})				
			}else if(m_secType==2){
				var city=document.getElementById('city');
				city.style.display= 'none'; 
				var county=document.getElementById('county');
				county.style.display= 'none';	
				$.getJSON("./",{m_secId:m_secId},function(json){
					var catemp="";
					businesshall=json.length;
					for(var i=0;i<json.length;i=i+1){
						catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
					}
					$("#businesshall").append(catemp);
				})
			}	
			
		}else{
			alert("提交失败！");
		}
	})
})

function check_county(){
	var m_secId=$("#county option:selected").attr("id");
	$.getJSON("./",{
		m_secId:m_secId,
	},function(json){
		var catemp="";
		county=json.length;
		for(var i=0;i<json.length;i=i+1){
			catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
		}
		$("#county").append(catemp);
	})	
}
function check_hall(){
	var m_secId=$("#businesshall option:selected").attr("id");
	$.getJSON("./",{
		m_secId:m_secId,
	},function(json){
		var catemp="";
		businesshall=json.length;
		for(var i=0;i<json.length;i=i+1){
			catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
		}
		$("#businesshall").append(catemp);
	})	
}

function search(){
	var m_receiveAble="";
	for(var i=0;i<city.length;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId+",";
		}
	}
	for(var i=0;i<county.length;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId+",";
			
		}
	}
	for(var i=0;i<businesshalllength;i=i+1){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId;
		}
	}
	
	$.getJSON("json/plan.json",{
		m_receiveAble:m_receiveAble,
	},function(json){
		if(json[0].check){
			alert("提交成功！");
			var caTemp="";
			for(var i=0;i<json.length;i=i+1){   
				var j=i+1;
				caTemp="<tr style='text-align:center'><td height=10px >"
					+j+"</td><td>"
					+json[i].m_mapId+"</td><td>"
					+json[i].m_planId+"</td><td>"
					+json[i].m_userId+"</td><td>"
					+json[i].m_userName+"</td><td>"
					+json[i].m_cusId+"</td><td>"
					+json[i].m_cusName+"</td><tr>"
			}	
			$("#tb_activity").append(caTemp);
		}else{
			alert("提交失败！");
		}
	})
}



