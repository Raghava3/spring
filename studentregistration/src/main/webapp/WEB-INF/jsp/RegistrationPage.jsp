<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!--  this is jstl tag for printing message on the page -->
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
<center>

<form action="register" method="post">
firstname: <input type="text" name="firstname" placeholder="enter the firstname">
middlename:<input type="text" name="middlename" placeholder="enter the middlename">
lastname:  <input type="text" name="lastname" placeholder="enter the lastname">
email:     <input type="text" name="email" placeholder="enter the email">
password:  <input type="password" name="password" placeholder="enter the password">
           <input type="submit" value="click to register">
</form>
<!--  this is printing message on the jsp page -->
${msg}


</center>
</pre>
</body>
</html>