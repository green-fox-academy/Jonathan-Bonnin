//#TODO
//public class VariableMutation {
//    public static void main(String[] args) {
//        int a = 3;
//        // make it bigger by 10
//
//
//        System.out.println(a);
//
//
//
//
//        int b = 100;
//        // make it smaller by 7
//
//
//        System.out.println(b);
//
//
//
//
//        int c = 44;
//        // please double c's value
//
//
//        System.out.println(c);
//
//
//
//
//        int d = 125;
//        // please divide by 5 d's value
//
//
//        System.out.println(d);
//
//
//
//
//        int e = 8;
//        // please cube of e's value
//
//
//        System.out.println(e);
//
//
//
//
//        int f1 = 123;
//        int f2 = 345;
//        // tell if f1 is bigger than f2 (print as a boolean)
//
//
//
//
//
//        int g1 = 350;
//        int g2 = 200;
//        // tell if the double of g2 is bigger than g1 (print as a boolean)
//
//
//
//
//        int h = 135798745;
//        // tell if it has 11 as a divisor (print as a boolean)
//
//
//
//
//
//        int i1 = 10;
//        int i2 = 3;
//        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
//
//
//
//
//        int j = 1521;
//        // tell if j is dividable by 3 or 5 (print as a boolean)
//
//
//
//
//        String k = "Apple";
//        //fill the k variable with its cotnent 4 times
//
//
//        System.out.println(k);
//    }
//}

public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        double e2 = e;
        e2 = Math.pow(e2, 3);
        System.out.println(Math.round(e2));

        int f1 = 123;
        int f2 = 345;
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        System.out.println(g2*2 > g1);

        int h = 135798745;
        System.out.println(h % 11 == 0);

        int i1 = 10;
        int i2 = 3;
        double i2_2 = i2;
        System.out.println(i1 > Math.pow(i2_2, 2) && i1 < Math.pow(i2_2, 3));

        int j = 1521;
        System.out.println(j % 5 == 0 || j % 3 == 0);

        String k = "Apple";
        for (int i = 0; i < 4; i++) {
            k += k;
        }
        System.out.println(k);


    }
}
