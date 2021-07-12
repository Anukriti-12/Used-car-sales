<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="p" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Car</title>
</head>
<body>
<h2><center>Add Car</center></h2>
<hr>
<p:form action="add" method="post" modelAttribute="car">
<table>
<tr>
<td>Car Name:</td>
<td><p:input path="name"/>
</td>
<td></td>
</tr>
<tr>
<td>Car Model:</td>
<td><p:input path="model"/>
</td>
<td></td>
</tr>
<tr>
<td>Car Maker:</td>
<td><p:input path="maker"/>
</td>
<td></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Car"></td>
</tr>
</table>
</p:form>
<hr>
<a href="./">Go To Home</a>
</body>
</html>