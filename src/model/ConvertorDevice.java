/**
 * Reciever class that encapsulates all the commands of a convertor device. The purpose of this class is to perform the action
 * associated with the request. This class defines 2 commands that are performed when the execute method is run by the invoker.
 * One method is the command to convert to Feet and the other is to convert ot Meter. They both take and input value that is provided
 * by the user to be converted to the associated unit.
 */

package model;

public class ConvertorDevice {
    /**
     * A method that converts a given value to feet
     * @param val the given value in centimeter
     * @return the converted value of centimer to feet
     */
    public double convertToFeet(double val){
        return val / 30.48;
    }

    /**
     * A method that converts a given value to meter
     * @param val the given value in centimeter
     * @return the converted value of centimer to meter
     */
    public double convertToMeter(double val){
        return val / 100;
    }
}
