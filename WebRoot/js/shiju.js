$(function(){
		var $ca=$("#tb_activity");
		var catemp="";
		$.getJSON("./js",function(json){
			for(i=0;i<json.length;i++){
				var j=i+1;
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+"<a href='#'onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"
					+json[i].m_planName+"</a>"+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"					
					+"<a href='#'onclick=showopen_shiju("+json[i].m_planId+") style='text-decoration:none;text-align:center'>发布</a>"+"</td></tr>"
			}
			$("#welcome").append(m_userName);
			$ca.append(catemp);
		});
})
function unopen(){
	$("#content").load("jsp/shiju.jsp",function(){
		
	})
}
function openact(){
	$(".inner").load("jsp/open_shiju.jsp",function(){
		
	})
}
function end(){
	$(".inner").load("jsp/end_shiju.jsp",function(){
		
	})
}
function showplan(){
	$(".inner").load("jsp/actplan_shiju.jsp",function(){
		
	})
}
function showopen_shiju(){
	$(".inner").load("jsp/openactivity_shiju.jsp",function(){
		
	})
}
function showsub_shiju(){
	$(".inner").load("jsp/subordinate.jsp",function(){
		
	})
}



