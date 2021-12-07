/**
 * This is the controller class. This class is also the event handler for the menubar. It handles the event by implementing
 * ActionListener. With ActionListener it is able to listen for the event that occur in the menubar. It is able to do this by 
 * by picking up events that occur in the actionPerformed. This method then handles the event by calling the model to convert the 
 * value and notifies the observers to change thier states.
 */

package controller;

import model.ValueToConvert;
import view.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener{
    Panel panel;
    ValueToConvert convertor = new ValueToConvert();

    /**
     * constructor that initilizes that panel with the given panel
     * @param panel that panel given to be initialized
     */
    public Listener(Panel panel){
        this.panel = panel;
    }

    /**
     * Method that handles events by the menubar. Once and event occurs it converts the value to the respected unit 
     * and notifies the observers to change thier states.
     * @param event the event that occurs in the menubar.
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Convert")){
            String input = panel.getInput();
            panel.notify(convertor.convert(input));
         
        }
        
    }
    
}
