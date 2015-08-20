$(function(){
	var $ca=$("#tb_activity");
	var catemp="";
	$.getJSON("json/plan.json",function(json){
		for(i=0;i<json.length;i=i+1){
			var j=i+1;
			catemp+="<tr><td height='8%' style='text-align:center'>"
				+j+"</td><td height='8%' style='text-align:center;'>"
				+"<a href='#'onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"
				+json[i].m_planName+"</a>"+"</td><td height='8%' style='text-align:center;width:15%'>"
				+"<a href='#'onclick=showopen_shiju("+json[i].m_planId+") style='text-decoration:none;text-align:center'>上传素材</a>"+"</td></tr>"
		}
		$ca.append(catemp);
	});
})

function showplan(){
	$('inner').load("jsp/",function(){
		
	})
}












