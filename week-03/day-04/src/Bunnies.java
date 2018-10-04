public class Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        System.out.println(bunnyEarsCounter(10));
    }

    static int bunnyEarsCounter(int n){
        if (n == 1){
            return 2;
        }
        return 2 + bunnyEarsCounter(n-1);
    }
}
