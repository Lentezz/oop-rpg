package com.example.ooprpg.controller;

import com.example.ooprpg.manager.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class InGameController {

    @FXML
    private Button buttonDiploma;

    @FXML
    private Button buttonDota;

    @FXML
    private Button buttonDrink;

    @FXML
    private Button buttonEat;

    @FXML
    private Button buttonEpam;

    @FXML
    private Button buttonMainMenu;

    @FXML
    private Button buttonLose;

    @FXML
    private Button buttonRgr;

    @FXML
    private Button buttonSing;

    @FXML
    private Button buttonSleep;

    @FXML
    private Button buttonSleepBench;

    @FXML
    private Button buttonWork;

    @FXML
    public TextArea pointsArea;


    @FXML
    private Button buttonMakeOrder;

    @FXML
    public void initialize() {
        pointsArea.setText(Manager.getInstance().getStudent().toString());
    }

    @FXML
    void buttonMainMenuClicked(ActionEvent event) {
        Manager.getInstance().processCommand(this.buttonMainMenu.getText());
        Manager.getInstance().closeWindow(this.buttonDiploma.getScene());
    }

    @FXML
    void buyDiploma(ActionEvent event) {
        Manager.getInstance().processCommand(buttonDiploma.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonDiploma.getScene());
    }

    @FXML
    void makeOrder(ActionEvent event) {
        Manager.getInstance().processCommand(buttonMakeOrder.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonMakeOrder.getScene());
    }

    @FXML
    void makeRgr(ActionEvent event) {
        Manager.getInstance().processCommand(buttonRgr.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonRgr.getScene());
    }

    @FXML
    void sleep(ActionEvent event) {
        Manager.getInstance().processCommand(buttonSleep.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonSleep.getScene());
    }

    @FXML
    void drinkBeer(ActionEvent event) {
        Manager.getInstance().processCommand(buttonDrink.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonDrink.getScene());
    }

    @FXML
    void eatShawarma(ActionEvent event) {
        Manager.getInstance().processCommand(buttonEat.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonEat.getScene());
    }

    @FXML
    void epam(ActionEvent event) {
        Manager.getInstance().processCommand(buttonEpam.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonEpam.getScene());
    }

    @FXML
    void fallAsleep(ActionEvent event) {
        Manager.getInstance().processCommand(buttonSleepBench.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonSleepBench.getScene());
    }

    @FXML
    void playDota(ActionEvent event) {
        Manager.getInstance().processCommand(buttonDota.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonDota.getScene());
    }

    @FXML
    void postcards(ActionEvent event) {
        Manager.getInstance().processCommand(buttonWork.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonWork.getScene());
    }

    @FXML
    void sign(ActionEvent event) {
        Manager.getInstance().processCommand(buttonSing.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonSing.getScene());
    }

    @FXML
    void step(ActionEvent event) {
        Manager.getInstance().processCommand(buttonLose.getText());
        Manager.getInstance().updateArea(this.pointsArea);
        Manager.getInstance().checkPoints(buttonLose.getScene());
    }
}
