/**
 * @author Mikael Hinton
 * Assignment #10
 * Program that does recursion and iterative to see which is better for performance
 */

import java.util.Random;

public class RecursionAssignment {

	public static void main(String[] args)
	{
		//Gets random number for a and b
		Random n = new Random();
		int a = n.nextInt(100) + 1;
		int b = n.nextInt(100) + 1;
		
		// Always makes sure the bigger number is first and the lower number is the second number
		if(a < b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		// Prints out the numbers and then shows you either the multiplying or dividing of the numbers by recursion or iterative
		System.out.println("The numbers are: " + a + " " + b);
		System.out.println("Multiplying by Recursion: " + multiplyR(a,b));
		System.out.println("Multiplying by Iterative: " + multiplyI(a,b));
		System.out.println("Dividing by Recursion: " + divisionR(a,b));
		System.out.println("Dividing by Iterative: " + divisionI(a,b));

		int num = 1;
		// A for loop to test the speeds and performance between recursion and iterative
		
			for( int i = 0; i < num * 10; i++)
			{
				int c = 1;
				int d = 1;
			
				if(c < d)
				{
					int temp = c;
					c = d;
					d = temp;	
				}
			System.out.println("R" + multiplyR(c,d));
			System.out.println("I" + multiplyI(c,d));
			System.out.println("R" + divisionR(c,d));
			System.out.println("I" + divisionI(c,d));
			}
	}
	
	
	/**
	 * Multiplying by Recursion
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiplyR(int a, int b)
	{
		if(b != 0)
		{
			return a + multiplyR(a,b-1);
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Dividing by Recursion
	 * @param a
	 * @param b
	 * @return
	 */
	public static int divisionR(int a, int b)
	{
	    if(a > b)
	    {
	    	 return 1 + divisionR(a-b,b);
	    }
	    else
	    {
	    	return 0;
	    }

	}
	
	/**
	 * Multiplying by Iterative
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiplyI(int a , int b)
	{
	    int num = 0;
	    for(int i = 1; i <= b; i++)
	    {
	        num += a;
	    }
	    return num;
	}
	
	/**
	 * Dividing by Iterative
	 * @param a
	 * @param b
	 * @return
	 */
	public static int divisionI(int a,int b)
	{
	    int num = 0;
	    while(a >= b)
	    {
	      a -= b;
	      num++;
	    }
	    return num;
	}
	
}
