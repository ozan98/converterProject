/**
 * A view class that represents a JTextarea of the centimeter area
 */


package view;

import java.awt.Color;

import javax.swing.JTextArea;

public class CentimeterConversionArea extends JTextArea {

    /**
     * constructor to initilize area for centimer
     * creates JTextarea with string and defines the row and column of the area
     * @param str text to shown on the area
     * @param rows row of the area
     * @param columns column of the area
     */
    public CentimeterConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        super.setBackground(Color.yellow);
    }

    /**
     * method to return the contents of the area using the parent class
     * @return string text content of the area
     */
    public String areaContent(){
        return super.getText();
    }

    
}
