package org.example.ssu.advancedjavaprogramming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/output")
public class OutputServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number;
        String name;
        String publisher;
        int price;

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        number = Integer.parseInt(request.getParameter("number"));
        name = request.getParameter("name");
        publisher = request.getParameter("publisher");
        price = Integer.parseInt(request.getParameter("price"));

        List<BookInfo> bookList = BookInfo.getInitialBookList();
        bookList.add(new BookInfo(number, name, publisher, price));

        out.println("<html>");
        out.println("<head><title>도서 목록</title></head>");
        out.println("<body>");
        out.println("<h1>도서 목록</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>번호</th><th>도서명</th><th>출판사</th><th>가격</th></tr>");
        for (BookInfo book : bookList) {
            out.println("<tr><td>" + book.getNumber() + "</td><td>" + book.getName() + "</td><td>" + book.getPublisher() + "</td><td>" + book.getPrice() + "</td></tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}