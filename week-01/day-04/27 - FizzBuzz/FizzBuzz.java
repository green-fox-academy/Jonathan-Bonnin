public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            String str = "";
            if (i % 3 == 0){
                str += "Fizz";
            }
            if (i % 5 == 0){
                str += "Buzz";
            }
            if (str.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(str);
            }
        }
    }
}
