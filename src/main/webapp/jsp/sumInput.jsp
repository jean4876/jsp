<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <form action="<%=request.getContextPath() %>/SumCalculation" method="get">
      start의 값 : <input type="text" name='start'><br>
	  end의 값 : <input type="text" name='end'><br><br>
      <input type="submit" value="전송"/> <br>
   </form>

</body>
</html>
