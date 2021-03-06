package main;
import view.*;
import javax.swing.JFrame;

import controller.Listener;

public class Main {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Convertor Project");
    Panel panel = new Panel();
    Listener listener = new Listener(panel);
    MenuBar menuBar = new MenuBar(listener);
    frame.add(panel);
    frame.setJMenuBar(menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setVisible(true);
    }
    
}
