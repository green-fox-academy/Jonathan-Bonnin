package com.greenfoxacademy.jonathan.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;
}
