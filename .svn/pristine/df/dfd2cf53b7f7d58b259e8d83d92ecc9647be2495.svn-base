function submit(){
	var m_cusName=$("#m_cusName").val();
	var m_cusAddress=$("#m_cusAddress").val();
	var m_cusTel=$("#m_cusTel").val();
	
	if(m_cusName==""){
		alert("请输入客户姓名！");
		$("#m_planName").focus();
		return false;
	}else if(m_cusAddress==""){
		alert("请输入客户地址！");
		$("#m_planGoal").focus();
		return false;
	}else if(m_cusTel==""){
		alert("请输入客户电话！");
		$("#m_planContent").focus();
		return false;
	}
	
	$.getJSON("./AddCustomer",{
		m_cusName:m_cusName,
		m_cusAddress:m_cusAddress,
		m_cusTel:m_cusTel,
		m_secId:m_secId,
	},function(json){
		if(json.check){
			alert("添加成功！");
			$("#body").load("jsp/businesshall.jsp");
		}else{
			alert("添加失败！");
		}		
	})
}