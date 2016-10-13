<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>
<div id="showClients">

</div>
<form method="post" action="/addClient">
    <p>Name:</p>
    <input name="fullName" type="text" placeholder="Enter your full name"/>
    <p>Email:</p>
    <input type="email" name="email" placeholder="Email"/>
    <p>Password:</p>
    <input name="password" type="password"/>
    <p>Phone:</p>
    <input type="text" name="phone" placeholder="+380XXNNNNNNN"/>
    <p>Address:</p>
    <select name="curCountry">
        <option>--------SELECT COUNTRY---------</option>
        <c:forEach items="${countries}" var="country">
            <option value="${country.countryId}">${country}</option>
        </c:forEach>
    </select>
    <button>Submit</button>
</form>
<p>

</p>
</body>
</html>
