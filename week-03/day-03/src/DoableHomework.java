//Create 5 trees
//        Store the data of them in variables in your program
//        for every tree the program should store its'
//        type
//        leaf color
//        age
//        sex
//        you can use just variables, or lists and/or maps

import java.util.HashMap;

public class DoableHomework {

    public static void main(String[] args) {
        HashMap<String, Object> tree1 = new HashMap<>();
        tree1.put("type", "bamboo");
        tree1.put("leaf color", "indigo");
        tree1.put("age", 5);
        tree1.put("sex", "large");

        HashMap<String, Object> tree2 = new HashMap<>();
        tree1.put("type", "apple tree");
        tree1.put("leaf color", "yellow");
        tree1.put("age", 4);
        tree1.put("sex", "clean");

        HashMap<String, Object> tree3 = new HashMap<>();
        tree1.put("type", "pine tree");
        tree1.put("leaf color", "white");
        tree1.put("age", 3);
        tree1.put("sex", "stinky");

        HashMap<String, Object> tree4 = new HashMap<>();
        tree1.put("type", "christmas tree");
        tree1.put("leaf color", "purple");
        tree1.put("age", 2);
        tree1.put("sex", "protected");

        HashMap<String, Object> tree5 = new HashMap<>();
        tree1.put("type", "coconut tree");
        tree1.put("leaf color", "green");
        tree1.put("age", 1);
        tree1.put("sex", "small");
    }
}
