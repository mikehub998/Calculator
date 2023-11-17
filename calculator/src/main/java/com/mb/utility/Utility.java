package com.mb.utility;

import java.util.Scanner;

public class Utility {
    int num1;
    int num2;
    String operation;

    static Scanner scan = new Scanner(System.in);

    public static int returnInt() {
        return Integer.parseInt(scan.next().trim());
    }

    public static String returnOperator() {
        return scan.next();
    }
    
}
