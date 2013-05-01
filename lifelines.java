import java.awt.*;
import hsa.Console;

public class lifelines
{
    static Console c;
    public static void main (String args[]) // just to test if the algorithms are working
    {
	c = new Console ();
	boolean[] lifeline = new boolean [3]; // array for avalible lifelines

       
	int randomIndex, answer;
	String confidence;
	randomIndex = (int) (3 * Math.random () + 1); //used to determine friend confidence

	confidence = friendConfidence (randomIndex);
	c.print (confidence);
	answer = FriendsAnswer (0, randomIndex);//just setting the correct answer to a.
	c.println (" the answer is " + numberToLetter (answer));
	
	c.println("The choices that are wrong are: " + fiftyFifty(0));//just setting the correct answer to a.


	c.println("The audience votes choice "+ numberToLetter(rightAnswer()) +", " + percent() + "% correct...");

       


    }





    // used for determining the confidence level of the friend
    public static String friendConfidence (int randomIndex)
    {
	String confidence = ""; // used to determine how correct the friend is. Is also used for ranomization of the correct answer.

	if (randomIndex == 1)
	    confidence = "I don't know..., ";
	else if (randomIndex == 2)
	    confidence = "I'm kinda sure..., ";
	else if (randomIndex == 3)
	    confidence = "I'm positive..., ";

	return confidence;
    }
    
    public static int rightAnswer ()
    {
     int rightAnswer =0;
     
     return rightAnswer;
    }


    public static String fiftyFifty (int rightAnswer)
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


    public static String percent ()  // sets the audience percentage to 75
    {
	String percent;
	percent = "75";
	return percent;
    }
}
