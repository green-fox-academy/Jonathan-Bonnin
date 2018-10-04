public class Strings {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(xTurnsIntoy("Excellent Green Fox Academy"));
    }

    static String xTurnsIntoy(String str){
        if (str.contains("x") ==  false){
            return str;
        }
        return xTurnsIntoy(str.replace("x", "y"));
    }
}
