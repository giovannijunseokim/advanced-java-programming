<%--
  Created by IntelliJ IDEA.
  User: giovannijunseokim
  Date: 4/17/24
  Time: 1:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%
    String url = "jdbc:mysql://localhost/jdbctest";
    String user = "root";
    String password = "001021";
    Connection conn;
    Statement stmt;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement();
        out.println("MySQL Connection Success!");
%><h2>Orders Table 열람 결과</h2><%
    String query = "SELECT * FROM Orders";
    ResultSet rs = stmt.executeQuery(query);
%>
<table border="1">
    <tr>
        <th>주문번호</th>
        <th>고객번호</th>
        <th>도서번호</th>
        <th>할인된 가격</th>
        <th>주문 일자</th>
    </tr>
    <%while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt(1) %>
        </td>
        <td><%=rs.getInt(2) %>
        </td>
        <td><%=rs.getInt(3) %>
        </td>
        <td><%=rs.getInt(4) %>
        </td>
        <td><%=rs.getDate(5) %>
        </td>
    </tr>
    <%}%></table>
<ul>
    <li><a href="${pageContext.request.contextPath}/">대문 페이지로 이동</a></li>
</ul>
<%
        conn.close();
    } catch (Exception e) {
        out.println(e);
    }
%>