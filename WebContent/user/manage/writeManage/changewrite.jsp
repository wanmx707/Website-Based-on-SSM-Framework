<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta http-equiv="Content-Type"
	content="multipart/form-data; charset=utf-8" />

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<title>分析文章</title>
<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/base.css" type="text/css" />
<script src="<%=basePath%>xheditor/jquery/jquery-1.4.4.min.js"></script>
<script src="<%=basePath%>xheditor/xheditor-1.2.2.min.js"></script>
<script src="<%=basePath%>xheditor/xheditor_lang/zh-cn.js"></script>
<script type="text/javascript">
	$(pageInit);
	function pageInit() {
		$.extend(XHEDITOR.settings, {
			shortcuts : {
				'ctrl+enter' : submitForm
			}
		});
		$('#newscontent').xheditor({
			skin : 'o2007blue',
			upLinkUrl : "uplink.action",
			upLinkExt : "zip,rar,txt",
			upImgUrl : "<%=basePath%>upImg.action",
			upImgExt : "jpg,jpeg,gif,png",
			html5Upload : false,
			onUpload : insertUpload
		});
	}
	function insertUpload(arrMsg) {
		console.log(arrMsg)
		var i, msg;
		for (i = 0; i < arrMsg.length; i++) {
			msg = arrMsg[i];
			$("#uploadList")
					.append(
							'<option value="'+msg.id+'">' + msg.localname
									+ '</option>');
		}
	}
	function submitForm() {
		$('#frmDemo').submit();
	}
	
	function validate() {
		var titlecomment = document.getElementById("newstitle").value;
		if (titlecomment == "") {
			alert("请输入标题");
			return false;
		}
		var comment = document.getElementById("newscontent").value;
		if (comment == "" || comment == null) {
			alert("请输入内容");
			return false;
		} 
	}
</script>
</head>
<body>
	<form id="frmDemo" enctype="multipart/form-data" method="post"
				action="<%=basePath%>updateNewschange.action" onsubmit="return validate();">
				<br /> <br />
				<c:if test="${allErrors!=null }">
				<c:forEach items="${allErrors }" var="errors">
				<span style="color: red">${errors.defaultMessage }</span><br />
				</c:forEach>
				</c:if>
				<div align="center">
				<input type="hidden" name="newsid" value="${news.newsid }"/>
					标题：<input type="text" id="newstitle" name="newstitle" value="${news.newstitle }"/>
				</div>
				<br /> <br />
				<textarea id="newscontent" name="newscontent" rows="25" cols="80" style="width: 100%" >${news.newscontent }</textarea>
				<br /> <br /> <input type="submit" style="font-size: 22px;"
					name="save" value="确认修改" /> <input type="reset"
					style="font-size: 22px;" name="reset" value="重置" />
			</form>
	</div>
	</div>
</body>
</html>