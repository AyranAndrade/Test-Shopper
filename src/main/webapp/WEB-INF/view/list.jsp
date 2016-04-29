<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>List of Customers</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>RG</th>
                    <th>Address</th>
                    <th>CEP</th>
                    <th>Edit</th>
                    <th>Remove</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.name}</td>
                        <td>${customer.age}</td>
                        <td>${customer.rg}</td>
                        <td>${customer.address}</td>
                        <td>${customer.cep}</td>
                        <td><a href="<c:url value='/customer/edit/'/>${customer.id}">Edit</a></td>
                        <td><a href="<c:url value='/customer/remove/'/>${customer.id}">Remove</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="<c:url value='/customer/new'/>">New Customer</a>
    </body>
</html>