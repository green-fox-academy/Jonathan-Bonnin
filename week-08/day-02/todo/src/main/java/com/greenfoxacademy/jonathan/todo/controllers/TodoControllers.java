package com.greenfoxacademy.jonathan.todo.controllers;


import com.greenfoxacademy.jonathan.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoControllers {

    @Autowired
    TodoRepository repo;

    @RequestMapping(value = {"/list", "/"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }


}
