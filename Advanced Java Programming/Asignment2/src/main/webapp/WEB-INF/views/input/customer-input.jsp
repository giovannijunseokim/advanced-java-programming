<%--
  Created by IntelliJ IDEA.
  User: giovannijunseokim
  Date: 4/15/24
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Customer 정보 입력</h1>
<h1>Customer Input Form</h1>
<form action="${pageContext.request.contextPath}/customer-output" method="post">
    <label for="custId">Customer ID:</label>
    <input type="number" id="custId" name="custId"><br>

    <label for="name">Customer Name:</label>
    <input type="text" id="name" name="name"><br>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br>

    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone"><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
