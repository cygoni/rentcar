<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${ pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>렌Y트G카</title>
<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css">
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>
</head>
<body>
	<header>
		<div class="container">
			<span>로그인/회원가입</span>
		</div>
		<div class="logo">
			<a href="main.do" style="text-decoration: none">
				<img alt="" src="img/rent_logo.jpg" height="120">
			</a>
		</div>
		
		<table>
			<tr height="60">
				<td>
					<font><a href="carMain.do" style="text-decoration: none">
						예 약 하 기
					</a></font>
				</td>
				<td>
					<font><a href="carMain.do" style="text-decoration: none">
						예 약 확 인
					</a></font>
				</td>
				<td>
					<font><a href="carMain.do" style="text-decoration: none">
						자유게시판
					</a></font>
				</td>
				<td>
					<font><a href="carMain.do" style="text-decoration: none">
						이  벤  트
					</a></font>
				</td>
				<td>
					<font><a href="carMain.do" style="text-decoration: none">
						고 객 센 터
					</a></font>
				</td>
			</tr>
		</table>
	</header>
	<section>
</body>
</html>