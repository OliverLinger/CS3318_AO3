package org.example;

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
    /*
    This method takes two colour instances and compares them to see if they are the same color
     */
    public Boolean compareColours(Colour colour1, Colour colour2) {

        return result;
    }
}
