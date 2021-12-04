package view;

import java.awt.Color;

import javax.swing.JPanel;


public class Panel extends JPanel{
    CentimeterConversionArea cemArea = new CentimeterConversionArea("0", 3, 5);
    FeetConversionArea feetArea = new FeetConversionArea("0 ft", 3, 5);
    MeterConversionArea meterArea = new MeterConversionArea("0 m", 3, 5);

    public Panel(){
        this.add(cemArea);
        this.add(feetArea);
        this.add(meterArea);
    }
    
}
