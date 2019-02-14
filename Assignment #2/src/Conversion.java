/**
 * @author Mikael Hinton
 */

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {

		//Temperature
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a temperature in Celcius: ");
		float celcius1 = sc.nextFloat();
		
		float fahrenheit1 = (celcius1 - 32 * (9/5)); 
		
		System.out.println ("The temperature " + celcius1 + " Celcius is " + fahrenheit1 +
							" Fehrenheit!\n");
		
		System.out.print("Please enter a temperature in Fehrenheit: ");
		float fahrenheit2 = sc.nextFloat();
		
		float celcius2 = (fahrenheit2 + 32 * (9/5));
		
		System.out.println ("The temperature " + fahrenheit2 + " Fahrenheit is " + celcius2 +
				" Celcius!\n");
		
		//Volume
		
		System.out.print("Please enter Liters: ");
		double liters = sc.nextDouble();
		
		double gallons = (liters * 0.26417);		
	
		System.out.println(liters + " Liters is " + gallons + " Gallons!\n");
		
		System.out.print("Please enter Gallons: ");
		double gallons1 = sc.nextDouble();
		
		double liters1 = (gallons / 0.26417);
		
		System.out.println(gallons1 + " Gallons is " + liters1 + " Liters!\n");
		
		//Distance
		
		System.out.print("Please enter miles: ");
		double miles = sc.nextDouble();
		
		double kilometers = (miles / 0.62137);
		
		System.out.println(miles + " Miles is " + kilometers + " Kilometers!\n");

		System.out.print("Please enter Kilometers: ");
		double kilometers1 = sc.nextDouble();
		
		double miles1 = (kilometers1 * 0.62137);
		
		System.out.println(kilometers1 + " Kilometers is " + miles1 + " Miles!\n");
		
		//Weight/Mass
		
		System.out.print("Please enter Pounds: ");
		double pounds = sc.nextDouble();
		
		double kilograms = (pounds / 2.2046);
		
		System.out.println(pounds + " Pounds is " + kilograms + " Kilograms!\n");
		
		System.out.print("Please enter Kilograms: ");
		double kilograms1 = sc.nextDouble();
		
		double pounds1 = (kilograms * 2.2046);
		
		System.out.println(kilograms1 + " Kilograms is " + pounds1 + " Pounds!\n");
	}

}
