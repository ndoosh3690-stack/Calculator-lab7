package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AppCalculator1 implements Calculator {
    
    private static final Logger logger = LoggerFactory.getLogger(AppCalculator1.class);
    
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Division by zero: a={}, b={}", a, b);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
  }
