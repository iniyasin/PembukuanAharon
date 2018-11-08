package com.main.feature.java;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Main.fxml"));
        primaryStage.setTitle("Pembukuan PT.AHARON");
        primaryStage.setScene(new Scene(root, 1024, 725));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
