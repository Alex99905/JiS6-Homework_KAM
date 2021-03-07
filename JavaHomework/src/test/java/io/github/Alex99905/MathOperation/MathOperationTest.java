package io.github.Alex99905.MathOperation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationTest {
    @Test
    public void substractionTest() {
        int a = 10;
        int b = 5;
        int result = MathOperation.substraction(a, b);
        int actual = 5;
        assertEquals(actual, result);
    }

    @Test
    public void additionTest() {
        int a = 10;
        int b = 5;
        int result = MathOperation.addition(a, b);
        int actual = 15;
        assertEquals(actual, result);
    }

    @Test
    public void divisionTest() {
        int a = 10;
        int b = 5;
        int result = MathOperation.division(a, b);
        int actual = 2;
        assertEquals(actual, result);
    }

    @Test
    public void multiplicationTest() {
        int a = 10;
        int b = 5;
        int result = MathOperation.multiplication(a, b);
        int actual = 50;
        assertEquals(actual, result);
    }
}


