/**
 * 
 * @author Mikael Hinton
 *
 */
public class SizeableItem extends Item{

	// An integer to represent how many
	// 	or what size the item the customer
	//  wants.
	private int quantity;
	
	/**
	 * Default constructor
	 */
	public SizeableItem()
	{
		super();
	}
	
	/**
	 * Overloaded Constructor
	 * @param item
	 * @param newQuantity
	 * @param newPrice
	 */
	public SizeableItem(String newName, int newQuantity, double newPrice)
	{
		super(newName, newPrice);
		setName(newName);
		setQuantity(newQuantity);
		setPrice(newPrice);
	}
	
	/**
	 * Gets the quantity
	 * @return
	 */
	public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 * sets the quantity and makes sure number > 0
	 * @param newQuantity
	 */
	public void setQuantity(int newQuantity)
	{
		quantity = newQuantity;
	}
	
	// Return a String representation of the item
		public String toString()
		{
			return (super.toString() + "\nQuantity: " + quantity);
		}
}
