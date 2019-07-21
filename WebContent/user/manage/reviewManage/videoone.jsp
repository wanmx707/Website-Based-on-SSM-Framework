<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
</head>
<body onload="dologin()">
		<div id="contents">
			<div class="main">
				<div class="summary">
					<div class="title">
						<h2>
							<span style="color: red">标题：</span> ${uservideo.videotitle }
						</h2>
					</div>
						
				</div>
				<div class="player-wrapper">
					<div id="player" class="player" style="height: 603px;">
						<embed
							src="/upload/${uservideo.way }"
							width="100%" height="100%" bgcolor="#000000" quality="high"
							allowfullscreen="true" allowscriptaccess="always"/>
					</div>
				</div>
			</div>
			
			<div class="ep-info">
				<div class="left">
					<div class="detail">
						<div class="txt">
							<h3>
								<span style="color: red">简介：</span> 「${uservideo.videotitle }」${uservideo.videocontent }<span class="date"><fmt:formatDate
										value="${uservideo.videoaddtime }" pattern="yyyy-MM-dd" /></span>
							</h3>
							<p class="desc"></p>
						</div>
					</div>
					<h3></h3>
				</div>
			</div>
		</div>
</body>
</html>