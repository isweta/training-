<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">
function showCustomer(str)
{
var xmlhttp;    
if (str=="")
  {
  document.getElementById("txtHint").innerHTML="";
  return;
  }
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("txtHint").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","getcustomer.jsp?nm="+str,true);
xmlhttp.send();
}
</script>


</head>
<body>

<!-- <form action=""> 
<select name="customers" onchange="showCustomer(this.value)">
<option value="">Select a customer:</option>
<option value="Peter">peter</option>
<option value="BLAKE">BLAKE</option>
<option value="MILLER">MILLER</option>
<option value="TURNER">TURNER</option>
</select> 

<div id="txtHint">Customer info will be listed here...</div>
</form>
 -->


 First Name: <input type="text" id="txt1" name="customers" onkeyup="showCustomer(this.value)"> <br/><br/>
 <div id="txtHint">Customer info will be listed here...</div>
<br />


</body>
</html>