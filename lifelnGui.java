
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class lifelnGui extends JPanel implements ActionListener{
		
		 JButton fiftyFiftyButton, phoneButton, askButton;

	    public JPanel createContentPane (){

	        // We create a bottom JPanel to place everything on.
	        JPanel totalGUI = new JPanel();
	        totalGUI.setLayout(null);

	        // Creation of a Panel to contain the title labels
	        JPanel titlePanel = new JPanel();
	        titlePanel.setLayout(null);
	        titlePanel.setLocation(10, 0);
	        titlePanel.setSize(250, 30);
	        totalGUI.add(titlePanel);

	        // Creation of a Panel to contain the score labels.
	        JPanel lifelinePanel = new JPanel();
	        lifelinePanel.setLayout(null);
	        lifelinePanel.setLocation(10, 40);
	        lifelinePanel.setSize(250, 30);
	        totalGUI.add(lifelinePanel);

	        JLabel lifeline = new JLabel("Your lifelines");
	        lifeline.setLocation(30, 10);
	        lifeline.setSize(100, 30);
	        lifeline.setHorizontalAlignment(0);
	        lifelinePanel.add(lifeline);

	        

	        // Creation of a label to contain all the JButtons.
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(null);
	        buttonPanel.setLocation(10, 80);
	        buttonPanel.setSize(150, 200);
	        totalGUI.add(buttonPanel);

	    
            //button 50/50 for lifelines
	        fiftyFiftyButton = new JButton("50/50");
	        fiftyFiftyButton.setLocation(0, 0);
	        fiftyFiftyButton.setSize(150, 30);
	        fiftyFiftyButton.addActionListener(this);
	        buttonPanel.add(fiftyFiftyButton);

	        // button for phone a friend
	        phoneButton = new JButton("Phone a friend");
	        phoneButton.setLocation(0, 50);
	        phoneButton.setSize(150, 30);
	        phoneButton.addActionListener(this);
	        buttonPanel.add(phoneButton);
	       // blueButton.setVisible(false);
	        
	        // button for ask the audience
	        askButton = new JButton("Ask the audience");
	        askButton.setLocation(0, 100);
	        askButton.setSize(150, 30);
	        askButton.addActionListener(this);
	        buttonPanel.add(askButton); 
	       
	        
	        totalGUI.setOpaque(true);
	        return totalGUI;
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	    	
	    	
	      
			if(e.getSource() == fiftyFiftyButton)
	        {
				JOptionPane.showMessageDialog(null, "The choices that are wrong are: " + fiftyFifty(0),"", JOptionPane.INFORMATION_MESSAGE); // displays the 50/50 message (a popup)
				fiftyFiftyButton.setEnabled(false); // makes button unclickable when lifeline is used
	        }
	        else if(e.getSource() == phoneButton)
	        {
	        	int randomIndex = (int) (3 * Math.random () + 1); //used to determine friend confidence
	        	int answer = FriendsAnswer (rightAnswer(), randomIndex);//generating the friend's answer.

	        	JOptionPane.showMessageDialog(null,"\n............................. \n.................... \n......... " +
	        			"\nHello?.."+"\n" + friendConfidence (randomIndex) + "\nMy answer is " + numberToLetter (answer)+".","", JOptionPane.INFORMATION_MESSAGE); // displays the phone a friend message (a popup)
	        	phoneButton.setEnabled(false); // makes button unclickable when lifeline is used
	        }
	      
	        else if(e.getSource() == askButton)
	        {
	        	
	         JOptionPane.showMessageDialog(null, "The audience votes choice "+ numberToLetter(rightAnswer()) +", " + percent() + "% correct...","", JOptionPane.INFORMATION_MESSAGE); // displays the audience message (a popup)	
	         askButton.setEnabled(false); // makes button unclickable when lifeline is used
	           
	        }
	    }
	    
		public int rightAnswer()// take this out because its just for testing purposes
		{
			
		int rightAnswer = 0;
		return rightAnswer;
			
		}
		
		// used for determining the confidence level of the friend
	    public static String friendConfidence (int randomIndex)
	    {
	        String confidence = ""; // used to determine how correct the friend is. Is also used for ranomization of the correct answer.

	        if (randomIndex == 1)
	            confidence = "I don't know... ";
	        else if (randomIndex == 2)
	            confidence = "I'm kinda sure... ";
	        else if (randomIndex == 3)
	            confidence = "I'm positive... ";

	        return confidence;
	    }
	    
	    
	    // used to determine the friend's answer
	    public static int FriendsAnswer (int rightAnswer, int randomIndex)
	    {
	        int randomNumber;

	        int[] choices = {0, 1, 2, 3}; // creates the array

	        // array for the choices to be eliminated


	        for (int i = randomIndex ; i > 0 ; i--)
	        {
	            do
	            {
	                randomNumber = (int) (4 * Math.random ()); // used to eliminate an answer

	            }
	            while (randomNumber == rightAnswer); // does not eliminate the correct answer.

	            if (choices [randomNumber] != -1)
	            {
	                choices [randomNumber] = -1; // sets the eliminated value to -1 in the array

	            }
	            else
	            {
	                i++; //accounts for numbers selected aready
	            }

	        }

	        do
	            randomNumber = (int) (4 * Math.random ()); // used to determine the friend's answer
	        while (choices [randomNumber] == -1);

	        return randomNumber;

	    }
		
		public static String fiftyFifty (int rightAnswer) // used for the fifty fifty lifeline
	    {
	        int randomNumber,choiceElimimated=0,choice2Eliminated=0;
	        String Eliminated,Eliminated2;

	        int[] choices = {0, 1, 2, 3}; // creates the array

	        for (int i = 2 ; i > 0 ; i--)
	        {
	            do
	            {
	                randomNumber = (int) (4 * Math.random ()); // used to eliminate an answer

	            }
	            while (randomNumber == rightAnswer); // does not eliminate the correct answer.

	            if (choices [randomNumber] != -1)
	            {
	                if (i == 2)
	                    choiceElimimated = randomNumber;
	                else if (i == 1)
	                    choice2Eliminated = randomNumber;

	                choices [randomNumber] = -1; // sets the eliminated value to -1 in the array

	            }
	            else
	            {
	                i++; //accounts for numbers selected aready
	            }
	        }
	        
	        Eliminated = numberToLetter ( choiceElimimated );
	        Eliminated2 = numberToLetter ( choice2Eliminated );
	        
	        return Eliminated +" and " + Eliminated2;





	    }
		
		 public static String numberToLetter (int number)  // converts number from 0-3 into a,b,c or d
		  {

		        if (number == 0)
		            return "a";

		        else if (number == 1)
		            return "b";

		        else if (number == 2)
		            return "c";

		        else
		            return "d";



		}
		 
		
		 public  String percent ()  // sets the audience percentage to 75 (used for the ask the audience lifeline)
		 {
		        String percent;
		        percent = "75";
		        return percent;
		 }
	    
	    // creates the gui
	    private static void createAndShowGUI() {

	        
	        JFrame frame = new JFrame("Lifelines");

	        //Create and set up the content pane.
	        lifelnGui demo = new lifelnGui();
	        frame.setContentPane(demo.createContentPane());

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(200, 300);
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	}
