$(function(){
	var $ca=$("#tb_activity");
	var catemp="";
	$.getJSON("./QueryPublishActplan",{
		m_secId:m_secId,
		m_userId:m_userId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			var state="";
			var s="";
			if(json[i].m_planMold==0){
				state="<a href='#'onclick=showplan("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"+json[i].m_planName+"</a>"
				s="<a href='#'onclick=showupload("+json[i].m_planId+") style='text-decoration:none;text-align:center'>上传</a>"
				json[i].m_planMold="普通活动"
			}else if(json[i].m_planMold==1){
				state="<a href='#'onclick=showplan1("+json[i].m_planId+") style='text-decoration:none;text-align:center' >"+json[i].m_planName+"</a>"
				s="无"
				json[i].m_planMold="走访活动"
			}
			json[i].m_planType="已发布"
			catemp+="<tr><td height='8%' style='text-align:center'>"
				+j+"</td><td height='8%' style='text-align:center;'>"
				+state+"</td><td height='8%' style='text-align:center;width:15%'>"
				+json[i].m_planMold+"</td><td height='8%' style='text-align:center;width:15%'>"	
				+json[i].m_planType+"</td><td height='8%' style='text-align:center;width:15%'>"
				+s+"</td></tr>"
		}
		$ca.append(catemp);
	});
})
function showplan(){
	$(".inner").load("jsp/middlecity_actplan.jsp",function(){});
}
function showplan1(){
	$(".inner").load("jsp/middlecity_actplan_talk.jsp",function(){});
}
function showupload(){
	$(".inner").load("middlecityupload.jsp",function(){});
}







