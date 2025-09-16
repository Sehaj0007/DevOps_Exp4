package com.example.adder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(15, App.add(5, 10));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-15, App.add(-5, -10));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(10, App.add(0, 10));
    }

    @Test
    public void testAddMixedNumbers() {
        assertEquals(5, App.add(10, -5));
    }
}
