<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>海贼王漫画</title>
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />

<link rel="stylesheet" href="static/css/fzdm-min-f628b25083.css">
<link rel="stylesheet" href="static/css/fzdm-ddf6c465a1.css">
<link rel="stylesheet" href="static/css/mh-2bde3af992.css">
</head>
<body>
	<!--网站通用顶部-->
	<%@include file="top.jsp"%>
	<!--网站通用结束-->
	<!--网站通用结束-->
	<div class="warp" style="position: relative; z-index: 11">
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

			<div class="pure-g">
				<div id="content">
					<h2>海贼王漫画 航海王 one piece海贼王在线漫画 海贼王全集</h2>
					<img src="static/picture/2.jpg" alt="海贼王漫画"><br>
					<div id="mhlistad"></div>
					<c:forEach items="${comicsList }" var="comics" begin="0"
						varStatus="1">
						<li class="pure-u-1-2 pure-u-lg-1-4"><a
							href="findcomicsDetail.action?method=${comics.comicsid }"
							title="${comics.comicsname }">${comics.comicsname }</a></li>
					</c:forEach>
				</div>
				<br>
				<div id="content"></div>
			</div>
			<div class="clear"></div>
			<div id="footer">
				<%@include file="foot.jsp"%>
			</div>
</body>
</html>