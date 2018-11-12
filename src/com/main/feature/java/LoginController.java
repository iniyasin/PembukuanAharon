package com.main.feature.java;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public Button btn_masuk;
    public TextField id_username;
    public PasswordField id_password;
    public Text id_error;

    public void signIn() throws IOException {
        if ((id_username.getText() == "admin") && (id_password.getText() == "admin")){
            Stage mainForm = new Stage();
            Parent mainRoot = FXMLLoader.load(getClass().getResource("../fxml/Main.fxml"));

            mainForm.setScene(new Scene(mainRoot));
            mainForm.show();
        } else{
            id_error.setText("Username atau Password Salah!!!");
        }
    }
}
