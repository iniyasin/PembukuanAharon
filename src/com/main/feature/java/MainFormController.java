package com.main.feature.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public void tambah_data() throws IOException {
        Stage tambahData = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/FormTambah.fxml"));

        tambahData.setScene(new Scene(root));
        tambahData.show();
    }
}
