<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>

    <title>
        Customer registration
    </title>

</head>


    <body>

        First name: <form:input path="${customer.firstName}" />

        <br><br>

        Last name: <form:input path="${customer.lastName" />

        <br><br>

        <input type="submit" value="Save registration">

        <br><br>

        <form:button name="Save" value="Save" />

        <br><br>

        First name: <form:input path="firstName"/>

        <br><br>

        <input type="submit" value="Save Registration">

</body>

</html>