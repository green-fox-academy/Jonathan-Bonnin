public class PrintArguments {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "abc";
        String str3 = "987";
        String str4 = "zyx";

        printArguments(str1, str2, str3, str4);

    }


    public static void printArguments(String... str){

        for (String strings : str) {

            System.out.println(strings);

        }

    }

}
