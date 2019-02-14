/**
 * @author Mikael Hinton
 */
import java.text.DecimalFormat;

public class RestaurantClient {

	public static void main(String [] args)
	{
		
		final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
		
		String name = "Mikael";
		int numServedEveryYear = 1454;
		
		double averagePrice = 9.76;
		
		double taxPerYear = 17000;
		
		
		Restaurant newItem = new Restaurant(name, numServedEveryYear, averagePrice);
		
		System.out.println(newItem.toString() + "\nTaxes per year: "+ MONEY.format(taxPerYear)+ "\n");
		
		
		newItem.setName("Bob");
		System.out.println("\ngetName Testing Now: "+ newItem.getName());		
		
		
		newItem.setServedEveryYear(1795);
		System.out.println("\ngetPeoplePerYear Testing Now: "+ newItem.getServedEveryYear());
		
		
		newItem.setAveragePrice(12.74);
		System.out.println("\ngetAveragePricePerPerson Testing Now: "+ newItem.getAveragePrice());
		
		

		taxPerYear = newItem.averageTaxesYearly();
		System.out.println("\nNew tax per year: "+MONEY.format(taxPerYear));
	}
}

