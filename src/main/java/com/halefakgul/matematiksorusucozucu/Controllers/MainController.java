package com.halefakgul.matematiksorusucozucu.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button runButton;

    @FXML
    private Button exitButton;

    @FXML
    private TextArea input;


    @FXML
    protected void runButtonOnAction(ActionEvent e) {
        System.out.println("Run");
    }

    @FXML
    protected void exitButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) runButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void trashButtonOnAction(ActionEvent e) {
        input.clear();
    }
}