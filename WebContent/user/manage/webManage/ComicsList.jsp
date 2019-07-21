<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 导入国际化标签库 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>漫画列表</title>
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
	function doDel(Id) {
		if (window.confirm("您确定删除吗？")) {
			//给隐藏表单域 设置要删除的员工编号
			document.getElementById("comicsid").value = Id;
			//手动调用表单提交方法
			document.getElementById("delCmics").submit();
		}
	}
</script>
</head>
<body>
	<h1>漫画列表&nbsp;&gt;&gt;&nbsp;管理漫画列表</h1>
	<form id="delCmics" action="delComicsManageByID.action" method="get">
		<input type="hidden" name="comicsid" id="comicsid">
	</form>
	<table width="90%" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<caption>
			<h3>漫画列表</h3>
		</caption>
		<thead>
			<tr bgcolor="#cccccc">
				<!-- <th>
          <input type="checkbox" id="chkAll" />
          <a href="#">删除/批量</a>
        </th> -->
				<th>编号</th>
				<th>话数</th>
				<th>上传时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty requestScope.comicsList }">
				<tr>
					<td colspan="7">没有您要的查询结果</td>
				</tr>
			</c:if>

			<c:if test="${not empty requestScope.comicsList }">
				<c:forEach items="${requestScope.comicsList }" var="comicsList"
					varStatus="status">

					<tr
						<c:if test="${status.index mod 2 ne 0 }">bgcolor="#cccccc"</c:if>>
						<%-- <td align="center" width="10%"><input type="checkbox" id="chkEmployee${status.count }" name="empIds" /></td> --%>
						<td width="10%" height="4%" align="center">${comicsList.comicsid }</td>
						<td width="40%" height="7%"><a
							href="#?method=${comicsList.comicsid }">${comicsList.comicsname }</a></td>
						<td width="20%" height="7%"><fmt:formatDate
								value="${comicsList.addtime }" pattern="yyyy年MM月dd日 " /></td>
						<td width="10%" height="7%">
							<!-- <a href="#">更新</a> --> <a
							href="javascript:doDel(${comicsList.comicsid });">删除</a> <a
							href="findcomicsDetail.action?method=${comicsList.comicsid }">查看</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div style="text-align: right; padding-right: 40px;">
		<td colspan="7"><a href="selectComicsManage.action?pages=1">首页</a> <c:if
				test="${pages ne 1 }">
				<a href="selectComicsManage.action?pages=${prepages }">上一页</a>
			</c:if> <c:if test="${nextpages le totalpages }">
				<a href="selectComicsManage.action?pages=${nextpages }">下一页</a>
			</c:if> <a href="selectComicsManage.action?pages=${totalpages }">末页</a>
			第${pages}页/共${totalpages}页
	</div>
</body>
</html>