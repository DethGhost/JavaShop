<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 14.10.2016
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    ${client}
</p>
<p>Address:</p>
<form:form modelAttribute="addressForm" method="post" action="/addAddress">
    <p>Phone:</p>
    <input type="text" name="phone" placeholder="+380XXNNNNNNN"/>
    <p>Country:</p>
    <select name="countryId">
        <option value="">--------SELECT COUNTRY--------</option>
        <c:forEach items="${countries}" var="country">
            <option value="${country.countryId}">${country}</option>
        </c:forEach>
    </select>
    <p>Enter your address:</p>
    <form:input path="address" placeholder="Enter your address"/>
    <p>Enter your postcode:</p>
    <form:input path="postCode" placeholder="Enter postcode"/>
    <p>Enter your City:</p>
    <form:input path="city" placeholder="Enter your City"/>
    <button>Submit</button>
</form:form>
</body>
</html>
