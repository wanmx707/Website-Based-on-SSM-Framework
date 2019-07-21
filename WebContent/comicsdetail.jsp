<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王漫画:${comics. comicsname}</title>

<link rel="alternate" media="only screen and (max-width: 640px)"
	href="http://m.hanhande.com/op/" />

<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/main.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
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
			<div class="warp" style="position: relative; z-index: 11">
				<a href="#" target="_blank" id="bg_link"
					style="width: 100%; height: 580px; position: fixed; top: 38px; left: 0; z-index: 1;"></a>
				<div class="main"
					style="position: relative; z-index: 999; background: #fff;">
					<div class="location">
						<h3>
							<a href="queryindex.action" target="_blank">海贼王分享网</a> > > <a
								href="findcomics.action">海贼王</a> > ${comics. comicsname}
						</h3>
					</div>
					<div class="mhShow">
						<div class="mhTit">
							<h3>${comics. comicsname}</h3>
							<span> <a style="display: none;" href="#" target="_blank">漫画下载</a>
								<a class="a2" href="findcomics.action" target="_blank">章节列表</a>
							</span>
						</div>

						<ul class="mhpage cc">
							<li class="on"><a
								href="findcomicsDetail.action?method=${comics.comicsid-1 }"
								title="上一话">上一话</a></li>
							<li class="on"><a
								href="findcomicsDetail.action?method=${comics.comicsid+1 }"
								title="下一话">下一话</a></li>
						</ul>
						<div class="mhBoxShow">
							<div id="pictureContent" onclick="goNextPage();"
								class="nph_photo_view"
								style="overflow: hidden; width: 980px; cursor: pointer">
								<c:forEach items="${comics.comicsdetail }" var="comicsdetail"
									begin="0" varStatus="1">

									<p style="text-indent: 2em; text-align: center">
										<img src="/op/${comicsdetail.detailpaper }"
											alt="${comics.comicsname }" title="${comics.comicsname }" " />
									</p>
								</c:forEach>
							</div>
						</div>
						<ul class="mhpage">
							<li class="on"><a
								href="findcomicsDetail.action?method=${comics.comicsid-1 }"
								title="上一话">上一话</a></li>
							<li class="on"><a
								href="findcomicsDetail.action?method=${comics.comicsid+1 }"
								title="下一话">下一话</a></li>
						</ul>

					</div>
					<div class="cl"></div>
					<div id="SOHUCS" sid="${comics.uuid }"></div>
					<script charset="utf-8" type="text/javascript"
						src="https://changyan.sohu.com/upload/changyan.js"></script>
					<script type="text/javascript">
						window.changyan.api.config({
							appid : 'cyu9LdD9m',
							conf : 'prod_2dc3d013dcee21736e09178b42a45b1c'
						});
					</script>
					<div class="cl"></div>
					<div id="footer">
						<%@include file="foot.jsp"%>
					</div>
				</div>
			</div>
			<script src="js/arc.js" type="text/javascript"></script>
			<script language="javascript" src="1611files/js/index.js"></script>
			<script src="/taglist/manhua_count.php?aid=1158006&mhid=8"
				language="javascript"></script>
</body>
</html>