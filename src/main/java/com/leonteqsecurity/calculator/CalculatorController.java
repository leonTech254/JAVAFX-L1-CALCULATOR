package com.leonteqsecurity.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CalculatorController {
    private String currentNumberString="";
    private int parentNumber=0;
    private  String currentOperation;

    @FXML
    public  void  buttonClicked(ActionEvent event)
    {
        Button buttonclicked =(Button) event.getSource();
//        converting text to integer
        String stringNumber=buttonclicked.getText();
//        int number =Integer.parseInt(stringNumber);
        if(currentNumberString.isEmpty())
        {
            currentNumberString=stringNumber;

        }else
        {
            currentNumberString=currentNumberString+stringNumber;

        }




    }
    public  void clickOperator(ActionEvent event)
    {
        Button buttonclicked =(Button) event.getSource();
//        converting text to integer
        String operator=buttonclicked.getText();
        currentOperation= operator;
//        System.out.println(currentOperation);
        parentNumber =Integer.parseInt(currentNumberString);
    }
    public  void equal()
    {
//        System.out.println(parentNumber+" "+currentNumberString);
        myFactory(parentNumber, Integer.parseInt(currentNumberString),currentOperation);
    }
    public int myFactory(int existingNumber, int currentNumber, String symbol)

    {
        int results = 0;
        if (symbol.equals("+"))
        {
             results=existingNumber+currentNumber;

        }else if (symbol.equals("-"))
        {
             results=existingNumber-currentNumber;
        }
        else if (symbol.equals("*"))
        {
             results=existingNumber*currentNumber;
        }else if (symbol.equals("/"))
        {
             results=existingNumber/currentNumber;
        }
        System.out.println(results);
        return results;


    }

}
