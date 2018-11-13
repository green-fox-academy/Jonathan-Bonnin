package com.greenfox.todoappwithsql.repository;

import com.greenfox.todoappwithsql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
