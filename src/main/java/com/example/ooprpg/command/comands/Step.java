package com.example.ooprpg.command.comands;

import com.example.ooprpg.command.Command;
import com.example.ooprpg.manager.Manager;
import com.example.ooprpg.model.Student;

public class Step implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(0);
        student.setMoralEndurance(0);
        student.setCash(-999999);
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Step");
    }
}
