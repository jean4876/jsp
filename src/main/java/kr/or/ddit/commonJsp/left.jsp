<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<ul class="nav nav-sidebar">
   <!-- a tag : get method -->
   <li class="active"><a href="<%=request.getContextPath() %>/userList">사용자리스트 <span class="sr-only">(current)</span></a></li>
   <li class="active"><a href="<%=request.getContextPath() %>/UserListOnlyHalf">사용자리스트(onlyHalf) <span class="sr-only">(current)</span></a></li>
   <li class="active"><a href="<%=request.getContextPath() %>/UserPagingList?page=1&pagesize=10">사용자페이징리스트<span class="sr-only">(current)</span></a></li>
   <li class="active"><a href="<%=request.getContextPath() %>/LprodServlet">제품그룹리스트</a></li>
   <li class="active"><a href="<%=request.getContextPath() %>/LprodPagingList?page=1&pagesize=5">제품그룹페이징리스트<span class="sr-only">(current)</span></a></li>
</ul>