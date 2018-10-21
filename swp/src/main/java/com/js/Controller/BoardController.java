package com.js.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import com.js.JPA.Jpa;
import com.js.domian.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    Jpa repository;    //jpaRepository

    @PostMapping("/add")
    public User name(@RequestBody User user) {
        User userData = repository.save(user);
        
        return userData;
    } 

    @RequestMapping("/list")
    public List<User> list(Model model) {
        List<User> users = repository.findAll();
        model.addAttribute("list", users);

        return users;
    }
}