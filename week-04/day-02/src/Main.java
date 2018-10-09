public class Main {

    public static void main(String[] args) {

        Student julia = new Student("John", 20, "male", "BME");
        try {
            Student roberts = (Student) julia.clone();
            System.out.println(julia == roberts); // false
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
