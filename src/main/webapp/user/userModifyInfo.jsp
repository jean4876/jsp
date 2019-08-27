
<%@page import="kr.or.ddit.user.model.User"%>
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

<title>Jsp-basicLib</title>

<%@ include file="/commonJsp/basicLib.jsp"%>

</head>

<body>

   <!-- header -->
   <%@ include file="/commonJsp/header.jsp"%>

   <div class="container-fluid">
      <div class="row">

         <div class="col-sm-3 col-md-2 sidebar">
            <!-- left -->
            <%@ include file="/commonJsp/left.jsp" %>
         </div>
         <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <form class="form-horizontal" role="form" action="${cp}/userModify" method="post" enctype="multipart/form-data">

               <div class="form-group">
                  <label for="userNm" class="col-sm-2 control-label">사용자 사진</label>
                  <div class="col-sm-10">
                     <img src ="${cp }/userPicture?userId=${user.userId }"/>
						<input id="picture" type="file" name="picture"/> <br>
                  </div>
               </div>

               <div class="form-group">
                  <label for="userNm" class="col-sm-2 control-label">사용자 아이디</label>
                  <div class="col-sm-10">
                  	 <input type="hidden" id="userId" name="userId" value="${user.userId }" />
                     <label class="control-label">${user.userId }</label>
                  </div>
               </div>

               <div class="form-group">
                  <label for="userNm" class="col-sm-2 control-label">사용자 이름</label>
                  <div class="col-sm-10">
                  <input type="text" id="inputName" name = "userId" class="form-control" value=${user.userNM } required>
                  </div>
               </div>

               <div class="form-group">
                  <label for="userNm" class="col-sm-2 control-label">별명</label>
                  <div class="col-sm-10">
                  <input type="text" id="inputalias" name="alias" class="form-control" value=${user.alias } required>
                  </div>
               </div>

               <div class="form-group">
                  <label for="pass" class="col-sm-2 control-label">Password</label>
                  <div class="col-sm-10">
                  <input type="text" id="inputPassword" name="pass" class="form-control" value=${user.pass } required>
                  </div>
               </div>

                              <div class="form-group">
                  <label for="reg_dt" class="col-sm-2 control-label">생일</label>
                  <div class="col-sm-10">
                     <input type="date" class="form-control" id="reg_dt" name="reg_dt"
                        placeholder="생일"  value=${user.reg_dt_fmt }>
                  </div>
               </div>

               <div class="form-group">
                  <label for="addr1" class="col-sm-2 control-label">주소1</label>
                  <div class="col-sm-8">
                     <input type="text" class="form-control" id="addr1" name="addr1"
                        value="${user.addr1 }" readonly>
                  </div>
                  <div class="col-sm-2">
                     <button type="button" id="zipcodeBtn" class="btn btn-default">우편번호</button>
                  </div>
               </div>

               <div class="form-group">
                  <label for="addr2" class="col-sm-2 control-label">주소2</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="addr2" name="addr2"
                        value="${user.addr2 }">
                  </div>
               </div>

               <div class="form-group">
                  <label for="zipcode" class="col-sm-2 control-label">우편번호</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="zipcode" name="zipcode"
                         value= "${user.zipcode }" readonly>
                  </div>
               </div>


               <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                     <button id = "modifyBtn" type="submit" class="btn btn-default">사용자 수정 등록</button>
                  </div>
               </div>
            </form>

         </div>
      </div>
   </div>
</body>
</html>