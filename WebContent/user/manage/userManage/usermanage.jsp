<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用户</title>
<link type="text/css" rel="stylesheet" href="css/global.css"></link>
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<style type="text/css">
h1 {
	font: bold 14px/24px 宋体;
	background: #ccc;
}
</style>
<script type="text/javascript">
	 function checkAll(){
		 var result=confirm("是否修改？");
		 if(result){
			 return true;
		 }else{
			 return false;
		 }
	 }
</script>
</head>
<body>
	<h1>个人管理--&nbsp;&gt;&gt;&nbsp;信息管理</h1>

	<form action="/comics/changeInfor.action" method="post" onsubmit="return checkAll()" enctype="multipart/form-data">
		<table width="90%" align="center" cellpadding="10" cellspacing="0">
			<tr>
				<td></td>
				<td><h2>
						您的信息：</strong>
					</h2>
			</tr>
			<tr>
				<td align="right" width="20%">用户姓名：</td>
				<td width="80%"><input type="hidden" name="userid"
					value="${user.userid }" /> <input type="text" id="username"
					name="username" value="${user.username }" /></td>
			</tr>
			<tr>
				<td align="right">电子邮箱：</td>
				<td><input type="text" id="useremail" name="useremail"
					value="${user.useremail }" /></td>
			</tr>
			<tr>
				<td align="right">性别：</td>
				<td><select name="backsex" id="backsex">
						<option><c:if test="${user.sex eq 1 }">男</c:if>
							<c:if test="${user.sex eq 0 }">女</c:if>
						</option>
						<option><c:if test="${user.sex eq 0 }">男</c:if>
							<c:if test="${user.sex eq 1 }">女</c:if>
						</option>
				</select></td>
			</tr>
			<tr>
				<td align="right">出生日期：</td>

				<td><input type="text" id="backbirthday" name="backbirthday"
					value="<fmt:formatDate value="${user.birthday }"
						pattern="yyyy-MM-dd" />" /></td>
			</tr>
			<tr>
				<td align="right">联系方式：</td>
				<td><input type="text" id="callway" name="callway"
					value="${user.callway }" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="确认修改" /> <input type="reset"
					value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>