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
%><h2>Customer Table 열람 결과</h2><%
    String query = "SELECT * FROM Customer";
    ResultSet rs = stmt.executeQuery(query);
%>
<table border="1">
    <tr>
        <th>고객번호</th>
        <th>고객명</th>
        <th>주소</th>
        <th>전화번호</th>
    </tr>
    <%while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt(1) %>
        </td>
        <td><%=rs.getString(2) %>
        </td>
        <td><%=rs.getString(3) %>
        </td>
        <td><%=rs.getString(4) %>
        </td>
    </tr>
    <%}%></table>
<%
        conn.close();
    } catch (Exception e) {
        out.println(e);
    }
%>