package com.greenfox.todoappwithsql;

import com.greenfox.todoappwithsql.model.Todo;
import com.greenfox.todoappwithsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplicationStarter implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(TodoApplicationStarter.class, args);

    }

    @Autowired
    TodoRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();
        repo.save(new Todo("Learn Object Relational Mapping", false, false));
        repo.save(new Todo("Finish the Green Fox Club project", false, false));
        repo.save(new Todo("Create fair & open source FB clone", true, true));
        repo.save(new Todo("Go to the bathroom", true, false));
        repo.save(new Todo("Have coffee", false, true));
    }
}
