<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 导入国际化标签库 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>情报列表</title>
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
			document.getElementById("fruitid").value = Id;
			//手动调用表单提交方法
			document.getElementById("delFruit").submit();
		}
	}
</script>
</head>
<body>
	<h1>情报列表&nbsp;&gt;&gt;&nbsp;管理情报列表</h1>
	<form id="delFruit" action="delFruitByid.action" method="get">
		<input type="hidden" name="fruitid" id="fruitid">
	</form>
	<table width="90%" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<caption>
			<h3>情报列表</h3>
		</caption>
		<thead>
			<tr bgcolor="#cccccc">
				<!-- <th>
          <input type="checkbox" id="chkAll" />
          <a href="#">删除/批量</a>
        </th> -->
				<th>编号</th>
				<th>类别</th>
				<th>名称</th>
				<th>编写时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty requestScope.fruitList }">
				<tr>
					<td colspan="7">没有您要的查询结果</td>
				</tr>
			</c:if>

			<c:if test="${not empty requestScope.fruitList }">
				<c:forEach items="${requestScope.fruitList }" var="fruitList"
					varStatus="status">
					<tr
						<c:if test="${status.index mod 2 ne 0 }">bgcolor="#cccccc"</c:if>>
						<%-- <td align="center" width="10%"><input type="checkbox" id="chkEmployee${status.count }" name="empIds" /></td> --%>
						<td width="10%" height="4%" align="center">${fruitList.fruitid }</td>
						<td width="10%" height="4%"><c:if
								test="${fruitList.fruittypeid=='1' }">自然系果实</c:if> <c:if
								test="${fruitList.fruittypeid=='2' }">超人系果实</c:if> <c:if
								test="${fruitList.fruittypeid=='3' }">动物系果实</c:if> <c:if
								test="${fruitList.fruittypeid=='4' }">未知</c:if> </td>

						<td width="10%" height="7%">${fruitList.title }</td>
						<td width="20%" height="7%"><fmt:formatDate
								value="${fruitList.addtime }" pattern="yyyy年MM月dd日 " /></td>
						<td width="10%" height="7%">
							<!-- <a href="#">更新</a> --> <a
							href="javascript:doDel(${fruitList.fruitid });">删除</a> <a
							href="selectFruitByid.action?method=${fruitList.fruitid }">查看</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div style="text-align: right; padding-right: 40px;">
		<td colspan="7"><a href="selectFruitManage.action?pages=1">首页</a>
			<c:if test="${pages ne 1 }">
				<a href="selectFruitManage.action?pages=${prepages }">上一页</a>
			</c:if> <c:if test="${nextpages le totalpages }">
				<a href="selectFruitManage.action?pages=${nextpages }">下一页</a>
			</c:if> <a href="selectFruitManage.action?pages=${totalpages }">末页</a>
			第${pages}页/共${totalpages}页
	</div>
</body>
</html>