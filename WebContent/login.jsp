<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>立即登录</title>

<link rel="stylesheet" type="text/css"
	href="static/css/style_14_common.css" />
<link rel="stylesheet" type="text/css"
	href="static/css/style_14_member_register.css" />
<script type="text/javascript">
	var STYLEID = '14', STATICURL = 'static/', IMGDIR = 'static/image/common', VERHASH = 'TUZ', charset = 'utf-8', discuz_uid = '0', cookiepre = 'fDLT_2132_', cookiedomain = '', cookiepath = '/', showusercard = '1', attackevasive = '0', disallowfloat = 'newthread|reply', creditnotice = '1|威望|,2|贝里|,3|贡献|,4|点评指数|', defaultstyle = '', REPORTURL = 'aHR0cDovL2Jicy50YWxrb3AuY29tL21lbWJlci5waHA/bW9kPTI1Njc4YzViMTI4OGFhNzA=', SITEURL = 'http://bbs.talkop.com/', JSPATH = 'http://res.talkop.com/static/js/', CSSPATH = 'http://res.talkop.com/data/cache/style_', DYNAMICURL = '';
</script>
<script src="static/js/common.js" type="text/javascript"></script>
<link rel="stylesheet" id="css_widthauto" type="text/css"
	href='static/css/style_14_widthauto.css' />
<link rel="stylesheet" type="text/css" href="static/css/style.css" />
<link rel="stylesheet" href="static/css/oculus.css" />
<link rel="stylesheet" href="static/css/nc.css" />

<link rel="stylesheet" href="css/base.css" type="text/css" />
<script type="text/javascript">
	HTMLNODE.className += ' widthauto'
</script>

<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700"
	rel="stylesheet" />
<link type="text/css" rel="stylesheet" href="js/login/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="js/login/slick.css" />
<link type="text/css" rel="stylesheet" href="js/login/slick-theme.css" />
<link type="text/css" rel="stylesheet"
	href="js/login/nouislider.min.css" />
<link rel="stylesheet" href="js/login/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="js/login/style.css" />
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
<style type="text/css">
.main {
	width: 600px;
	height: 70%;
}

.put {
	width: 160px;
	height: 23px;
}

.form1 {
	margin-top: 100px;
}
</style>
</head>
<body id="nv_member" class="pg_register">

	<%@include file="top.jsp"%>
	<!--网站通用结束-->
	<div class="warp" style="position: relative; z-index: 11">
		<a href="#" target="_blank" id="bg_link"></a>
		<div class="warpbox"
			style="position: relative; z-index: 22; width: 980px; margin: 0 auto">
			<div id="header">
				<div>
					<img src="images/head2.jpg" />
				</div>
				<div>
					<img src="images/head3.jpg" />
				</div>
				<ul class="menu">
					<li><a href="queryindex.action" target="_blank">海贼王分享网</a></li>
					<li><a href="findcomics.action" target="_blank">海贼王漫画</a></li>
					<li><a href="findanime.action" target="_blank">海贼王动画</a></li>
					<li><a href="findvideoPage.action" target="_blank">海贼视频</a></li>
					<li><a href="finddata.action" target="_blank">资料</a></li>
					<li><a href="findPicture.action" target="_blank">图片</a></li>
					<li><a href="findInformation.action" target="_blank">资讯情报</a></li>
					<li><a href="findNews.action" target="_blank">海贼分析</a></li>
				</ul>
			</div>
			<!-- 头部結束 -->

			<script src="static/js/nc.js"></script>
			<script src="static/js/oculus_nc.js"></script>

			<form action="Login.action" method="post" class="form1">
				<center>
					<div class="main">
						<table background="images/08.jpg" width="600px">
							<tr>
								<td colspan="4"><img src="images/06.jpg" /></td>
							</tr>
							<tr>
								<td colspan="4">&nbsp;</td>
							</tr>
							<tr>
								<td align="right">用&nbsp;户&nbsp;名：</td>
								<td><input type="text" name="username" class="put"
									value="${user.username }" /></td>
								<td><font color="red">${loginmessage}</font></td>
								<td><a href="register.jsp"><img src="images/09.jpg"
										border="0px" /></a></td>
							</tr>
							<tr>
								<td colspan="4">&nbsp;</td>
							</tr>
							<tr>
								<td align="right">密&nbsp;&nbsp;&nbsp;码：</td>
								<td><input type="password" name="userpassword" class="put" /></td>
								<td><font color="red"></font></td>
								<td><a href="findPassword.jsp"><img src="images/10.jpg" border="0px" /></a></td>
							</tr>
							<tr>
								<td colspan="4">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><input type="submit" value="登录" /></td>
								<td>&nbsp;</td>
							</tr>
						</table>
					</div>
				</center>
			</form>

			<!-- 尾部 -->
			<div class="cl"></div>
			<div id="footerlogin" align="center">
				<%@include file="foot.jsp"%>
			</div>
		</div>
	</div>

	<script src="static/js/home.js" type="text/javascript"></script>
</body>
</html>
