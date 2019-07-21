<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王-恶魔果实</title>

<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />

<link href="static/css/css_topbar.css" rel="stylesheet" type="text/css" />
<link href="static/css/haizeiwang_global.css" rel="stylesheet"
	type="text/css" />
<link href="static/css/haizeiwang2_140918.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="static/js/haizei.js"></script>
<script type="text/javascript" src="static/js/data_haizeiwang2.js"></script>
<base target="_blank" />
</head>
<body>
	<%@include file="top.jsp"%>
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
			<div class="wrap mt10">
				<div class="g_row mt10 clearfix">
					<!-- <div class="g_col g_col_w700"> -->
					<div class="g_box">
						<div class="g_hd">
							<span class="lt"></span> <span class="rt"></span>
						</div>
						<div class="g_bd">
							<div class="dm_crumbs g_crumbs">
								当前位置：<a href="queryindex.action" target='_self'>海贼王分享网</a><span
									class='s_g5'>&gt;</span><span class='s_g5'>&gt;</span>恶魔果实
							</div>
							<div class="dm_acticle">
								<h1 class="dm_title">${fruit.title }</h1>
								<div class="dm_author">
									<span>作者：海贼王分享网</span><span>来源：网络</span> <span>时间：<fmt:formatDate
											value="${fruit.addtime }" pattern="YYYY-MM-dd" /></span>
								</div>
								<div class="dm_content">${fruit.content }</div>
							</div>
						</div>
						<div class="g_fd">
							<span class="lb"></span> <span class="rb"></span>
						</div>
						<!-- </div> -->
					</div>
				</div>
			</div>
			<div class="dm_bottombar" id="footer">
				<%@include file="foot.jsp"%>
			</div>
</body>
</html>