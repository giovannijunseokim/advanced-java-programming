package org.example.ssu.assignment2.controller;

import lombok.RequiredArgsConstructor;
import org.example.ssu.assignment2.model.Book;
import org.example.ssu.assignment2.model.Customer;
import org.example.ssu.assignment2.model.Orders;
import org.example.ssu.assignment2.repository.BookRepository;
import org.example.ssu.assignment2.repository.CustomerRepository;
import org.example.ssu.assignment2.repository.OrdersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final BookRepository bookRepository;
    private final CustomerRepository customerRepository;
    private final OrdersRepository ordersRepository;

    // 대문 페이지를 보여주는 역할
    @GetMapping("/")
    public String root() {
        return "root";
    }

    // 주문자 정보 입력 페이지를 보여주는 역할
    @GetMapping("/customer-input")
    public String customerInput() {
        return "input/customer-input";
    }

    // 주문자 정보 페이지를 보여주는 역할
    @PostMapping("/customer-output")
    public String customerOutput(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "output/customer-output";
    }

    // 도서 정보 입력 페이지를 보여주는 역할
    @GetMapping("/book-input")
    public String bookInput() {
        return "input/book-input";
    }

    // 도서 정보 페이지를 보여주는 역할
    @PostMapping("/book-output")
    public String bookOutput(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "output/book-output";
    }

    // 주문 정보 입력 페이지를 보여주는 역할
    @GetMapping("/order-input")
    public String orderInput() {
        return "input/order-input";
    }

    // 주문 정보 페이지를 보여주는 역할
    @PostMapping("/order-output")
    public String orderOutput(@ModelAttribute Orders orders) {
        ordersRepository.save(orders);
        return "output/order-output";
    }
}
