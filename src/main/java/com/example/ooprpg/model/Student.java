package com.example.ooprpg.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Student implements Serializable{

    private static Student instance;

    public static synchronized Student getInstance(){

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/com/example/ooprpg/model/student.dat")))
        {
            instance = (Student) ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        if(instance == null){
            instance = new Student();
        }
        return instance;
    }

    private String name;
    private double points;
    private double moralEndurance;
    private double cash;


    private Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getMoralEndurance() {
        return moralEndurance;
    }

    public void setMoralEndurance(double moralEndurance) {
        this.moralEndurance = moralEndurance;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Points: " + points +
                "\nMoralEndurance: " + moralEndurance +
                "\nCash: " + cash;
    }
}
