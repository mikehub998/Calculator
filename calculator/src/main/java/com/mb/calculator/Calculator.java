package com.mb.calculator;

import com.mb.exception.NewException;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        try {
            if (num2 == 0) throw new NewException("You have tried to divide by zero, this is not possible");
            return num1/num2;
        } catch (NewException nx) {
            System.out.println(nx.getMessage());
            return 0;
        }
    }

    
}
