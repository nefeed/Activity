function Login(){
	var m_userPhone=$("#userPhone").val();
	var m_userPwd=$("#userPwd").val();

	$.getJSON("./Login",{
		m_userPhone:m_userPhone,
		m_userPwd:m_userPwd,
	},function(json){
		if(json.result==1){
			alert("登录成功");
			location.href="index.jsp";
		}else if(json.result==2){
			alert("密码错误");
		}else if(json.result==3){
			alert("没有该用户");
		}else{
			alert("登录失败");
		}
	});

}



