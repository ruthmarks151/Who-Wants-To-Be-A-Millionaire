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

class LifeLineFrame extends JFrame{
  LifelnGui lg;
    LifeLineFrame(){
    lg=new LifelnGui(); 
    
    this.add(lg);
    this.setSize(200,300);
    this.setVisible(true);
  }
  
  void setQuestion(Question given){
    lg.setQuestion(given);
  }
}