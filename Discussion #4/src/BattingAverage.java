/*
 * @author Mikael Hinton
 * @date 1/30/2018
 * @Description: Program that takes in 2 ints and then computes the average
 * 				into a batting average and lets the user know if the player
 * 				is eligible for the all star game or not.
 */

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the number of hits the player has: " + "\n");
		int hits = s.nextInt();
		
		System.out.print("Enter the number of at bats the player has: " + "\n");
		int atBats = s.nextInt();
		
		double battingAverage = (double)hits / (double)atBats;
		
		System.out.println("The players batting average is: " + battingAverage + "\n");
		
		if(battingAverage >= .300)
		{
			System.out.println("The player is eligible for the All Star Game!");
		}
		else
			System.out.println("The player is NOT eligible for the All Star Game!");
	
	}

}
