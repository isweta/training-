<%@page errorPage="error.jsp" %>

<html>
	<head><title>Showing Error Page.</title></head>

	<body>
		<form method="post">
			<table border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>Enter a number: </td>
					<td><input type="text" name="txtNum" />
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" name="B1" value="Divide by zero" />
				</tr>
			</table>
		</form>
		<%
			if(request.getParameter("txtNum") != null){
				if(!request.getParameter("txtNum").equals("")){
					int div = Integer.parseInt(request.getParameter("txtNum")) / 0;
					out.println("Answer is: " + div);
				}			
				else{
					out.println("<html><font color=red>Please enter a number.</font></html>");
				}
			}
		%>
	</body>
</html>