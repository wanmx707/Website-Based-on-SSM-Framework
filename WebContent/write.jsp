<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta http-equiv="Content-Type"
	content="multipart/form-data; charset=utf-8" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<title>海贼王漫画中文网_海贼王922_海贼王859</title>
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
<link href="static/css/haizeiwang_global.css" rel="stylesheet"
	type="text/css" />
<script src="<%=basePath%>xheditor/jquery/jquery-1.4.4.min.js"></script>
<script src="<%=basePath%>xheditor/xheditor-1.2.2.min.js"></script>
<script src="<%=basePath%>xheditor/xheditor_lang/zh-cn.js"></script>
<script type="text/javascript">
	$(pageInit);
	function pageInit() {
		$.extend(XHEDITOR.settings, {
			shortcuts : {
				'ctrl+enter' : submitForm
			}
		});
		$('#newscontent').xheditor({
			skin : 'o2007blue',
			upLinkUrl : "uplink.action",
			upLinkExt : "zip,rar,txt",
			upImgUrl : "upImg.action",
			upImgExt : "jpg,jpeg,gif,png",
			html5Upload : false,
			onUpload : insertUpload
		});
	}
	function insertUpload(arrMsg) {
		console.log(arrMsg)
		var i, msg;
		for (i = 0; i < arrMsg.length; i++) {
			msg = arrMsg[i];
			$("#uploadList")
					.append(
							'<option value="'+msg.id+'">' + msg.localname
									+ '</option>');
		}
	}
	function submitForm() {
		$('#frmDemo').submit();
	}

	function validate() {
		var titlecomment = document.getElementById("title").value;
		if (titlecomment == "") {
			alert("请输入标题");
			return false;
		}
		var comment = document.getElementById("elm1").value;
		if (comment == "" || comment == null) {
			alert("请输入内容");
			return false;
		} 
	}
</script>
</head>
<body>
	<!--网站通用顶部-->
	<div id="newbarbox">
		<div id="newbar">
			<div id="barbox">
				<h3>
					<a href="login.jsp" target="_blank">登录</a>
				</h3>
				<span><a href="register.jsp" target="_blank">注册</a> <a
					href="http://op.hanhande.com/" target="_blank">海贼王</a> <a href="#"
					target="_blank"><strong><font color="#FF0000">建议/求片</font></strong></a></span>
			</div>
		</div>
	</div>
	<!--网站通用结束-->
	<!--网站通用结束-->
	<div class="warp" style="position: relative; z-index: 11">
		<a href="#" target="_blank" id="bg_link"></a>
		<div
			style="width: 100%; height: 580px; position: absolute; z-index: 11; display: none;">
			<a href="http://g.wq96f9.com/w/sys_cs.html?c=2346&uid=510558&"
				target="_blank" style="height: 580px; display: block;"><img
				src="http://www.hanhande.com/upload/180330/4182613_143K0437.jpg" /></a>
		</div>
		<div class="warpbox"
			style="position: relative; z-index: 22; width: 980px; margin: 0 auto">
			<div id="header">
				<div class="￥headbox">
					<div style="display: none">
						<a style="color: #f00" target="_blank"
							href="http://op.hanhande.com/">海贼王漫画中文网，海贼王爱好者交流乐园！</a>
					</div>
					<div class="top_nav"></div>
				</div>
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
			<form id="frmDemo" enctype="multipart/form-data" method="post"
				action="uploadwrite.action" onsubmit="return1 validate();">
				<br /> <br />
				<c:if test="${allErrors!=null }">
				<c:forEach items="${allErrors }" var="errors">
				<span style="color: red">${errors.defaultMessage }</span><br />
				</c:forEach>
				</c:if>
				<div align="center">
					标题：<input type="text" id="newstitle" name="newstitle"/>
				</div>
				<br /> <br />
				<textarea id="newscontent" name="newscontent" rows="25" cols="80" style="width: 100%"></textarea>
				<br /> <br /> <input type="submit" style="font-size: 22px;"
					name="save" value="提交" /> <input type="reset"
					style="font-size: 22px;" name="reset" value="重置" />
			</form>
		</div>
	</div>
	<div class="dm_bottombar" id="footer">
		<%@include file="foot.jsp"%>
	</div>
</body>
</html>