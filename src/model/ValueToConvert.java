package model;

public class ValueToConvert {
    private double val;

    public ValueToConvert(String strInput){
        try {
            Integer.parseInt(strInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input must be a number");
        }
        this.val = (double) Integer.parseInt(strInput);
    }

    public Double[] convert(){
        Double[] convertedValues = new Double[2];
        ConvertorDevice device = new ConvertorDevice();
        ConvertToFeetCommand toFeet = new ConvertToFeetCommand(device);
        ConvertToMeterCommand toMeter = new ConvertToMeterCommand(device);
        InvokeConvertor invokeToFeet = new InvokeConvertor(toFeet);
        InvokeConvertor invokeToMeter = new InvokeConvertor(toMeter);

        convertedValues[0] = invokeToFeet.convert(val);
        convertedValues[1] = invokeToMeter.convert(val);

        return convertedValues;
    }


    
}
