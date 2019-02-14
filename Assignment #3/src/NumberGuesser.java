/*
 * @author Mikael Hinton
 * @date 1/29/2018
 * @Description: Program that takes in a number from the user and then outputs how many numbers
 * 		it guessed before being able to guess the correct numebr.
 *  LESSON #3 ASSIGNMENT
 */


import java.util.Scanner;

public class NumberGuesser {

	public static void main (String [] args) {
	
int minimum = 1;
int maximum = 100;
int num = 0;
int startNumber = 1;
		
	while (startNumber==1){
		System.out.println("Enter the number (between " + minimum + " and " + (maximum) + "): ");
		num = new Scanner(System.in).nextInt();
		   if (num < minimum || num >= maximum){
				System.out.println("Not between " + minimum + " and " + (maximum));
			}
			else{
				break;
			}
		}

int guess = (maximum + minimum) / 2;		
int count = 1;

	while (num != guess){
		if (guess < num){
		   minimum = guess;
		   guess = (maximum + minimum) / 2;
		}
		else{
			maximum = guess;
			guess = (maximum + minimum) / 2;
		}
			System.out.println(guess);
			count++;
	}
System.out.println("The computer found the number: " + guess +" in " + count + " guesses!");
}
}