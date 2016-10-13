<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 11.10.2016
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addCountry" method="post">
    <input name="countryName" type="text" placeholder="Enter Country"/>
    <button>Add Country</button>

</form>
<br/>${country}
<p>
<form action="showCountries" method="get">
    <button>Show Countries</button>
</form>
<c:forEach var="countryN" items="${countries}">
    <br/>${countryN}
</c:forEach>
</p>
</body>
</html>
