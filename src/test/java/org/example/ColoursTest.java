package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColoursTest {
    /*
    Declaring an instance of the Colours class called colours.
     */
    Colours colours;

    /*
    A new instance of Colours() is created before and testing occurs.
     */
    @BeforeEach
    void setUp() {
        colours = new Colours();
    }

    @AfterEach
    void tearDown() {
    }

    /*
    This test function tests whether the floating point representations of red, green and blue are the correct values.
    Red, Green, and Blue should be within the range of 0.0 and 1.0.
     */
    @Test
    void createColourTest() {
        // assert that the red value is less than 1.0.
        assertTrue(colours.getRed() < 1.0 ,"Value for red is too large and not within the range");
        // assert that the red value is greater than 0.0
        assertTrue(colours.getRed() < 0.0 ,"Value for red is too small and not within the range");
        // assert that the green value is less than 1.0
        assertTrue(colours.getGreen() < 1.0 ,"Value for green is too large and not within the range");
        // assert that the green value is greater than 0
        assertTrue(colours.getGreen() < 0.0 ,"Value for green is too small and not within the range");
        // assert that the blue value is less than 1.0.
        assertTrue(colours.getBlue() < 1.0 ,"Value for blue is too large and not within the range");
        // assert that the blue value is greater than 0.0
        assertTrue(colours.getBlue() < 0.0 ,"Value for blue is too small and not within the range");
    }
}