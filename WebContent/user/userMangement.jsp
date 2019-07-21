<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>

<link type="text/css" rel="stylesheet"
	href="js/easyui/themes/default/easyui.css">
<link type="text/css" rel="stylesheet" href="js/easyui/themes/icon.css">
<link type="text/css" rel="stylesheet" href="css/global.css">
<link type="text/css" rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/easyui/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="../css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="../css/base.css" type="text/css" />
<style type="text/css">
#container {
	width: 960px;
	height: 700px;
	margin: 0px auto;
}
</style>
<script type="text/javascript">
function dologin(){
		var a='<%=session.getAttribute("username")%>';
		var denglu = document.getElementById("denglu");
		var zhuce = document.getElementById("zhuce");
		var youname = document.getElementById("youname");
		var zhuxiao = document.getElementById("zhuxiao");
		var leixing = document.getElementById("usertype");
		if (a !== 'null') {
			denglu.style.display = "none";
			zhuce.style.display = "none";
			zhuxiao.style.display = "block";
			youname.style.display = "block";
		}
	}
</script>
<script type="text/javascript">
	//文档加载完成（DOM已经在内存中构成完毕，不需要等待图片加载完成）
	$(document).ready(function() {
		//alert("恭喜您！easyUI开发环境搭建完成");
	});

	//窗体加载事件，等待图片等所有资源都加载完成
	//window.onload=function(){};

	$(function() {
		//单击“个人信息”时，打开个人信息页面
		$("#usermanage").bind("click", function() {
			$("#mainFrame").prop("src", "../findUserInfor.action");
		});
		//修改密码
		$("#changepassword").bind("click", function() {
			$("#mainFrame").prop("src", "manage/userManage/userpassword.jsp");
		});

		//单击“账户注销”时，打开账户注销页面
		$("#lostuser").bind("click", function() {
			$("#mainFrame").prop("src", "");
		});

		//单击“上传视频稿件”时，打开上传稿件页面
		$("#uploadvideo").bind("click", function() {
			$("#mainFrame").prop("src", "manage/videoManage/uploadvideo.jsp");
		});

		//单击“管理视频稿件”时，打开管理视频稿件页面
		$("#managevideo").bind("click", function() {
			$("#mainFrame").prop("src", "../findvideoByPage.action");
		});
		//打开编辑文章页面
		$("#uploadcontext").bind("click", function() {
			$("#mainFrame").prop("src", "manage/writeManage/write.jsp");
		});
		//打开管理文章页
		$("#manageContext").bind("click", function() {
			$("#mainFrame").prop("src", "../findWriteByPage.action");
		});
		//打开上传图片页
		$("#uploadcomic").bind("click", function() {
			//$("#center").css("height","300px");
			$("#mainFrame").prop("src", "manage/picManage/uploadpic.jsp");
		});
		//打开管理图片页
		$("#managecomics").bind("click", function() {
			$("#mainFrame").prop("src", "../findPicByPage.action");
		});
		//打开视频审核
		$("#videoReview").bind("click", function() {
			$("#mainFrame").prop("src", "../findvideoStatus.action");
		});
		//打开文章审核
		$("#textReview").bind("click", function() {
			$("#mainFrame").prop("src", "../findNewsstatus.action");
		});
		//打开图片审核
		$("#pictureReview").bind("click", function() {
			$("#mainFrame").prop("src", "../findpictureStatus.action");
		});
		//漫画编辑
		$("#comicswrite").bind("click", function() {
			$("#mainFrame").prop("src", "manage/webWrite/uploadcomics.jsp");
		});
		//动画编辑
		$("#anminwrite").bind("click", function() {
			$("#mainFrame").prop("src", "manage/webWrite/animeManage.jsp");
		});
		//情报编辑
		$("#inforwrite").bind("click", function() {
			$("#mainFrame").prop("src", "manage/webWrite/newswrite.jsp");
		});
		//资料编辑
		$("#ziliaowrite").bind("click", function() {
			$("#mainFrame").prop("src", "manage/webWrite/ziliaowrite.jsp");
		});
		//恶魔果实编辑
		$("#fruitwrite").bind("click", function() {
			$("#mainFrame").prop("src", "manage/webWrite/fruitwrite.jsp");
		});
		//举报管理
		$("#manageuser").bind("click", function() {
			$("#mainFrame").prop("src", "../findNewsJubao.action");
		});
		//漫画管理
		$("#comicsmanage").bind("click", function() {
			$("#mainFrame").prop("src", "../selectComicsManage.action");
		});
		//动画管理
		$("#anminmanage").bind("click", function() {
			$("#mainFrame").prop("src", "../selectManageAnimeByPage.action");
		});
		//情报管理
		$("#informanage").bind("click", function() {
			$("#mainFrame").prop("src", "../selectNewsManage.action");
		});
		//资料管理
		$("#ziliaomanage").bind("click", function() {
			$("#mainFrame").prop("src", "../selectOpdataManage.action");
		});
		//恶魔果实管理
		$("#fruitmanage").bind("click", function() {
			$("#mainFrame").prop("src", "../selectFruitManage.action");
		});
	});
