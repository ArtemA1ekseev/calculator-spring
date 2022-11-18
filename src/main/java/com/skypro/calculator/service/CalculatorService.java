package com.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws IllegalArgumentException {
        if (a != 0 && b == 0) {
            throw new IllegalArgumentException("division by zero!");
        } else {
            return a / b;
        }

    }

}
