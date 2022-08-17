package com.example.ooprpg.command.comands;

import com.example.ooprpg.command.Command;
import com.example.ooprpg.manager.Manager;
import com.example.ooprpg.model.Student;

public class EatShawarma implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();

        student.setMoralEndurance(student.getMoralEndurance() + manager.getRandomNumber(5, 15));
        student.setCash(student.getCash() - manager.getRandomNumber(5, 15));
        Manager.getInstance().saveData(student);
        System.out.println(Student.getInstance().toString());
        System.out.println("Eat Shawarma");
    }
}
