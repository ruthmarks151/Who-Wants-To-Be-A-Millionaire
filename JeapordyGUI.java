import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class JeapordyGUI extends JPanel implements ActionListener{
 
  JButton startbutton, instructionbutton; 
 
 
  public  JPanel startmenupanel(){ // start menu
 
  
  
    startbutton = new JButton ("Start"); // creates start button 
    startbutton.setPreferredSize(new Dimension(0,40)); // gives the buttons its size
    startbutton.addActionListener (this); // adds action listener
 
    instructionbutton = new JButton ("Instructions"); // creates instructions button 
    instructionbutton.addActionListener(this); // adds action listener
    instructionbutton.setPreferredSize(new Dimension(0,40)); // gives the buttons its size
    
    //startmenu panel
    JPanel startmenu = new JPanel(); //creates panel to put buttons on to
    startmenu.setBackground(Color.blue); // gives the startmenu panel a background of blue
    
 
    GridLayout startmenulayout = new GridLayout(1,2,30,0); // creates a new GridLayout
    
    startmenu.setLayout(startmenulayout); // sets the startmenu panel layout to startmenulayout which is a gridlayout
 
    startmenu.add(startbutton); // adds start button and the position of the button on the panel
 
    startmenu.add(instructionbutton) ; // adds instruction button and the position of the button on the panel

    return startmenu; // returns startmenu
 }
  
 
  public JPanel backgrounds(){// background Jpanel
  
    JPanel backgrounds = new JPanel(); //creates panel to put background stuff on to
    backgrounds.setBackground(Color.blue); // makes the panel background blue
  
    return backgrounds; //returns this panel
  
 }
 
 
  public void actionPerformed (ActionEvent e){ // creates action listeners
  
    //instruction button action listener
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
    
  JFrame frame = new JFrame("IMPROVISED - JEA" +
                            "PORDY"); // creates a frame with the name of IMPROVISED - JEAPORDY
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program when closed
  
  frame.setLayout(new BorderLayout()); // creates a new border layout for the frame
  
  frame.setSize(650,500); // sets frame to this size 
  
  //content added to window
  frame.add (backgrounds()); // adds the backgrounds panel (a panel for the backgroun)
  frame.add (startmenupanel(), BorderLayout.SOUTH); // adds the start menu panale ( includes buttons)
  
  
  
  
  //displays Frame/Window 
  frame.setVisible (true);
  
  }
 
 public static void main (String[] args){
   
  
   new JeapordyGUI().createAndShowGUI();
 }
 
 

}
