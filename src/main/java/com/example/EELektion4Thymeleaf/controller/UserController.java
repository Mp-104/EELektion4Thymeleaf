package com.example.EELektion4Thymeleaf.controller;

import com.example.EELektion4Thymeleaf.model.MyUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userPage (Model model) {

        MyUser user1 = new MyUser("Test", "test");

        ArrayList<MyUser> userList = new ArrayList<>(
                List.of(
                        new MyUser("Test1", "pass"),
                        new MyUser("Test2", "pass"),
                        new MyUser("Test3", "pass2")
                )
        );


        model.addAttribute("users", userList);

        return "user";
    }
}
