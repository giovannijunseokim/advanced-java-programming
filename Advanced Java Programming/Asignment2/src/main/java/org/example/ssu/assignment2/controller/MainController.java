package org.example.ssu.assignment2.controller;

import lombok.RequiredArgsConstructor;
import org.example.ssu.assignment2.model.Book;
import org.example.ssu.assignment2.model.Customer;
import org.example.ssu.assignment2.repository.BookRepository;
import org.example.ssu.assignment2.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final BookRepository bookRepository;
    private final CustomerRepository customerRepository;

    @GetMapping("/")
    public String root() {
        return "root";
    }

    @GetMapping("/customer-input")
    public String customerInput() {
        return "input/customer-input";
    }

    @PostMapping("/customer-output")
    public String customerOutput(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "output/customer-output";
    }

    @GetMapping("/book-input")
    public String bookInput() {
        return "input/book-input";
    }

    @PostMapping("/book-output")
    public String bookOutput(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "output/book-output";
    }

    @GetMapping("/order-input")
    public String orderInput() {
        return "input/order-input";
    }
}