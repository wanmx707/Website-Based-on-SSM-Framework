<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>海贼王分析</title>
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
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<style type="text/css">
html {
	height: 100%
}

#choiceWindow {
	display: none;
	position: absolute;
	top: 10%;
	left: 35%;
	width: 30%;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 6px;
	background-color: white;
	z-index: 2;
	overflow: auto;
	background-color: white;
}

#backGround {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: black;
	z-index: 1;
	-moz-opacity: 0.8;
	opacity: .80;
	filter: alpha(opacity = 88);
}

#close:hover {
	cursor: pointer;
	color: rgb(55, 198, 192);
}
</style>
<script type="text/javascript">
	function doDel(id) {
		if (window.confirm("您确定举报吗？")) {
			var pdata = {
				"jubaoselect" : $('#jubaoselect').val(),
				"newsid" : id
			};
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath }/jubao.action",
				contentType:"application/json;charset=utf-8",
				data:JSON.stringify(pdata),
				//数据格式是json串
				success:function(data){//返回json结果
					alert(data.answer);
				}
			});
					$("#choiceWindow").slideUp(300);
					$("#backGround").hide();
		}
	}
</script>
<base target="_blank" />
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
									class='s_g5'>&gt;</span><span class='s_g5'>&gt;</span><a
									href="findNews.action" target='_self'>海贼王分析</a>
								<button id="btn" style="float: right;">
									<span style="float: right; color: red;">举报</span>
								</button>
							</div>
							<div class="dm_acticle">
								<h1 class="dm_title">${news.newstitle }</h1>
								<div class="dm_author">
									<span>作者：${news.writer }</span><span>来源：${news.writer }</span>
									<span>时间：<fmt:formatDate value="${news.addtime}"
											pattern="YYYY-MM-dd" /></span>
								</div>
								<div class="dm_content">${news.newscontent }</div>
							</div>
						</div>
						<div class="g_fd">
							<span class="lb"></span> <span class="rb"></span>
						</div>
						<!-- </div> -->
					</div>
					<div id="SOHUCS" sid="${news.uuid }"></div>
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
			<script type="text/javascript">
				$(document).ready(function() {
					$("#btn").click(function() {
						$("#choiceWindow").slideDown(300);
						$("#backGround").show();

					});
					$("#close").click(function() {
						$("#choiceWindow").slideUp(300);
						$("#backGround").hide();
					})

				});
			</script>
			<div id="choiceWindow">
				<label id="close"
					style="position: absolute; top: 2px; left: 95%; font-size: 10px;">关闭</label>
				<div align="center">
					<span style="font-size: 10px;">举报稿件</span>
				</div>
				<br>
				<label>请选择违反的内容：</label>&nbsp &nbsp &nbsp <select id="jubaoselect">
					<option value="2">色情</option>
					<option value="3">违法违禁</option>
					<option value="4">引战</option>
					<option value="5">抄袭</option>
					<option value="6">其他问题</option>
				</select><br><br> <a href="javascript:doDel(${news.newsid });"><button
								id="jubao" style="margin-left: 45%" value="提交">提交</button></a>
			</div>
			<div id="backGround"></div>
</body>
</html>