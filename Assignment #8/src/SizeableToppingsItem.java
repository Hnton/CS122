/**
 * @author Mikael Hinton
 * 
 */

import java.util.ArrayList;

public class SizeableToppingsItem 
					extends SizeableItem{

	// A constant double to represent how much a single
	//		topping costs. 50 cents	
	private final double TOPPING_COST = 0.50;
	
	// An ArrayList of toppings that have been added to
	//		this item. Holds values from the Topping enum
	private final static ArrayList<Topping> toppings = new ArrayList<>();
	
	public SizeableToppingsItem()
	{
		super(); 
	}
	
	/**
	 * Overloaded constructor
	 * @param newName
	 * @param newQuantity
	 * @param newPrice
	 */
	public SizeableToppingsItem(String newName, int newQuantity, double newPrice)
	{
		super(newName, newQuantity, newPrice);
		setName(newName);
		setQuantity(newQuantity);
		setPrice(newPrice);
	}
	
	/**
	 * Return the ArrayList of toppings added to this item
	 * @return
	 */
	 public ArrayList<Topping> getToppings()
	{
		 return toppings;
	}
	
	/**
	 * Add a Topping from the Topping enum to the toppings
	 * 		ArrayList and update the price
	 * @param newTopping
	 */
	public void addTopping(Topping newTopping)
	{
		toppings.add(newTopping);
		setPrice(getPrice() + TOPPING_COST);
	}
	
	/**
	 * Remove a Topping from the toppings ArrayList and
	 * 		update the price
	 * @param newTopping
	 */
	public void removeTopping(Topping newTopping)
	{
		toppings.remove(newTopping);
		setPrice(getPrice() - TOPPING_COST);

	}
	
	// Return a String representation of the item
	public String toString()
	{
		return (super.toString() + "\nToppings: " + toppings);
	}
	
}