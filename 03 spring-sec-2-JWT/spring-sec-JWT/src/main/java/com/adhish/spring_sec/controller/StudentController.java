package com.adhish.spring_sec.controller;

import com.adhish.spring_sec.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Adhish","Java"),
            new Student(2, "Omkar","Mysql")
    ));

    //Token Generation Method  -->
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
       return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudents()
    {
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student)
    {
        students.add(student);
    }
}
