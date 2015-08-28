<%@page import="java.lang.*, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%@include file="header.jsp" %>
	<form method="post" action="SimpleFormServlet">
		<table border=2 align="centre">
			<tr>
				<td>Name</td>
				<td><input type="text" name="nameText" /></td>

			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="addressText" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="passText" /></td>
			</tr>
			<tr>

				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>


</body>
</html>