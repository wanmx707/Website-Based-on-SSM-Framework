<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传图集</title>
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

</script>
</head>
<body>
	<h1>图片稿件&nbsp;&gt;&gt;&nbsp;上传稿件</h1>
	<form action="../../../uploadpic.action" method="post"
		enctype="multipart/form-data">


		<table id="tblAddDocument" width="90%" border="1"
			bordercolor="#eeeeee" align="center" cellpadding="5" cellspacing="1">

			<tr>
				<td align="right">标题</td>
				<td><input type="text" name="picname" /><font color="red"
					size="3px">*标题无法更改请仔细斟酌决定</font></td>
			</tr>
			<tr>
				<td align="right">封面</td>
				<td><input type="file" name="filefengmian" id="filefengmian"
					accept="image/gif,image/jpeg,image/jpg,image/png" /></td>
			</tr>
			<tr>
				<td align="right">描述</td>
				<td><textarea type="text" name="piccontent" cols="50" rows="5"></textarea></td>
			</tr>
			<tr>
				<td align="right">上传文件</td>
				<td><input type="file" multiple="multiple" name="fileupload"
					id="fileupload" accept="image/gif,image/jpeg,image/jpg,image/png" /><font
					color="red" size="2px">*多个图片时请按住ctrl选择*支持gif,jpeg,jpg,png格式</font></td>
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