import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ProgressBar extends JPanel{
  
  JProgressBar verticalbar;
  
  static final int minimum = 0; // gives minimum to the progress bar
  static final int maximum = 15; // gives maximum to the progress bar
  static JLabel[] levels;
  public ProgressBar() // default constructer for progress bar.
  {
    levels =new JLabel[15];
    verticalbar = new JProgressBar (JProgressBar.VERTICAL , minimum, maximum);
    verticalbar.setPreferredSize(new Dimension(30,240));
    JPanel levelBox =new JPanel();
    GridLayout gl = new GridLayout(15,0);
    levelBox.setLayout(gl);
    
//creates a vertical progress bar with a set minimum and maximum value
    add(verticalbar);
    Level l=new Level();
    for(int i=0;i<levels.length;i++){
      levels[i]=new JLabel("$"+l.levelAt(14-i));
      levelBox.add(levels[i]);
    }
    
    this.add(levelBox);
  }
  
  public void setBar(int newValue){ // a method that sets  a value to the vertical bar
    verticalbar.setValue(newValue); // sets the vertical bar to a specific value
  }
  
   public void incrementBar(){ // a method that sets  a value to the vertical bar
    verticalbar.setValue(verticalbar.getValue()+1); // sets the vertical bar to a specific value
  }
  
  
  public static void main (String[] args)
  {
    
    
  }
  
}
