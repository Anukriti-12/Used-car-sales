<%@page import="models.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Cars</h1>
<table border="2" align="center" width="70%">
<tr>
<th>Car Id</th>
<th>Car Name</th>
<th>Car Model</th>
<th>Car Maker</th>
<th>Action</th>
</tr>

<%
List<Car> list=(List<Car>)session.getAttribute("ssn");
for(Car car:list)
{
%>
<tr>
<td><%=car.getId() %></td>
<td><%=car.getName()%></td>
<td><%=car.getModel() %></td>
<td><%=car.getMaker() %></td>
<td><a href="deleteuser?id=<%=car.getId()%>">Delete</a>
<a href=""></a>
</td>
</tr>
<%	
}
%>

</table>

</body>
</html>