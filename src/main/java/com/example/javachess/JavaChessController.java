package com.example.javachess;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JavaChessController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}