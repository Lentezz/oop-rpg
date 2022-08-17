package com.example.ooprpg.controller;

import com.example.ooprpg.manager.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoseController {

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonNewGame;

    @FXML
    void exitClicked(ActionEvent event) {
        Manager.getInstance().closeWindow(this.buttonExit.getScene());
    }

    @FXML
    void newGameClicked(ActionEvent event) {
        Manager.getInstance().processCommand(buttonNewGame.getText());
        Manager.getInstance().closeWindow(this.buttonExit.getScene());
    }

}

