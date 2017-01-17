<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: jasonskipper
  Date: 1/17/17
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Debug Data</title>
</head>
<body>
<%
    Enumeration<String> paramNames = request.getHeaderNames();
    while(paramNames.hasMoreElements()){
        String key = paramNames.nextElement();
        String data = request.getHeader(key);
%>
    KEY: <%=key%>  VALUE: <%=data%>
<p/>
<%
    }
%>
</body>
</html>
