<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传视频</title>
<link type="text/css" rel="stylesheet" href="css/global.css"></link>
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<style type="text/css">
#tblAddDocument {
	margin-top: 10px;
}

h1 {
	font: bold 14px/24px 宋体;
	background: #ccc;
}
</style>
<script type="text/javascript">
	function validateTitle() {
		var codeElement = document.getElementById("videotitle");
		var msgElement = document.getElementById("titleMsg");
		if (codeElement.value == "") {
			codeElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:black'>标题不能为空!</span>";
			return false;
		}
	}
	function validateText() {
		var codeElement = document.getElementById("videocontent");
		var msgElement = document.getElementById("textMsg");
		if (codeElement.value == "") {
			codeElement.className = "wrong";//获取元素对象的class属性
			msgElement.innerHTML = "<span style='color:black'>描述不能为空!</span>";
			return false;
		}
	}
	function validate(){
		return validateTitle()&&validateText();
	}
</script>
</head>
<body>
	<h1>视频稿件&nbsp;&gt;&gt;&nbsp;上传稿件</h1>
	<form action="../../../upload.action" method="post"
		enctype="multipart/form-data" onsubmit="return validate();">


		<table id="tblAddDocument" width="90%" border="1"
			bordercolor="#eeeeee" align="center" cellpadding="5" cellspacing="1">

			<tr>
				<td align="right">标题</td>
				<td><input type="text" name="videotitle" id="videotitle"
					onblur="validateTitle();" /><span id="titleMsg" style="color: red">${worng }</span><font
					color="red" size="3px">*标题无法更改请仔细斟酌决定</font></td>
			</tr>
			<tr>
				<td align="right">封面</td>
				<td><input type="file" name="videopicture" accept="img/jpg" /><font
					color="red" size="3px">*封面无法更改请仔细斟酌决定</font></td>
			</tr>
			<tr>
				<td align="right">描述</td> 
				<td><textarea type="text" name="videocontent" id="videocontent" cols="50"
						rows="5" onblur="validateText();"></textarea><span id="textMsg"
					style="color: red">${worng }</span></td>
			</tr>
			<tr>
				<td align="right">上传文件</td>
				<td><input type="file" name="file" accept="video/mp4" /><font
					color="red" size="3px">*只允许mp4格式，大小暂时限制在100MB以内</font></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交" /> <input type="reset"
					value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>