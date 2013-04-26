import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



public class QuestionWindowManager {
  public static QuestionWindowPanel f;
  public static void main(String[] args) {
    
    QuestionDeck qd = new QuestionDeck ();
    qd.fill ();
    
    System.out.println("Done execution");
  }
}
