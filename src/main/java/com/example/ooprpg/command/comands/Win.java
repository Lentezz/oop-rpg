package com.example.ooprpg.command.comands;

import com.example.ooprpg.Main;
import com.example.ooprpg.command.Command;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Win implements Command {
    @Override
    public void execute() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("win-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 450);
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Another Window Triggered by Clicking");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
