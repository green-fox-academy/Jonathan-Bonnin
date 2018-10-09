public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
}
