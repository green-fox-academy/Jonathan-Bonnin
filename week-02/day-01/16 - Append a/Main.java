// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end


public class Main {

    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};

        for (String animal : animals) {
            animal = appendA(animal);
            System.out.println(animal);
        }
    }

    public static String appendA(String aLess){
        return aLess + "a";
    }
}
