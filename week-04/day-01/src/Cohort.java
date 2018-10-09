import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    String name;
    List<Student> students;
    List<Mentor> mentors;

    Cohort(String name){
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
      }

    void addStudent(Student student){
        students.add(student);
    }

    void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
