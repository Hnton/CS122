
public class Store {

	public final double SALES_TAX_RATE = 0.06;
	private String name;
	
	public Store(String newName)
	{
		setName(newName);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String toString()
	{
		return ("Name: " + name);
	}
}
