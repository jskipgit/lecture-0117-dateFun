<%@ page import="com.ironyard.data.InfoHolder" %>
<%
InfoHolder tmp = ((InfoHolder)request.getSession().getAttribute("infoHolderTmp"));
String result = "";
if(tmp != null){
    result = tmp.getName();
}
%>
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
Hello <%=result%>

</body>
</html>
