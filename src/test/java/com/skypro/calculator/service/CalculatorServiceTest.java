package com.skypro.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private int a;
    private int b;
    private int a1;
    private int b1;
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        a = 5;
        b = 0;

        a1 = 56;
        b1 = 7;

        calculatorService = new CalculatorService();
    }

    @Test
    public void shouldReturnPlusNumbers() {
        int c = calculatorService.plus(a,b);
        int d = a + b;
        assertEquals(c,d);

        int c1 = calculatorService.plus(a1,b1);
        int d1 = a1 + b1;
        assertEquals(c1,d1);
    }

    @Test
    public void shouldReturnMinusNumbers() {
        int c = calculatorService.minus(a,b);
        int d = a - b;
        assertEquals(c,d);

        int c1 = calculatorService.minus(a1,b1);
        int d1 = a1 - b1;
        assertEquals(c1,d1);
    }

    @Test
    public void shouldReturnMultiplyNumbers() {
        int c = calculatorService.multiply(a,b);
        int d = a * b;
        assertEquals(c,d);

        int c1 = calculatorService.multiply(a1,b1);
        int d1 = a1 * b1;
        assertEquals(c1,d1);
    }

    @Test
    public void shouldReturnDivideNumbers() {
        int c = calculatorService.divide(a,b);
        int d = a / b;
        assertEquals(c,d);

        int c1 = calculatorService.divide(a1,b1);
        int d1 = a1 / b1;
        assertEquals(c1,d1);
    }

    @Test
    public void shouldReturnDivideNumbersError() throws IllegalArgumentException{
        if ((a != 0 && b == 0) || ((a1 != 0 && b1 == 0)) ) {
            throw new IllegalArgumentException("division by zero! @Test");
        } else {
            int c = calculatorService.divide(a, b);
            int d = a / b;
            assertEquals(c, d);

            int c1 = calculatorService.divide(a1, b1);
            int d1 = a1 / b1;
            assertEquals(c1, d1);
        }
    }
}
