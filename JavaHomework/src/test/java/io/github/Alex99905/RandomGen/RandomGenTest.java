package io.github.Alex99905.RandomGen;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomGenTest {
    @Test
    public void main() {
        Random r = new Random();
        int result = r.nextInt(100);
        int min = 0;
        int max = 100;
        assertTrue(result >= min);
        assertTrue(result <= 100);

    }

    @Test
    public void mainFalse() {
        Random r = new Random();
        int result = r.nextInt(100);
        int min = 0;
        int max = 100;
        assertFalse(result <= min);
        assertFalse(result >= 100);
    }

    @Test
    public void maimSumTrue() {
        Random r = new Random();
        int sum = 0;
        int randomInt;
        for (int i = 0; i < 3; i++) {
            randomInt = r.nextInt(100);

            sum = sum + randomInt;
            assertTrue(sum <= 300);
            assertTrue(sum >= 0);
        }
    }
    @Test
    public void mainSumFalse (){
        Random r = new Random();
        int sum = 0;
        int randomInt;
        for (int i = 0; i < 3; i++){
            randomInt = r.nextInt(100);
            sum = sum + randomInt;
            assertFalse(sum >= 300);
            assertFalse(sum <= 0);
        }
    }
}