package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ColoursTest {
    /*
    Declaring an instance of the Colours class called colours.
     */
    Colour colour;
    /*
    Declaring a second instance of Colours class called wholeColour which uses our second constructor.
     */
    Colour entireColour;

    public Boolean comparisonResult;

    /*
    A new instance of Colours() is created before and testing occurs.
     */
    @BeforeEach
    void setUp() {
        colour = new Colour(1.0f, 1.0f, 1.0f);
        entireColour = new Colour("FFFFFF");
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
        assertTrue(colour.getRed() <= 1.0 ,"Value for red is too large and not within the range");
        // assert that the red value is greater than 0.0
        assertTrue(colour.getRed() >= 0.0 ,"Value for red is too small and not within the range");
        // assert that the green value is less than 1.0
        assertTrue(colour.getGreen() <= 1.0 ,"Value for green is too large and not within the range");
        // assert that the green value is greater than 0
        assertTrue(colour.getGreen() >= 0.0 ,"Value for green is too small and not within the range");
        // assert that the blue value is less than 1.0.
        assertTrue(colour.getBlue() <= 1.0 ,"Value for blue is too large and not within the range");
        // assert that the blue value is greater than 0.0.
        assertTrue(colour.getBlue() >= 0.0 ,"Value for blue is too small and not within the range");
    }
    @Test
    void createColourTestForSecondConstructor() {
        // assert that the red value is less than 1.0.
        assertTrue(entireColour.getRed() <= 1.0, "Value for red is too large and not within the range");
        // assert that the red value is greater than 0.0
        assertTrue(entireColour.getRed() >= 0.0, "Value for red is too small and not within the range");
        // assert that the green value is less than 1.0
        assertTrue(entireColour.getGreen() <= 1.0, "Value for green is too large and not within the range");
        // assert that the green value is greater than 0
        assertTrue(entireColour.getGreen() >= 0.0, "Value for green is too small and not within the range");
        // assert that the blue value is less than 1.0.
        assertTrue(entireColour.getBlue() <= 1.0, "Value for blue is too large and not within the range");
        // assert that the blue value is greater than 0.0
        assertTrue(entireColour.getBlue() >= 0.0, "Value for blue is too small and not within the range");
    }
    /*
    This test validates whether the input is valid hex using a regex expression. Using pattern matching.
     */
    @Test
    void testIfValidHex() {
        String wholeHexNumber = entireColour.getCombinedColour();
        String hexRegex = "(^[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        // Compile the ReGex
        Pattern pattern = Pattern.compile(hexRegex);
        Matcher possibleMatch = pattern.matcher(wholeHexNumber);
        assertEquals(possibleMatch.matches(), true, "This input is not valid hex.");
    }
    /*
    This test separates the colour red form within the binary number which contains all the colours. Which is represented in hex.
    It checks that red is within the appropriate range for the colour red.
     */
    @Test
    void testRedSegmentOfCombinedNumber() {
        // Test the red part of the Hex number, the first two characters. Bits 16-23.
        // Get the red portion of the string which is the first two characters.
        String wholeHexNumber = entireColour.getCombinedColour();
        String redHex = wholeHexNumber.substring(0,2);
        int intVersionOfRedHex = Long.valueOf(redHex, 16).intValue();
        float redFloatValue = Float.intBitsToFloat(intVersionOfRedHex);
        // assert that the red value is less than 1.0 for the subsection of the whole colour that represents red.
        assertTrue(redFloatValue <= 1.0 ,"Value for red is too large and not within the range. Within the whole number");
        // assert that the red value is greater than 0.0 for the subsection of the whole colour that represents red.
        assertTrue(redFloatValue >= 0.0 ,"Value for red is too small and not within the range. Within the whole number");
    }
    /*
    This test separates the green section of the hex code and converts it into a float representation.
    This is checked to see if it is in range. Using assertEquals().
     */
    @Test
    void testGreenSegmentOfCombinedNumber() {
        // Test the green segment of the Hex number. The third and fourth characters. Bits 8-15.
        // Get the green section of the Hex string which is character 3 and 4.
        String wholeHexNumber = entireColour.getCombinedColour();
        String redHex = wholeHexNumber.substring(3,5);
        int intVersionOfGreenHex = Long.valueOf(redHex, 16).intValue();
        float greenFloatValue = Float.intBitsToFloat(intVersionOfGreenHex);
        // assert that the green value is less than 1.0. For the subsection of the whole colour that represents Green.
        assertTrue(greenFloatValue <= 1.0 ,"Value for green is too large and not within the range. Within the whole number");
        // assert that the green value is greater than 0
        assertTrue(greenFloatValue >= 0.0 ,"Value for green is too small and not within the range. Within the whole number");
    }
    /*
    This test separates the blue section of the hex code and converts it into a float representation.
    This is checked to see if it is in range. Using assertEquals().
     */
    @Test
    void testBlueSegmentOfCombinedNumber() {
        // Test the blue segment of the Hex number. The fifth and sixth characters. Bits 0-7.
        // Get the blue section of the Hex string which is character 5 and 6.
        String wholeHexNumber =entireColour.getCombinedColour();
        String redHex = wholeHexNumber.substring(5);
        int intVersionOfBlueHex = Long.valueOf(redHex, 16).intValue();
        float blueFloatValue = Float.intBitsToFloat(intVersionOfBlueHex);
        // assert that the green value is less than 1.0. For the subsection of the whole colour that represents Green.
        assertTrue(blueFloatValue <= 1.0 ,"Value for blue is too large and not within the range. Within the whole number");
        // assert that the green value is greater than 0
        assertTrue(blueFloatValue >= 0.0 ,"Value for blue is too small and not within the range. Within the whole number");
    }
    /*
    Tests to make sure the hash map is not empty.
     */
    @Test
    void testRGBMapIsNotEmpty() {
        Map<String, Number> rgbMap = colour.RGBColour();
        // Test if it is empty
        assertFalse(rgbMap.isEmpty());
    }
    /*
    Tests is the map has three elements in it. Red, green and blue
     */
    @Test
    void testIfMapSizeThree() {
        Map<String, Number> rgbMap = colour.RGBColour();
        // Test that it is of size three.
        assertEquals(3, rgbMap.size());
    }
    /*
    Test to see if the resulting result from comparing two colour objects is not true.
    They are either true of false.
     */
    @Test
    void testIfEqualOverrideWorks() {
        assertTrue(colour.equals(entireColour));
    }


}
