import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



public class QuestionWindowManager {
  public static QuestionWindowPanel p;
  public static void main(String[] args) {
    
    QuestionDeck qd = new QuestionDeck ();
    qd.fill ();
    
    
    p = new QuestionWindowPanel(qd);
    
    p.setSize(600, 200);
    p.setVisible(true);
    
    
    JFrame frame = new JFrame("IMPROVISED - JEA" +
    "PORDY"); // creates a frame with the name of IMPROVISED - JEAPORDY
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program when closed
  
  frame.setLayout(new BorderLayout()); // creates a new border layout for the frame
  
  frame.setSize(650,500); // sets frame to this size 
  
  frame.add(p);
    frame.setVisible (true);
    System.out.println("Done execution");
  }
}
