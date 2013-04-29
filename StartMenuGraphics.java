import java.awt.Graphics;
import java.awt.*;
import javax.swing.JPanel;


public class StartMenuGraphics extends JPanel{
  @Override public void paintComponent(Graphics g){ // override to actaully draw
    super.paintComponent(g);  // paints JPanel with graphics
    
    g.setColor(Color.blue); // sets color to be blue
    g.fillRect(0,0,1000,1000);// fills rectangle with the size of 1000, 1000, from the x,y coordinates of 0,0 with a blue colour , basically painting the entire thing blue.
    g.setColor(Color.white); // sets color to be white
    g.drawString("Hi",500,500);
    
  } 
  
  public static void main(String[] args) {
  
    
  }
}
