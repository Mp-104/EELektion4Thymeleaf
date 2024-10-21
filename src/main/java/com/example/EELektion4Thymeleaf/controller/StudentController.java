package com.example.EELektion4Thymeleaf.controller;

import com.example.EELektion4Thymeleaf.model.Book;
import com.example.EELektion4Thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentPage (Model model) {

        Student student = new Student("name", "email");

        Book book = new Book("Book name");

        model.addAttribute("book", book);
        model.addAttribute("student", student);
        return "student";
    }

}
