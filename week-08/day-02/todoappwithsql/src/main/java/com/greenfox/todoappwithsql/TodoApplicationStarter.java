package com.greenfox.todoappwithsql;

import com.greenfox.todoappwithsql.model.Todo;
import com.greenfox.todoappwithsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplicationStarter implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {

        SpringApplication.run(TodoApplicationStarter.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("Learn Object Relational Mapping", false, false));
        repo.save(new Todo("Finish the Green Fox Club project", false, false));
        repo.save(new Todo("Create an open source and fair clone of Facebook that everyone will use", true, true));
        repo.save(new Todo("Go to the bathroom", true, false));
        repo.save(new Todo("Have coffee", false, true));
    }
}
