$(function(){
		var $ca=$("#tb_activity");
		var catemp="";
		$.getJSON("./js",function(json){
			for(i=0;i<json.length;i++){
				var j=i+1;
				var state="";
				var s="";
				if(json[i].m_planMold==0){
					state="<a href='#'onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"+json[i].m_planName+"</a>"
					s="<a href='#'onclick=show_upload("+json[i].m_planId+") style='text-decoration:none;text-align:center'>上传</a>"
				}else if(json[i].m_planMold==1){
					state="<a href='#'onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"+json[i].m_planName+"</a>"
					s="无"
				}
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+state+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"					
					+s+"</td></tr>"
			}
			$("#welcome").append(m_userName);
			$ca.append(catemp);
		});
})
function show_upload(){
	$(".inner").load("jsp/upload_shiju.jsp",function(){});
}
function showplan(){
	$(".inner").load("jsp/.jsp",function(){});
}
function showplan1(){
	$(".inner").load("jsp/upload_shiju.jsp",function(){});
}




