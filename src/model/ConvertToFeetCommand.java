package model;

public class ConvertToFeetCommand implements Command{
    ConvertorDevice device;

    public ConvertToFeetCommand(ConvertorDevice newDevice){
        device = newDevice;
    }

    @Override
    public double execute(double val) {
        return device.converToFeet(val);
        
    }
    
}
