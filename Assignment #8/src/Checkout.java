/**
 * 
 * @author Mikael Hinton
 *
 */

import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;

public class Checkout {
	
	public static DecimalFormat MONEY = new DecimalFormat("$###.00");
	public double TAX_RATE = 0.03;
	private static Scanner sc;
	private static ArrayList<Item> order = new ArrayList<Item>();
	
	public static void main(String[] args) 
	{
		
		sc = new Scanner(System.in);
		System.out.print("Enter Test mode?(y/n)\n");
		String option = sc.nextLine();
		
		//Switch to go from Main mode or Test mode
		switch(option) {
		
		//GOING INTO MAIN MODE
		case "n":
		case "N":
			
		//MENU TO PICK FROM
		System.out.println("\t\t Tom's Diner Menu \t\t");
		System.out.println("Drinks:");
		System.out.println("\t 1. Coffee\t\t\t99 Cents");
		System.out.println("\t 2. Small Soda (12 oz) \t\t99 Cents");
		System.out.println("\t 3. Large Soda (18 oz) \t\t$1.50");
		System.out.println("Side Dishes:");
		System.out.println("\t 4. Salad\t\t\t$1.99");
		System.out.println("\t 5. Green Beans\t\t\t$1.99");
		System.out.println("\t 6. Rice\t\t\t$1.99");
		System.out.println("Entrees:");
		System.out.println("\t 7. 8 oz Steak\t\t\t99 Cents An Ounce");
		System.out.println("\t 8. 12 oz Steak\t\t\t99 Cents An Ounce");
		System.out.println("\t 9. 16 oz Steak\t\t\t$3.99 Each");
		System.out.println("\t10. Chicken Breast\t\t$3.99 Each");
		System.out.println("Desserts:");
		System.out.println("\t11. Cake\t\t\t$1.99 A Piece");
		System.out.println("\t12. Ice Cream by the scoop\t99 Cents Per Scoop");
		System.out.println("\t13. Sundae (Ice Cream By The Scoop + Toppings)");
		System.out.println();

		// Prompts user to input item number
		addItem();
		
		
		break;
		//GOING INTO TEST MODE
		case "y":
		case "Y":
					// UNIT TEST MODE
		System.out.println(" -----------------------------------------\n" + 
				"--------------------------------------------");

		System.out.println("\t\tTEST MODE");
		System.out.println("---------------------------------------------\n" + 
							" -----------------------------------------\n");
				//START OF ITEM CLASS
		System.out.println("\t\tItem Class");
		System.out.println("\t\t----------");


		
		//Default constructor Item class
		System.out.println("Default constructor in Item class");
		System.out.println("---------------------------------");

		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00");

		Item item1 = new Item();
		System.out.println("\tCode:\n" + item1);
		System.out.println("");

		
		//Overloaded constructor Item class
		System.out.println("Overloaded constructor in Item class");
		System.out.println("------------------------------------");

		System.out.println("\tCorrect:\nItem: Soda\nPrice: $1.99");
		
		Item item2 = new Item("Soda", 1.99);
		System.out.println("\tCode: \n" + item2);
		System.out.println("");
		
		//getPrice Method in Item class
		System.out.println("Get price Method in Item class");
		System.out.println("------------------------------");

		System.out.println("\tCorrect:\nPrice: 2.75");
		
		Item item3 = new Item();
		item3.setPrice(2.75);
		System.out.println("\tCode:\nPrice: " + item3.getPrice());
		System.out.println("");

		//setPrice Method in Item class
		System.out.println("Set Price Method in Item class");
		System.out.println("------------------------------");

		System.out.println("\tCorrect:\nPrice: 1.74");
		
		Item item4 = new Item();
		item4.setPrice(1.74);
		System.out.println("\tCode:\nPrice: " + item4.getPrice());
		System.out.println("");
		
		//getName Method in Item class
		System.out.println("Get Name Method in Item class");
		System.out.println("-----------------------------");
		
		System.out.println("\tCorrect:\nItem: Large Soda (18 oz)");
		
		Item item5 = new Item();
		item5.setName("Large Soda (18 oz)");
		System.out.println("\tCode:\nItem: " +item5.getName());
		System.out.println("");
		
		//SetName Method in Item class
		System.out.println("Set Name Method in Item class");
		System.out.println("-----------------------------");
		
		System.out.println("\tCorrect:\nItem: Small Soda (12 oz)");
		
		Item item6 = new Item();
		item6.setName("Small Soda (12 oz)");
		System.out.println("\tCode:\nItem: " + item6.getName());
		System.out.println("");

		//toString Method in Item class
		System.out.println("To String Method in Item class");
		System.out.println("------------------------------");
		
		System.out.println("\tCorrect:\nItem: Salad\nPrice: $1.99");
		
		Item item7 = new Item("Salad", 1.99);
		
		System.out.println("\tCode:\n" + item7.toString());
		System.out.println("");
		
					// START OF SIZEABLETOPPINGITEM CLASS
		System.out.println("\t\t SizeableToppingsItem Class");
		System.out.println("\t\t --------------------------\n");


		
		//Default constructor in SizeableToppingsItem class
		System.out.println("Default constructor in SizeableToppingsItem class");
		System.out.println("-------------------------------------------------");
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00\nQuantity: 0\nToppings: []");
		
		Item item8 = new SizeableToppingsItem();
		
		System.out.println("\tCode:\n" + item8);
		System.out.println("");

		//Overloaded constructor in SizeableToppingsItem class
		System.out.println("Overloaded constructor in SizeableToppingsItem class");
		System.out.println("----------------------------------------------------");
		
		System.out.println("\tCorrect:\nItem:Ice Cream by the scoop\nPrice: $1.98\nQuantity: 2\nToppings: []");
		
		Item item9 = new SizeableToppingsItem("Ice Cream by the scoop", 2, 1.98);
		
		System.out.println("\tCode:");
		System.out.println(item9);
		System.out.println("");

		//       HELP
		/**
		//ArrayList<Toppings> getToppings Method in SizeableToppingsItem class  
		System.out.println("ArrayList<Toppings> Get Toppings method in SizeableToppingsItem class");
		System.out.println("---------------------------------------------------------------------");
		Topping top = Topping.Caramel;
		ArrayList<Topping> item10 = new addTopping(Topping.Caramel);
		addTopping();
		System.out.println();
		*/

		//addTopping method in SizeableToppingsItem class
		System.out.println("Add Toppings Method in SizeableToppingsItem class");
		System.out.println("-------------------------------------------------");
		
		System.out.println("\tCorrect:\n" + "Item: No Item Available\n" +
		"Price: $.50\n" + "Quantity: 0\n" + "Toppings: [Fudge]\n");
		
		SizeableToppingsItem item10 = new SizeableToppingsItem();
		Topping ta = Topping.Fudge;
		item10.addTopping(ta);
		item10.getToppings();
		System.out.println("\tCode:\n" + item10);
		System.out.println("");

		//removeTopping method in SizeableToppingsItem class
		System.out.println("Remove Toppings Method in SizeableToppingsItem");
		System.out.println("----------------------------------------------");
		
		SizeableToppingsItem item11 = new SizeableToppingsItem();
		
		System.out.println("\tCorrect:\n"
				+ "Item: No Item Available\n"
				+ "Price: $.00\nQuantity: 0\nToppings: []");
		
		
		
		item11.addTopping(ta);
		System.out.println("\tCode:\n\n\tADDED TOPPING:\n" + item10 + "\n");
		item11.removeTopping(ta);
		item11.getToppings();
		System.out.println("\tREMOVED TOPPING:\n" + item11);
		System.out.println("");
		
		//to String method in SizeableToppingItem class
		System.out.println("To String Method in SizeableToppingsItem");
		System.out.println("----------------------------------------");
		
		SizeableToppingsItem item12 = new SizeableToppingsItem();
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.50\n" +
							"Quantity: 0\nToppings: [Fudge]\n");
		
		item12.addTopping(ta);
		System.out.println("\tCode:\n" + item12.toString());
		System.out.println("");
		
				//START OF SIZEABLEITEM CLASS
		System.out.println("\t\t SizeableItem Class");
		System.out.println("\t\t ------------------\n");
		System.out.println("");

		//Default Constructor in SizeableItem class
		System.out.println("Default Constructor in SizeableItem");
		System.out.println("-----------------------------------");
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00\nQuantity: 0\n");

		SizeableItem item13 = new SizeableItem();
		
		System.out.println("\tCode:\n" + item13);
		System.out.println("");

		//Overloaded Constructor in SizeableItem class
		System.out.println("Overloaded Constructor in SizeableItem");
		System.out.println("--------------------------------------");
		
		SizeableItem item14 = new SizeableItem("Rice", 3, 1.99);

		System.out.println("\tCorrect:\nItem: Rice\nPrice: $1.99\nQuantity: 3\n");
		
		System.out.println("\tCode:\n" + item14);
		System.out.println("");

		//Get Quantity method in SizeableItem class
		System.out.println("Get Quantity method in SizeableItem");
		System.out.println("-----------------------------------");
		
		SizeableItem item15 = new SizeableItem();
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00\nQuantity: 4\n");
		
		item15.setQuantity(4);
		item15.getQuantity();
		
		System.out.println("\tCode:\n" + item15);
		System.out.println("");

		//Set Quantity method in SizeableItem class
		System.out.println("Set Quantity method in SizeableItem");
		System.out.println("-----------------------------------");

		SizeableItem item16 = new SizeableItem();
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00\nQuantity: 2\n");
		
		item16.setQuantity(2);
		
		System.out.println("\tCode:\n" + item16);
		System.out.println("");
		
		//To String method in SizeableItem class
		System.out.println("To String method in SizeableItem");
		System.out.println("--------------------------------");
		
		SizeableItem item17 = new SizeableItem();
		
		System.out.println("\tCorrect:\nItem: No Item Available\nPrice: $.00\nQuantity: 0\n");
		
		System.out.println("\tCode:\n" + item17.toString());
		break;
	}
}
	/**
	 * Adds the items
	 */
