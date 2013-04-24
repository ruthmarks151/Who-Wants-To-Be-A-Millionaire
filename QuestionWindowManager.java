import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



public class QuestionWindowManager {
  public static QuestionWindowFrame f;
  public static void main(String[] args) {
    
    QuestionDeck qd = new QuestionDeck ();
    qd.fill ();
    
    
    f = new QuestionWindowFrame(qd.get ());
    
    f.pack();
    f.setVisible(true);
    System.out.println("Done execution");
  }
}
