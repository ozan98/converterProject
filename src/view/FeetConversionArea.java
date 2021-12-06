/**
 * A view class that represents a JTextarea of the feet area
 */
package view;
import java.awt.Color;

import javax.swing.JTextArea;


public class FeetConversionArea extends JTextArea{
    /**
     * constructor to initilize area for feet
     * creates JTextarea with string and defines the row and column of the area
     * @param str text to shown on the area
     * @param rows row of the area
     * @param columns column of the area
     */
    public FeetConversionArea(String str, int rows, int columns){
        super(str, rows, columns);
        super.setBackground(Color.green);
    }
    
    /**
     * method to return the contents of the area using the parent class
     * @return string text content of the area
     */
    public void updateText(double val){
        resetText();
        super.append(Double.toString(val) + " ft");
        
    }

    /**
     * this method deletes the current content of the area
     */
    private void resetText(){
        super.replaceRange(null, 0, super.getText().length());
    }
}
