import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class JeapordyGUI extends JPanel implements ActionListener{
	
	JButton startbutton, instructionbutton; 
	
	
	public  JPanel startmenupanel(){ // start menu
		
		
		
	startbutton = new JButton ("Start"); // creates start button 
	startbutton.addActionListener (this); // adds action listener
	
	instructionbutton = new JButton ("Instructions"); // creates instructions button 
	instructionbutton.addActionListener(this); // adds action listener
	
	//startmenu panel
	JPanel startmenu = new JPanel(); //creates panel to put buttons on to
	
	startmenu.setLayout(null); // allows buttons location to be set anywhere
	
	startmenu.setBackground(Color.blue)	;// makes the panel blue
	startmenu.add(startbutton); // adds start button
	startbutton.setBounds(320,400,120,50); // sets location of the startbutton
	startmenu.add(instructionbutton); // adds instruction button 
	instructionbutton.setBounds(180,400,120,50);  // sets location of the instructionbutton 
	
	
	
	return startmenu; // returns startmenu
	}
		
	
	public void actionPerformed (ActionEvent e){ // creates action listener
		
		//instruction button acction listener
		if (e.getSource() == instructionbutton) 
		{
			JOptionPane.showMessageDialog(null, "Instructions","Instructions", JOptionPane.INFORMATION_MESSAGE); // displays the instructions message (a popup)
		}
		// startmenu button action listener
		else if (e.getSource() == startbutton) 
		{
			
		}
		
		
	}
	
	
	private void createAndShowGUI(){
		//creates and sets up the window
		
		JFrame frame = new JFrame("IMPROVISED - JEAPORDY"); // creates a frame with the name of IMPROVISED - JEAPORDY
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program when closed
		
		
		
		
		
		//content added to window
		frame.add (startmenupanel());
		
		
		
		
		//displays Frame/Window	
		
		frame.setSize(650,500); // sets frame size
		frame.setVisible (true);
		
	}
	
	public static void main (String[] args){
		
		
		new JeapordyGUI().createAndShowGUI();
	}
	
	
}
