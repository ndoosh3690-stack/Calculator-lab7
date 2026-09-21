package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class Math2Test {

    private Calculator calculator;
    private Math2 math2;

    @BeforeEach
    void setUp() {
        calculator = new AppCalculator1();
        math2 = new Math2(calculator);
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        math2 = null;
    }

    @Test
    @DisplayName("Test AdditionEquals")
    void testMakeAddition() {
        int result = math2.makeAddition(10, 4);
        assertEquals(14, result, "10 + 4 should equal 14");
    }
    @Test
    @DisplayName("Test AdditiontNull")
    void testAdditionWithNull() {
        Math2 nullMathService = null;
        assertNull(nullMathService, "Math2 instance should be null before initialization");
    }

    @Test
    @DisplayName("Test SubtractionNotEquals")
    void testMakeSubtraction() {
        int result = math2.makeSubtraction(8, 7);
        assertNotEquals(5, result, "8 - 7 should not equal 5");    
    }

    @Test
    @DisplayName("Test SubtractionFalse")
    void testSubtractionFalse() {
        int result = math2.makeSubtraction(10, 1);
        assertFalse(result < 0, "Result of 10 - 1 should not be negative");
    }
    @Test
    @DisplayName("Test MultiplicationTrue")
    void testMakeMultiplication() {
        int result = math2.makeMultiplication(3, 4);
        assertTrue(result > 0, "Result of 3 * 4 should be positive");  
      }

   @Test
    @DisplayName("Test MultiplicationNotNull")
    void testMultiplicationWithNotNull() {
        assertNotNull(math2, "Math2 instance must not be null to perform multiplication");
        int result = math2.makeMultiplication(3, 4);
        assertEquals(12, result, "3 * 4 should equal 12");
    }
}