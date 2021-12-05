package view;
import java.awt.Color;

import javax.swing.JTextArea;

public class FeetConversionArea extends JTextArea{
    public FeetConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        super.setBackground(Color.green);
    }
}
