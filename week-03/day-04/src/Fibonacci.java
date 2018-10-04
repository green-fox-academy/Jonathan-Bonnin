public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(whatIsTheNthFibonacci(10));
    }

    static int whatIsTheNthFibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return whatIsTheNthFibonacci(n-1) + whatIsTheNthFibonacci(n-2);
    }
}
