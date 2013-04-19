import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonListener implements ActionListener {
 Question q;
  public ButtonListener(Question question) {
    q=question;
 }
 public void actionPerformed(ActionEvent e) {
 if(q.correct())
   System.out.println("Right Answer!");
 else
   System.out.println("Wrong Answer!");
 } 
};
