

/**
 * Represents a card in a 52 card deck of cards
 * @author Mikael Hinton
 *
 */
public class Card{

	// Represents a point value of the card
	private int value;
	
	// Represents one of the four suits in a standard 52 card
	//		deck. This will be done with Enumeration.
	private Enum<Suit> suit;
	
	// Used to show or hide the first card dealt
	private boolean visible = true;
	
	// Will either be the number of the card, or the actual name
	//		if it is a face card.
	private String name;
	
	/**
	 * Default constructor
	 */
	protected Card()
	{
		value = 0;
		suit = Suit.Hearts;
		name = "Ace";
	}
	
	/**
	 * Constructor
	 * @param newValue
	 * @param newSuit
	 * @param newName
	 */
	protected Card(int newValue, Suit newSuit, String newName) 
	{
		value = newValue;
		suit = newSuit;
		name = newName;
	}

	/**
	 * getter for value
	 * @return
	 */
	protected int getValue()
	{
		return value;
	}
	
	/**
	 * setter for value
	 * @param newValue
	 */
	protected void setValue(int newValue)
	{
		value = newValue;
	}
	/**
	 * getter for suit
	 * @return
	 */
	protected Enum<Suit> getSuit()
	{
		return suit;
	}
	
	/**
	 * setter for suit
	 * @param newSuit
	 */
	protected void setSuit(Suit newSuit)
	{
		suit = newSuit;
	}
	
	/**
	 * Changes the card to show by boolean
	 * @return 
	 */
	public void show()
	{
		visible = true;
	}
	
	/**
	 * Changes the card to hide by boolean
	 * @return 
	 */
	public void hide()
	{
		visible = false;
	}
		
	/**
	 * Represents the card. It should output the name and suit of the
	 * 		card.
	 */
	public String toString()
	{
		if(visible == false)
		{
			return "Bicycle";
		}
		else
		{
		return name + " Of " + suit;
		}
	}
	
	/**
	 * CompareTo method
	 * @param card
	 * @return
	 */
	public int compareTo(Card card)
	{
		return value > card.value ? 1 : value < card.value ? -1 : 0;
		
	}
}//EOF
