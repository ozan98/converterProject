package view;

import java.awt.Color;

import javax.swing.JTextArea;

public class MeterConversionArea extends JTextArea{
    public MeterConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        this.setBackground(Color.orange);
    }

    public void updateText(double val){
        resetText();
        super.append(Double.toString(val) + " m");
        
    }

    private void resetText(){
        super.replaceRange(null, 0, super.getText().length());
    }
}
