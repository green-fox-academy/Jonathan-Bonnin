package com.greenfox.todoappwithsql.model;

import javax.persistence.Column;
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

    public Todo() {

    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public long getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent(){
        return urgent;
    }

    public boolean isDone(){
        return done;
    }
}
