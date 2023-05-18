<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored ="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
<table border="2px">
  <tr style="background-color:red">
    <th>cutomerId</th>
    <th>customerName</th>
     <th>customerEmail</th>
     <th>User-Action</th>
  </tr>
  <c:forEach var="customer" items="${customerList}">
  <tr>
    <td>${customer.getCustomerId()}</td>
    <td>${customer.getCustomerName()}</td>
     <td>${customer.getCustomerEmail()}</td>
     <td><a href="delete?customerId=${customer.getCustomerId()}"><button style="color:red">Delete</button></a>
     <a href="update?customerId=${customer.getCustomerId()}"><button style="color:green">Update</button></a></td>
  </tr>
  </c:forEach>
</table>
</body>
</html>