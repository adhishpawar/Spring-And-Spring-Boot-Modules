package com.adhish.spring_sec.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "Adhish's Zone" + request.getSession().getId();
    }

}
