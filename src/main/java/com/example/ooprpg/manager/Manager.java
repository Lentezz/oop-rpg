package com.example.ooprpg.manager;

import com.example.ooprpg.command.Command;
import com.example.ooprpg.command.CommandProducer;
import com.example.ooprpg.model.Student;
import com.example.ooprpg.model.StudentBuilder;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Manager{

    private static Manager instance;

    public static synchronized Manager getInstance(){
        if(instance == null){
            instance = new Manager();
        }
        return instance;
    }

    public void processCommand(String command){
        Command c = CommandProducer.getInstance().getCommand(command);
        c.execute();
    }

    public void closeWindow(Scene scene){
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }

    public void createStudent(String name, Toggle toggleButton){
        ToggleButton toggleButton1 = (ToggleButton) toggleButton;
        StudentBuilder sb = new StudentBuilder(toggleButton1.getText(), name);
        System.out.println(Student.getInstance());
    }

    public void updateArea(TextArea textArea){
        textArea.setText(Student.getInstance().toString());
    }

    public Student getStudent(){
        return Student.getInstance();
    }

    public void saveData(Student student){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/com/example/ooprpg/model/student.dat")))
        {
            oos.writeObject(student);
            System.out.println("Збережено");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void checkPoints(Scene scene){
        Student student = Student.getInstance();
        if(student.getPoints() >= 100 && student.getMoralEndurance() >= 0 && student.getCash() >= 0){
            Manager.getInstance().processCommand("win");
            Manager.getInstance().closeWindow(scene);
        }
        if(student.getPoints() <= 0 || student.getCash() <= 0 || student.getMoralEndurance() <= 0){
            Manager.getInstance().processCommand("lose");
            Manager.getInstance().closeWindow(scene);
        }
    }

    public int getRandomNumber(int init, int end){
        return init + (int) (Math.random() * (end - init + 1));
    }

}
