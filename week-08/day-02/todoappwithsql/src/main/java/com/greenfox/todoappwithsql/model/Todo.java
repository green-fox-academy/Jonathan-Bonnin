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
    @Column
    String title;
    @Column
    boolean urgent = false;
    @Column
    boolean done = false;

    public Todo() {

    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }
}
