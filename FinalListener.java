
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalListener implements ActionListener {
 Question q;

  public FinalListener(Question question) {
    q=question;

 }
 public void actionPerformed(ActionEvent e) {
   CustomDialog sure=new CustomDialog(null,true,("Is "+(char)('A'+q.selected)+") "+q.answers[q.selected]+", your final answer"));
   if (sure.getAnswer()){
     if(q.correct()){
   System.out.println("Right Answer!");
   StateMachine.nextQuestion=true;
}else
  System.out.println("Wrong Answer!");}
   
 } 
};
