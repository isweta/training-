<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Get Value from bean</h1>
        <jsp:useBean id="emp" class="bean.Employees" scope="session" />

        <%-- <jsp:setProperty name="emp" property="firstName" param="firstName"/>
        <jsp:setProperty name="emp" property="lastName" param="lastName"/>
         <jsp:setProperty name="emp" property="address" param="address"/>--%>
         
         
         <jsp:setProperty name="emp" property="*"/>
         
        
        <table>
            <tr>
                <td>First Name</td>
                <td> : </td>
                <td> ${sessionScope.emp.firstName} </td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td> : </td>
                <td> <jsp:getProperty name="emp" property="lastName"/> </td>
            </tr>
            <tr>
                <td>Address</td>
                <td> : </td>
                <td> <jsp:getProperty name="emp" property="address"/> </td>
            </tr>
        </table>

</body>
</html>