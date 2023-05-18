<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<c:form action="updateCustomer" mwthod="post" modelAttribute="customerUpdate">
<c:input path="customerId" placeholder="customerId" hidden="true"></c:input>>
<c:label path="customerName">Name</c:label>
<c:input path="customerName" placeholder="customer name"/>
<c:label path="customerEmail">Email</c:label>
<c:input path="customerEmail" placeholder="customer email"/>
<input type="submit" value="update">
</c:form>
</body>
</html>