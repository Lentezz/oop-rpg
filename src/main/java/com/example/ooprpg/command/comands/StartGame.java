package com.example.ooprpg.command.comands;

import com.example.ooprpg.Main;
import com.example.ooprpg.controller.InGameController;
import com.example.ooprpg.command.Command;
import com.example.ooprpg.model.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartGame implements Command {
    @Override
    public void execute() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("game-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 450);
            Stage anotherStage = new Stage();
            InGameController sample = fxmlLoader.getController();
            sample.pointsArea.setText(Student.getInstance().toString());
            anotherStage.setTitle("ІПСАШНИК");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
