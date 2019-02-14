/**
 * @author Mikael Hinton
 */

import java.text.DecimalFormat;

public class Restaurant extends Store {
	
	final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	private int servedEveryYear;
	private double averagePrice;
	
	public Restaurant(String newName, int newServedEveryYear, double newAveragePrice)
	{
		super(newName);
		setServedEveryYear(newServedEveryYear);
		setAveragePrice(newAveragePrice);
	}
	
	public int getServedEveryYear()
	{
		return servedEveryYear;
	}
	
	public void setServedEveryYear(int newServedEveryYear)
	{
		servedEveryYear = newServedEveryYear;
	}
	
	public double getAveragePrice()
	{
		return averagePrice;
	}
	
	public void setAveragePrice(double newAveragePrice)
	{
		averagePrice = newAveragePrice;
	}
	
	public double averageTaxesYearly()
	{
		double averageTax;
		
		averageTax = (getServedEveryYear() * getAveragePrice() * SALES_TAX_RATE);
	return averageTax;
	}
	
	public String toString()
	{
		return super.toString() + "\nPeople served yearly: " + servedEveryYear
				+ "\nAverage price: " + MONEY.format(averagePrice);
	}
	

}
