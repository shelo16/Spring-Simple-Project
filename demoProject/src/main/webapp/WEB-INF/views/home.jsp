<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>WTF Do we do now ?</h1>
    <h3>Dont ask me, im just a robot</h3>

    <div align = "center">
        <table border ="1" cellpadding ="5">
            <caption><h2>Employees</h2></caption>

            <tr>
                <th>Name</th>
                <th>SurName</th>
                <th>Age</th>
                <th>Bio</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach var = "product" items = "${employeeManip.employeeList}">

                <c:url var = "editUrl" value = "editEmployee">
                    <c:param name = "id" value = "${product.id}"/>
                </c:url>

                <c:url var = "deleteUrl" value = "deleteEmployee">
                    <c:param name = "id" value = "${product.id}"/>
                </c:url>



                <tr>
                    <td><c:out value = "${product.name}"/></td>
                    <td><c:out value="${product.surName}"/></td>
                    <td><c:out value="${product.age}"/></td>
                    <td><c:out value="${product.bio}"/></td>
                    <td><a href = "${editUrl}">Edit</a></td>
                    <td><a href = "${deleteUrl}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <c:url var = "addEmployee" value = "addEmployee"/>
        <h2><a href = "${addEmployee}">Add Employee</a></h2>
    </div>
</body>
</html>