<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Mast Kalandar</h1>
	<form action=BillServlet>
		<h4>Choose Item</h4>
		<select name="food">
			<option value="100">Paneer Chili</option>
			<option value="200">Veg Manchurian</option>
		</select> <input type="submit" value="Generate Bill" />

	</form>

</body>
</html>