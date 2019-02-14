/**
 * Represents a player with a stash of money to bet, and a hand of cards
 * @author Mikael Hinton
 */

import java.util.*;

public class Player{

	// bet
	public int bet = 0;
	
	// a String that holds the player’s name, or the word Dealer
	private String name;
	
	// an Int that holds the money the player can bet with.  
	//	It must be a positive number
	private int stash;
	
	// an ArrayList of cards that have been dealt to the player
	private ArrayList<Card> h = new ArrayList<Card>();
	
	// scanner
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Default constructor
	 */
	public Player()
	{
		name = "UNKNOWN";
		stash = 0;
	}
	
	/**
	 * Constructor
	 * @param newName
	 * @param newStash
	 */
	public Player(String newName, int newStash)
	{
		name = newName;
		stash = newStash;
	}
	
	/**
	 * getter for card
	 * @param i
	 * @return
	 */
	protected Card getCard(int i)
	{
		return h.get(i);
	}
	
	/**
	 * getter for name
	 * @return
	 */
	protected String getName()
	{
		return name;
	}

	/**
	 * getter for stash
	 * @return
	 */
	protected int getStash()
	{
		return stash;
	}

	/**
	 * setter for stash
	 * @param newStash
	 */
	protected void setStash(int newStash)
	{
		stash = newStash;
	}
	
	/**
	 * Setter for name
	 * @param newName
	 */
	protected void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Get the bet for this round from the player.  
	 * Return the Int of the bet, or -1 if the bet is 			
	 * invalid (they bet more than they have, or bet a – number)
	 * @return
	 */
	public int bet()
	{
		
		System.out.println("\nPlease enter your bet:");
		bet = sc.nextInt();
		
		if(bet > stash || bet < 0 )
		{
			return -1;
		}
		else
		{
			stash = stash - bet;
			return bet;
		}
	}
	
	/**
	 * Give up this hand before the hand is done being dealt
	 */
	public void fold()
	{
		h.removeAll(h);
	}

	/**
	 * Returns the size of the hand
	 * @return
	 */
	protected int getHandSize() 
	{
		return h.size();
 	}	
	
	/**
	 * 	Return an Integer with a score based on the hand
	 * @return
	 */
	public int scoreHand()
	{
		if(isFlush() && isStraight())
		{
			return 9;
		}
		else if(is4OfAKind())
		{
			return 8;
		}
		else if(isFullHouse())
		{
			return 7;
		}
		else if(isFlush())
		{
			return 6;
		}
		else if(isStraight())
		{
			return 5;
		}
		else if(is3OfAKind())
		{
			return 4;
		}
		else if(is2Pair())
		{
			return 3;
		}
		else if(is1Pair())
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}

	/**
	 * Detects whether the hand contains a flush
	 * @return
	 */
	protected boolean isFlush()
	{		
		if(h.size() != 5)
		{
			return false;
		}
		sortBySuit();
		
		return h.get(0).getSuit() == h.get(4).getSuit();	
	}

	/**
	 * Detects whether the hand contains a straight
	 * @return
	 */
	protected boolean isStraight()
	{
		int i, testValue;
		
		if(h.size() != 5)
		{
			return false;
		}
		
		sortByValue();
		
		//Checks if hand has an Ace
		if(h.get(4).getValue() == 14)
		{
			//Checks Straight using an ace
			boolean a = h.get(0).getValue() == 2 && h.get(1).getValue() == 3 &&
						h.get(2).getValue() == 4 && h.get(3).getValue() == 5;
			
			boolean b = h.get(0).getValue() == 10 && h.get(1).getValue() == 11 &&
						h.get(2).getValue() == 12 && h.get(3).getValue() == 13;
			
			return (a || b);
		}
		else
		{
			//General cases to check
			testValue = h.get(0).getValue() + 1;
			
			for(i = 1; i < 5; i++)
			{
				if(h.get(i).getValue() != testValue)
				{
					return false;
				}
			testValue++;
			}
		return true;
		}
	}

	/**
	 * Detects whether the hand contains a four of a kind
	 * @return
	 */
	protected boolean is4OfAKind()
	{
		boolean a1, a2;
		
		if(h.size() != 5)
		{
			return false;
		}
		
		sortByValue();
		
		//Check for 4 cards of the same rank + higher ranked unmatched card
		a1 = h.get(0).getValue() == h.get(1).getValue() &&
			 h.get(1).getValue() == h.get(2).getValue() &&
			 h.get(2).getValue() == h.get(3).getValue();
		
		// Check for lower ranked unmatched card  + cards fo the same rank
		a2 = h.get(1).getValue() == h.get(2).getValue() &&
			 h.get(2).getValue() == h.get(3).getValue() &&
			 h.get(3).getValue() == h.get(4).getValue();
		
		return a1 || a2;
	}
	
