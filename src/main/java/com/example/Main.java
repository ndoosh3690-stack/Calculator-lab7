package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new AppCalculator1();

        Math2 math = new Math2(myCalculator);

        int a = 20;
        int b = 5;

        int additionResult = math.makeAddition(a, b);
        int subtractionResult = math.makeSubtraction(a, b);
        int multiplicationResult = math.makeMultiplication(a, b);
        int divisionResult = math.makeDivision(a, b);

        System.out.println("Addition (" + a + " + " + b + ") = " + additionResult);
        System.out.println("Subtraction (" + a + " - " + b + ") = " + subtractionResult);
        System.out.println("Multiplication (" + a + " * " + b + ") = " + multiplicationResult);
        System.out.println("Division (" + a + " / " + b + ") = " + divisionResult);
    }
}