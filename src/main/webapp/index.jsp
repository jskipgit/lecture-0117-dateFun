<%@ page import="com.ironyard.data.InfoHolder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
<!-- calls servlet doGet aka HTTP GET -->
<a href="/daysUntilBirthday?name=Jason">Check Me Out</a>

<!-- calls servlet doPost aka HTTP POST -->
<form action="/daysUntilBirthday" method="post">
    <input type="text" name="name">
    <input type="submit">
</form>

<h2>Results</h2>
Hello <c:out value="${infoHolderTmp.name}"/>

</body>
</html>
