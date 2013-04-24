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
  StateMachine s=new StateMachine(); 
   QuestionDeck qd = new QuestionDeck ();
 qd.fill ();

 
  f = new QuestionWindowFrame(qd.get ());
  f.addRadioListener();
  f.pack();
  f.setVisible(true);
  System.out.println("Done execution");
 while(!StateMachine.doneGame){ 
         System.out.println("Looped");
        
         System.out.println(""+StateMachine.doneGame);
         
         StateMachine.nextQuestion=false;
         System.out.println("Next Question");
 }
 System.out.println("Done");
 }
 }
