<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 导入国际化标签库 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<link type="text/css" rel="stylesheet" href="css/global.css"></link>
<style type="text/css">
td, th {
	font-size: 12px;
}

h1 {
	margin: 0px;
	padding: 0px;
	background: #ccc;
	height: 30px;
	font: bold 14px/30px 宋体;
}

.textbox {
	width: 120px;
}
</style>
<script type="text/javascript">
	function doList(pageIndex) {
		//alert("pageIndex: "+pageIndex);
		//设定要查询的页码数
		document.getElementById("txtPageIndex").value = pageIndex;
		//手动调用表单提交方法
		document.getElementById("frmListEmployee").submit();
	}

	function doDel(Id) {
		if (window.confirm("您确定删除吗？")) {
			//给隐藏表单域 设置要删除的员工编号
			document.getElementById("delpicid").value = Id;
			//手动调用表单提交方法
			document.getElementById("delpicture").submit();
		}
	}
	function dopass(Id) {
		if (window.confirm("您确定通过吗？")) {
			//给隐藏表单域 设置通过的视频编号
			document.getElementById("passpicid").value = Id;
			//手动调用表单提交方法
			document.getElementById("passpicture").submit();
		}
	}
	function doback(Id) {
		if (window.confirm("您确定驳回吗？")) {
			//给隐藏表单域 设置通过的视频编号
			document.getElementById("backpicid").value = Id;
			//手动调用表单提交方法
			document.getElementById("backpicture").submit();
		}
	}
</script>
</head>
<body>
	<h1>视频稿件&nbsp;&gt;&gt;&nbsp;管理我的稿件</h1>
	<form id="delpicture" action="delpicByID.action" method="get">
		<input type="hidden" name="picid" id="delpicid">
	</form>
	<form id="passpicture" action="passpicByID.action" method="get">
		<input type="hidden" name="picid" id="passpicid">
	</form>
	<form id="backpicture" action="backpicByID.action" method="get">
		<input type="hidden" name="picid" id="backpicid">
	</form>
	<table width="90%" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<caption>
			<h3>我的视频稿件</h3>
		</caption>
		<thead>
			<tr bgcolor="#cccccc">
				<th>编号</th>
				<th>标题</th>
				<th>简介</th>
				<th>上传时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty requestScope.userpicList }">
				<tr>
					<td colspan="7">没有您要的查询结果</td>
				</tr>
			</c:if>

			<c:if test="${not empty requestScope.userpicList }">
				<c:forEach items="${requestScope.userpicList }" var="userpicList"
					varStatus="status">

					<tr
						<c:if test="${status.index mod 2 ne 0 }">bgcolor="#cccccc"</c:if>>
						<td width="10%" height="4%" align="center">${userpicList.picid }</td>
						<td width="10%" height="7%"><a
							href="findstatusvideoByid.action?method=${userpicList.picid }">${userpicList.picname }</a></td>
						<td width="40%" height="7%">${userpicList.piccontent }</td>
						<td width="20%" height="7%"><fmt:formatDate
								value="${userpicList.picaddtime }"
								pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						<td width="10%" height="7%">
							<!-- <a href="#">更新</a> --> <a
							href="javascript:doDel(${userpicList.picid });">删除</a> <a
							href="findstatuspicByid.action?method=${userpicList.picid }">查看</a>
							<a href="javascript:dopass(${userpicList.picid });">通过</a> <a
							href="javascript:doback(${userpicList.picid });">驳回</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div style="text-align: right; padding-right: 40px;">
		<td colspan="7"><a href="findpictureStatus.action?pages=1">首页</a>
			<c:if test="${pages ne 1 }">
				<a href="findpictureStatus.action?pages=${prepages }">上一页</a>
			</c:if> <c:if test="${nextpages le totalpages }">
				<a href="findpictureStatus.action?pages=${nextpages }">下一页</a>
			</c:if> <a href="findpictureStatus.action?pages=${totalpages }">末页</a>
			第${pages}页/共${totalpages}页
	</div>
</body>
</html>