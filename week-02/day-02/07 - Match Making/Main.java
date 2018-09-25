import java.util.*;

public class Main{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList... arrLists){
        ArrayList<String> mergedArrays = new ArrayList<>();

        for (ArrayList arrList: arrLists) {
            for (Object str: arrList) {
                mergedArrays.add(str.toString());
            }
        }

        return mergedArrays;
    }
}