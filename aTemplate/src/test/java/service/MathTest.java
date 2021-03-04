package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {
    @Test
    public void substractionTest(){
        int a = 4;
        int b = 2;
        int result = Math.substraction(a, b);
        int actual = 2;
        assertEquals(actual, result);
    }
    @Test
    public void additionTest(){
        int a = 4;
        int b = 2;
        int result = Math.addition(a, b);
        int actual = 6;
        assertEquals(actual, result);
    }
    @Test
    public void multiplicationTest(){
        int a = 4;
        int b = 2;
        int result = Math.multiplication(a, b);
        int actual = 8;
        assertEquals(actual, result);
    }
    @Test
    public void divisionTest(){
        int a = 4;
        int b = 2;
        int result = Math.division(a, b);
        int actual = 2;
        assertEquals(actual, result);
    }
}