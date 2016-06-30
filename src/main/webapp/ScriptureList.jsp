<%-- 
    Document   : ScriptureList
    Created on : Jun 16, 2016, 10:11:01 AM
    Author     : sburton
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Steve's Scriptures</title>
    </head>
    <body>
        <h1>Steve's Favorite Scripture Application</h1>
        <ul>

            <c:forEach var="scripture" items="${scriptures}">
                <li><strong>${scripture.book}</strong> ${scripture.chapter}</li>
            </c:forEach>
        </ul>
    </body>
</html>
