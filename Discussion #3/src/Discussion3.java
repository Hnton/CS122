/** Mikael Hinton
* CS 122
* Description: This program has the user input a string of letters/words and then outputs then all in uppercase,
 then in lowercase, and finally how they were originally typed by the user
*/

import java.util.Scanner;

public class Discussion3 
		{ 
		
	/**
	 * The test scanner which lets the user type a string into the program
	 */
	private static Scanner s; 

	
	public static void main(String[]args) { 

		s = new Scanner(System.in);
		/**
		 *  The line that is executed when the program starts
		 *  to let the user input a string
		 */
		System.out.print("Type a word and hit enter: "); // What is displayed when program first starts up 
		String string = s.nextLine(); 
		
		/**
		 * Prints a string which is either all uppercase,
		 * all lowercase, and then the original input by the user
		 */
		System.out.println(string.toUpperCase()); // Prints out message in uppercase
		System.out.println(string.toLowerCase()); // Prints out message in lowercase
		System.out.println(string); // Prints out message that user entered
		} 
}
