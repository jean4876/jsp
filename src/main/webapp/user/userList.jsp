<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>
<%@ include file="/commonJsp/basicLib.jsp" %>
<script>
   // 문서 로딩이 완료되고 나서
   $(document).ready(function () {

      // 사용자 정보 클릭시 이벤트 핸들러
      $(".userTr").on('click', function () {
         console.log("userTr click");

         // 클릭된 tr 태그의 자식태그(td)중 첫번째 자식의 텍스트 문자열
         // :) 사용자 아이디를 확인할 수 있는 방법
         console.log($(this).children().first().text());

         // input 태그에 값 설정
         $('#userId').val($(this).children().first().text());

         // form 태그 이용 전송
         console.log("serialize : " + $('#frm').serialize());

         $('#frm').submit();
      });
   })
</script>


</head>

<body>
<form id ="frm" action="${cp }/user" method="get">
	<input type="hidden" id = "userId" name = "userId"/>


</form>


<nav class="navbar navbar-inverse navbar-fixed-top">
   <div class="container-fluid">
      <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
            aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span> <span
               class="icon-bar"></span> <span class="icon-bar"></span> <span
               class="icon-bar"></span>
         </button>
         <a class="navbar-brand" href="#">JSP/SPRING</a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
         <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Help</a></li>
         </ul>
         <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
         </form>
      </div>
   </div>
</nav><div class="container-fluid">
      <div class="row">

<div class="col-sm-3 col-md-2 sidebar">
   <ul class="nav nav-sidebar">
      <li class="active"><a href="#">Main <span class="sr-only">(current)</span></a></li>
      <li class="active"><a href="#">사용자</a></li>
   </ul>
</div><div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


<div class="row">
   <div class="col-sm-8 blog-main">
      <h2 class="sub-header">사용자</h2>
      <div class="table-responsive">
         <table class="table table-striped">
            <tr>
               <th>사용자 아이디</th>
               <th>사용자 이름</th>
               <th>사용자 별명</th>
               <th>등록일시</th>
            </tr>
<%--             <%
            	List<User> userList = (List<User>) request.getAttribute("userList");
                           for(User userVo : userList){
            %>
            <tr>
               <td><%=userVo.getUserId() %></td>
               <td><%=userVo.getUserNM() %></td>
               <td></td>
               <td></td>
            </tr>
            <%} %> --%>



			<!-- for(User user : userList) -->
            <c:forEach items="${userList}" var="user">
            	<tr class = "userTr">
            		<td>${user.userId}</td>
            		<td>${user.userNM}</td>
            		<td>${user.alias}</td>
            		<td>${user.reg_dt_fmt}</td>
            	</tr>
            </c:forEach>

         </table>
      </div>

      <a class="btn btn-default pull-right">사용자 등록</a>

      <div class="text-center">
         <ul class="pagination">
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
         </ul>
      </div>
   </div>
</div>
   </div>
      </div>
   </div>
</body>
</html>