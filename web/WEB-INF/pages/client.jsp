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
<form:form modelAttribute="clientF" method="post" action="/addClient">
    <p>Email:</p>
    <form:input type="email" path="email" placeholder="Email"/>
    <p>Name:</p>
    <form:input path="fullName" placeholder="Enter your full name"/>

    <p>Password:</p>
    <form:input path="password" type="password" placeholder="Enter password"/>

    <input type="submit" value="Ok"/>
</form:form>
<p>

</p>
</body>
</html>
