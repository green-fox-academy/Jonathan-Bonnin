package com.greenfoxacademy.restapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {

    @Id
    @GeneratedValue
    @JsonProperty
    Integer id;
    @JsonIgnore
    Date createdAt;
    String endpoint;
    String data;

    public Log() {

    }

    public Log(Date createdAt, String endpoint, String data) {
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.data = data;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
