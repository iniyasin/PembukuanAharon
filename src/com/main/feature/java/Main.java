package com.main.feature.java;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    Button btn_masuk;
    @FXML
    TextField id_username;
    @FXML
    TextField id_password;

    String user = "admin";
    String pass = "admin";
    String checkUser, checkPass;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Login.fxml"));
        primaryStage.setTitle("PT.AHARON CAKRA MAHKOTA");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void signIn(ActionEvent actionEvent) {

        checkUser = id_username.getText().toString();
        checkPass = id_password.getText().toString();

        if (checkUser.equals(user) && checkPass.equals(pass)){
            
        }

    }
}
