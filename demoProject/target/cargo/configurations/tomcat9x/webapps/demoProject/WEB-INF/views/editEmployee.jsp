<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Add Employee</title>
    </head>
    <body>

        <div align = "center">
        <form:form method = "POST" modelAttribute = "editEmployee">
            <table>
                <tr>
                    <td><label>ID</label></td>
                    <td>
                        <form:input path="id" disabled="true" />
                    </td>
                </tr>
                <tr>
                    <td><label>Name</label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                     <td><label>Surname</label></td>
                     <td><form:input path="surName"/></td>
                </tr>
                <tr>
                     <td><label>age</label></td>
                     <td><form:input path="age"/></td>
                </tr>
                <tr>
                     <td><label>Bio</label></td>
                     <td><form:textarea path="bio"/></td>
                </tr>
                <tr>
                     <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        </div>
    </body>
</html>