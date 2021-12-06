package controller;

import model.ValueToConvert;
import view.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listerner implements ActionListener{
    Panel panel;
    ValueToConvert convertor = new ValueToConvert();


    public Listerner(Panel panel){
        this.panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Convert")){
            String input = panel.getInput();
            panel.notify(convertor.convert(input));
         
        }
        
    }
    
}
