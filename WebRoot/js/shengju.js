$(function(){
		var $ca=$("#tb_activity");
		var catemp="";
		var state="";
		var type="";
		var s="";
		$.getJSON("json/plan.json",function(json){
			for(i=0;i<json.length;i++){
				var j=i+1;
				if(json[i].m_planType==0){
					s+="未发布";
					state+="<a href='#'onclick=showopen_shengju("+json[i].m_planId+") style='text-decoration:none;text-align:center'>未发布</a>"
				}else if(json[i].m_planType==1){
					s+="已发布";
					state+="无";
				}else if(json[i].m_planType==2){
					s+="已结束";
					state+="无";
				}
				if(json[i].m_planMold==0){
					type+="<a href='#'onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
				}else if(json[i].m_planMold==1){
					type+="<a href='#'onclick=showplan2("+json[i].m_planId+") style='text-decoration:none;text-align:center'>"+json[i].m_planName+"</a>"
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
function show_shengju(){
	$("#content").load("jsp/shengju.jsp",function(){
		
	})
}
function showplan1(){
	$(".inner").load("jsp/actplan.jsp",function(){
		
	})
	$("#.inner").load("jsp/actplan.jsp?planId="+json[i].m_planId)
}
function showplan2(){
	$(".inner").load("jsp/actplan_talk.jsp",function(){
		
	})
	$(".inner").load("jsp/actplan_talk.jsp?planId="+json[i].m_planId)
}
function showopen_shengju(){
	$(".inner").load("jsp/openactivity.jsp",function(){
		
	})
	$(".inner").load("jsp/openactivity.jsp?planId="+json[i].m_planId)
}
function showsub_shengju(){
	$(".inner").load("jsp/subordinate.jsp",function(){
		
	})
	$(".inner").load("jsp/subordinate.jsp?planId="+json[i].m_planId)
}
