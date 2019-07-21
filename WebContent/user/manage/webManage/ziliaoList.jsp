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
			document.getElementById("opdataid").value = Id;
			//手动调用表单提交方法
			document.getElementById("delOpdata").submit();
		}
	}
</script>
</head>
<body>
	<h1>情报列表&nbsp;&gt;&gt;&nbsp;管理情报列表</h1>
	<form id="delOpdata" action="delOpdatByid.action" method="get">
		<input type="hidden" name="opdataid" id="opdataid">
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
				<th>标题</th>
				<th>上传时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty requestScope.opdataList }">
				<tr>
					<td colspan="7">没有您要的查询结果</td>
				</tr>
			</c:if>

			<c:if test="${not empty requestScope.opdataList }">
				<c:forEach items="${requestScope.opdataList }" var="opdataList"
					varStatus="status">

					<tr
						<c:if test="${status.index mod 2 ne 0 }">bgcolor="#cccccc"</c:if>>
						<%-- <td align="center" width="10%"><input type="checkbox" id="chkEmployee${status.count }" name="empIds" /></td> --%>
						<td width="10%" height="4%" align="center">${opdataList.opdataid }</td>
						<td width="10%" height="4%"><c:if
								test="${opdataList.opdatatypeid=='1' }">海贼</c:if> <c:if
								test="${opdataList.opdatatypeid=='2' }">海军</c:if> <c:if
								test="${opdataList.opdatatypeid=='3' }">世界政府</c:if> <c:if
								test="${opdataList.opdatatypeid=='4' }">革命军</c:if> <c:if
								test="${opdataList.opdatatypeid=='5' }">海贼团</c:if> <c:if
								test="${opdataList.opdatatypeid=='6' }">动物</c:if> <c:if
								test="${opdataList.opdatatypeid=='7' }">其他</c:if></td>

						<td width="10%" height="7%">${opdataList.titleopdata }</td>
						<td width="20%" height="7%"><fmt:formatDate
								value="${opdataList.addtime }" pattern="yyyy年MM月dd日 " /></td>
						<td width="10%" height="7%">
							<!-- <a href="#">更新</a> --> <a
							href="javascript:doDel(${opdataList.opdataid });">删除</a> <a
							href="selectOpdataByid.action?method=${opdataList.opdataid }">查看</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<div style="text-align: right; padding-right: 40px;">
		<td colspan="7"><a href="selectOpdataManage.action?pages=1">首页</a>
			<c:if test="${pages ne 1 }">
				<a href="selectOpdataManage.action?pages=${prepages }">上一页</a>
			</c:if> <c:if test="${nextpages le totalpages }">
				<a href="selectOpdataManage.action?pages=${nextpages }">下一页</a>
			</c:if> <a href="selectOpdataManage.action?pages=${totalpages }">末页</a>
			第${pages}页/共${totalpages}页
	</div>
</body>
</html>