<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8”>
<html>
<head>
</head>
<body>
	<div id="contents">
		<form action="findvideochange.action" enctype="multipart/form-data" method="post">
		<input type="hidden" value="${uservideo.videoid }" name="videoid"/>
			<div class="main">
				<div class="summary">
					<div class="title">
						<h2>
							<span style="color: red">标题：</span> <input type="text"
								value="${uservideo.videotitle }" name="videotitle"/>
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
								<span style="color: red">简介：</span>
								<textarea rows="3" cols="60" name="videocontent">${uservideo.videocontent }</textarea>
								<input type="submit" value="提交" style="font-size: 10px"/>
							</h3>
							<p class="desc"></p>
						</div>
					</div>
					<h3></h3>
				</div>
			</div>
		</form>
	</div>
</body>
</html>