<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>
        Student Confirmation
    </title>
</head>


    <body>
    Student name is: ${student.firstName} ${student.lastName }
    <br><br>
    Country of origin is: ${student.country}
    <br><br>
    Preferred programming language: ${student.prefferedLanguage}
    <br><br>
    Preferred operating systems (no looping): ${student.preferredOperatingSystem}

    <br><br>
    Preferred operating systems (with looping):
    <ul>
        <c:forEach var="item" items="${student.preferredOperatingSystem}">
            <li> ${item} </li>
        </c:forEach>
    </ul>

    <br><br>
    </body>

</html>