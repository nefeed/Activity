$(function(){
	var catemp="";
	$.getJSON("./ClickActplanButton",{
		m_secId:m_secId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			catemp+="<tr><td height='8%' style='text-align:center'>"
				+j+"</td><td height='8%' style='text-align:center;'>"
				+json[i].m_secId+"</td><td height='8%' style='text-align:center;width:15%'>"
				+json[i].m_secName+"</td></tr>"
		}
		$("#tb_activity").append(catemp);
	});
})