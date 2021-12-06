package view;



import javax.swing.JPanel;


public class Panel extends JPanel{
    FeetConversionArea feetArea = new FeetConversionArea("0 ft", 18, 20);
    MeterConversionArea meterArea = new MeterConversionArea("0 m", 18, 20);
    CentimeterConversionArea cemArea = new CentimeterConversionArea("0", 18, 20);
    

    public Panel(){
        this.add(feetArea);
        this.add(meterArea);
        this.add(cemArea);
        
    }
    
}
