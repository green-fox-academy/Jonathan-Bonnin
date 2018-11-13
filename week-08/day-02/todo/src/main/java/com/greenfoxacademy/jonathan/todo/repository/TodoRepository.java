package com.greenfoxacademy.jonathan.todo.repository;

import com.greenfoxacademy.jonathan.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
