import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = null;
        System.out.println(        sum(list));
    }

    public static int sum(ArrayList<Integer> list){
        int result = 0;
        for (int num: list) {
            result += num;
        }
        return result;
    }

}
