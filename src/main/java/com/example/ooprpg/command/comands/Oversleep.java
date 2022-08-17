package com.example.ooprpg.command.comands;

import com.example.ooprpg.command.Command;
import com.example.ooprpg.manager.Manager;
import com.example.ooprpg.model.Student;

public class Oversleep implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() - manager.getRandomNumber(7, 12));
        student.setMoralEndurance(student.getMoralEndurance() + manager.getRandomNumber(15, 25));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("OverSleep");
    }
}
