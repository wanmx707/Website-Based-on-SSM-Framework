<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>海贼王全集</title>
<link rel="alternate" media="only screen and (max-width: 640px)"
	href="http://m.hanhande.net/donghua/op/index.shtml">
	<script language="javascript" src="static/js/jquery-1.4.2.min.js"></script>
	<script language="javascript" type="text/javascript"
		src="static/js/m911.js"></script>
	<link rel="stylesheet" type="text/css" media="all"
		href="static/css/jscrollpane.css" />
	<link rel="stylesheet" href="static/css/base.css" type="text/css" />
	<link rel="stylesheet" href="static/css/main.css" type="text/css"
		media="screen" />
	<link rel="stylesheet" href="../comics/css/index.css" type="text/css"
		media="screen" />
	<link rel="stylesheet" href="../comics/css/base.css" type="text/css" />
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
</head>

<body onload="dologin()">
	<!--网站通用顶部-->
	<div id="newbarbox">
		<div id="newbar">
			<div id="barbox">
				<h3>
					<div id="denglu" style='display: block;'>
						<a href="login.jsp" target="_blank">登录</a>
					</div>
					<div id="youname" style='display: none;'>
						欢迎你：<a href="user/userMangement.jsp" target="_Blank"><%=session.getAttribute("username")%></a>
					</div>
				</h3>
				<h3>
					<div id="zhuce" style='display: block;'>
						<a href="register.jsp" target="_blank">注册</a>
					</div>
					<div id="zhuxiao" style='display: none;'>
						<a href="Logout.action">注销</a>
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
		<div class="warpbox"
			style="position: relative; z-index: 22; width: 980px; margin: 0 auto">
			<div id="header">
				<div>
					<img src="../comics/images/head2.jpg" />
				</div>
				<div>
					<img src="../comics/images/head3.jpg" />
				</div>
				<ul class="menu">
					<li><a href="queryindex.action" target="_blank">海贼王分享网</a></li>
					<li><a href="findcomics.action" target="_blank">海贼王漫画</a></li>
					<li><a href="findanime.action" target="_blank">海贼王动画</a></li>
					<li><a href="findvideoPage.action" target="_blank">海贼视频</a></li>
					<li><a href="finddata.action" target="_blank">资料</a></li>
					<li><a href="findpictrue.action" target="_blank">图片</a></li>
					<li><a href="findInformation.action" target="_blank">资讯情报</a></li>
					<li><a href="findNews.action" target="_blank">海贼分析</a></li>
				</ul>
			</div>
		</div>
		<div id="main" class="articlebox"
			style="position: relative; z-index: 999;">

			<div style="margin-top: 10px;">
				<script language="javascript" src="static/js/1.js"></script>
			</div>
			<div class="location location1 location2">
				<a href="queryindex.action" target="_blank">首页</a> > TV版 >
				海贼王
			</div>
			<div class="dhlist">
				<div class="zwlist cc">
					<div class="zw cc">
						<img src="static/picture/l_hzw.jpg" width="168" height="232" />
						<h3>
							<b><a title="海贼王">海贼王</a></b>
							<code>
								【观看漫画】
							</code>
						</h3>
						<p>
							<span>作者：尾田荣一郎 </span> <span>首播时间：1997-01-01</span>
						</p>
						<p>
							<span>地区：日本</span>
							<span>影片类型：TV版</span>
						</p>
						<p>
							<span>状态：连载中</span> <span>
							</span>
						</p>
						<p>
							题材：奇幻冒险&nbsp;热血少年&nbsp;
						</p>
						<p>
							简介：&ldquo;ONE
							PIECE&rdquo;在故事中为&ldquo;一个大秘宝&rdquo;之意。故事描述男主角&lsquo;草帽&rsquo;蒙其&middot;D&middot;路飞为了当上&ldquo;...<a
								href="#des" style="color: #f75b88; font-weight: bold;">查看更多</a>
						</p>
						<div class="gxtime">
							更新预告<b>暂无!</b>
						</div>
					</div>
					<div class="ad"></div>
				</div>
				<!--<div class="jujlist cc">
					<ul>
						<li class="cur"><code>下载</code></li>
					</ul>
				</div>
				 <div class="juji juji2">
					<p>
						&nbsp;<span
							style="color: rgb(51, 51, 51); font-family: 'Microsoft YaHei', arial, helvetica, clean, sans-serif; font-size: 13px; line-height: 26px; background-color: rgba(255, 255, 255, 0.960784);">资源列表</span>
					</p>
					<p>
						<span
							style="color: rgb(51, 51, 51); font-family: 'Microsoft YaHei', arial, helvetica, clean, sans-serif; font-size: 13px; line-height: 26px; background-color: rgba(255, 255, 255, 0.960784);">海贼王794集：<u><strong><a
									href="http://pan.baidu.com/share/link?shareid=1833899365&amp;uk=3962011727&amp;errno=0&amp;errmsg=Auth%20Login%20Sucess&amp;&amp;bduss=&amp;ssnerror=0"
									target="_blank"><strong><span
											style="color: rgb(255, 0, 0);">百度网盘</span></strong></a></strong></u><strong><a
								href="http://pan.baidu.com/share/link?shareid=1833899365&amp;uk=3962011727&amp;errno=0&amp;errmsg=Auth%20Login%20Sucess&amp;&amp;bduss=&amp;ssnerror=0"
								target="_blank"></a></strong><u>&nbsp;</u></span>
					</p>
					<p
						style="margin: 0px; padding-bottom: 13px; color: rgb(51, 51, 51); font-family: 'Microsoft YaHei', arial, helvetica, clean, sans-serif; font-size: 13px; line-height: 26px; background-color: rgba(255, 255, 255, 0.960784);">
						<span property="v:summary">剧场版种子：<a
							href="http://pan.baidu.com/s/1pKXAGjx" target="_blank"
							textvalue="百度云盘"
							style="outline: none; color: rgb(17, 34, 204); text-decoration: none; background-color: transparent;">百度云盘</a>&nbsp;密码：r9d7
						</span>
					</p>
					<p
						style="margin: 0px; padding-bottom: 13px; color: rgb(51, 51, 51); font-family: 'Microsoft YaHei', arial, helvetica, clean, sans-serif; font-size: 13px; line-height: 26px; background-color: rgba(255, 255, 255, 0.960784);">
						<span property="v:summary">1-626话:+剧场版+特别篇 种子：<a
							href="http://pan.baidu.com/s/1c26by2" target="_blank"
							textvalue="百度云盘"
							style="outline: none; color: rgb(17, 34, 204); text-decoration: none; background-color: transparent;">百度云盘</a>&nbsp;密码：eowc
						</span>
					</p>
					<p
						style="margin: 0px; padding-bottom: 13px; color: rgb(51, 51, 51); font-family: 'Microsoft YaHei', arial, helvetica, clean, sans-serif; font-size: 13px; line-height: 26px; background-color: rgba(255, 255, 255, 0.960784);">&nbsp;</p>
				</div> -->
				<div class="relativedh">
					<h3>海贼王剧情简介</h3>
					<a name="des"></a>
					<div class="xhintro">
						<p>
							<p style="text-indent: 2em">&ldquo;ONE
								PIECE&rdquo;在故事中为&ldquo;一个大秘宝&rdquo;之意。故事描述男主角&lsquo;草帽&rsquo;蒙其&middot;D&middot;路飞为了当上&ldquo;海贼王&rdquo;而踏上&ldquo;伟大航道&rdquo;及与其伙伴的经历。传说中&lsquo;海贼王&rsquo;哥尔&middot;D&middot;罗杰在死前说出他留下了具有财富、名声、力量世界第一的宝藏&ldquo;ONE
								PIECE&rdquo;，许多人为了争夺&ldquo;ONE
								PIECE&rdquo;，争相出海，许多海贼开始树立霸权，而形成了&ldquo;大海贼时代&rdquo;。十年后，路飞为了要实现与因救他而断臂的四皇&lsquo;红发&rsquo;香克斯的约定而出海，在遥远的路途上找寻着志同道合的伙伴，一起进入&ldquo;伟大航道&rdquo;，目标当上&ldquo;海贼王&rdquo;。</p>
							<p style="text-indent: 2em; text-align: center">
								<img src="static/picture/1283568_165003_2091.jpg" alt="" />
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">导演: 宇田钢之助</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">编剧: Mitsuru Shimada /
										Suminori Takegami</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">主演: 田中真弓 / 冈村明美 / 中井和哉 / 平田广明
										/ 山口胜平 / 更多...</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">类型: 喜剧 / 动作 / 动画 / 奇幻 / 冒险</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">官方网站:
										www.toei-anim.co.jp/tv/onep/</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">制片国家/地区: 日本</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">语言: 日语</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">首播: 1999-10-20(日本)</span></font>
							</p>
							<p style="text-indent:0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">单集片长: 24分钟</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">又名: 航海王 / One Piece</span></font>
							</p>
							<p style="text-indent: 0px;">
								<font face="Arial, Helvetica, sans-serif" color="#666666"><span
									style="line-height: 18px;">IMDb链接: tt0388629</span></font>
							</p>
							<p style="text-indent: 2em">&nbsp;</p>
						</p>
					</div>
				</div>
				<div class="juqh">
					<div class="jujlist cc">
						<span id='jjsort'><em class="cur">降序</em><em class="sx">升序</em></span>
						<ul>
							<li class="cur"><code>选集</code>列表</li>
						</ul>
					</div>
					<div class="juji">
						<ul>
						<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							<c:forEach items="${animeLsit }" var="anime" begin="0" varStatus="1">
							<li><a href="findanimeByid.action?method=${anime.animeid }"
									target="_blank">${anime.animepid }</a></li>
							</c:forEach>
							
						</ul>
						<div class="kmore">
							<a href="javascript:void(0)">点击查看全集</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="footer" style="margin-top: 0;">
			<div class="btmenu">
				<div class="dm_bottombar footer">
					本站漫画等相关内容均来自网络或网友上传，以供爱好者研究讨论，若侵犯到您的权益，请立即联系我们删除。本站不负任何相关责任。<br />
					<a rel="external nofollow" href="#">闽网文[2019]XXXX-XXX号</a> | <a
						rel="external nofollow" href="#">新出网证(闽)字XX号</a> | <a
						rel="external nofollow" href="#">ICP证闽XX-XXXXXXXX-XX</a>
					如果有意见和建议，请点反馈E-mail至<a href="mailto:1005159022@qq.com">1005159022@qq.com</a><br />
					Copyright &copy; 2018 - 2019 opshare.com All Rights Reserved.温孟旋
					版权所有
				</div>
			</div>
		</div>
	</div>
	<script language="javascript" src="static/js/jquery-1.4.2.min.js"></script>
	<script language="javascript" src="static/js/index.js"></script>
</body>
</html>