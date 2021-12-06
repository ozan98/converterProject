/**
 * Reciever class that encapsulates all the commands of a convertor device
 */

package model;

public class ConvertorDevice {
    /**
     * A method that converts a given value to feet
     * @param val the given value in centimeter
     * @return the converted value of centimer to feet
     */
    public double converToFeet(double val){
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
