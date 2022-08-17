package com.example.ooprpg.command.comands;

import com.example.ooprpg.command.Command;
import com.example.ooprpg.manager.Manager;
import com.example.ooprpg.model.Student;

public class PlayDota implements Command {
    @Override
    public void execute() {
        Manager manager = Manager.getInstance();
        Student student = Student.getInstance();
        student.setPoints(student.getPoints() - manager.getRandomNumber(2, 7));
        student.setMoralEndurance(student.getMoralEndurance() + manager.getRandomNumber(15, 25));
        student.setCash(student.getCash() - manager.getRandomNumber(10, 15));
        manager.saveData(student);
        System.out.println(Student.getInstance().toString());
    }
}
