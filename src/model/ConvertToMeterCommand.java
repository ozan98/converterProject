/**
 * This is a concrete command class that executes converting input value to meter command. This class implements execute by invoking
 * the corresponding operation on the reciever. This class need a reciever before it can make an execution. That is why in the constructor
 * it takes a reciever as a parameter. This is the reiever is will make to execution to. In the execute method, it calls the command that is 
 * assiocated with the unit to be converted to. In this classes case that is converting to meter.
 */

package model;

public class ConvertToMeterCommand implements Command{
    ConvertorDevice device;
    
    /**
     * Constructor initializes a command to be executed on the given reciver class
     * @param newDevice reciver class 
     */
    public ConvertToMeterCommand(ConvertorDevice newDevice){
        device = newDevice;
    }

    /**
     * Method that executes the convert command on the reciver
     * @param val value to be converted.
     */
    @Override
    public double execute(double val) {
        return device.convertToMeter(val);
        
    }
}
