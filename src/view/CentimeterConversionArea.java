/**
 * A view class that represents a JTextarea of the centimeter area. CentimeterConversionArea is the observer of the obvserver 
 * design pattern. CentimeterConversionArea observes the concrete subject class which is Panel. CentimeterConversionArea does not
 * update its state because it does not need to. The function of CentimeterConversionArea is to take input from the user and pass it
 * to the concrete subject so it can then be past to the model to be converted. 
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
