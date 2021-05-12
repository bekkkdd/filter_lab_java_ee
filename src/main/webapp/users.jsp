<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.filter_lab.models.User" %><%--
  Created by IntelliJ IDEA.
  User: MIBook Pro
  Date: 12.05.2021
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
    if(users != null) {
        for (User u : users) {

%>
    <p>
        ID : <%=u.getId()%>
        EMAIL : <%=u.getEmail()%>
        PASSWORD : <%=u.getPassword()%>
        FULL NAME : <%=u.getFullName()%>
    </p>
<%
        }
    }
%>
</body>
</html>
