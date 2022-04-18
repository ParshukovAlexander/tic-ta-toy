package com.example.tictatoy;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MainController {
    Session session = new Session();
    int count =0;


    @FXML
    public void buttonClick(ActionEvent event){
        Button button = (Button) event.getSource();
        if (button.getText().equals("")) {
            if (count % 2 == 0) button.setText("X");
            else button.setText("O");
            session.putFigure(button);
            count++;
            if (session.examSession()) System.out.println("win");
        }
    }
}