<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2"> 
<tr>
<th>COUNTRY ID</th>
<th>COUNTRY NAME</th>
</tr>
<c:forEach var="temp"  items="${List}">
<tr>
<td>${temp.ctryid}</td>
<td><a href="<c:url value='countryname1?id=${temp.name}'/>">${temp.name}</a></td>
</tr>
</c:forEach>
</table> 
<pre>
                        click on name to get complete details  about country
                        
<a href="index.jsp">click here to go back</a>
</pre>

</body>
</html>