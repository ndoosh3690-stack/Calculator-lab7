package com.example;

public class Math2 {    
private Calculator calculator;
    public Math2(Calculator calculator) { // Constructor
        this.calculator = calculator;
    }

    public int makeAddition(int a, int b) {
        return calculator.add(a, b);
    }

    public int makeSubtraction(int a, int b) {
        return calculator.subtract(a, b);
  }  
    public int makeMultiplication(int a, int b) {
        return calculator.multiply(a, b);
    }
}
