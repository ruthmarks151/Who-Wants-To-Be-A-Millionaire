import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonListener implements ActionListener {
 Question q;
  public ButtonListener(Question question) {
    q=question;
 }
 public void actionPerformed(ActionEvent e) {
   if(q.correct()){
   System.out.println("Right Answer!");   
   CustomDialog d=new CustomDialog(null,true,"You Are Correct! Do you want to move on?");
}else
   System.out.println("Wrong Answer!");
 } 
};
