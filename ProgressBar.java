import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ProgressBar extends JPanel{
  
  JProgressBar verticalbar;
  
  static final int minimum = 0; // gives minimum to the progress bar
  static final int maximum = 100; // gives maximum to the progress bar
 
  public ProgressBar() // default constructer for progress bar.
  {
    verticalbar = new JProgressBar (JProgressBar.VERTICAL , minimum, maximum);
    verticalbar.setPreferredSize(new Dimension(30,400));
    //creates a vertical progress bar with a set minimum and maximum value
    add(verticalbar);
  }
  
  public void updateBar(int newValue){ // a method that sets  a value to the vertical bar
   verticalbar.setValue(newValue); // sets the vertical bar to a specific value
  }
  
  
  public static void main (String[] args)
  {
    
    
  }
 
}
