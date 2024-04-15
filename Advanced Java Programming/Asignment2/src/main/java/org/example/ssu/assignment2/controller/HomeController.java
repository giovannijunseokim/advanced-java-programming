package org.example.ssu.assignment2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/customer-info")
    public String customerInfo() {
        return "customer-info";
    }

    @GetMapping("/book-info")
    public String bookInfo() {
        return "home";
    }

    @GetMapping("/order")
    public String order() {
        return "home";
    }
}
