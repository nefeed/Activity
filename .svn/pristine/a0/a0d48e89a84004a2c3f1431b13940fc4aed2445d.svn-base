$("#welcome").append(m_userName);
$(function(){
	var $ca=$("#tb_activity");
	var catemp="";
	$.getJSON("./QueryUnPublishActplan",{
		m_secId:m_secId,
		m_userId:m_userId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			var type="";
			if(json[i].m_planMold==0){
				planMold="普通活动";
				type="<a onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"
				   +json[i].m_planName+"</a>";
				json[i].m_planType="未发布";
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+type+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"	
					+json[i].m_planType+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"<a onclick=PushActplan("+json[i].m_planId+") style='text-decoration:none;text-align:center'>发布</a>"+"</td></tr>";
			}else if(json[i].m_planMold==1){
				planMold="走访活动";
				type="<a onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"
				   +json[i].m_planName+"</a>";
				json[i].m_planType="委派中";
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+type+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"	
					+json[i].m_planType+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"<a onclick=businesshallAppoint("+json[i].m_planId+") style='text-decoration:none;text-align:center'>委派</a>"+"</td></tr>";
			}
		}
		$ca.append(catemp);
	});
	
});
function businesshall_unpublish(){
	$("#content").load("jsp/businesshall.jsp");
}
function HavePublishedActplan(){
	$(".inner").load("jsp/HavePublishedActplan.jsp");
}
function subordinate(){
	$(".inner").load("jsp/subordinate.jsp");
}
function AddCustomer(){
	$(".inner").load("jsp/AddCustomer.jsp");
}
function ShowCustomer(){
	$(".inner").load("jsp/ShowCustomer.jsp");
}


function showplan(planId){
	$(".inner").load("jsp/actplan.jsp?planId="+planId);
}
function showplan1(planId){
	$(".inner").load("jsp/actplan_talk.jsp?planId="+planId);
}
function PushActplan(planId){
	$(".inner").load("jsp/PushActplan.jsp?planId="+planId);
}
function businesshallAppoint(planId){
	alert(planId);
	$(".inner").load("jsp/businesshallAppoint.jsp?planId="+planId);
}
