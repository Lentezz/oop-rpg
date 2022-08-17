package com.example.ooprpg.controller;

import com.example.ooprpg.manager.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class CreateGameController {
    @FXML
    private ToggleButton easyToggle;

    @FXML
    private ToggleButton hardToggle;

    @FXML
    private ToggleButton mediumToggle;

    @FXML
    private TextField nameField;

    @FXML
    private ToggleGroup toggleGroup1;

    @FXML
    private Button startGameButton;

    @FXML
    void startGameButtonClicked(ActionEvent event) {
        Manager.getInstance().createStudent(nameField.getText(), toggleGroup1.getSelectedToggle());
        Manager.getInstance().processCommand(startGameButton.getText());
        Manager.getInstance().closeWindow(startGameButton.getScene());
    }

}
