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
			document.getElementById("delNewsid").value = Id;
			//手动调用表单提交方法
			document.getElementById("delNews").submit();
		}
	}
	function dopass(Id) {
		if (window.confirm("您确定通过吗？")) {
			//给隐藏表单域 设置通过的视频编号
			document.getElementById("passNewsid").value = Id;
			//手动调用表单提交方法
			document.getElementById("passNews").submit();
		}
	}
	function doback(Id) {
		if (window.confirm("您确定驳回吗？")) {
			//给隐藏表单域 设置通过的视频编号
			document.getElementById("backNewsid").value = Id;
			//手动调用表单提交方法
			document.getElementById("backNews").submit();
		}
	}
</script>
</head>
<body>
	<h1>稿件&nbsp;&gt;&gt;&nbsp;管理文章稿件</h1>
	<form id="delNews" action="delNewsByidJubao.action" method="get">
		<input type="hidden" name="newsid" id="delNewsid">
	</form>
	<form id="passNews" action="passNewsByidJubao.action" method="get">
		<input type="hidden" name="newsid" id="passNewsid">
	</form>
	<form id="backNews" action="backNewsByidJubao.action" method="get">
		<input type="hidden" name="newsid" id="backNewsid">
	</form>
	<table width="90%" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<caption>
			<h3>文章稿件</h3>
		</caption>
		<thead>
			<tr bgcolor="#cccccc">
				<th>编号</th>
				<th>标题</th>
				<th>上传时间</th>
				<th>被举报原因</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty requestScope.newsList }">
				<tr>
					<td colspan="7">没有您要的查询结果</td>
				</tr>
			</c:if>

			<c:if test="${not empty requestScope.newsList }">
				<c:forEach items="${requestScope.newsList }" var="newsList"
					varStatus="status">

					<tr
						<c:if test="${status.index mod 2 ne 0 }">bgcolor="#cccccc"</c:if>>
						<td width="10%" height="4%" align="center">${newsList.newsid }</td>
						<td width="27%" height="7%"><a
							href="findstatusvideoByid.action?method=${newsList.newsid }">${newsList.newstitle }</a></td>
						<td width="13%" height="7%"><fmt:formatDate
								value="${newsList.addtime }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						<td width="10%" height="7%" align="center"><c:choose>
								<c:when test="${newsList.status==2 }">色情</c:when>
								<c:when test="${newsList.status==3 }">违法违禁</c:when>
								<c:when test="${newsList.status==4 }">引战</c:when>
								<c:when test="${newsList.status==5 }">抄袭</c:when>
								<c:otherwise>其他问题</c:otherwise>
							</c:choose></td>
						<td width="10%" height="7%">
							<!-- <a href="#">更新</a> --> <a
							href="javascript:doDel(${newsList.newsid });">删除</a> <a
							href="findnewsstatusByid.action?method=${newsList.newsid }">查看</a>
							<a href="javascript:dopass(${newsList.newsid });">通过</a> <a
							href="javascript:doback(${newsList.newsid });">驳回</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div style="text-align: right; padding-right: 40px;">
		<td colspan="7"><a href="findNewsJubao.action?pages=1">首页</a> <c:if
				test="${pages ne 1 }">
				<a href="findNewsJubao.action?pages=${prepages }">上一页</a>
			</c:if> <c:if test="${nextpages le totalpages }">
				<a href="findNewsJubao.action?pages=${nextpages }">下一页</a>
			</c:if> <a href="findNewsJubao.action?pages=${totalpages }">末页</a>
			第${pages}页/共${totalpages }页
	</div>
</body>
</html>