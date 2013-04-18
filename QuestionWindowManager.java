/*
Quincy Lam, Ryan Marks, Stephen Wen
*/
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
 Question q1 = qd.get ();
 q1.display ();

  f = new QuestionWindowFrame(q1);
  f.addRadioListener();
  f.pack();
  f.setVisible(true);
 }
  
 
}
