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
<h1>Book 정보 입력</h1>
<h1>Book Input Form</h1>
<form action="${pageContext.request.contextPath}/book-output" method="post">
    <label for="bookId">Book ID:</label>
    <input type="number" id="bookId" name="bookId"><br>

    <label for="bookName">Book Name:</label>
    <input type="text" id="bookName" name="bookName"><br>

    <label for="publisher">Publisher:</label>
    <input type="text" id="publisher" name="publisher"><br>

    <label for="price">Price:</label>
    <input type="number" id="price" name="price"><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>


