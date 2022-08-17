package com.example.ooprpg.controller;

import com.example.ooprpg.manager.Manager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button continueButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button newGameButton;


    @FXML
    void continueGameButtonClicked() {
        Manager.getInstance().closeWindow(continueButton.getScene());
        Manager.getInstance().processCommand(continueButton.getText());
    }

    @FXML
    void exitButtonClicked() {
        Manager.getInstance().closeWindow(exitButton.getScene());
    }

    @FXML
    void newGameButtonClicked() {
        Manager.getInstance().closeWindow(newGameButton.getScene());
        Manager.getInstance().processCommand(newGameButton.getText());
    }
}