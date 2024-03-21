<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Book into BookList</title>
</head>
<body>
<h1>신규 도서 등록</h1>
<br/>
<form method="post" action="result.jsp">
    <label>
        <input type="number" name="number">
    </label>
    <label>
        <input type="text" name="name">
    </label>
    <label>
        <input type="text" name="publisher">
    </label>
    <label>
        <input type="number" name="price">
    </label>
    <input type="submit" value="제출">
</form>
</body>
</html>