</script>
</head>
<body onload="dologin()">
	<!--网站通用顶部-->
	<div id="newbarbox">
		<div id="newbar">
			<div id="barbox">
				<h3>
					<div id="denglu" style='display: block;'>
						<a href="../login.jsp" target="_blank">登录</a>
					</div>
					<div id="youname" style='display: none;'>
						欢迎你：<%=session.getAttribute("username")%></div>
				</h3>
				<h3>
					<div id="zhuce" style='display: block;'>
						<a href="register.jsp" target="_blank">注册</a>
					</div>
					<div id="zhuxiao" style='display: none;'>
						<a href="../Logout.action">注销</a>
					</div>
				</h3>
				<h3>
					<a href="http://bbs.talkop.com/" target="_blank">talkop海贼王论坛</a> <a
						href="#" target="_blank"><strong><font
							color="#FF0000">建议/求片</font></strong></a>
				</h3>
			</div>
		</div>
	</div>
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
					<img src="../images/head2.jpg" />
				</div>
				<div>
					<img src="../images/head3.jpg" />
				</div>
				<ul class="menu">
					<li><a href="../queryindex.action" target="_blank">海贼王分享网</a></li>
					<li><a href="../findcomics.action" target="_blank">海贼王漫画</a></li>
					<li><a href="../findanime.action" target="_blank">海贼王动画</a></li>
					<li><a href="../findvideoPage.action" target="_blank">海贼视频</a></li>
					<li><a href="../finddata.action" target="_blank">资料</a></li>
					<li><a href="../findPicture.action" target="_blank">图片</a></li>
					<li><a href="../findInformation.action" target="_blank">资讯情报</a></li>
					<li><a href="../findNews.action" target="_blank">海贼分析</a></li>
				</ul>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<div id="container" class="easyui-layout">
		<div data-options="region:'west',title:'comicOP用户操作',split:true"
			style="width: 200px;">
			<div id="nav" class="easyui-accordion">
				<div title="个人管理" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><span><a id="usermanage"
								href="javascript:void(0);">个人信息</a></span></li>
						<li><a id="changepassword" href="javascript:void(0);">修改密码</a></li>
						<!-- <li><a id="lostuser" href="javascript:void(0);">账户注销</a></li> -->
					</ul>
				</div>
				<div title="视频稿件" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="uploadvideo" href="javascript:void(0);">上传稿件</a></li>
						<li><a id="managevideo" href="javascript:void(0);">管理稿件</a></li>
					</ul>
				</div>
				<div title="文章稿件" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="uploadcontext" href="javascript:void(0);">编辑文章</a></li>
						<li><a id="manageContext" href="javascript:void(0);">管理文章</a></li>
					</ul>
				</div>
				<div title="图片稿件" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="uploadcomic" href="javascript:void(0);">图片上传</a></li>
						<li><a id="managecomics" href="javascript:void(0);">图片管理</a></li>
					</ul>
				</div>
				<div title="审核管理" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="videoReview" href="javascript:void(0);">视频审核</a></li>
						<li><a id="textReview" href="javascript:void(0);">文章审核</a></li>
						<li><a id="pictureReview" href="javascript:void(0);">图片审核</a></li>
					</ul>
				</div>
				<div title="网站编辑" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="comicswrite" href="javascript:void(0);">漫画编辑</a></li>
						<li><a id="anminwrite" href="javascript:void(0);">动画编辑</a></li>
						<li><a id="inforwrite" href="javascript:void(0);">情报编辑</a></li>
						<li><a id="ziliaowrite" href="javascript:void(0);">资料编辑</a></li>
						<li><a id="fruitwrite" href="javascript:void(0);">恶魔果实编辑</a></li>
					</ul>
				</div>
				<div title="网站管理" style="overflow: auto; padding: 10px;">
					<ul class="easyui-tree" data-options="lines:true">
						<li><a id="manageuser" href="javascript:void(0);">举报管理</a></li>
						<li><a id="comicsmanage" href="javascript:void(0);">漫画管理</a></li>
						<li><a id="anminmanage" href="javascript:void(0);">动画管理</a></li>
						<li><a id="informanage" href="javascript:void(0);">情报管理</a></li>
						<li><a id="ziliaomanage" href="javascript:void(0);">资料管理</a></li>
						<li><a id="fruitmanage" href="javascript:void(0);">恶魔果实管理</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="center" data-options="region:'center'"
			style="padding: 0px; background: #fff;">
			<iframe id="mainFrame" src="../images/welcome.jpg" frameborder="0"
				scrolling="0"
				style="border: 0px solid red; width: 100%; height: 100%; background: #FFFFFF;"></iframe>
		</div>
		<div data-options="region:'south',split:true"
			style="height: 110px; background: #E2EDFF; text-align: center;">
			<div class="btmenu">
				<div class="dm_bottombar footer">
					本站漫画等相关内容均来自网络或网友上传，以供爱好者研究讨论，若侵犯到您的权益，请立即联系我们删除。本站不负任何相关责任。<br />
					<a rel="external nofollow" href="http://www.miitbeian.gov.cn">浙ICP备19014890</a>
					| <a target="_blank"
						href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=33010502005478"
						style="display: inline-block; text-decoration: none; height: 20px; line-height: 20px;"><img
						src="../images/beianlogo.png" style="float: left;" />&nbsp浙公网安备33010502005478号</a>
					| 如果有意见和建议，请点反馈E-mail至<a href="mailto:1005159022@qq.com">1005159022@qq.com</a><br />
					Copyright &copy; 2018 - 2019 opshare.com All Rights Reserved.温孟旋
					版权所有
				</div>
			</div>
		</div>
	</div>
</body>
</html>