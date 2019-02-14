import java.util.Scanner;

/**
 * Manage players and bets, and play the game
 * @author Mikael Hinton
 *
 */
public class Table{
	
	// An Int that holds the bets from both players for each hand. 
	//		Will initially be 0
	private int pot = 0;
	
	// A two element array of Player objects. 
	//		One is the dealer, and the other is the player
	private Player gamePlayers[] = new Player[2];
	
	// scanner
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Constructor
	 */
	public Table(Player player, Dealer dealer)
	{
		gamePlayers[0] = dealer;
		gamePlayers[1] = player;
	}

	/**
	 * A method to use each player’s scoreHand() results to pick a winner.  
	 * @return
	 */	
	public Player declareWinner()
	{
		// also have to do if a tie
		
		if(gamePlayers[0].scoreHand() < gamePlayers[1].scoreHand())
		{
			return gamePlayers[1];
		}
		else if(gamePlayers[0].scoreHand() > gamePlayers[1].scoreHand())
		{
			return gamePlayers[0];
		}
		else if(gamePlayers[0].scoreHand() == gamePlayers[1].scoreHand())
		{
			return gamePlayers[0];
		}
		else
		{
			return gamePlayers[0];
		}
		//returns a player after comparing all player's scoreHand()
	}

	/**
	 * A method to show all cards face up on the table. 
	 *  Used after the last bet
	 */
	public void show()
	{
		gamePlayers[0].getCard(0).show();
	}
	
	/**
	 * A method to ask the player for a bet,
	 *  and if valid, get the same bet from the dealer
	 */
	public void getBets()
	{
		if(gamePlayers[1].bet >= 0)
		{
			gamePlayers[1].bet();
			pot += gamePlayers[1].bet;
		}
		else
		{
			System.out.println("Bet is invalid, Please enter another bet!");
		}
	}
	
	/**
	 * A method to actually play the game 
	 */
	public void play()
	{	
		char playAgain = 0;
	do
	{
		
		//player and dealer objects
		Player player1 = gamePlayers[1];
		Dealer dealer1 = (Dealer) gamePlayers[0];
		
		if(player1.getStash() > 0)
		{
			
			//deals the player and dealer 2 cards and  of the dealers being hidden
			dealer1.dealToPlayer(player1);
			dealer1.dealToPlayer(dealer1);
			dealer1.dealToPlayer(player1);
			dealer1.dealToPlayer(dealer1);
			dealer1.getCard(0).hide();
			
			forLoop:
			for(int i = 0; i < 3; i++)
			{
				
				//prints out the dealer and player objects
				System.out.println();
				System.out.println(player1.toString());
				System.out.println();
				System.out.println(dealer1.toString());
				System.out.println();
				
				// asks user if they want to bet, check or fold
				System.out.println("Would you like to Bet(1), Check(2), Fold(3)?");
				System.out.println("\tPlease enter 1, 2, or 3");
				int action = sc.nextInt();
				
				// makes sure action is between 1 and 3
				if(action >= 1 && action <= 3)
				{	
					//bet
					if(action == 1)
					{
						getBets();
						System.out.println("\n\t\tBet");
						System.out.println("---------------------------------------");
						
					}
						//check
					if(action == 2)
					{
						System.out.println("\n\t\tCheck");
						System.out.println("---------------------------------------");
			
					}
						//Fold
					if(action == 3)
					{
						player1.fold();
						System.out.println("\n\t\tFold");
						System.out.println("---------------------------------------");
						break forLoop;
					}	
					dealer1.dealToPlayer(player1);
					dealer1.dealToPlayer(dealer1);	
				}
				else
				{
					System.out.println("\nEnter a 1 for bet, 2 for check, 3 for fold");
					System.out.println("--------------------------------------------");
				}
			}	
			
			System.out.println("\n\t\tFinal cards are:");
			System.out.println("------------------------------------------------\n");
			
			// prints out the player and dealer with all cards showing
			System.out.println(player1.toString());
			System.out.println();
			dealer1.getCard(0).show();
			System.out.println(dealer1.toString());
		
			// scores for player and dealer
			System.out.println("\nThe players score is " + player1.scoreHand());
			System.out.println("The dealers score is " + dealer1.scoreHand());
		
			System.out.println("\nThe winner is " + declareWinner().getName() + "\n");
			
			// if winner is player it takes off dealer stash and other way around
			if(declareWinner().getName() == GameClient.playerName)
			{
				player1.setStash(player1.getStash() + pot + pot);
				dealer1.setStash(dealer1.getStash() - pot);
			
			}
			else if(declareWinner().getName() == "Dealer")
			{
				dealer1.setStash(dealer1.getStash() + pot);
			}
			
			// play again?
			System.out.println("Would you like to play again? y/n");
			playAgain = sc.next().charAt(0);
		}
		
		// if player doesnt have enough stash to play again
		else
		{
			System.out.println("\n" + player1.getName() + " does not have enough stash!");
			break;
		}
		
		//clears cards and pot
		player1.fold();
		dealer1.fold();
		pot = 0;
	// to see if player wants to keep playing
	}while(playAgain == 'y' || playAgain == 'Y');
	System.out.println("\n--------------------------------------");
	System.out.println("\nCome back and play 5 Card Stud soon!");
	System.out.println("--------------------------------------");
	}
}//EOF
