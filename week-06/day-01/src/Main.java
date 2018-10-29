import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Exercise 8;
        //Write a Stream Expression to find the frequency of numbers in the following array:
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
        Map<Integer, Integer> intFrequency = new HashMap<>();
        numbers5.stream().
                forEach(n -> {
                    int count = intFrequency.containsKey(Integer.valueOf(n)) ? intFrequency.get(n) : 0;
                    intFrequency.put(Integer.valueOf(n), ++count);
                });
        System.out.println(intFrequency);
        System.out.println();

        //Exercise 6;
        //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
                "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
        cities.stream().
                filter(city -> city.startsWith("A") && city.endsWith("I")).
                forEach(System.out::println);
        System.out.println();

        //Exercise 5;
        //Write a Stream Expression to find the uppercase characters in a string!
        List<String> strings1 = Arrays.asList("micHel has onE Lama and eLeven fOxes!");
        strings1.stream().
                map(str -> str.replaceAll("[^A-Z]", "")).
                forEach(System.out::println);
        System.out.println();

        //Exercise 4;
        //Write a Stream Expression to find which number squared value is more then 20 from the following array:
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers4.stream().
                filter(n -> n * n > 20).
                forEach(System.out::println);
        System.out.println();

        //Exercise 3;
        //Write a Stream Expression to get the squared value of the positive numbers from the following array:
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        numbers3.stream().
                filter(n -> n >= 0).
                map(n -> n * n).
                forEach(System.out::println);
        System.out.println();

        //Exercise 2;
        //Write a Stream Expression to get the average value of the odd numbers from the following array:
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        OptionalDouble average = numbers2.stream().
                filter(n -> n % 2 != 0).
                mapToDouble(n -> n).
                average();
        System.out.println(average.getAsDouble());
        System.out.println();

        // Exercise 1;
        //Write a Stream Expression to get the even numbers from the following array:
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        numbers1.stream().
                filter(n -> n % 2 == 0).
                forEach(System.out::println);

    }
}
