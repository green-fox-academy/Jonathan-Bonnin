package com.greenfoxacademy.restapi.services;

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
        if(methodCalled.equals("doubling")){
            error.put("error", "Please provide an input!");
        }
        if(methodCalled.equals("greeterWithoutName")){
            error.put("error", "Please provide a name!");
        }
        if(methodCalled.equals("greeterWithoutTitle")){
            error.put("error", "Please provide a title!");
        }
        return error;
    }

    public Object greeter(String name, String title) {
        Map<String, String> output = new HashMap<>();
        if (name == null){
            return error("greeterWithoutName");
        }
        if (title == null){
            return error("greeterWithoutTitle");
        }
        output.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        return output;
    }
}
