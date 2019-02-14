/**
 * 
 * @author Mikael Hinton
 *
 */
public interface Restaurant {

	/**
	 * Returns the cost of an item in cents, as an integer
	 * @return
	 */
	public  double getPrice();
	
	/**
	 * Sets the cost of an item in cents, as an integer
	 * @param newPrice
	 */
	public void setPrice(double newPrice);
	
	/**
	 * returns the name of the item
	 * @return
	 */
	 public String getName();
}
