import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.Timer;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.util.Map.Entry;
import java.util.Iterator;

public class QuestionWindowFrame extends JFrame implements ActionListener,WindowStateListener {
  private Question q;
 private static  HashMap<CorrectlyClicked, JButton> panelToButton;
 private JPanel p;
 private JScrollPane sp;
 private RadioListener r;
 
 public QuestionWindowFrame(Question question) { 
    super("$"+question.level.value()+" "+question.category());
      q=question;

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  panelToButton = new HashMap<CorrectlyClicked, JButton>();


  p = new JPanel();
  p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

  sp = new JScrollPane(p);
  sp.validate();
  add(sp);
  validate();
}
 public void changeQuestion (Question question){
sp.removeAll();//or remove(JComponent)
   q=question;
 super.setTitle("$"+question.level.value()+" "+question.category());
r.changeQuestion(q);
p.revalidate();
p.repaint();

 }  
 // Enables button for CheckboxListener and RadioListener
 // Makes a new CheckboxListener or RadioListener for JButtons
 public void actionPerformed (ActionEvent e) {
      System.out.println("Action event!");
}

 
 public void windowStateChanged(WindowEvent e) {
 
 }
 

 public void addRadioListener() {
  r = new RadioListener(q);
  /* c.addActionListener(this); */
  p.add(r); 
  JButton lock = new JButton("Final Answer");
  JButton stop = new JButton("Stop Playing");
  lock.addActionListener(new FinalListener(q));
  stop.addActionListener(new StopListener(q));
  p.add(lock);
  p.add(stop);
  
  System.out.println(p.getPreferredSize());
  p.setSize(p.getPreferredSize());

  p.validate();
  panelToButton.put(r, lock);
    panelToButton.put(r, stop);
 }


}
