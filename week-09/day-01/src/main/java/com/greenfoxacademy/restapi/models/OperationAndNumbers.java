package com.greenfoxacademy.restapi.models;

public class OperationAndNumbers {

    String what;
    Integer[] numbers;

    public OperationAndNumbers() {
    }

    public OperationAndNumbers(String what, Integer[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }
}
