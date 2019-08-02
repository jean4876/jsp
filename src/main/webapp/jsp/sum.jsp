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

int result = 0;

	for(int i = number; i <= number2; i++){
		result += i;
	}

%>
</head>
<body>

첫번째 값 : <%=number %><br>
두번째 값 : <%=number2 %><br>
두 값사이의 숫자들위 합 : <%=result %><br>

</body>
</html>