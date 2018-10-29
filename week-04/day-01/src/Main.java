import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Aircraft Carrier Exercise

        Carrier foch = new Carrier(20, 9999);
        foch.add(new F35());
        foch.add(new F16());
        foch.add(new F16());
        foch.add(new F16());
        foch.add(new F35());

        System.out.println(foch.getStatus());
        foch.fill(); // add ammo only to the 2 F35, respectively 12 and 8
        System.out.println(foch.getStatus());
        foch.ammoStored = 999;
        foch.fill(); // maxes ammo of all aircrafts
        System.out.println(foch.getStatus());

        Carrier CDG = new Carrier(50, 1500); // creates 2nd carrier to simulate fight
        CDG.add(new F16());
        CDG.add(new F16());
        CDG.add(new F35());
        CDG.add(new F35());
        CDG.fill();

        System.out.println(CDG.fight(foch)); //2nd carrier fights 1st carrier and dies
        System.out.println();
        System.out.println(foch.getStatus()); //1st carrier has now no ammo and lower HP

        //Garden Exercise

        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));


        garden.situation();
        garden.waterThePlants(40);
        garden.waterThePlants(70);

        System.out.println();

        //Green Fox Organisation Exercise

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();
    }
}
