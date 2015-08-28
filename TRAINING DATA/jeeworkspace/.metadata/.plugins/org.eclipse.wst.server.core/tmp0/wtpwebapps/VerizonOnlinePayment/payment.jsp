<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function CallWebService() {

		var xmlHttp;
		xmHttp = new XMLHttpRequest();

		xmlHttp.onreadystatechange = function() {

			if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {

				var res = xmlHttp.responseText;
				if (res == "ok")
					document.getElementById("done").disabled = "enabled";
			}
		}

		xmlHttp.open("GET", "GetStatesServlet?cname=" + cname, true);
		/* alert("Opened RequestObject"); */
		xmlHttp.send();

	}
</script>
</head>
<body>

	<form action="thankyou.jsp">
		Hello ${sessionScope.uname} <br> Mobile Or Datacard No:
		${requestScope.connNo}<br> Amount to Pay:
		${requestScope.amtToPay}<br> <select name="payOpt">
			<option>CitiBank Credit Card</option>
			<option>CitiBank Debit Card</option>
			<option>HDFC Credit Card</option>
			<option>HDFC Credit Card</option>
		</select> <br> <input type="button" onClick="CallWebService()"
			value="ProceedToPayment" /> <br> <input type="submit"
			name="done" value="thankyou.jsp" disabled="disabled" />

	</form>


</body>
</html>