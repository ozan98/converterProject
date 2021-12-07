/**
 * a view class that represent a JMenuBar. The purpose of this Class is to initialize and display the menu bar of the program. It defines 
 * a JMenu and adds it to the JMenuBar. It creates the JMenu with one menu and menu item. The menu item is created with the helper
 * method to initialize the parameter of it. It then sets the action command and adds the action listener and aswell as the adds
 * a keyEvent to check pressed keys.
 */

package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JMenuBar{

    /**
     * contructor that initilizes a menuBar with one menu and one menu item with an actionlistener then adds these components to the menuBar
     * @param listener the action listener to listen for actions by the menuBar
     */
    public MenuBar(ActionListener listener){
        super();
        JMenu menu = new JMenu("Update Model");
        menu.add(createMenuItem("Save input centimeter", "Convert",KeyEvent.VK_F, listener));
        super.add(menu);
    }

    /**
     * helper method to help create a menu item for the contructor
     * @param text text representation of the item
     * @param actionCommand text representation of the command to listen
     * @param accelerator the key to press the item on the menu
     * @param listener the action listener to listen for events
     * @return
     */
    private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener){
        JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
		return menuItem;
    }
    
}
