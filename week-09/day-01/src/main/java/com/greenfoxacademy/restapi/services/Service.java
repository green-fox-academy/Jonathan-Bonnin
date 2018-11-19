package com.greenfoxacademy.restapi.services;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {

    public static Object doubling(Integer num) {
        if (num == null) {
            return error();
        }
        Map<String, Integer> output = new HashMap<>();
        output.put("received", num);
        output.put("result", num * 2);
        return output;
    }

    private static Object error() {
        Map<String, String> error = new HashMap<>();
        error.put("error", "Please provide an input!");
        return error;
    }
}
