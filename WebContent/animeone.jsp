<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王动画</title>
<link href="static/css/op.video.css" rel="stylesheet" media="screen"
	type="text/css" />
	<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
</head>
<body>
	<div id="page">
		<!--网站通用顶部-->
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
						<h1>${anime.animetitle }</h1>
						<h2>
							<a href="findanime.action">海贼王</a> ${anime.animepid }
						</h2>
					</div>
						
				</div>
				<div class="player-wrapper">
					<div id="player" class="player" style="height: 603px;">
						<embed
							src="${anime.way }"
							width="100%" height="100%" bgcolor="#000000" quality="high"
							allowfullscreen="true" allowscriptaccess="always"/>
					</div>
				</div>
			</div>
			<div class="ep-list">
				<div class="info">
					<div class="preview">
						<a href="findanime.action"><img src="static/picture/icon.jpg"></a>
					</div>
				</div>
				<div class="video">
					<div class="b-head">
						<a class="t" href="findanime.action">海贼王</a>
					</div>
					<ul class="ep-page" id="ep-page"></ul>
					<div id="episode_list">
						<a href="#" title="${anime.animepid }${anime.animetitle }" class="active">${anime.animepid }</a>
						<ul class="tab_conbox" id="tab_conbox">
						<c:forEach items="${animeLsit }" var="animelsit">
							<a href="findanimeByid.action?method=${animelsit.animeid }" title="${animelsit.animepid }${animelsit.animetitle }">${animelsit.animepid }</a>
						</c:forEach>
						<c:forEach items="${animeLsit }" var="animelsit">
							<a href="findanimeByid.action?method=${animelsit.animeid }" title="${animelsit.animepid }${animelsit.animetitle }">${animelsit.animepid }</a>
						</c:forEach>
						<c:forEach items="${animeLsit }" var="animelsit">
							<a href="findanimeByid.action?method=${animelsit.animeid }" title="${animelsit.animepid }${animelsit.animetitle }">${animelsit.animepid }</a>
						</c:forEach>
						<c:forEach items="${animeLsit }" var="animelsit">
							<a href="findanimeByid.action?method=${animelsit.animeid }" title="${animelsit.animepid }${animelsit.animetitle }">${animelsit.animepid }</a>
						</c:forEach>
						<c:forEach items="${animeLsit }" var="animelsit">
							<a href="findanimeByid.action?method=${animelsit.animeid }" title="${animelsit.animepid }${animelsit.animetitle }">${animelsit.animepid }</a>
						</c:forEach>
						</ul>
					</div>
				</div>
			</div>
			<div class="ep-info">
				<div class="left">
					<div class="detail">
						<div class="txt">
							<h3>
								${anime.animepid } 「${anime.animetitle }」<span class="date"><fmt:formatDate
										value="${anime.animeaddtime }" pattern="yyyy-MM-dd" /></span>
							</h3>
							<p class="desc"></p>
						</div>
					</div>
					<h3></h3>
				</div>
			</div>
		</div>
		<script src="static/animejs/jquery.min.js"></script>
		<script src="static/animejs/jquery.allofthelights.min.js"></script>
		<script>
			$(document).ready(function() {
				$("#player").allofthelights();
			});
			$(document).ready(
					function() {
						jQuery.jqtab = function(tabtit, tab_conbox, shijian,
								zindex) {
							$(tab_conbox).find("li").hide();
							$(tabtit).find("li:eq(" + zindex + ")").addClass(
									"thistab").show();
							$(tab_conbox).find("li:eq(" + zindex + ")").show();

							$(tabtit).find("li").bind(
									shijian,
									function() {
										$(this).addClass("thistab").siblings(
												"li").removeClass("thistab");
										var activeindex = $(tabtit).find("li")
												.index(this);
										$(tab_conbox).children()
												.eq(activeindex).show()
												.siblings().hide();
										return false;
									});

						};
						var j = Math.floor($(".tab_conbox a").length / 50 + 1);
						var zindex = Math.floor(875 / 50);
						var ctab = '';
						for (i = 1; i <= j; i++) {
							var jstart = (i - 1) * 50 + 1;
							var jend = (i - 1) * 50 + 50;
							$(".ep-page").append(
									'<li>' + jstart + '-' + jend + '</li>');
						}

						jQuery(".tab_conbox a").each(
								function(i) {
									jQuery(".tab_conbox a").slice(i * 50,
											i * 50 + 50).wrapAll(
											'<li class="tab_con"></li>');
								});
						$.jqtab("#ep-page", "#tab_conbox", "click", zindex);
					});
		</script>
		<div class="btmenu">
			<%@include file="foot.jsp"%>
		</div>
</body>
</html>