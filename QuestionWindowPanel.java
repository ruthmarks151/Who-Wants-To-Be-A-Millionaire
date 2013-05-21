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
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.util.Map.Entry;
import java.util.Iterator;

public class QuestionWindowPanel extends JPanel implements ActionListener,WindowStateListener {
  private Question q;
  private QuestionDeck qd;
  private static  HashMap<CorrectlyClicked, JButton> panelToButton;
  private JScrollPane sp;
  private RadioListener r;
  private JButton lock, stop;
  ProgressBar pb;
  LifeLineFrame lf;
  
  public QuestionWindowPanel(QuestionDeck questionDeck,ProgressBar progressbar) { 
    super();
    lf = new LifeLineFrame();
    
    pb=progressbar;
    pb.incrementBar();
    qd=questionDeck;
    q=qd.get();
    
    lf.setQuestion(q);
    
    panelToButton = new HashMap<CorrectlyClicked, JButton>();
    
    super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    
    sp = new JScrollPane(this);
    sp.validate();
    //add(sp);
    validate();
    addRadioListener();
    lock = new JButton("Final Answer");
    stop = new JButton("Stop Playing");
    lock.addActionListener(this);
    stop.addActionListener(this);
    this.add(lock);
    this.add(stop);
    panelToButton.put(r, lock);
    panelToButton.put(r, stop);
  }
  
  
  public void changeQuestion (){
    q=qd.get();
    r.changeQuestion(q);
    lf.setQuestion(q);
    pb.incrementBar();
    revalidate();
    repaint();
    
  }  
  // Enables button for CheckboxListener and RadioListener
  // Makes a new CheckboxListener or RadioListener for JButtons
  public void actionPerformed (ActionEvent e) {
    if (e.getSource()==lock){
      CustomDialog sure=new CustomDialog(null,true,("Is "+(char)('A'+q.selected)+") "+q.answers[q.selected]+", your final answer"));
      if (sure.getAnswer()){
        if(q.correct()){
          System.out.println("Right Answer!");
          changeQuestion();
          
        }else {
          JOptionPane.showMessageDialog(null, "You leave the game with $"+pb.dropBar(),"You Lose", JOptionPane.INFORMATION_MESSAGE);
          
        }
      }
      
    }else if (e.getSource()==stop){
      CustomDialog sure=new CustomDialog(null,true,"Are you sure you want to leave with $"+pb.getMoney());
      if (sure.getAnswer()){
        
        JOptionPane.showMessageDialog(null, "You leave the game with $"+pb.getMoney(),"You Win", JOptionPane.INFORMATION_MESSAGE);
        
      }}
  }
  
  
  public void windowStateChanged(WindowEvent e) {
    
  }
  
  
  public void addRadioListener() {
    r = new RadioListener(q);
    
    super.add(r); 
    
    
    System.out.println(this.getPreferredSize());
    super.setSize(this.getPreferredSize());
    
    super.validate();
    
  }
  
  
}
