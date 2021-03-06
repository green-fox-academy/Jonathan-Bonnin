package com.greenfoxacademy.jonathan.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;

    public Todo(){

    }

    public Todo(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
