package com.mb.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    
    @Test
    public void testAddTwoPlusTwo() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2, 2));
    }

    @Test
    public void testAddThreePlusSeven() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(3, 7) == 10);
        assertEquals(10, calculator.add(3, 7));
    }



    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.divide(20, 2) == 10);

    }

    @Test
    public void testMultiply() { 
        Calculator calculator = new Calculator();
        assertFalse(calculator.multiply(2, 2) == 5);

    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(6, 3));

    }
}
