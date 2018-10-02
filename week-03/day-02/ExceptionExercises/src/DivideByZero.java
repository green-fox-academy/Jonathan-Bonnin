// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {

    public static void main(String[] args) {

        try {
            divideTenBy(0);
        } catch (Exception e) {
            System.out.println("fail");
        }

    }

    public static int divideTenBy(int num) throws Exception {
        return 10 / num;
    }
}
