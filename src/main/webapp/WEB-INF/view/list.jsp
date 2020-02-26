<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css"/>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">

	//分页
	function fenye(pageNum) {
		//给表单中隐藏标签赋值
		$("[name=pageNum]").val(pageNum);
		//表单提交
		$("form").submit();
	}

	//添加跳转
	function add() {
		location="toAdd.do";
	}	
</script>
</head>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="pageNum">
	
	品牌：<input type="text" name="bbrand" value="${con.bbrand }">
	种类：<input type="text" name="btype" value="${con.btype }">
	单价范围：<input type="text" name="p1" value="${con.p1 }">
		到<input type="text" name="p2" value="${con.p2 }">
	商品名称：<input type="text" name="gname" value="${con.gname }">
	<button>搜索</button>
	<input type="button" value="添加" onclick="add()">
</form>
<table>
	<tr>
		<td>商品编号</td>
		<td>商品名称</td>
		<td>英文名称</td>
		<td>商品品牌</td>
		<td>商品种类</td>
		<td>尺寸</td>
		<td>单价(元)</td>
		<td>数量</td>
		<td>标签</td>
		<td>商品图片上传</td>
	</tr>
	<c:forEach items="${page.list }" var="goods" varStatus="count">
		<tr>
			<td>${count.count}</td>
			<td>${goods.gname }</td>
			<td>${goods.english }</td>
			<td>${goods.bbrand }</td>
			<td>${goods.btype }</td>
			<%-- <td>
				<c:forEach items="${goods.brands }" var="b">
					${b.bbrand }
				</c:forEach>
			</td> --%>
			<%-- <td>
				<c:forEach items="${goods.brands }" var="b">
					${b.btype }
				</c:forEach>
			</td> --%>
			<td>${goods.size }</td>
			<td>${goods.price }</td>
			<td>${goods.num }</td>
			<td>${goods.txt }</td>
			<td>
				<img alt="未选择任何文件" src="file/${goods.pic }">
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			当前${page.pageNum}/${page.pages}页,共${page.total}条
		</td>
	</tr>
</table>
</body>
</html>