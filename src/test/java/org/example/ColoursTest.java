package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColoursTest {
    Colours colours;

    @BeforeEach
    void setUp() {
        colours = new Colours();
    }

    @AfterEach
    void tearDown() {
    }

    /*
    This test function tests whether the floating point representations of red, green and blue are the correct values.
    red should be 0.0,
    green should be 0.1,
    blue should be 1.0.
    Using assertEquals we can test this.
     */
    @Test
    void createColourTest() {
        assertArrayEquals(0.0, colours.getRed());
        assertArrayEquals(0.1, colours.getGreen());
        assertArrayEquals(1.0, colours.getBlue());
    }
}