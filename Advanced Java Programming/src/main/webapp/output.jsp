<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="org.example.ssu.advancedjavaprogramming.BookInfo" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 목록</title>
</head>
<body>
<h1>도서 목록</h1>
<table border="1">
    <tr>
        <th>번호</th>
        <th>도서명</th>
        <th>출판사</th>
        <th>가격</th>
    </tr>
    <%
        List<BookInfo> bookList = BookInfo.getInitialBookList();
        int number = Integer.parseInt(request.getParameter("number"));
        String name = request.getParameter("name");
        String publisher = request.getParameter("publisher");
        int price = Integer.parseInt(request.getParameter("price"));
        bookList.add(new BookInfo(number, name, publisher, price));

        for (BookInfo book : bookList) {
    %>
    <tr>
        <td><%= book.getNumber() %></td>
        <td><%= book.getName() %></td>
        <td><%= book.getPublisher() %></td>
        <td><%= book.getPrice() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>
