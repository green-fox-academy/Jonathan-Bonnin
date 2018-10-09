import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1)); // prints 1
        System.out.println();

        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0)); // prints a
        System.out.println();


        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);
        System.out.println(dominoes);
        System.out.println();

        Student julia = new Student("John", 20, "male", "BME");
        try {
            Student roberts = (Student) julia.clone();
            System.out.println(julia == roberts); // false
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
