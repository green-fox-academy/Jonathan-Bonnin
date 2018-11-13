package com.greenfoxacademy.jonathan.todo;

import com.greenfoxacademy.jonathan.todo.model.Todo;
import com.greenfoxacademy.jonathan.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoStarter implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {

        SpringApplication.run(TodoStarter.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("I have to learn Object Relational Mapping"));
        repo.save(new Todo("I have to finish the Green Fox Club project"));
        repo.save(new Todo("I have to create and open source and fair clone of Facebook that everyone will use"));
    }
}
