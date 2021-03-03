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

    </body>

</html>