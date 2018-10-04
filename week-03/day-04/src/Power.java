public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(powerN(7, 5));
    }

    static int powerN(int x, int n){
        if (x == 1 || n == 1){
            return x;
        }
        return x * powerN(x, n-1);
    }
}
