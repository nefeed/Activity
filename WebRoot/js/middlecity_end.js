$(function(){
		var $ca=$("#tb_activity");
		var catemp="";
		var type="";
		$.getJSON("json/plan.json",function(json){
			for(var i=0;i<json.length;i=i+1){
				var j=i+1;
				if(json[i].m_planMold==0){
					type+="<a href='#'onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
				}else if(json[i].m_planMold==1){
					type+="<a href='#'onclick=showplan2("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
				}
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+type+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"已结束"+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"无"+"</td></tr>";
			}
			$ca.append(catemp);
		});
})

function showplan1(){
	$("#.inner").load("jsp/actplan.jsp?planId="+json[i].m_planId)
}
function showplan2(){
	$(".inner").load("jsp/actplan_talk.jsp?planId="+json[i].m_planId)
}



