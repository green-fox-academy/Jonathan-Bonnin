public class StringsAgain {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.
        System.out.println(removeAllX("xxGxxxxrxxxxexxxxexxn xxxTxxxoxxy xxAcxxxaxdxxxexxmxxxyxxx ixxsxxx cxoxoxl"));
    }

    static String removeAllX(String str){
        if (str.contains("x") ==  false){
            return str;
        }
        return removeAllX(str.replaceFirst("x", ""));
    }
}
