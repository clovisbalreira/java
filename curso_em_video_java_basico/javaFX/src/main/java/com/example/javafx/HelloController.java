package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Button btnClick;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Olá Mundo");
    }


}