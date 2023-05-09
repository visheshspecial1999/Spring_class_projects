<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save customer</title>
</head>
<body>
<c:form action="saveCustomer" mwthod="post" modelAttribute="customerObject">
<c:label path="customerName">Name</c:label>
<c:input path="customerName" placeholder="customer name"/>
<c:label path="customerEmail">Email</c:label>
<c:input path="customerEmail" placeholder="customer email"/>
<input type="submit" value="save">
</c:form>
</body>
</html>