package com.main.feature.java;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class LoginController {
    public Button btn_masuk;
    public TextField id_username;
    public PasswordField id_password;
    public Text id_error;

    public void signIn() throws IOException {
        Stage mainForm = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/MainForm.fxml"));

        mainForm.setScene(new Scene(root));
        mainForm.show();
    }
}
