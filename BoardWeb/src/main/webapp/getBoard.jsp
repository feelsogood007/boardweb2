<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 상세</title>
</head>
<body>
	<a href="logout.do">Log-out</a>
	<hr>
	<form action="updateBoard.do" method="post">
		<input name="seq" type="hidden" value="${board.seq}" />		
		<table>
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td align="left"><input name="title" type="text" value="${board.title}" /></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">작성자</td>
				<td align="left">${board.writer}</td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">내용</td>
				<td align="left"><textarea name="content" cols="40" rows="10">${board.content}</textarea></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">조회수</td>
				<td align="left">${board.regDate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="글 수정" /></td>
			</tr>																	
		</table>		
	</form>
	<hr>
	<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq}">글삭제</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">글목록</a>

</body>
</html>