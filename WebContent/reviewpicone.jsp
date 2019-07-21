<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
</head>
<body>

	<div id="main">
		<div class="wrap mt10">
		<div class="g_row">
			<div class="g_box g_box_wide">
				<div class="g_hd">
					<span class="lt"></span> <span class="rt"></span>
				</div>
				<div class="g_bd">
					<div class="g_gallery">
						<div class="g_picsbox">
							<h1 class="dm_title">${picture.picname }</h1>
							<div class="dm_author">
								<span>作者：海贼王分享网</span><span>来源：网络</span> <span>时间：<fmt:formatDate
										value="${picture.picaddtime }" pattern="yyyy-MM-dd" /></span>
							</div>
							<c:forEach items="${picture.picturedetail }" var="picturedetail">
							<div class="g_pics">
								<img src="/upload/${picturedetail.picway }"/>
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
	</div>
	</div>
</body>
</html>