package org.example;

public class Colour {

    private float red;
    private float green;
    private float blue;


    /*
    A constructor for Colour class which has 3 variables, red, green and, blue.
     */
    public Colour(float colourRed, float colourGreen, float colourBlue){
        this.red = colourRed;
        this.green = colourGreen;
        this.blue = colourBlue;
    }
    /*
    Getter method for the colour red.
     */
    public float getRed(){
        return this.red;
    }
    public float getGreen(){
        return this.green;
    }

    public float getBlue() {
        return this.blue;
    }
}
