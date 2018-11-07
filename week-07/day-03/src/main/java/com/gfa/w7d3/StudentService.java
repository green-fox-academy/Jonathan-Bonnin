package com.gfa.w7d3;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public boolean hasName(String student){
        if(student != null){
            for(String name : names){
                if (student.equals(name)){
                    return true;
                }
            }
        }
        return false;
    }
}