	/**
	 * Detects whether the hand contains a full house
	 * @return
	 */
	protected boolean isFullHouse()
	{		
		boolean a1, a2;
		
		if(h.size() != 5)
		{
			return false;
		}

		sortByValue();
		
		//Checks for xxxyy
		a1 = h.get(0).getValue() == h.get(1).getValue() &&
		     h.get(1).getValue() == h.get(2).getValue() &&
		     h.get(3).getValue() == h.get(4).getValue();
		//Checks for xxyyy
		a2 = h.get(0).getValue() == h.get(1).getValue() &&
			 h.get(2).getValue() == h.get(3).getValue() &&
			 h.get(3).getValue() == h.get(4).getValue();
		
		return a1 || a2;
	}

	/**
	 * Detects whether the hand contains a 3 of a kind
	 * @return
	 */
	protected boolean is3OfAKind()
	{
		boolean a1, a2, a3;
		
		if(h.size() != 5)
		{
			return false;
		}
		
		sortByValue();
		//Check for xxxab
		a1 = h.get(0).getValue() == h.get(1).getValue() &&
			 h.get(1).getValue() == h.get(2).getValue() &&
			 h.get(3).getValue() != h.get(0).getValue() &&
			 h.get(4).getValue() != h.get(0).getValue() &&
			 h.get(3).getValue() != h.get(4).getValue();
		//Check for axxxb
		a2 = h.get(1).getValue() == h.get(2).getValue() &&
			 h.get(2).getValue() == h.get(3).getValue() &&
			 h.get(0).getValue() != h.get(1).getValue() &&
			 h.get(4).getValue() != h.get(1).getValue() &&
			 h.get(0).getValue() != h.get(4).getValue();
		//Check for abxxx
		a3 = h.get(2).getValue() == h.get(3).getValue() &&
			 h.get(3).getValue() == h.get(4).getValue() &&
			 h.get(0).getValue() != h.get(2).getValue() &&
			 h.get(1).getValue() != h.get(2).getValue() &&
			 h.get(0).getValue() != h.get(1).getValue();
		
		return a1 || a2 || a3;	
	}

	/**
	 * Detects whether the hand contains 2 pair
	 * @return
	 */
	protected boolean is2Pair()
	{		
		boolean a1, a2, a3;
		
		if(h.size() != 5)
		{
			return false;
		}
		
		if(is4OfAKind() || isFullHouse() || is3OfAKind())
		{
			return false;
		}
		
		sortByValue();
		
		//Check for aabbx
		a1 = h.get(0).getValue() == h.get(1).getValue() &&
			 h.get(2).getValue() == h.get(3).getValue();
		//Check for aaxbb
		a2 = h.get(0).getValue() == h.get(1).getValue() &&
			 h.get(3).getValue() == h.get(4).getValue();
		///Check for xaabb
		a3 = h.get(1).getValue() == h.get(2).getValue() &&
			 h.get(3).getValue() == h.get(4).getValue();
		
		return a1 || a2 || a3;

	}

	/**
	 * Detects whether the hand contains 1 pair
	 * @return
	 */
	protected boolean is1Pair()
	{		
		boolean a1, a2, a3, a4;
		
		if(h.size() != 5)
		{
			return false;
		}
		
		if( is4OfAKind() || isFullHouse() || is3OfAKind() || is2Pair())
		{
			return false;
		}

		sortByValue();
		
		//Check for aaxy
		a1 = h.get(0).getValue() == h.get(1).getValue();
		
		//Check for xaayz
		a2 = h.get(1).getValue() == h.get(2).getValue();
		
		//Check for xaayz
		a3 = h.get(2).getValue() == h.get(3).getValue();

		//Check for xyzaa
		a4 = h.get(3).getValue() == h.get(4).getValue();

		return a1 || a2 || a3 || a4;	
	}
	
	/**
	 * Return a String showing the player’s name and the cards in 
	 * 		their hand, along with their stash of money
	 */
	public String toString()
	{
		return "Name: " + name + "\nHand: " + h + "\nStash: " + stash;
	}

	/**
	 * Sorts the value of the cards in ascending order
	 */
	public void sortByValue()
	{		
		int i, j, min_j;
		
		for(i = 0; i < h.size(); i++)
		{
			min_j = i;
			
			for(j = i + 1; j < h.size(); j++)
			{
				if(h.get(j).getValue() < h.get(min_j).getValue())
				{
					min_j = j;
				}
			}	
		Card temp = h.get(i);
		h.set(i, h.get(i));
		h.set(min_j, temp);
		}
	}

	/**
	 * Sorts the Suit of the cards in ascending order
	 */
	public void sortBySuit()
	{	
		int i, j, min_j;
		
		for(i = 0; i < h.size(); i++)
		{
			min_j = i;
			
			for(j = i + 1; j < h.size(); j++)
			{
				if(h.get(j).getSuit().ordinal() < h.get(min_j).getSuit().ordinal())
				{
					min_j = j;
				}
			}
		Card temp = h.get(i);
		h.set(i, h.get(1));
		h.set(min_j, temp);
		}

	}

	/**
	 * Adds a card into a hand
	 * @param cardToDeal
	 */
	public void addToHand(Card cardToDeal)
	{	
		h.add(cardToDeal);
	}
}//EOF
