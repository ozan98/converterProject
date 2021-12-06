package model;

public class ConvertorDevice {
    
    public double converToFeet(double val){
        return val / 30.48;
    }

    public double convertToMeter(double val){
        return val / 100;
    }
}
