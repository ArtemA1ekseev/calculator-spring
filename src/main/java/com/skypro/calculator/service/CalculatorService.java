package com.skypro.calculator.service;

import com.skypro.calculator.exception.IllegalNumberException;
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

    public int divide(int a, int b) throws IllegalNumberException {
        if (b == 0) {
            throw new IllegalNumberException("division by zero!");
        } else {
            return a / b;
        }
    }
}
