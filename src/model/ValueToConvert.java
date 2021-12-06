package model;

import java.util.ArrayList;

public class ValueToConvert {
    Double[] convertedVals;

    public ValueToConvert(){
        convertedVals = new Double[2];
    }

    public Double[] convert(String input){
        try {
           Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input must be a number");
        }

        int inputVal = Integer.parseInt(input);
        convertedVals[0] = convertToFeet(inputVal);
        convertedVals[1] = convertToMeter(inputVal);


        return this.convertedVals;

    }

    public double convertToFeet(int input){
        return (double )input / 30.48;
    }

    public double convertToMeter(int input){
        return (double) input / 100;
    }

    
}
