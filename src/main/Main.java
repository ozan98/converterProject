package main;
import view.*;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) throws Exception {
    JFrame gameFrame = new JFrame("Convertor Project");
    Panel panel = new Panel();
    MenuBar menuBar = new MenuBar();
    
    gameFrame.add(panel);
    gameFrame.setJMenuBar(menuBar);
    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameFrame.setSize(600, 600);
    gameFrame.setLocationRelativeTo(null);
    gameFrame.setResizable(false);
    gameFrame.setVisible(true);
    }
    
}
