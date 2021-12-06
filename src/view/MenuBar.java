package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JMenuBar{
    public MenuBar(ActionListener listener){
        super();
        JMenu menu = new JMenu("Update Model");
        menu.add(createMenuItem("Save input centimeter", "Convert",KeyEvent.VK_F, listener));
        super.add(menu);
    }

    private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener){
        JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
		return menuItem;
    }
    
}
