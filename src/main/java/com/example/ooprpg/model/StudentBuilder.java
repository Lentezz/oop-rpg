package com.example.ooprpg.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentBuilder {
    private Student student;
    private String difficult;
    private String name;

    public StudentBuilder(String difficult, String name) {
        this.difficult = difficult;
        student = Student.getInstance();
        student.setName(name);
        if(difficult.equals("Lite")) {
            student.setPoints(15);
            student.setMoralEndurance(30);
            student.setCash(30);
        }
        if(difficult.equals("Middle")) {
            student.setPoints(5);
            student.setMoralEndurance(30);
            student.setCash(30);
        }
        if(difficult.equals("Hard")) {
            student.setPoints(2);
            student.setMoralEndurance(20);
            student.setCash(20);
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/com/example/ooprpg/model/student.dat")))
        {
            oos.writeObject(student);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
