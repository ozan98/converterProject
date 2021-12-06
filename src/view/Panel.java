package view;

import javax.swing.JPanel;


public class Panel extends JPanel{
    FeetConversionArea feetArea;
    MeterConversionArea meterArea;
    CentimeterConversionArea cemArea;
    

    public Panel(){
        feetArea = new FeetConversionArea("0 ft", 18, 20);
        meterArea = new MeterConversionArea("0 m", 18, 20);
        cemArea = new CentimeterConversionArea("0", 18, 20);
        this.add(feetArea);
        this.add(meterArea);
        this.add(cemArea);
    }

    public void notify(Double[] convertedVals){
         feetArea.updateText(convertedVals[0]);
         meterArea.updateText(convertedVals[1]);
    }

    public String getInput(){
        return  cemArea.areaContent();
    }
    
}
