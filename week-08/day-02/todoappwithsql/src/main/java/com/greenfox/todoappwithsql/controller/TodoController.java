package com.greenfox.todoappwithsql.controller;

import com.greenfox.todoappwithsql.model.Todo;
import com.greenfox.todoappwithsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    TodoRepository repo;

    @GetMapping(value = {"/list", "/"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean active) {
        List<Todo> todos = new ArrayList<>();
        repo.findAll().forEach(todos::add);

        if(active){
            todos = todos.stream().
                    filter(todo -> !todo.isDone()).
                    collect(Collectors.toList());
        }

        model.addAttribute("todos", todos);

        return "todolist";
    }

    @GetMapping("/add")
    public String showAddTodo(Model model){
        model.addAttribute("todo", new Todo());
        return "add";
    }

    @PostMapping("/add")
    public String submitTodo(@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/todo/list";
    }
}
