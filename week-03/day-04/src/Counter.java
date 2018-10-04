public class Counter {

    public static void main(String[] args) {

        // Write a recursive function that takes one parameter: n and counts down from n.
        counter(10); // 10 9 8 7 6 5 4 3 2 1 0
    }

    static int counter(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            return counter(n - 1);
        }
        System.out.println(n);
        return n;
    }
}
