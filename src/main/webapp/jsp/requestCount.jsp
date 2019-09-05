<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>uri 통계자료</h2>
<table>
	<thead>
		<tr>
			<th>uri</th>
			<th>post/get</th>
			<th>횟수</th>
		</tr>
	</thead>
	<%-- application scope 저장된 속성명 : requestCountMap  --%>
	<c:forEach items="${requestCountMethodMap }" var="map">
	<tbody>
		<tr>
			<td>${map.key.uri }</td>
			<td>${map.key.method }</td>
			<td>${map.value }</td>
	</tbody>

	</c:forEach>
</table>
</body>
</html>