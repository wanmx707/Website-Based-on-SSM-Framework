<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王视频：${uservideo.videotitle }</title>
<link href="static/css/op.video.css" rel="stylesheet" media="screen"
	type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
</head>
<body>
	<%@include file="top.jsp"%>
	<!--网站通用结束-->
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
	<div id="contents">
		<div class="main">
			<div class="summary">
				<div class="title">
					<h1>${uservideo.videotitle }</h1>
					<h2>
						<a href="findanime.action">海贼王</a>>> ${uservideo.videotitle }
					</h2>
				</div>

			</div>
			<div class="player-wrapper">
				<div id="player" class="player" style="height: 603px;">
					<video width="100%" height="100%" src="/upload/${uservideo.way }" poster="/upload/videoImg/${uservideo.videopic }" controls="controls"  
						 preload="none"></video>
				</div>
			</div>
		</div>

		<div class="ep-info">
			<div class="left">
				<div class="detail">
					<div class="txt">
						<h3>
							「<b>${uservideo.videotitle }</b>」<b>:</b>${uservideo.videocontent }<span
								class="date"><fmt:formatDate
									value="${uservideo.videoaddtime }" pattern="yyyy-MM-dd" /></span>
						</h3>
						<p class="desc"></p>
					</div>
				</div>
				<h3></h3>
			</div>
		</div>
	</div>
	<div id="SOHUCS" sid="${uservideo.uuid }"></div>
	<script charset="utf-8" type="text/javascript"
		src="https://changyan.sohu.com/upload/changyan.js"></script>
	<script type="text/javascript">
		window.changyan.api.config({
			appid : 'cyu9LdD9m',
			conf : 'prod_2dc3d013dcee21736e09178b42a45b1c'
		});
	</script>
	<script src="static/animejs/jquery.min.js"></script>
	<script src="static/animejs/jquery.allofthelights.min.js"></script>

	<%@include file="foot.jsp"%>
</body>
</html>