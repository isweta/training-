<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function validatePatt(text){
		pattval=document.getElementById("txtPattVal").value;
		console.log(pattval);
		console.log(text);
		var patt=new RegExp(pattval, "i");
		if(patt.test(text)){
			document.getElementById("patt").innerHTML="Matched";
		}
		else{
			document.getElementById("patt").innerHTML="Didn't Match";
		}
	}
	/*For checking only alphabet 
	 [0-9] check if present yes-false*/

</script>
</head>
<body>

	<form id="f1" action="">
		<table>
			<tr>
				<td>Pattern</td>
				<td><input type=text id="txtPattVal" value="e" /></td>
				<td></td>
			</tr>
		
			<tr>
				<td>Check in String</td>
				<td><input type=text name="txtPatt" onblur="validatePatt(this.value)" /></td>
				<td><div id="patt"></div></td>
			</tr>
			<tr>
				<td>String</td><td><input type=text name="txtPatt" onblur="validatePatt(this.value)" /></td>
			</tr>
		</table>
		
		
	</form>
	
	<div id="res"></div>
</body>
</html>