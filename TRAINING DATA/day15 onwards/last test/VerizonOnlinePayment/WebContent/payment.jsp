<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="authenticateWebService">
		Hello ${sessionScope.uname} <br> Mobile Or Datacard No:
		${requestScope.connNo}<br> Amount to Pay:
		${requestScope.amtToPay}<br> <select name="payOpt">
			<option>CitiBank Credit Card</option>
			<option>CitiBank Debit Card</option>
			<option>HDFC Credit Card</option>
			<option>HDFC Credit Card</option>
		</select> <br> <input type="submit" value="ProceedToPayment" />
		<br>
		
	</form>


</body>
</html>