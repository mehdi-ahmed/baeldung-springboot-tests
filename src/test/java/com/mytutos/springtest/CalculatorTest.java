package com.mytutos.springtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @InjectMocks
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAdd() {
        int a = 5;
        int b = 8;

        int sumMocks = 13;
        int sum = Calculator.add(a, b);
        assertEquals(sum, sumMocks);
    }

    @Test
    void minus() {
        //arrange data
        int a = 7;
        int b = 10;
        int substractResult = b - a;

        int result = Calculator.minus(b, a);

        assertEquals(substractResult, result);
    }
}