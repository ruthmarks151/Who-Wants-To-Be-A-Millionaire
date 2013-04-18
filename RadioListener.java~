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
    
    public RadioListener (){
    	//initializes all values
        panel = new JPanel ();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        label = new JLabel();
        group = new ButtonGroup ();
        buttons = new JRadioButton[(int)(Math.random()*9 + 2)];//creates an array of random length, different number of buttons every time
        
        choice = (int)(Math.random()*group.getButtonCount ());//randomly selects a button you want to pick
        label.setText("Please click the "+choice+" button, or hit " + choice + " + Alt");//promts which button to press
        label.setAlignmentX(CENTER_ALIGNMENT);
        add(label);//puts the label on the panel
        for (int i = 0 ; i < buttons.length ; i++){//loop to initialize all the buttons
            buttons[i] = new JRadioButton("Button "+i);//creates the button, and names it
            buttons[i].addActionListener(this);//adds an actionlistener so we can tell if it is hit
            buttons[i].setMnemonic(KeyEvent.VK_1 + i-1);//allows you to press a key instead of click **HAVE TO PRESS ALT FOR IT TO WORK**
            buttons[i].setAlignmentX(CENTER_ALIGNMENT);
            panel.add(buttons[i]);//adds the button to the panel
            group.add(buttons[i]);//adds the button to the group so we can't select more than one
        }
        add(panel);
    }
    
    public void actionPerformed(ActionEvent e){//called when you click a button
        if(isCorrect()){//checks if you selected the right button
            label.setText("You hit the right button");//congratulates you
        }
        else{//if it isn't the right button
            label.setText("That was the wrong button, please press button "+choice);//tells you to fix your mistake
        }
    }
		
	public boolean isCorrect() {
		return buttons[choice].isSelected();
	}
}
