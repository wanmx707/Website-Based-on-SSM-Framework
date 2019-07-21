<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王人物介绍_悬赏令_海贼王人物-4399海贼王</title>

<link href="static/css/css_topbar.css" rel="stylesheet" type="text/css" />
<link href="static/css/haizeiwang_global.css" rel="stylesheet"
	type="text/css" />
<link href="static/css/haizeiwang2_140918.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
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
				<div class="g_row">
					<div class="g_box g_box_wide">
						<div class="g_hd">
							<span class="lt"></span> <span class="rt"></span>
						</div>
						<div class="g_bd">
							<div class="g_wanted">
								<div class="wanted_title">
									<span>悬赏令</span>
								</div>
								<div class="g_tab roletab" id="j-roletab">
									<ul class="clearfix">
										<li class="cur"><i class="ico1"></i> <span>全部</span></li>
										<c:forEach items="${opdatalist }" var="opdata" varStatus="s">
											<li><i class="ico${s.count+1 }"></i> <span>${opdata.opdatatype }</span></li>
										</c:forEach>
									</ul>
								</div>
								<div class="rolecon" id="j-rolecon">
									<ul class="g_rolelist modemini clearfix" id="iga"
										style="display: block">
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="#"> <img name="lzimg_1"
													lz_src='http://localhost:8080/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />x${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
										
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[0].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />海贼${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[1].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />海军${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[2].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />世界政府${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[3].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />革命军${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[4].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />海贼团${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[5].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />动物${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<ul class="g_rolelist clearfix" style="display: none">
										<c:forEach items="${opdatalist[6].opdatalist }"
											var="opdatalist">
											<li><a href="findopdataByID.action?method=${opdatalist.opdataid }"> <img
													lz_src='/ziliaoimg/${opdatalist.opdatapic }'
													alt="${opdatalist.titleopdata }" />其他${opdatalist.titleopdata }
											</a></li>
										</c:forEach>
									</ul>
									<div id="div_btn">
										<a href="" class="btnshowall"></a>
									</div>
								</div>
							</div>
						</div>
						<div class="g_fd">
							<span class="lb"></span> <span class="rb"></span>
						</div>
					</div>
				</div>

			</div>
			<script type="text/javascript" src="static/js/jquery-1.4.4.min.js"></script>
			<!-- <script type="text/javascript" src="static/js/common.js"></script> -->
			<!-- <script type="text/javascript" src="static/js/home.js"></script> -->
			<!-- <script type="text/javascript" src="static/js/commshare_g.js"></script> -->
			<!-- <script type="text/javascript" src="static/js/page.js"></script> -->



			<script src="static/js/haizeiwang2tab.js"></script>
			<script src="static/js/ks.marquee.js"></script>
			<script>
				//最新公告滚动
				ue.marquee({
					hovertarget : "#info",//鼠标hover停止切换的对象
					target : '#info .notice_in ul',//滚动对象 一般为 ul
					items : '#info .notice_in li', //滚动的详细列表
					delay : 1000,//切换间隔时间
					speed : 900,//切换速度
					visiblenum : 1,//可见个数
					scrollnum : 1,//每次滚动个数
					autoplay : true,//是否自动播放    
					loop : 1,//循环模式 1 无限循环 0 不循环
					mode : 0,
					direction : 0
				});

				if ($("#j-roletab").length != 0) {
					tab("j-roletab", "li", "j-rolecon", "ul");
				}
				if ($("#j-roletab2").length != 0) {
					tab2("j-roletab2", "li", "j-rolecon2", "ul");
				}
				//展示全部
				$(".btnshowall").bind(
						"click",
						function() {
							$("#iga").removeClass("modemini");
							$(".btnshowall").hide();
							var this_img = $("#iga");
							var replace_html = this_img.html().replace(
									/lz_src/g, "src");
							this_img.html(replace_html);
							return false;
						});
			</script>
			<div class="dm_bottombar" id="footer">
				<%@include file="foot.jsp"%>
			</div>
		</div>
</body>
</html>