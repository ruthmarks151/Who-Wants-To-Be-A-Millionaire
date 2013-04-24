
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopListener implements ActionListener {
 Question q;

  public StopListener(Question question) {
    q=question;

 }
 public void actionPerformed(ActionEvent e) {
   CustomDialog sure=new CustomDialog(null,true,"Are you sure you want to leave with $"+q.level.value());
   if (sure.getAnswer()){
     if(q.correct()){
   System.out.println("You left the game with");
   StateMachine.doneGame=true;
     }}} 
};
