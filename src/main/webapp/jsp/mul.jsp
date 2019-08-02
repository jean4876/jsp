<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
int number = Integer.parseInt(request.getParameter("number"));
int number2 = Integer.parseInt(request.getParameter("number2"));
%>


</head>
<body>

<h1>두 값의 곱</h1>

첫번째 값 : <%=number %><br>
두번째 값 : <%=number2 %><br>
두 값의 곱 : <%=number*number2 %><br>

</body>
</html>