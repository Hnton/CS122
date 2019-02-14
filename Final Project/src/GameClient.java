/**
 * Game Client
 * @author Mikael Hinton
 */
import java.util.Scanner;

public class GameClient {
	
	//Player name
	public static String playerName;
	
	//Scanner
	private static Scanner sc;
	
	//Main method
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		System.out.println("\tWelcome to 5 Card Stud!\n");
		System.out.println("Enter players name: ");
		playerName = sc.nextLine();
		
		Player gamePlayer = new Player(playerName, 50);
		Dealer gameDealer = new Dealer("Dealer", 50 * 5);
		
		
		Table playTable = new Table(gamePlayer, gameDealer);
		playTable.play();
		
	}

}
