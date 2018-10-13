import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            String str = "";
            if (i % 3 == 0) str += "Fizz";
            if (i % 5 == 0) str += "Buzz";

            if (str.length() > 0){
                System.out.println(str);
            } else {
                System.out.println(i);
            }

            System.out.println(str.length() > 0 ? str : i);
        }
    }
}
