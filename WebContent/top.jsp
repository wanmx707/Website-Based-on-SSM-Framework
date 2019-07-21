<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>

<script type="text/javascript">
function dologin(){
		var a='<%=session.getAttribute("username")%>';
		var type='<%=session.getAttribute("type")%>';
		var denglu = document.getElementById("denglu");
		var zhuce = document.getElementById("zhuce");
		var youname = document.getElementById("youname");
		var zhuxiao = document.getElementById("zhuxiao");
		var leixing = document.getElementById("usertype");
		if (a !== 'null') {
			denglu.style.display = "none";
			zhuce.style.display = "none";
			if(type==1){	
			youname.innerHTML=youname.innerHTML+'欢迎你：<a href="user/user.jsp" target="_Blank"><%=session.getAttribute("username")%></a>';
			}else if(type==2){
			youname.innerHTML=youname.innerHTML+'欢迎你：<a href="user/userMangement.jsp" target="_Blank"><%=session.getAttribute("username")%></a>';
			}
			zhuxiao.style.display = "block";
			youname.style.display = "block";
		}
	}
</script>
</head>
<body onload="dologin()">
	<!--网站通用顶部-->
	<div id="newbarbox">
		<div id="newbar">
			<div id="barbox">
				<h3>
					<div id="denglu" style='display: block;'>
						<a href="login.jsp" target="_blank">登录</a>
					</div>
					<div id="youname" style='display: none;'></div>
				</h3>
				<h3>
					<div id="zhuce" style='display: block;'>
						<a href="register.jsp" target="_blank">注册</a>
					</div>
					<div id="zhuxiao" style='display: none;'>
						<a href="Logout.action">注销</a>
					</div>
				</h3>
				<h3>
					<a href="http://bbs.talkop.com/" target="_blank">talkop海贼王论坛</a> <a
						href="#" target="_blank"><strong><font
							color="#FF0000">建议/求片</font></strong></a>
				</h3>
			</div>
		</div>
	</div>
</body>
</html>