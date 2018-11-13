package com.greenfox.todoappwithsql.controller;

import com.greenfox.todoappwithsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    TodoRepository repo;

    @RequestMapping(value = {"/list", "/"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean active) {
        model.addAttribute("active", active);
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }


}
