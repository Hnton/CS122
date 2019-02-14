/**
 * Discussion #10
 * @author Mikael Hinton
 *
 */

import java.util.*;

public class Recursion {
	
	   private static Scanner sc;

	public static int dividingBy3(int n) {

	       if (n < 1)
	           return 0;
	       else {
	    	   System.out.println();
	           System.out.println(n + " / 3 = " + n / 3);
	           return dividingBy3(n / 3);
	       }

	   }

	   public static void main(String[] args) {

		   System.out.println("Enter a postive integer: ");
		   sc = new Scanner(System.in);
		   int number = sc.nextInt();
		   dividingBy3(number);

	   }
	}


