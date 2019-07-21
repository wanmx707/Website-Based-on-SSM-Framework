<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="UTF-8">
<title>海贼王图片</title>
<link href="static/css/haizeiwang_global.css" rel="stylesheet"
	type="text/css" />
<link href="static/css/haizeiwang2_140918.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
</head>
<body>
	<%@include file="top.jsp"%>
	<div class="warp" style="position: relative; z-index: 11">
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
		</div>
	</div>
	<div id="main">
		<div class="wrap mt10">
			<div class="g_row">
				<div class="g_box g_box_wide">
					<div class="g_hd">
						<span class="lt"></span> <span class="rt"></span>
					</div>
					<div class="g_bd">
						<div class="dm_crumbs g_crumbs">
							当前位置：<a href="queryindex.action" target="_self">海贼王分享网</a><span
								class="s_g5">&gt;</span><a href="findPicture.action"
								target="_self">海贼王图片</a>
						</div>
						<div class="g_gallery">
							<div class="g_picsbox">
								<h1 class="dm_title">${picture.picname }</h1>
								<div class="dm_author">
									<span>作者：海贼王分享网</span><span>来源：网络</span> <span>时间：<fmt:formatDate
											value="${picture.picaddtime }" pattern="yyyy-MM-dd" /></span>
								</div>
								<c:forEach items="${picture.picturedetail }" var="picturedetail">
									<div class="g_pics">
										<img src="/upload/${picturedetail.picway }" />
									</div>
									<div class="dm_author"></div>
								</c:forEach>
							</div>
						</div>
					</div>
					<div class="g_fd">
						<span class="lb"></span> <span class="rb"></span>
					</div>
				</div>
			</div>
			<div id="SOHUCS" sid="${picture.uuid }"></div>
			<script charset="utf-8" type="text/javascript"
				src="https://changyan.sohu.com/upload/changyan.js"></script>
			<script type="text/javascript">
				window.changyan.api.config({
					appid : 'cyu9LdD9m',
					conf : 'prod_2dc3d013dcee21736e09178b42a45b1c'
				});
			</script>
		</div>
	</div>

	<div class="dm_bottombar" id="footer">
		<%@include file="foot.jsp"%>
	</div>
</body>
</html>