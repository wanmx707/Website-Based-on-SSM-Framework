<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>	
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王分享网</title>
<script language="javascript" src="static/js/jquery-1.4.2.min.js"></script>
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
	<div class="cl"></div>
	<div id="main">
		<div class="m1bg">
			<div class="w540">
				<div class="w263 mt10">
					<h3 class="t2">
						<span><a href="findanime.action"
							target="_blank" rel="nofollow">更多</a> </span><a href="findanime.action"
							target="_blank">海贼王动画</a>
					</h3>
					<ul class="newsbox m1">
						<c:forEach items="${listAnime }" var="anime" begin="0" end="4"
							varStatus="1">
							<li><cite><a
									href="findanimeByid.action?method=${anime.animeid }"
									target="_blank" title="${anime.animepid }" rel="nofollow"><em></em>${anime.animepid }:
										${anime.animetitle }</a></cite></li>
						</c:forEach>
					</ul>
					<div class="bt263"></div>
					<div class="cl"></div>
					<div class="bt263"></div>

					<!--  -->
					<h3 class="t1 t11">
						<span><a href="findInformation.action" target="_blank"
							rel="nofollow">+更多</a></span><a href="findInformation.action"
							target="_blank">情报资讯</a>
					</h3>
					<ul class="newslist  bdbox cc">
						<c:forEach items="${listInformation }" var="information" begin="0"
							end="14" varStatus="1">
							<li><span>[<fmt:formatDate
										value="${information.inforaddtime }" pattern="MM-dd" />]
							</span>·<a href='findInforByid.action?method=${information.inforid }'
								title="${information.infortitle }" target='_blank'>${information.infortitle }</a></li>
						</c:forEach>
					</ul>
					<div class="bt263"></div>
					<div class="cl"></div>
					<div class="bt263"></div>
				</div>
				<div class="w263 mt10" style="float: right">
					<h3 class="t2">
						<span><a href="findcomics.action" target="_blank"
							rel="nofllow">更多</a></span>海贼王漫画
					</h3>
					<ul class="newsbox ">
						<c:forEach items="${listComics }" var="comics" begin="0" end="4"
							varStatus="1">
							<li><cite><a
									href="findcomicsDetail.action?method=${comics.comicsid }"
									target="_blank" rel="nofollow">${comics.comicsname }</a></cite><sup></sup></li>
						</c:forEach>
					</ul>

					<div class="bt263"></div>
					<div class="cl"></div>
					<div class="bt263"></div>

					<!--  -->
					<h3 class="t1 t11">
						<span><a href="findNews.action" target="_blank"
							rel="nofollow">+更多</a></span><a href="findNews.action" target="_blank">内容分析</a>
					</h3>
					<ul class="newslist  bdbox cc">
						<c:forEach items="${listNews }" var="news" begin="0" end="14"
							varStatus="1">
							<li><span>[<fmt:formatDate value="${news.addtime}"
										pattern="MM-dd" />]
							</span>·<a href="findfenxiDetail.action?method=${news.newsid }"
								title="${news.newstitle }" target='_blank'>${news.newstitle }</a></li>
						</c:forEach>
					</ul>
					<div class="bt263"></div>
					<div class="cl"></div>
					<div class="bt263"></div>
				</div>
			</div>
			<div class="w320">
				<dl>
					<c:forEach items="${listComics }" var="comics" begin="0" end="0"
						varStatus="1">
						<dt>
							<a href='findcomicsDetail.action?method=${comics.comicsid }'
								title="${comics.comicsname }" target='_blank'>${comics.comicsname }</a>
						</dt>
					</c:forEach>
					<c:forEach items="${listComics }" var="comics" begin="1" end="1"
						varStatus="1">
						<dd>
							[<a href="findcomicsDetail.action?method=${comics.comicsid }"
								target="_blank"><font color="#000000">${comics.comicsname }</font></a>]
						</dd>
					</c:forEach>
					<c:forEach items="${listAnime }" var="anime" begin="0" end="0"
						varStatus="1">
						<dt>
							<a href='findanimeByid.action?method=${anime.animeid }'
								title="${anime.animepid }:${anime.animetitle }"
								target='_blank'>${anime.animepid }: ${anime.animetitle }</a>
						</dt>
					</c:forEach>
					<dd>
					<c:forEach items="${listComics }" var="comics" begin="2" end="2"
						varStatus="1">
						[<a href="findcomicsDetail.action?method=${comics.comicsid }"
							target="_blank"><font color="#000000">${comics.comicsname }</font></a>]
					</c:forEach>
					<c:forEach items="${listNews }" var="news" begin="0" end="0"
						varStatus="1"> [<a
							href="findfenxiDetail.action?method=${news.newsid }"
							target="_blank"><font color="#009933">${news.newstitle }</font></a>]
					</c:forEach>
					</dd>


				</dl>
				<ul>

					<c:forEach items="${listInformation }" var="information" begin="0"
						end="0" varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${information.inforaddtime }" pattern="MM-dd" /></font>]
						</span>·【<a href='/findNews.acion'
							target="_blank">情报</a>】<a
							href='findInforByid.action?method=${information.inforid }'
							title="${information.infortitle }" target='_blank'>${information.infortitle }</a></li>
					</c:forEach>
					<c:forEach items="${listNews }" var="news" begin="0" end="2"
						varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${news.addtime}" pattern="MM-dd" /></font>]
						</span>·【<a href='findfenxiDetail.action?method=${news.newsid }'
							target="_blank">分析</a>】<a
							href='findfenxiDetail.action?method=${news.newsid }'
							title="${news.newstitle }" target='_blank'>${news.newstitle }</a></li>
					</c:forEach>
				</ul>
				<ul>
					<c:forEach items="${listInformation }" var="information" begin="1"
						end="1" varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${information.inforaddtime }" pattern="MM-dd" /></font>]
						</span>·【<a href='#' target="_blank">情报</a>】<a
							href='findInforByid.action?method=${information.inforid }'
							title="${information.infortitle }" target='_blank'>${information.infortitle }</a></li>
					</c:forEach>
					<c:forEach items="${listNews }" var="news" begin="3" end="6"
						varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${news.addtime}" pattern="MM-dd" /></font>]
						</span>·【<a href='findfenxiDetail.action?method=${news.newsid }'
							target="_blank">分析</a>】<a
							href='findfenxiDetail.action?method=${news.newsid }'
							title="${news.newstitle }" target='_blank'>${news.newstitle }</a></li>
					</c:forEach>
				</ul>
				<ul>
					<c:forEach items="${listInformation }" var="information" begin="2"
						end="2" varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${information.inforaddtime }" pattern="MM-dd" /></font>]
						</span>·【<a href='#' target="_blank">情报</a>】<a
							href='findInforByid.action?method=${information.inforid }'
							title="${information.infortitle }" target='_blank'>${information.infortitle }</a></li>
					</c:forEach>
					<c:forEach items="${listNews }" var="news" begin="0" end="2"
						varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${news.addtime}" pattern="MM-dd" /></font>]
						</span>·【<a href='findfenxiDetail.action?method=${news.newsid }l'
							target="_blank">分析</a>】<a
							href='findfenxiDetail.action?method=${news.newsid }'
							title="${news.newstitle }" target='_blank'>${news.newstitle }</a></li>
					</c:forEach>
				</ul>
				<ul>
					<c:forEach items="${listInformation }" var="information" begin="3"
						end="3" varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${information.inforaddtime }" pattern="MM-dd" /></font>]
						</span>·【<a href='#' target="_blank">情报</a>】<a
							href='findInforByid.action?method=${information.inforid }'
							title="${information.infortitle }" target='_blank'>${information.infortitle }</a></li>
					</c:forEach>
					<c:forEach items="${listNews }" var="news" begin="3" end="6"
						varStatus="1">
						<li><span>[<font color='#ff0000'><fmt:formatDate
										value="${news.addtime}" pattern="MM-dd" /></font>]
						</span>·【<a href='findfenxiDetail.action?method=${news.newsid }'
							target="_blank">分析</a>】<a
							href='findfenxiDetail.action?method=${news.newsid }'
							title="${news.newstitle }" target='_blank'>${news.newstitle }</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>


		<div class="cl"></div>
		<h3 class="t1 mt10">
			<span><a href="findvideoPage.action" target="_blank"
				rel="nofollow">+更多</a></span><a href="findvideoPage.action" target="_blank">用户视频</a>
		</h3>
		<div class="bd cc">
			<dl class="picbox bd cc">
				<dt>
					<c:forEach items="${listUservideo }" var="listUservideo" begin="0"
						end="0" varStatus="1">
						<a href='findvideoByid.action?method=${listUservideo.videoid }'
							title="${listUservideo.videotitle }" target="_blank"><img
							src='/uploadImg/${listUservideo.videopic  }' border='0'
							width='280px' height='233px' alt='${listUservideo.videotitle }' /></a>
						<p>
							<a href='findvideoByid.action?method=${listUservideo.videopic }'
								title="${listUservideo.videotitle }" target='_blank'>${listUservideo.videotitle }</a>
						</p>
					</c:forEach>
				</dt>
				<dd>
					<c:forEach items="${listUservideo }" var="listUservideo" begin="1"
						end="8" varStatus="1">
						<span><a
							href='findvideoByid.action?method=${listUservideo.videoid }'
							title="${listUservideo.videotitle }" target="_blank"><img
								src='/uploadImg/${listUservideo.videopic  }' border='0'
								width='120px' height='100px' alt='${listUservideo.videotitle }' /></a>
							<p>
								<a href='findvideoByid.action?method=${listUservideo.videoid }'
									title="${listUservideo.videotitle }" target='_blank'>${listUservideo.videotitle }</a>
							</p></span>
					</c:forEach>
				</dd>
			</dl>
		</div>
		<div class="bt980"></div>
		<div class="cl"></div>
		<h3 class="t1 mt10">
			<span><a href="findPicture.action" target="_blank"
				rel="nofollow">+更多</a></span><a href="findPicture.action" target="_blank">图库</a>
		</h3>
		<div class="bd cc">
			<dl class="picbox bd cc">
				<dt>
					<c:forEach items="${listPicture }" var="picture" begin="0" end="0"
						varStatus="1">
						<a href='findPictureByid.action?method=${picture.picid }'
							title="${picture.picname }" target="_blank"><img
							src='/upload/${picture.picfengmian  }' border='0' width='280px'
							height='233px' alt='${picture.picname }' /></a>
						<p>
							<a href='findPictureByid.action?method=${picture.picid }'
								title="${picture.picname }" target='_blank'>${picture.picname }</a>
						</p>
					</c:forEach>

				</dt>

				<dd>
					<c:forEach items="${listPicture }" var="picture" begin="1" end="8"
						varStatus="1">
						<span><a href='findPictureByid.action?method=${picture.picid }'
							title="${picture.picname }" target="_blank"><img
								src='/upload/${picture.picfengmian  }' border='0' width='120px'
								height='100px' alt='${picture.picname }' /></a>
							<p>
								<a href='findPictureByid.action?method=${picture.picid }'
									title="${picture.picname }" target='_blank'>${picture.picname }</a>
							</p></span>
					</c:forEach>
				</dd>
			</dl>
		</div>
		<div class="bt980"></div>
		<div class="cl"></div>
		<div class="cl"></div>
		<div class="cl"></div>
		<h3 class="t1 mt10">
			<span><a href="" target="_blank"
				rel="nofollow">更多</a></span><a href=""
				target="_blank">恶魔果实</a>
		</h3>
		<div class="bd cc">
			<div class="data cc bdbox">
				<div class="data_tab">
					<span> <a href="" class="more"
						target="_blank">更多 </a></span>
					<ul>
						<li class="current">自然系果实</li>
						<li>超人系果实</li>
						<li>动物系果实</li>
						<li>未知果实</li>
					</ul>
				</div>
				<div class="cl"></div>
				<div class="databox cc">
				<c:forEach items="${listFruittype[0].fruitList }" var="fruit">
					<a href="findFruitByid.action?method=${fruit.fruitid }" target="_blank">${fruit.title }</a>
				</c:forEach>
				</div>
				<div class="databox cc" style="display: none">
				<c:forEach items="${listFruittype[1].fruitList }" var="fruit">
					<a href="findFruitByid.action?method=${fruit.fruitid }" target="_blank">${fruit.title }</a>
				</c:forEach>
				</div>
				<div class="databox cc" style="display: none">
				<c:forEach items="${listFruittype[2].fruitList }" var="fruit">
					<a href="findFruitByid.action?method=${fruit.fruitid }" target="_blank">${fruit.title }</a>
				</c:forEach>
				</div>
				<div class="databox cc" style="display: none">
				<c:forEach items="${listFruittype[3].fruitList }" var="fruit">
					<a href="findFruitByid.action?method=${fruit.fruitid }" target="_blank">${fruit.title }</a>
				</c:forEach>
				</div>
			</div>
		</div>
		<div class="bt980"></div>
		<div class="cl"></div>
	</div>
	<div class="cl"></div>
	<div id="footer">
		<%@include file="foot.jsp"%>
	</div>
	<script language="javascript" src="static/js/js.js"></script>
</body>
</html>