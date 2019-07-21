<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>


<script type="text/javascript" src="<%=basePath %>js/jquery-1.4.2.min.js"></script>

<style type="text/css">
h1 {
	font: bold 14px/24px 宋体;
	background: #ccc;
}
</style>
<script type="text/javascript">
	function validatePassword() {
		var passElement = document.getElementById("pass");
		var msgElement = document.getElementById("passMsg");
		if (passElement.value == "") {
			passElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>密码不能为空!</span>";
			return false;
		}
		if (/^\w{6,20}$/.test(passElement.value)) {
			passElement.className = "right";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:green'>密码输入格式正确!</span>";
			return true;
		} else {
			passElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>密码长度应该在6-20之间!</span>";
			return false;
		}
	}
	function validateRePassword() {
		var passElement = document.getElementById("pass");
		var repassElement = document.getElementById("repass");
		var msgElement = document.getElementById("repassMsg");
		if (repassElement.value == "") {
			passElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>密码不能为空!</span>";
			return false;
		}
		if (!(/^\w{6,20}$/.test(repassElement.value))) {
			repassElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>密码长度应该在6-20之间!</span>";
			return false;
		}
		if (passElement.value == repassElement.value) {
			repassElement.className = "right";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:green'>两次密码一致!</span>";
			return true;
		} else {
			repassElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>两次密码不一致!</span>";
			return false;
		}
	}

	function validateRepeat(srcName, desName) { //确定密码与确认密码是否一致
		var srcElement = document.getElementById(srcName);
		var desElement = document.getElementById(desName);
		var msgElement = document.getElementById(desName + "Msg");
		if (srcElement.value == desElement.value) {
			desElement.className = "right";
			msgElement.innerHTML = "<span style='color:green'>输入内容相同!</span>";
			return true;
		} else {
			desElement.className = "wrong";
			msgElement.innerHTML = "<span style='color:red'>输入内容不相同!</span>";
			return false;
		}
	}
	function validatePass() { //验证密码是否为空
		return validateEmpty("pass");
	}
	function validateRepass() { //验证两次密码是否相同
		if (validateEmpty("repass")) { //确认密码不为空
			return validateRepeat("pass", "repass"); //验证密码是否一致
		}
		return false;//确认密码为空，直接返回false
	}

	function validateCode() {
		var codeElement = document.getElementById("code");
		var msgElement = document.getElementById("codeMsg");
		if (codeElement.value == "") {
			codeElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:red'>验证码不能为空!</span>";
			return false;
		}
	}
	function validate() {
		return validatePassword() && validateRePassword() && validateCode();
	}

	function run() {
		
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath }/getpasswordCode.action",			
		}); 
		var btn = document.getElementById("getcode");
		btn.disabled = true;
		var time = 60;//定义时间变量。用于倒计时用
		var timer = null;//定义一个定时器；
		//alert&#40;"aaaa"&#41;;
		timer = setInterval(function() {///开启定时器。函数内执行
			btn.innerText = time + "秒后重新发送"; //点击发生后，按钮的文本内容变成之前定义好的时间值。
			time--;//时间值自减
			if (time == 0) { //判断,当时间值小于等于0的时候
				btn.innerText = '重新发送验证码'; //其文本内容变成……点击重新发送……
				btn.disabled = false;
				clearInterval(timer); //清除定时器
			}
		}, 1000)

	}
</script>
</head>
<body>
	<h1>个人管理--&nbsp;&gt;&gt;&nbsp;修改密码</h1>
	<form action="/comics/setpassword.action" method="post"
		onsubmit="return validate();">
		<table width="90%" align="center" cellpadding="10" cellspacing="0">
			<tr>
				<input type="hidden" name="userid" value="${user.userid }" />
				<td></td>
				<td><h2>
						您的信息：</strong>
					</h2>
			</tr>
			<tr>
				<th><span class="rq">*</span><label
					for="password5aa765d61d8327de">密码:</label></th>
				<td><input type="password" name="userpassword" id="pass"
					onblur="validatePassword();" class="init" value="" /></td>
				<td><span id="passMsg"></span></td>
			</tr>
			<tr>
				<th><span class="rq">*</span><label
					for="password25aa765d61d8327de">确认密码:</label></th>
				<td><input type="password" name="repass" id="repass"
					onblur="validateRePassword();" class="init" value="" /></td>
				<td><span id="repassMsg"></span></td>
			</tr>
			<tr>
				<th><span class="rq">*</span><label for="email786a0b4a39efab23">验证码:</label></th>
				<td><input type="text" name="code" id="code" class="init"
					onblur="validateCode();" /></td>
				<td><button class="sendVerifyCode" type="button" name="getcode"
						id="getcode" onclick="run()">获取验证码</button> <span id="codeMsg"
					style="color: red">${worng }</span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="确认修改" /></td>
			</tr>
		</table>
	</form>
</body>
</html>