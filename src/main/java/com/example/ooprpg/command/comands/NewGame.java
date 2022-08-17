package com.example.ooprpg.command.comands;

import com.example.ooprpg.Main;
import com.example.ooprpg.command.Command;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewGame implements Command {
    @Override
    public void execute() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("create-new-game.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 450);
            Stage anotherStage = new Stage();
            anotherStage.setTitle("ІПСАШНИК");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
