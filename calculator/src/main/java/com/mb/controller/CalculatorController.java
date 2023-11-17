package com.mb.controller;

import com.mb.calculator.Calculator;
import com.mb.utility.Utility;

public class CalculatorController {
    public static void run() {
        System.out.println("Please enter a number:\n");
        int num1 = Utility.returnInt();
        System.out.println("Enter a second number:\n");
        int num2 = Utility.returnInt();
        System.out.println("Enter an operator:\n");
        
        Calculator calc = new Calculator();
        String operator = Utility.returnOperator();

        System.out.println("The answer is:");

        if (operator.equals("+")) {
            System.out.println(calc.add(num1, num2));
        }

        else if (operator.equals("-")) {
            System.out.println(calc.divide(num1, num2));
        }

        else if (operator.equals("*")) {
            System.out.println(calc.multiply(num1, num2));
        }

        else if (operator.equals("/")) {
            System.out.println(calc.divide(num1, num2));
        }

        else {
            System.out.println("Wrong selection try again;");

        }
    }  
    
}
