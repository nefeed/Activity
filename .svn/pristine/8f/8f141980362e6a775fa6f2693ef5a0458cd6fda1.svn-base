$(function(){
	var $ca=$("#tb_activity");
	var catemp="";
	$.getJSON("./QueryCustomerBySecId",{
		m_secId:m_secId,
	},function(json){
		for(var i=0;i<json.length;i=i+1){
			var j=i+1;
			var state="";
			var s="";
			if(json[i].m_cusType==0){
				state="<a onclick=ShowCustomerInformation("+json[i].m_cusId+") style='text-decoration:none;text-align:center' >"+json[i].m_cusName+"</a>"
				s="<a onclick=DeleteCustomer("+json[i].m_cusId+") style='text-decoration:none;text-align:center'>清楚</a>"
				catemp+="<tr><td height='8%' style='text-align:center'>"
					+j+"</td><td height='8%' style='text-align:center;'>"
					+state+"</td><td height='8%' style='text-align:center;width:15%'>"
					+json[i].m_cusTel+"</td><td height='8%' style='text-align:center;width:15%'>"	
					+json[i].m_cusAddress+"</td><td height='8%' style='text-align:center;width:15%'>"
					+"正常"+"</td><td height='8%' style='text-align:center;width:15%'>"
					+s+"</td></tr>"
			}
		}
		$ca.append(catemp);
	});
})
function ShowCustomerInformation(cusId){
	$(".inner").load("jsp/ShowCustomerInformation.jsp?cusId="+cusId);
}
function DeleteCustomer(cusId){
	var m_cusId=cusId;
	$.getJSON("./DeleteCustomer",{m_cusId:m_cusId},function(json){
		if(json.check){
			alert("客户清楚成功！");
		}else{
			alert("清楚客户失败！");
		}
	})
	$(".inner").load("jsp/ShowCustomer.jsp");
}
