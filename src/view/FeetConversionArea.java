package view;
import java.awt.Color;

import javax.swing.JTextArea;

public class FeetConversionArea extends JTextArea{
    public FeetConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        super.setBackground(Color.green);
    }
    
    public void updateText(double val){
        resetText();
        super.append(Double.toString(val) + " ft");
        
    }

    private void resetText(){
        super.replaceRange(null, 0, super.getText().length());
    }
}
