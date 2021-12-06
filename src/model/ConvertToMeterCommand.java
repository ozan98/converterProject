package model;

public class ConvertToMeterCommand implements Command{
    ConvertorDevice device;
    

    public ConvertToMeterCommand(ConvertorDevice newDevice){
        device = newDevice;
    }

    @Override
    public double execute(double val) {
        return device.convertToMeter(val);
        
    }
}
