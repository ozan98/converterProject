package view;

import java.awt.Color;

import javax.swing.JTextArea;

public class CentimeterConversionArea extends JTextArea {
    public CentimeterConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        super.setBackground(Color.yellow);
    }

    public String areaContent(){
        return super.getText();
    }

    
}
