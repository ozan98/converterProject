package main;
import view.*;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Convertor Project");
    Panel panel = new Panel();
    MenuBar menuBar = new MenuBar();
    
    frame.add(panel);
    frame.setJMenuBar(menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setVisible(true);
    }
    
}
