
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter;

public class lifelines extends JPanel  ()
{
   JSpinner spinner = new JSpinner();
 
  
  
  // ask the audience
  
  // 50/50

}

public static String friendConfidence ( int randomIndex )
{
  String confidence; // used to determine how correct the friend is. Is also used for ranomization of the correct answer.
  
  if (randomIndex == 0)
  confidence = "I don't know...";
  else if (randomIndex == 1)
  confidence = "I'm kinda sure...";
  else if (randomIndex == 2)
  confidence = "I'm positive ...";
  
  return confidence;
}

public String percent ()// sets the audience percentage to 75
{
  String percent;
  percent = "75";
  return percent;
}

public static void main(String args[]) 
{
  
   boolean [] lifeline = new boolean [3];// array for avalible lifelines
  
  //jSpinner spinner = new JSpinner();
   int randomIndex;
   String confidence ;
   randomIndex = (int) (3 * Math.random ()); //used to determine friend confidence
   confidence = friendConfidence(randomIndex);
   
   JFrame f = new JFrame("Lifelines");
   f.add(new spinner());
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 // spinner.add();
                
                
     
     
}
}