$(function(){
	var $ca=$("#tb_activity");
	var catemp="";
	$.getJSON("json/plan.json",function(json){
		for(i=0;i<json.length;i++){
			var j=i+1;
			catemp+="<tr><td height='8%' style='text-align:center'>"
				+j+"</td><td height='8%' style='text-align:center;'>"
				+"<a href='#'onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"
				+json[i].m_planName+"</a>"+"</td><td height='8%' style='text-align:center;width:15%'>"
				+json[i].m_planMold+"</td><td height='8%' style='text-align:center;'>"+"无"+"</td></tr>"
		}
		$ca.append(catemp);
	});
})
function showplan(){
	$(".inner").load("actplan_talk_shiju.jsp",function(){
		$(".inner").load("jsp/shengju.jsp?value="+json[i].m_planId);
	});
}



