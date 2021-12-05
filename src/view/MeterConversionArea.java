package view;

import java.awt.Color;

import javax.swing.JTextArea;

public class MeterConversionArea extends JTextArea{
    public MeterConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        this.setBackground(Color.orange);
    }
}
