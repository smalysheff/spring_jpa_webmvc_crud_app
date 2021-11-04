<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
    <title>Customers</title>
</head>
<body>
<div class="div">
    <form method="post">
        <label>
            <input type="text" name="field" />
        </label>
        <input type="button" name="button" value="Search"/>
    </form>
</div>

<div>
    <table class="table">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>