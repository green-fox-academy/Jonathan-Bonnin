package com.greenfoxacademy.restapi.services;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {

    public static Object doubling(Integer num) {
        if (num == null) {
            return error("doubling");
        }
        Map<String, Integer> output = new HashMap<>();
        output.put("received", num);
        output.put("result", num * 2);
        return output;
    }

    private static Object error(String methodCalled) {
        Map<String, String> error = new HashMap<>();
        if (methodCalled.equals("doubling")) {
            error.put("error", "Please provide an input!");
        }
        if (methodCalled.equals("greeterWithoutName")) {
            error.put("error", "Please provide a name!");
        }
        if (methodCalled.equals("greeterWithoutTitle")) {
            error.put("error", "Please provide a title!");
        }
        if (methodCalled.equals("doUntil")) {
            error.put("error", "Please provide a number!");
        }
        return error;
    }

    public Object greeter(String name, String title) {
        Map<String, String> output = new HashMap<>();
        if (name == null) {
            return error("greeterWithoutName");
        }
        if (title == null) {
            return error("greeterWithoutTitle");
        }
        output.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        return output;
    }

    public Object appendA(String word) {
        Map<String, String> output = new HashMap<>();
        output.put("appended", word + "a");
        return output;
    }

    public Object doUntil(String action, Integer until) {
        if (until == null) {
            return error("doUntil");
        }
        Map<String, Integer> output = new HashMap<>();
        output.put("until", until);
        if (action.equals("sum")) {
            output.put("result", sum(until));
        }
        if (action.equals("factor")) {
            output.put("result", factorial(until));
        }
        return output;
    }

    public int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int factorial(int number) {
        return number > 1 ? number * factorial(number - 1) : 1;
    }
}
