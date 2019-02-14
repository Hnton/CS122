/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

// ***** add your import statements here
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Calendar;
import java.util.Random;
import java.text.NumberFormat;

public class PracticeMethods
{
  private static Scanner s;

public static void main( String [] args )
  {
    s = new Scanner(System.in);
	  	
		System.out.println ("Enter first name: ");
		String firstName = s.next();
		
		System.out.println();
		System.out.println ("Hello " + firstName);
		
		System.out.println();
		System.out.println (firstName.length() + " letters in your name.");

    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.7.
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
		System.out.println();
		System.out.println("What year were you born?");
		Calendar today = Calendar.getInstance();
		int year = s.nextInt();
		
		System.out.println();
		int age = today.get(Calendar.YEAR) - year;
		System.out.println ("You are " + age );
		
		final double lifeExpectancy = 78.7;
		
		System.out.println();
		double used = age/lifeExpectancy;
		NumberFormat pt = NumberFormat.getPercentInstance();
		System.out.println(pt.format(used) + " of your expected life is over!");
		
    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: 
    //         use Math.abs)

		System.out.println();
		Random random = new Random();
		int randomNum = random.nextInt( 20 ) + 1;
		
		String in = JOptionPane.showInputDialog( null, "Enter a number to guess between 1 to 20." );
		int userGuess = Integer.parseInt(in);
		
		if (userGuess < 1 || userGuess > 20 )
			JOptionPane.showMessageDialog(null, "Invalid entery!");
			else
			{
		if (userGuess == randomNum)
			JOptionPane.showMessageDialog(null, "Correct Number! Good job!" );
			else
			{
			JOptionPane.showMessageDialog(null, "The number was " + randomNum);
			
			int betweenRan = randomNum - 20;
			int betweenGuess = userGuess - 20;
			int between = Math.abs(betweenRan - betweenGuess);
			JOptionPane.showMessageDialog(null, "You were " + between + " away from the random number!" );
		}
   }	
}
}