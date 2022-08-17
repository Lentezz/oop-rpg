module com.example.ooprpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ooprpg to javafx.fxml;
    exports com.example.ooprpg;
    exports com.example.ooprpg.controller;
    opens com.example.ooprpg.controller to javafx.fxml;
}