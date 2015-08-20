$("#welcome").append(m_userName);
$(function(){
		var $ca=$("#tb_activity");
		$.getJSON("./QueryMyActplan",{
			m_userId:m_userId,
		},function(json){
			var catemp="";
			for(var i=0;i<json.length;i=i+1){
				var state="";
				var type="";
				var s="";
				var j=i+1;
				if(json[i].m_planType==1){
					s="已发布";
					state="<a onclick=Finish("+json[i].m_planId+") style='text-decoration:none;text-align:center'>结束</a>";
				}else if(json[i].m_planType==2){
					s="已结束";
					state="无";
				}
				if(json[i].m_planMold==0){
					type="<a onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
				}else if(json[i].m_planMold==1){
					type="<a onclick=showplan2("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
				}
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+type+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"
					+s+"</td><td height='8%' style='text-align:center;width:15%'>"
					+state+"</td></tr>";
			}
			$ca.append(catemp);
		});
})

function CreateActplan(){
	$(".inner").load("jsp/CreateActplan.jsp")
}
function ActplanList(){
	$("#content").load("jsp/province.jsp")
}
function subordinate(){
	$(".inner").load("jsp/subordinate.jsp")
}


function showplan1(planId){
	$(".inner").load("jsp/actplan.jsp?planId="+planId);
}
function showplan2(planId){
	$(".inner").load("jsp/actplan_talk.jsp?planId="+planId);
}

function Finish(planId){
	var m_planId=planId;
	$.getJSON("./FinishActplan",{m_planId:m_planId},function(json){
		if(json.check){
			alert("该活动结束！");
		}else{
			alert("结束活动失败！");
		}
	})
}




