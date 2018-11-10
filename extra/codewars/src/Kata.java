public final class Kata {

    private Kata() {

    }

    public static String createPhoneNumberSolution(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
                numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(";
        for (int i = 0; i < numbers.length; i++) {
            phoneNumber += numbers[i];
            if (i == 2) {
                phoneNumber += ") ";
            } else if (i == 5) {
                phoneNumber += "-";
            }
        }
        return phoneNumber;
    }

    public static int breakChocolate(int n, int m) {
        return n + m > 1 ? n * m - 1 : 0;
    }

    public static String disemvowelSolution(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int dontGiveMeFive(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            String str = Integer.toString(i);
            if (!str.contains("5")) {
                result++;
            }
        }
        return result;
    }

    public static int dontGiveMeFiveSolution(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (!("" + i).contains("5")) {
                result++;
            }
        }
        return result;
    }


}
