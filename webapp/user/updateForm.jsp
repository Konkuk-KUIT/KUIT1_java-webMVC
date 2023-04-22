<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jwp.model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>KUIT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/styles.css" rel="stylesheet">
</head>
<body>
<%@ include file="/include/navigation.jspf" %>
<%@ include file="/include/header.jspf" %>

<div class="container" id="main">

    <main class="form-update">
        <%
            User user = (User) request.getAttribute("user");
        %>
        <form name="update" method="post" action="/user/update">
            <div class="form-floating">
                <input type="text" class="form-control" id="userId" name="userId" value="<%= user.getUserId() %>" placeholder="Id", readonly>
                <label for="userId">User Id</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="password" name="password" value="<%= user.getPassword() %>" placeholder="Password">
                <label for="password">Password</label>
            </div>
            <div class="form-floating">
                <input type="text" class="form-control" id="name" name="name" value="<%= user.getName() %>" placeholder="name">
                <label for="name">Name</label>
            </div>
            <div class="form-floating">
                <input type="email" class="form-control" id="email" name="email" value="<%= user.getEmail() %>"placeholder="name@example.com">
                <label for="email">Email address</label>
            </div>
            <div style="height:10px;">
            </div>
            <button class="w-100 btn btn-lg btn-primary" type="submit">Update</button>
        </form>
        <%
        %>
    </main>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
<script src="../js/scripts.js"></script>
</body>
</html>