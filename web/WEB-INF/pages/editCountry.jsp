<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 29.10.2016
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
${editedCountry}
<body>
<form action="/doEditCountry" method="post">
    <input name="name" type="text" placeholder="${editedCountry}" value="${editedCountry}"/>
    <button>Edit</button>
</form>
</body>
</html>
