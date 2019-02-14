/*
 * @author Mikael Hinton
 * @description This program takes in an int and then determines if its an leap, leapleap,
 *              leapleapleap year. If it isnt any of them it tells you invalid number,
 *              if it isnt an valid number it tells you,
 *              it asks if you would like to enter another number (y/n)
 * @date 2/12/2018
 * 
 */

import java.util.Scanner;

public class LeapYearTester {

// if leap
public static boolean isLeap(int year) 
		{
			return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		}
// if leapleap
public static boolean isLeapLeap(int year) 
		{
			return year % 100 == 0;
		}
//if leapleapleap
public static boolean isLeapLeapLeap(int year)
		{
			return year % 400 == 0;
		}
//if valid year
public static boolean isValidYear(int year)
		{
			return year > -450000000;
		}
//Main to test years
public static void main(String[] args)
{
	int year;
	Scanner s = new Scanner(System.in);
	char c;
		
// do while loop to test the year as many as you want, then it prompts if you want to
// continue (y/n)
 
do
{
	// reads in the year
	System.out.println("Enter a year: ");
	year = s.nextInt();
	
// if the year is valid
if(isValidYear(year) == true)
	{
	// prints if leap year
	if(isLeap(year))
		{
		System.out.println(year + " is a leap year!");
		}
	// prints if leapleap year
	else if(isLeapLeap(year))
		{
		System.out.println(year + " is a leap leap year!");
		}
	// print if leapleapleap year
	else if(isLeapLeapLeap(year)) 
		{
		System.out.println(year + " is a leap leap leap year!");
		}
	// prints that its not a leap year
	else
		{
		System.out.println(year + " is not a leap year!");

		}
	}
// prints not a vaild year if it doesnt go into loop
else
	{
	System.out.println(year + " is not a valid year");
	}

// prints asking user if they would like to enter another year	
System.out.println("Would you like to enter another year? (y/n)");
	c = s.next().charAt(0);

} while(c == 'y');

// prints goodbye if the input isnt a "y"
System.out.println("GOODBYE FOREVER!!!!");
}
}
