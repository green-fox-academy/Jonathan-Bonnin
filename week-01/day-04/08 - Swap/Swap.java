//#TODO
//public class Swap {
//    public static void main(String[] args) {
//        // Swap the values of the variables
//        int a = 123;
//        int b = 526;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

public class Swap {

    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Now I will swap numbers...");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers swapped!");
        System.out.println(a);
        System.out.println(b);
    }
}
