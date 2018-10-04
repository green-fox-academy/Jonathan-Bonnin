public class StringsAgainAndAgain {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".
        System.out.println(starsEverywhere("Green Fox Academy"));
    }

    static String starsEverywhere(String str){
        if (str.length() == 1){
            return str;
        }
        return str.charAt(0) + "*" +  starsEverywhere(str.substring(1));
    }


}
