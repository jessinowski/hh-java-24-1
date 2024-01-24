package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class lesson5TestsTest {

    // Write a test for a method that calculates the sum of two integers.
    @Test
    void add_when1Plus2_thenReturn3() {
        //GIVEN
        int a = 1;
        int b = 2;
        int expected = 3;
        //WHEN
        int actual = lesson5Tests.add(a, b);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void add_when2Plus2_thenReturn4() {
        //GIVEN
        int a = 2;
        int b = 2;
        int expected = 4;
        //WHEN
        int actual = lesson5Tests.add(a, b);
        //THEN
        assertEquals(expected, actual);
    }

    // Write a test for a method that checks if a given number is even.
    @Test
    void isEven_when_a_IsOdd_ThenReturnFalse() {
        //GIVEN
        int a = 5;
        //THEN
        assertFalse(lesson5Tests.isEven(a));
    }

    @Test
    void isEven_when_a_IsEven_ThenReturnTrue(){
        //GIVEN
        int a = 8;
        //THEN
        assertTrue(lesson5Tests.isEven(a));
    }

    // Write a test for a method that calculates the product of two integers.
    @Test
    void multiply_when2Times3_thenReturn6() {
        //GIVEN
        int a = 2;
        int b = 3;
        int expected = 6;
        //THEN
        assertEquals(expected, lesson5Tests.multiply(a,b));
    }

    // Write a test for a method that converts a given string to uppercase.
    @Test
    void uppercaseString_when_hallo_thenReturn_HALLO() {
        //GIVEN
        String name = "hallo";
        String expected = "HALLO";
        //THEN
        assertEquals(expected, lesson5Tests.uppercaseString(name));

    }

    @Test
    void uppercaseString_when_JEsSicA_thenReturn_JESSICA() {
        //GIVEN
        String name = "JEsSicA";
        String expected = "JESSICA";
        //THEN
        assertEquals(expected, lesson5Tests.uppercaseString(name));

    }

    // Write a test for a method that checks if a given number is positive.
    @Test
    void isPositive_when_a_isPositive_thenReturnTrue() {
        //GIVEN
        int a = 4;
        //THEN
        assertTrue(lesson5Tests.isPositive(a));
    }
}