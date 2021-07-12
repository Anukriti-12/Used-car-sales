<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="p" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Car</title>
</head>
<body>
<p:form action="updatecar" method="post">
<table>
<tr>
<td>Car Name:</td>
<td><p:input path="name"/></td>
</tr>
<tr>
<td>Car Model:</td>
<td><p:input path="model"/></td>
</tr>
<tr>
<td>Car Maker:</td>
<td><p:input path="maker"/></td>

</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Update"></td>
</tr>
</table>

</p:form>
</body>
</html>