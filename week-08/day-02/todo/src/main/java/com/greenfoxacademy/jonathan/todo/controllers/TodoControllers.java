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

    @ResponseBody
    @RequestMapping(value = {"/list", "/"})
    public String list(Model model){
        return "This is my first todo";
    }


}
