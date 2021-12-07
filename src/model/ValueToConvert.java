/**
 * A model class that represent the application to the command design pattern
 * it encapsulates the value to be converted to feet and meter. This class purpose is to encapsulate input value by the user
 * and request to make a convert command to the reciver. Before encapsulating the input value throught the convert method, there
 * is a precondition. The precondition is that the input value must be a number represention. This means that the string input that this
 * class recieves from the controller must not contain any letters. If the input string contains letters, then and IllegalArgumentExeption
 * is thrown. After the conversion is made the convert method returns an array of size 2. [0] contains the converted to feet value and [1] 
 * contains the converted to meters value. This is sent off to the controller after it is called by it. 
 */

package model;

public class ValueToConvert {
    private double val;
    ConvertorDevice device;
    ConvertToFeetCommand toFeet;
    ConvertToMeterCommand toMeter;
    InvokeConvertor invokeToFeet;
    InvokeConvertor invokeToMeter;



    /**
     * A constructor to initilize the command design pattern
     */
    public ValueToConvert(){
        device = new ConvertorDevice();
        toFeet = new ConvertToFeetCommand(device);
        toMeter = new ConvertToMeterCommand(device);
        invokeToFeet = new InvokeConvertor(toFeet);
        invokeToMeter = new InvokeConvertor(toMeter);
    }

    /**
     * A method that converts the text represention of a number to feet and meter.
     * @param strInput the string representation of a number.
     * @throws IllegalArgumentExeption if string value is not a representation of a number.
     * @return Size 2 array with converted value to feet and meter. [0] is the converted feet and [1] is the converted meter.
     */
    public Double[] convert(String strInput){
        try {
            Integer.parseInt(strInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input must be a number");
        }
        this.val = (double) Integer.parseInt(strInput);

        Double[] convertedValues = new Double[2];

        convertedValues[0] = invokeToFeet.convert(val);
        convertedValues[1] = invokeToMeter.convert(val);

        return convertedValues;
    }


    
}
