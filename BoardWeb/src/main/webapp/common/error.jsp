<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>기본 에러화면</title>
</head>
<body>
	<table><tr><td>기본에러 화면입니다.</td></tr></table>
	<br>
	<!-- 에러 메시지 -->
	<table>
 		<tr>
 			<td>Message : ${exception.message}</td>
 		</tr>
 	</table>
</body>
</html>