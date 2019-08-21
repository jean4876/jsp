<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



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
<%@ include file="/commonJsp/basicLib.jsp"%>
<script>
   // 문서 로딩이 완료되고 나서
   $(document).ready(function () {
      // 사용자 정보 클릭시 이벤트 핸들러
      $(".lProdTr").on('click', function () {
/*     	 console.log($(this).children().first().text());
         $('#lprod_gu').val($(this).children().first().text());
         $('#frm').submit(); */
    	  var dataValue = $(this).data("lprod_gu");
    	  $('#lprod_gu').val(dataValue);
    	  $('#frm').submit();
      });
   })
</script>

</head>

<body>
<form id="frm" action="${cp }/Prod" method="get">

</form>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
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
	</nav>
	<div class="container-fluid">
		<div class="row">

			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Main <span class="sr-only">(current)</span></a></li>
					<li class="active"><a href="#">사용자</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">Lprod</h2>
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>Lprod_gu</th>
									<th>Lprod_id</th>
									<th>Lprod_NM</th>
								</tr>
				
								<c:forEach items="${lprodList}" var="lprod">
									<tr class = "lProdTr" data-lprod_gu="${lprod.lprod_gu}">
									<input type="hidden" value="${lprod.lprod_gu}">
										<td>${lprod.lprod_gu}</td>
										<td>${lprod.lprod_id}</td>
										<td>${lprod.lprod_nm}</td>

									</tr>
								</c:forEach>

							</table>
						</div>

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