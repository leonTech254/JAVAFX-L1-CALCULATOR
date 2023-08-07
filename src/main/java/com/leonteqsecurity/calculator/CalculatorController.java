package com.leonteqsecurity.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CalculatorController {

    @FXML
    public  void  buttonClicked(ActionEvent event)
    {
        Button buttonclicked =(Button) event.getSource();
//        converting text to integer
        String stringNumber=buttonclicked.getText();
        int number =Integer.parseInt(stringNumber);

    }

}
