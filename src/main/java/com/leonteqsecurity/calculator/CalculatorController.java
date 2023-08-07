package com.leonteqsecurity.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class CalculatorController {
    private String currentNumberString="";
    private int parentNumber=0;
    private  String currentOperation;
    private  int finalResults;

    private List<String> AllData=new ArrayList<>();

    @FXML
    private TextField ResultScreen;

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
        AllData.add(currentNumberString);
        AllData.add(currentOperation);
        currentOperation="";
        currentNumberString="";
    }
    public  void equal()
    {
//        System.out.println(parentNumber+" "+currentNumberString);
        AllData.add(currentNumberString);
        currentNumberString="";
        myFactory(AllData);
    }
    public int myFactory(List<String> allData) {
        int result = Integer.parseInt(allData.get(0)); // Initialize result with the first number
System.out.println(allData);
        for (int i = 1; i < allData.size(); i += 2) {
            String operator = allData.get(i);
            // Make sure we have a valid index for the next number
            if (i + 1 < allData.size()) {
                if (!operator.isEmpty())
                {

                int currentNumber = Integer.parseInt(allData.get(i + 1));

                if (operator.equals("+")) {
                    result += currentNumber;
                } else if (operator.equals("-")) {
                    result -= currentNumber;
                } else if (operator.equals("*")) {
                    result *= currentNumber;
                } else if (operator.equals("/")) {
                    result /= currentNumber;
                }
            }
            }

        }

        System.out.println(result);
        ResultScreen.setText(String.valueOf(result));
        return result;
    }



}
