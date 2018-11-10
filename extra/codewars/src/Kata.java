public final class Kata {

    private Kata(){

    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }

    public static String disemvowelSolution(String str) {
        return str.replaceAll("(?i)[aeiou]","");
    }

    public static int dontGiveMeFive(int start, int end){
        int result = 0;
        for (int i = start; i <= end; i++){
            String str = Integer.toString(i);
            if (!str.contains("5")){
                result++;
            }
        }
        return result;
    }

    public static int dontGiveMeFiveSolution(int start, int end){
        int result = 0;
        for (int i = start; i <= end; i++){
            if (!(""+i).contains("5")){
                result++;
            }
        }
        return result;
    }


}