public static void addItem()
{	
		String anotherItem = "";
		int orderNumber;
		
	do
	{
			
			System.out.print("Please enter an item number: ");
			orderNumber = sc.nextInt();
			System.out.println();
		
		switch(orderNumber) 
		{
		
		case 1:
			Item num1 = new Item("Coffee", .99);
			order.add(num1);
			System.out.println(num1.toString());
			System.out.println();
			break;
		
		case 2:
			Item num2 = new Item("Small Soda (12 oz)", .99);
			order.add(num2);
			System.out.println(num2.toString());
			System.out.println();
			break;
		
		case 3:
			Item num3 = new Item("Large Soda (18 oz)", 1.50);
			order.add(num3);
			System.out.println(num3.toString());
			System.out.println();
			break;
		
		case 4:
			Item num4 = new Item("Salad", 1.99);
			order.add(num4);
			System.out.println(num4.toString());
			System.out.println();
			break;
		
		case 5:
			Item num5 = new Item("Green Beans", 1.99);
			order.add(num5);
			System.out.println(num5.toString());
			System.out.println();
			break;
		
		case 6:
			Item num6 = new Item("Rice", 1.99);
			order.add(num6);
			System.out.println(num6.toString());
			System.out.println();
			break;
		
		case 7:
			Item num7 = new Item("8 oz Steak", 7.92);
			order.add(num7);
			System.out.println(num7.toString());
			System.out.println();
			break;
		
		case 8:
			Item num8 = new Item("12 oz Steak", 11.88);
			order.add(num8);
			System.out.println(num8.toString());
			System.out.println();
			break;
		
		case 9:
			Item num9 = new Item("16 oz Steak",19.20);
			order.add(num9);
			System.out.println(num9.toString());
			System.out.println();
			break;
		
		case 10:
			Item num10 = new Item("Chicken Breast", 3.99);
			order.add(num10);
			System.out.println(num10.toString());
			System.out.println();
			break;
		
		case 11:
			
			int cakeQuantity = 0;
			System.out.print("How many pieces of cake would you like? ");
			cakeQuantity = sc.nextInt();
			System.out.println();
			System.out.print("Add Topping?(y/n)");
			String addingTopping = sc.next();
			System.out.println();
			
			SizeableToppingsItem num11 = new SizeableToppingsItem("Cake", cakeQuantity, 1.99 * cakeQuantity);
			
			if(addingTopping.equalsIgnoreCase("y"))
			{
				String anotherTopping;
				do 
				{	
				System.out.println("What topping would you like to add? (1-5) \n1. Fudge\n2. Caramel\n3. Bannana\n4. Strawberry\n5. Nuts");
				int topping = sc.nextInt();
					switch(topping) 
					{
				
					case 1:
						num11.addTopping(Topping.Fudge);
					
						break;
					case 2:
						num11.addTopping(Topping.Caramel);

						break;
					case 3:
						num11.addTopping(Topping.Bannana);
					
						break;
					case 4:
						num11.addTopping(Topping.Strawberry);
					
						break;
					case 5:
						num11.addTopping(Topping.Nuts);
					
						break;
					}
					
					System.out.println("Add another topping?(y/n)");
					anotherTopping = sc.next();
				}while(anotherTopping.equalsIgnoreCase("y"));
			}
			
			order.add(num11);
			System.out.println(num11.toString());
			System.out.println();
			break;
		
		case 12:
			
			int scoopQuantity = 0;
			
			System.out.println("How many scoops of Ice Cream would you like?");
			scoopQuantity = sc.nextInt();
			System.out.println();
			System.out.println("Add Topping?(y/n)");
			addingTopping = sc.next();
			System.out.println();
			
			SizeableToppingsItem num12 = new SizeableToppingsItem("Ice Cream by the scoop", scoopQuantity, .99 * scoopQuantity);
			
			if(addingTopping.equalsIgnoreCase("y"))
			{
				String anotherTopping;
				do 
				{	
				System.out.println("What topping would you like to add? (1-5) \n1. Fudge\n2. Caramel\n3. Bannana\n4. Strawberry\n5. Nuts");
				int topping = sc.nextInt();
					switch(topping) 
					{
				
					case 1:
						num12.addTopping(Topping.Fudge);
					
						break;
					case 2:
						num12.addTopping(Topping.Caramel);

						break;
					case 3:
						num12.addTopping(Topping.Bannana);
					
						break;
					case 4:
						num12.addTopping(Topping.Strawberry);
					
						break;
					case 5:
						num12.addTopping(Topping.Nuts);
					
						break;
					}
					
					System.out.println("Add another topping?(y/n)");
					anotherTopping = sc.next();
				}while(anotherTopping.equalsIgnoreCase("y"));
			}
			
			order.add(num12);
			System.out.println(num12.toString());
			System.out.println();
			break;
		
		case 13:
			int sundaeQuantity = 0;
			System.out.println("How many scoops of Ice Cream would you like in your sundae?");
			sundaeQuantity = sc.nextInt();
			System.out.println();
			
			System.out.println("Add Topping?(y/n)");
			addingTopping = sc.next();
			System.out.println();
			
			SizeableToppingsItem num13 = new SizeableToppingsItem("Sundae (Ice Cream By The Scoop + Toppings)", sundaeQuantity , .99 * sundaeQuantity);
			
			if(addingTopping.equalsIgnoreCase("y"))
			{
				String anotherTopping;
				do 
				{	
				System.out.println("What topping would you like to add? (1-5) \n1. Fudge\n2. Caramel\n3. Bannana\n4. Strawberry\n5. Nuts");
				int topping = sc.nextInt();
					switch(topping) 
					{
				
					case 1:
						num13.addTopping(Topping.Fudge);
					
						break;
					case 2:
						num13.addTopping(Topping.Caramel);

						break;
					case 3:
						num13.addTopping(Topping.Bannana);
					
						break;
					case 4:
						num13.addTopping(Topping.Strawberry);
					
						break;
					case 5:
						num13.addTopping(Topping.Nuts);
					
						break;
					}
					
					System.out.println("Add another topping?(y/n)");
					anotherTopping = sc.next();
				}while(anotherTopping.equalsIgnoreCase("y"));
			}

			
			order.add(num13);
			System.out.println(num13.toString());
		
		System.out.println("Would you like to add another item?(y/n)");
		anotherItem = sc.next();
		System.out.println();
		}
	}while((orderNumber >= 1) && (orderNumber <= 13) && (anotherItem.equalsIgnoreCase("y")));		
		
		System.out.println("Have a nice day!");
		
	}
}
	
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
/** public double getPayment(double newPayment)
	{
		
	return;
	}
	
	public String calculateTips()
	{
	
	return;
	}
	
	public String printReceipt()
	{
		
	return;
	}
**/


