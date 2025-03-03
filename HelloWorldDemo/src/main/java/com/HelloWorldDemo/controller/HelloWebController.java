package com.HelloWorldDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        System.out.println("Entered /web endpoint");  // For debugging purposes
        return "hello";  // Make sure hello.html exists
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("msg", "This is a custom message");
        return "message";
    }
}
