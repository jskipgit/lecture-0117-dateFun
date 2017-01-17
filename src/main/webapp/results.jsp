<%@ page import="com.ironyard.data.InfoHolder" %><%--
  Created by IntelliJ IDEA.
  User: jasonskipper
  Date: 1/17/17
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
Hello <%=((InfoHolder)request.getAttribute("infoHolderTmp")).getName()%>
It's  <%=((InfoHolder)request.getAttribute("infoHolderTmp")).getDays()%> until Jason's B-day!
....  <%=((InfoHolder)request.getAttribute("infoHolderTmp")).getStatus()%>

<a href="/daysUntilBirthday?name=<%=((InfoHolder)request.getAttribute("infoHolderTmp")).getName()%>">Click HERE!</a>
</body>
</html>
