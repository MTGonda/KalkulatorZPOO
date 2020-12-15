package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;;import java.io.IOException;

public class kalkulator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/scenecalculator.fxml"));
       // String javaVersion = System.getProperty("java.version");
       // String javafxVersion = System.getProperty("javafx.version");
       // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(root,600,420);
        stage.setScene(scene);
        stage.show();

    }

}
