<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>scope result</h2>
	request : <%=request.getAttribute("reqAttr") %> <br>
	sesssion: <%=request.getAttribute("sessionAttr") %> <br>
	application : <%=application.getAttribute("applicationATtr") %> <br>

</body>
</html>