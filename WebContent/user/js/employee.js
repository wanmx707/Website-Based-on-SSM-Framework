//验证员工信息
/*function checkAll(){
	//alert("ok");
	
	//获取用户名，进行验证
	var empName=document.getElementById("txtEmpName");
	if(empName.value==""){
		alert("用户名不能为空");
		return false;
	}

	if(empName.value.length<2||empName.value.length>20){
		alert("用户名长度必须在2~20之间");
		return false;
	}
	
	//获取密码，进行验证
	var password=document.getElementById("txtPassword");
	if(password.value==""){
		alert("密码不能为空");
		return false;
	}

	if(password.value.length<6||password.value.length>20){
		alert("密码长度必须在6~20之间");
		return false;
	}
	
	//获取确认密码，进行验证
	var repassword=document.getElementById("txtRepassword");
	if(repassword.value!=password.value){
		alert("两次输入密码不一致");
		return false;
	}
	
	return true;
}*/

function checkAll(){
	if(chenEmpName()&&checkPassword()&&checkRepassword()){
		return true;
	}
	return false;
} 

//验证员工姓名
function checkEmpName(){
	//获取用户名，进行验证
	var empName=document.getElementById("txtEmpName");
	var msgEmpName=document.getElementById("msgEmpName");
	if(empName.value==""){
		//alert("用户名不能为空");
		msgEmpName.innerHTML="<strong>用户名不能为空</strong>";
		return false;
	}

	if(empName.value.length<2||empName.value.length>20){
		//alert("用户名长度必须在2~20之间");
		msgEmpName.innerHTML="<strong>用户名长度必须在2~20之间</strong>";
		return false;
	}
	
	msgEmpName.innerHTML="<font color='green'>√</font>";
	return true;
}


//验证密码
function checkPassword(){
	//获取密码，进行验证
	var password=document.getElementById("txtPassword");
	var msgPassword=document.getElementById("msgPassword");
	if(password.value==""){
		//alert("密码不能为空");
		msgPassword.innerHTML="<font color='red'>密码不能为空</font>"
		return false;
	}

	if(password.value.length<6||password.value.length>20){
		//alert("密码长度必须在6~20之间");
		msgPassword.innerHTML="<font color='red'>密码长度必须在6~20之间</font>"
		return false;
	}
	msgPassword.innerHTML="<font color='green'>√</font>";
	return true;
}

//验证确认密码
function checkRepassword(){
	var password=document.getElementById("txtPassword");
	var repassword=document.getElementById("txtRepassword");
	var msgRepassword=document.getElementById("msgRepassword");
	if(repassword.value!=password.value){
		//alert("两次输入密码不一致");
		msgRepassword.innerHTML="两次输入密码不一致";
		return false;
	}
	msgRepassword.innerHTML="<font color='green'>√</font>";
	return true;
}


$(document).ready(function(){
	//	$("#btnCheckName").click(function(){
	//	});
	
	$("#btnCheckName").bind("click",function(){
		//alert(2);
		$.ajax("/mycrm/servlet/checkNameExistsServlet",{
			type:"GET",
			async:true,
			data:"empName="+$("#txtEmpName").val(),
			success:function(data){
				//alert("data: "+data);
				if($.trim(data)=="1"){
					$("#msgEmpName").html("该用户名已被注册!!!")
						.css("color","#f00");
				}else{
					$("#msgEmpName").html("该用户名可以使用!!!")
						.css("color","#0f0");
				}
			}
		});
	});
});







