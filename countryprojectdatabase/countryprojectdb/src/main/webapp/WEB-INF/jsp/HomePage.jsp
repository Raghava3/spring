<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HomePage</title>
</head>
<body>
<pre>
<a href="updateCountry">click here update the country list</a> 

<a href="delete">click here to delete the country list</a> 

<a href="countryList">click here to view the country list</a>  

<a href=logout">click here to logout</a>

<!--  value will be going to  controller class and we have to mention the id as the value -->  
<% String id=(String)session.getAttribute("Email");%> 
<a href="<c:url value='profile?id=${id}'/>">click here to profile</a>                                                           
 <font color="red">${msg}</font>
</pre>
</body>
</html>