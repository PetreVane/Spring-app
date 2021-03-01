<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>

    <title> Registration </title>
</head>


<body>
    <form:form action="/demo/student/confirmation" modelAttribute="student">

        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>

        <input type="submit" value="Save Registration">


    </form:form>
</body>


</html>