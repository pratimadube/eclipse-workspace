<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> --%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Product</title>
</head>
<body>
	<h1>add Product</h1>
	<form:form modelAttribute="product" method="post" action="product">
		<table width="50%">
			<form:hidden path="id" />
			<tr>
				<td>product ID:</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>product Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>product Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>isActive:</td>
				<td><form:input path="active" /></td>
			</tr>

			<tr>
			</tr>
		</table>
		<div style="padding-left: 20%;">
			<form:button type="submit">submit</form:button>

		</div>


	</form:form>

	<div style="width: 50%; margin-left: 40%;">
		<a href="/MySpringMvcWithAnnotation/addproducts">add new</a>
	</div>
	<h1>Product List</h1>
	<table width="100%" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>isActive</th>

			<th colspan="2">Action</th>
		</tr>

		<c:forEach var="prod" items="${listOfProducts}">
			<tr>

				<td><c:out value="${prod.id}" /></td>
				<td><c:out value="${prod.name}" /></td>
				<td><c:out value="${prod.price}" /></td>
				<td><c:out value="${prod.active}" /></td>

				<td><a href="<c:url value='/product/${prod.id}' />">Edit</a></td>
				<td><a href="<c:url value='/productdel/${prod.id}' />">Remove</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>