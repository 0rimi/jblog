<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBlog</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">

</head>
<body>
	<div id="center-content">
		
		
		<!-- 메인 해더 -->
		<c:import url="/WEB-INF/views/includes/main-header.jsp"></c:import>
		
		<div id="loginForm">
			
			<c:choose>
				<c:when test="${param.result eq 'fail' }">
					<form method="post" action="${pageContext.request.contextPath}/user/login">
			      		<table>
					      	<colgroup>
								<col style="width: 100px;">
								<col style="">
							</colgroup>
				      		<tr>
				      			<td><label for="textId">아이디</label></td>
				      			<td><input id="textId" type="text" name="id"></td>
				      		</tr>
				      		<tr>
				      			<td><label for="textPassword">패스워드</label> </td>
				      			<td><input id="textPassword" type="password" name="password"></td>   
				      			   			
				      		</tr> 
				      		<tr>
				      			<td colspan="2" id="tdMsg" colspan="2">
				      				<span>아이디 또는 비번을 확인해 주세요.</span>
				      			</td>
				      		</tr> 
				      	</table>
			      		<div id="btnArea">
							<button class="btn" type="submit" >로그인</button>
						</div>			      
					</form>				
				</c:when>
				<c:otherwise>
					<form method="post" action="${pageContext.request.contextPath}/user/login">
			      		<table>
					      	<colgroup>
								<col style="width: 100px;">
								<col style="">
							</colgroup>
				      		<tr>
				      			<td><label for="textId">아이디</label></td>
				      			<td><input id="textId" type="text" name="id"></td>
				      		</tr>
				      		<tr>
				      			<td><label for="textPassword">패스워드</label> </td>
				      			<td><input id="textPassword" type="password" name="password"></td>   
				      			   			
				      		</tr> 
				      	</table>
			      		<div id="btnArea">
							<button class="btn" type="submit" >로그인</button>
						</div>			      
					</form>	
				</c:otherwise>
			</c:choose>
		</div>
		
		<!-- 메인 푸터  자리-->
		
		
	</div>
	
</body>

</html>