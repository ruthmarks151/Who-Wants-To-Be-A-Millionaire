import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.Timer;
import javax.swing.JScrollPane;
import javax.swing.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.util.Map.Entry;
import java.util.Iterator;

class Progress extends JPanel {
  private Player p;
  private JProgressBar pB;
  public Progress(Player player){
    p=player;
pB = new JProgressBar(SwingConstants.VERTICAL,0,15);
pB.setValue(0);
pB.setStringPainted(true);

super.setLayout(new BorderLayout(this,BorderLayout));

}

}