<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ��</title>
</head>
<body>
	<a href="logout.do">Log-out</a>
	<hr>
	<form action="updateBoard.do" method="post">
		<input name="seq" type="hidden" value="${board.seq}" />		
		<table>
			<tr>
				<td bgcolor="orange" width="70">����</td>
				<td align="left"><input name="title" type="text" value="${board.title}" /></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">�ۼ���</td>
				<td align="left">${board.writer}</td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">����</td>
				<td align="left"><textarea name="content" cols="40" rows="10">${board.content}</textarea></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">��ȸ��</td>
				<td align="left">${board.regDate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="�� ����" /></td>
			</tr>																	
		</table>		
	</form>
	<hr>
	<a href="insertBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq}">�ۻ���</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">�۸��</a>

</body>
</html>