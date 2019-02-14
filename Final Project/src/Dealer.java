/**
 * Represents the dealer in a Poker game
 * @author Mikael Hinton
 *
 */
public class Dealer extends Player{

	// A deck of cards
	Deck deck = new Deck();

	/**
	 * Default Constructor
	 */
	public Dealer(String dealerName, int dealerStash)
	{
		super(dealerName, dealerStash);
	}

	/**
	 * A method to get a card from the deck and put it in 
	 * the player’s hand
	 * @param player
	 */
	public void dealToPlayer(Player player)
	{
		Card cardToDeal = deck.deal();
		player.addToHand(cardToDeal);
	}	
}//EOF
