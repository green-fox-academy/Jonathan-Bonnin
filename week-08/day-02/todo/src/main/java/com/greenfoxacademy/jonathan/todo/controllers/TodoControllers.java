package com.greenfoxacademy.jonathan.todo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoControllers {


    @ResponseBody
    @RequestMapping(value = "/todo")
    public String showTodo(){
        return "todo";
    }

    @ResponseBody
    @RequestMapping(value = {"/list", "/"})
    public String list(){
        return "This is my first todo";
    }


}
