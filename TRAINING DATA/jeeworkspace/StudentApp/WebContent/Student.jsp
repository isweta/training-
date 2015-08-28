<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Spring MVC Form Handling</title>
            </head>
    <body>
        <h2>Student Informations</h2>
        <form method="POST" action="addStudent.htm" >
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><input type="text" name="age" /></td>
                </tr>
                <tr>
                    <td>id</td>
                    <td><input type="text" name="id" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>  
        </form>
    </body>
</html>