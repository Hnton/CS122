/**
 * 
 * @author Mikael Hinton
 *
 */

import java.text.DecimalFormat;

public class Item implements Restaurant {
	
	// Money format
	public DecimalFormat MONEY = new DecimalFormat("$##.00");
	// An int to hold the cost of the item in cents
	private static double price;
	// A String to hold the name of the item
	private String name;
	
	/**
	 * Default constructor
	 */
	public Item()
	{
		price = .00;
		name = "No Item Available";
	}
	
	
	/**
	 * Overloaded constructor
	 * @param newName
	 * @param newPrice
	 */
	public Item(String newName, double newPrice)
	{
		setName(newName);
		setPrice(newPrice);	
	}
	
	/**
	 * Gets and returns price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Sets the price of the item
	 * @param newPrice
	 */
	public void setPrice(double newPrice)
	{
		if(price < -0.01)
		{
			System.out.println("Please enter a price greater than 0!");
		}
		else
		{
			
			price = newPrice;
		}
	}
	
	/**
	 * Gets and returns name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of the item
	 * @param newName
	 */
	public void setName(String newName)
	{
		// DO PARAMETER SO THAT IT MAKES SURE THERE IS SOMETHING IN NEW NAME
		name = newName;
	}
	
	// Return a String representation of the item
	public String toString()
	{
		return ("Item: " + name + "\nPrice: " + MONEY.format(price));
	}
}
