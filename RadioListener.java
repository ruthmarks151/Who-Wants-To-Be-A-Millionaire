import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.BoxLayout;
import java.awt.Component;

public class RadioListener  extends JPanel implements CorrectlyClicked, ActionListener{

  protected JPanel panel;//the panel that this object will be placed on
  protected JLabel label;//the label to show whether or not you hit the right button
  protected ButtonGroup group;//the group of buttons used
  protected JRadioButton[] buttons;//the array of buttons in the group
  protected int choice;//the index of the button that should be chosen
  protected Question q;
  
  public RadioListener (Question question){
    q=question;
    
    //initializes all values
    panel = new JPanel ();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    label = new JLabel();
    group = new ButtonGroup ();
    buttons = new JRadioButton[(int)(4)];//creates an array of random length, different number of buttons every time
    
    choice = q.rightAnswer();
    label.setText(""+q.question());//promts which button to press
    label.setAlignmentX(CENTER_ALIGNMENT);
    add(label);//puts the label on the panel
    for (int i = 0 ; i < buttons.length ; i++){//loop to initialize all the buttons
      buttons[i] = new JRadioButton((char)('A'+i)+") "+q.answers()[i]);//creates the button, and names it
      buttons[i].addActionListener(this);//adds an actionlistener so we can tell if it is hit
      buttons[i].setMnemonic(KeyEvent.VK_1 + i-1);//allows you to press a key instead of click **HAVE TO PRESS ALT FOR IT TO WORK**
      buttons[i].setAlignmentX(LEFT_ALIGNMENT);
      panel.add(buttons[i]);//adds the button to the panel
      group.add(buttons[i]);//adds the button to the group so we can't select more than one
    }
    add(panel);
  }
  
    
  public void actionPerformed(ActionEvent e){//called when you click a button
    System.out.println("Radio Button clicked!");
    for (int i=0;i<4;i++){
      if(buttons[i].isSelected())
        q.selected=i;
    }
  }
  
  public boolean isCorrect() {
    return buttons[choice].isSelected();
  }
  
  public void changeQuestion(Question newQ){
    q=newQ;
    label.setText(""+q.question());
    for (int i = 0 ; i < buttons.length ; i++){//loop to initialize all the buttons
      buttons[i].setText(((char)('A'+i)+") "+q.answers()[i]));//Sets new label
    }
    revalidate();
    repaint();  
  }
}
