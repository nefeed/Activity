
$(function(){
	var m_planId=$("#planId").val();
	$.getJSON("json/plan.json",{
		m_planId:m_planId,
	},function(json){
		if(json[0].check){
			alert("提交成功！");
			$(function(){
				$.getJSON("./",function(){
					if(m_planMold==0){
						document.getElementByID('talk').style.display= 'none';
						document.getElementByID('back').style.display= '';
						$("#m_recId").val(json[0].m_recId);
						$("#m_secId").val(json[0].m_secId);
						$("#m_planId").val(json[0].m_planId);
						$("#m_userId").val(json[0].m_userId);
					}else if(m_planMold==1){
						document.getElementByID('talk').style.display= '';
						document.getElementByID('back').style.display= 'none';
						if(m_secType==1){
							document.getElementByID('shi').style.display= 'none';
							$.getJSON("./",function(){
								xian=json.length;
								for(i=0;i<jaon.length;i++){
									catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
								}
								$("#xian").append(catemp);
							});
						}else if(m_secType==2){
							document.getElementByID('shi').style.display= 'none'; 
							document.getElementByID('xian').style.display= 'none';
							$.getJSON("./",function(){
								xian=json.length;
								for(i=0;i<jaon.length;i++){
									catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
								}
								$("ting").append(catemp);
							});
						}else if(m_secType==3){
							document.getElementByID('shi').style.display= 'none';
							document.getElementByID('xian').style.display= 'none';
							document.getElementByID('ting').style.display= 'none';
							$.getJSON("./",function(){
								xian=json.length;
								for(i=0;i<jaon.length;i++){
									catemp+="<option id='"+json[i].m_secId+"'>"+json[i]+"</option>"
								}
								$("#assistant").append(catemp);
							});
						}
					}
					$("#m_planId").val(json[0].m_planId);
					$("#m_createId").val(json[0].m_createId);
					$("#m_planName").val(json[0].m_planName);
					$("#m_planGoal").val(json[0].m_planGoal);
					$("#m_planContent").val(json[0].s_class);
					$("#m_address").val(json[0].m_address);
					$("#m_planBudget").val(json[0].m_planBudget);
					$("#m_publishId").val(json[0].m_publishId);
					$("#m_createDate").val(json[0].m_createDate);
					$("#m_planType").val(json[0].m_planType);
					$("#m_secId").val(json[0].m_secId);
				});
			})
		}else{
			alert("提交失败！");
		}
	})
})


function search(){
	var m_receiveAble="";
	for(i=0;i<shi;i++){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId+",";
		}
	}
	for(i=0;i<xian;i++){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId+",";
			
		}
	}
	for(i=0;i<ting;i++){
		if ($("#json[i].m_secId").attr("selected") == true) {
			m_receiveAble+=json[i].m_secId;
		}
	}
	
	$.getJSON("json/plan.json",{
		m_receiveAble:m_receiveAble,
	},function(json){
		if(json[0].check){
			alert("提交成功！");
			$.getJSON("./",function(json){ 
				var caTemp="";
				for(i=0;i<json.length;i++){   
					var j=i+1;
					caTemp="<tr style='text-align:center'><td height=10px >"
						+j+"</td><td>"
						+json[i].m_mapId+"</td><td>"
						+json[i].m_planId+"</td><td>"
						+json[i].m_userId+"</td><td>"
						+json[i].m_cusId+"</td><td>"+"</td><tr>"
				}	
				$("#tb_activity").append(caTemp);
			})
		}else{
			alert("提交失败！");
		}
	})
}



