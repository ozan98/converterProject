/**
 * This is a concrete command class that executes converting input value to feet command
 */

package model;

public class ConvertToFeetCommand implements Command{
    ConvertorDevice device;

    /**
     * Constructor initializes a command to be executed on the given reciver class
     * @param newDevice reciver class 
     */
    public ConvertToFeetCommand(ConvertorDevice newDevice){
        device = newDevice;
    }

    /**
     * Method that executes the convert command on the reciver
     * @param val value to be converted.
     */
    @Override
    public double execute(double val) {
        return device.converToFeet(val);
        
    }
    
}
