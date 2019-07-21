<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传漫画</title>
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
	<h1>网站管理&nbsp;&gt;&gt;&nbsp;上传漫画</h1>
	<form action="../../../uploadAnime.action" method="post"
		enctype="multipart/form-data">


		<table id="tblAddDocument" width="90%" border="1"
			bordercolor="#eeeeee" align="center" cellpadding="5" cellspacing="1">
			<tr>
				<td align="right">集数</td>
				<td><input type="text" name="animepid" style="width:300px;"/><font
					color="red" size="3px">*第几集</font></td>
			</tr>
			<tr>
				<td align="right">标题</td>
				<td><input type="text" name="animetitle" style="width:300px;"/><font
					color="red" size="3px">*动画标题</font></td>
			</tr>
			<tr>
				<td align="right">简介</td>
				<td><input type="text" name="animecontent" style="width:300px;"/><font
					color="red" size="3px"></font></td>
			</tr>
			<tr>
				<td align="right">播放地址</td>
				<td><input type="text" name="way" style="width:300px;"/><font
					color="red" size="3px"></font></td>
			</tr>
			<tr>
				<td></td>
				<td>
					 <input type="submit" value="提交" /> <input
					type="reset" value="重置" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>