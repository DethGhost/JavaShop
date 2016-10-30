<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="template/header.jsp" %>
<body>
<p>
    <br/>
<h1>Add Country(using Spring)</h1>
<form:form modelAttribute="countryForm" action="addCountry" method="post">
    <form:input path="name"/>
    <br/>
    <button>Submit</button>
</form:form>
</p>
<p>
    <br/>
<h1>Remove Country</h1>
<form action="/removeCountry" method="post">
    <select name="countryId">
        <c:forEach items="${countries}" var="country">
            <option value="${country.countryId}">${country}</option>
        </c:forEach>
    </select>
    <button>Remove selected</button>
</form>
</p>
<p>
    <br/>
<h1>Edit Country</h1>
<form action="/editCountry" method="post">
    <select name="countryId">
        <c:forEach items="${countries}" var="country">
            <option value="${country.countryId}">${country}</option>
        </c:forEach>
    </select>
    <button>EDIT selected</button>
</form>
</p>
<p>
<h1>Countries</h1><br/>
<form action="showCountries" method="get">
    <button>Show Countries</button>
</form>
<c:forEach var="countryN" items="${showCountries}">
    <br/>${countryN}
</c:forEach>
</p>
</body>
</html>
