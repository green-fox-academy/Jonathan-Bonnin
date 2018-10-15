public class numberToWords {

    public static String convertToWord(Object num) {

        String[] smallNumbers = smallNumFunc();
        String[] tens = tensFunc();

        if (!(num instanceof Integer)) {
            return "You didn't input a number";
        }

        int numAsInt = (int) num;

        if (numAsInt < 20){
            return smallNumbers[numAsInt];
        }

        if (numAsInt < 99){
            return tens[numAsInt / 10 - 2] + " " +(numAsInt % 10 == 0 ? "" : smallNumbers[numAsInt % 10]);
        }

        return "";

    }

    private static String[] smallNumFunc() {
        String[] smallNums = {"zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
        };
        return smallNums;
    }

    private static String[] tensFunc() {
        String[] tensNums = {"twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety",
        };
        return tensNums;
    }

}
