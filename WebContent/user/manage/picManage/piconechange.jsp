<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta http-equiv="Content-Type"
	content="multipart/form-data; charset=utf-8" />
<title>海贼王图片</title>
<link href="static/css/haizeiwang_global.css" rel="stylesheet"
	type="text/css" />
<link href="static/css/haizeiwang2_140918.css" rel="stylesheet"
	type="text/css" />

<script type="text/javascript">
function delPic(id) {
	if(window.confirm("你确定要删除这张图片吗？")){
		document.getElementById("PicDetail").value=id;
		document.getElementById("delPic").submit();
	}
}

</script>
</head>
<body>
	<div id="main">
		<form action="delPictureDetailByid.action" enctype="multipart/form-data" id="delPic" method="get">
			<input type="hidden" name="picdetailid" id="PicDetail" /> <input
				type="hidden" name="picid" value="${picture.picid }" />
		</form>
		<form action="updatePicureName.action" enctype="multipart/form-data"
			method="post">
			<div class="wrap mt10">
				<div class="g_row">
					<div class="g_box g_box_wide">
						<div class="g_hd">
							<span class="lt"></span> <span class="rt"></span>
						</div>
						<div class="g_bd">
							<div class="g_gallery">
								<div class="g_picsbox">
									<h1 class="dm_title">
										<input type="hidden" value="${picture.picid }" name="picid" />
										<input type="text" value="${picture.picname }" name="picname" />
									</h1>
									<c:forEach items="${picture.picturedetail }"
										var="picturedetail">
										<div class="g_pics">
											<img src="/upload/${picturedetail.picway }"
												onclick="delPic(${picturedetail.picdetailid})" />
										</div>
										<div class="dm_author"></div>
									</c:forEach>
									<input type="submit" value="提交修改" style="font-size: 22px;" />
								</div>
							</div>
						</div>

						<div class="g_fd">
							<span class="lb"></span> <span class="rb"></span>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>