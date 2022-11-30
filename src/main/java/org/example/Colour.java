package org.example;

import java.util.HashMap;
import java.util.Map;

public class Colour {

    private float red;
    private float green;
    private float blue;
    private String combinedColour;



    /*
    A constructor for Colour class which has 3 variables, red, green and, blue.
     */
    public Colour(float colourRed, float colourGreen, float colourBlue){
        this.red = colourRed;
        this.green = colourGreen;
        this.blue = colourBlue;
    }

    /*
    A constructor for Colour class that only takes in one parameter which is the whole colour.
     */
    public Colour(String wholeColour) {
        this.combinedColour = wholeColour;
        String hexRed = this.combinedColour.substring(0, 2);
        String hexGreen = this.combinedColour.substring(3,5);
        String hexBlue = this.combinedColour.substring(4);
        // Convert hex to integer
        int decimalHexRed = Integer.parseInt(hexRed, 16);
        int decimalHexGreen = Integer.parseInt(hexGreen, 16);
        int decimalHexBlue = Integer.parseInt(hexBlue, 16);
        this.red = decimalHexRed / 255;
        this.green = decimalHexGreen / 255;
        this.blue = decimalHexBlue / 255;
    }
    /*
    Storing the rgb values in a hashmap collection to represent a whole rgb colour.
     */
    public Map<String, Number> RGBColour(){
        Map<String, Number> rgbColour = new HashMap<>();
        // Get rgb value of red and insert it into our collection of rgb values.
        float rgbRed = this.getRed()* 255.0f;
        rgbRed = Math.round(rgbRed);
        int intRgbRed = (int) rgbRed;

        // Get rgb value of green and insert it into our collection of rgb values.
        float rgbGreen = this.getGreen() * 255.0f;
        rgbGreen = Math.round(rgbGreen);
        int intRgbGreen = (int) rgbGreen;

        // Get rgb value for blue and insert it into our collection of rgb values.
        float rgbBlue = this.getBlue() * 255.0f;
        rgbBlue = Math.round(rgbBlue);
        int intRgbBlue = (int) rgbBlue;

        // Insert all values into our collection.
        rgbColour.put("Red", intRgbRed);
        rgbColour.put("Green", intRgbGreen);
        rgbColour.put("Blue", intRgbBlue);
        return  rgbColour;
    }
    /*
    Getter method for the colour red.
     */
    public float getRed() {
        return this.red;
    }
    /*
    Getter method for the colour green.
     */
    public float getGreen() {
        return this.green;
    }
    /*
    Getter method for the colour blue.
     */
    public float getBlue() {
        return this.blue;
    }
    /*
    Getter for the whole colour from our second constructor.
     */
    public String getCombinedColour() {
        return this.combinedColour;
    }

}
