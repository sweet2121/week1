<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css"/>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form:form action="add.do" method="post" modelAttribute="goods" enctype="multipart/form-data">
	<table>
		<tr>
			<td>商品名称：</td>
			<td>
				<form:input path="gname"/>
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td>
				<form:input path="english"/>
			</td>
		</tr>
		<tr>
			<td>尺寸：</td>
			<td>
				<form:input path="size"/>
			</td>
		</tr>
		<tr>
			<td>单价：</td>
			<td>
				<form:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>数量：</td>
			<td>
				<form:input path="num"/>
			</td>
		</tr>
		<tr>
			<td>标签：</td>
			<td>
				<form:input path="txt"/>
			</td>
		</tr>
		<tr>
			<td>商品图片上传：</td>
			<td>
				<input type="file" name="myFile">
			</td>
		</tr>
		<tr>
			<td>品牌：</td>
			<td>
				<form:input path="bbrand"/>
			</td>
		</tr>
		<tr>
			<td>种类：</td>
			<td>
				<form:input path="btype"/>
			</td>
		</tr>
		<tr>
		<td></td>
		<td>
			<form:button>提交</form:button>
		</td>
	</tr>
	</table>
</form:form>
</body>
</html>