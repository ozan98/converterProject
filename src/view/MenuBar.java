/**
 * a view class that represent a JMenuBar 
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
