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
 public QuestionWindowFrame(Question question) { 
  super("");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  panelToButton = new HashMap<CorrectlyClicked, JButton>();
 q=question;

  p = new JPanel();
  p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

  sp = new JScrollPane(p);
  sp.validate();
  add(sp);
  validate();
}
   
 // Enables button for CheckboxListener and RadioListener
 // Makes a new CheckboxListener or RadioListener for JButtons
 public void actionPerformed (ActionEvent e) {
 }
 
 public void windowStateChanged(WindowEvent e) {
 
 }
 

 public void addRadioListener() {
  RadioListener r = new RadioListener(q);
  /* c.addActionListener(this); */
  p.add(r); 
  JButton b = new JButton("Final Answer");
  b.addActionListener(new ButtonListener());
  p.add(b);

  System.out.println(p.getPreferredSize());
  p.setSize(p.getPreferredSize());

  p.validate();
  panelToButton.put(r, b);
 }


}
