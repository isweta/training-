<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
  <HEAD><TITLE>JSTL Exception Handling</TITLE></HEAD>
  <BODY>


<c:forEach var="i" begin="1" end="5">
   Item <c:out value="${i}"/><p>
</c:forEach>

<c:forEach var="item" items="${li}">
${item}  <br>
</c:forEach>   
 </BODY>
 </HTML> 