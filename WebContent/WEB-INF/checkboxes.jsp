<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>测试checkboxes标签</h2>
<form:form modelAttribute="options" method="post" action="checkboxes">
	<table>
		<tr>
			<td>选择答案：</td>
			<td><form:checkboxes items="${optionsList }" path="options"/></td>
		</tr>
	</table>
</form:form>



</body>
</html>