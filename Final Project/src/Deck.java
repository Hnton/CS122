/**
 * Represents a deck of 52 playing cards
 * @author Mikael Hinton
 * 
 */

import java.util.*;

public class Deck{

	// An ArrayList of Card, with all 52 card put in the
	// 		list when the deck is created
	private ArrayList<Card> cards = new ArrayList<Card>();

	
	public Deck() {
		// Clubs
		cards.add(new Card(2, Suit.Clubs, "Two"));
		cards.add(new Card(3, Suit.Clubs, "Three"));
		cards.add(new Card(4, Suit.Clubs, "Four"));
		cards.add(new Card(5, Suit.Clubs, "Five"));
		cards.add(new Card(6, Suit.Clubs, "Six"));
		cards.add(new Card(7, Suit.Clubs, "Seven"));
		cards.add(new Card(8, Suit.Clubs, "Eight"));
		cards.add(new Card(9, Suit.Clubs, "Nine"));
		cards.add(new Card(10, Suit.Clubs, "Ten"));
		cards.add(new Card(11, Suit.Clubs, "Jack"));
		cards.add(new Card(12, Suit.Clubs, "Queen"));
		cards.add(new Card(13, Suit.Clubs, "King"));
		cards.add(new Card(14, Suit.Clubs, "Ace"));
		// Diamonds
		cards.add(new Card(2, Suit.Diamonds, "Two"));
		cards.add(new Card(3, Suit.Diamonds, "Three"));
		cards.add(new Card(4, Suit.Diamonds, "Four"));
		cards.add(new Card(5, Suit.Diamonds, "Five"));
		cards.add(new Card(6, Suit.Diamonds, "Six"));
		cards.add(new Card(7, Suit.Diamonds, "Seven"));
		cards.add(new Card(8, Suit.Diamonds, "Eight"));
		cards.add(new Card(9, Suit.Diamonds, "Nine"));
		cards.add(new Card(10, Suit.Diamonds, "Ten"));
		cards.add(new Card(11, Suit.Diamonds, "Jack"));
		cards.add(new Card(12, Suit.Diamonds, "Queen"));
		cards.add(new Card(13, Suit.Diamonds, "King"));
		cards.add(new Card(14, Suit.Diamonds, "Ace"));
		// Hearts
		cards.add(new Card(2, Suit.Hearts, "Two"));
		cards.add(new Card(3, Suit.Hearts, "Three"));
		cards.add(new Card(4, Suit.Hearts, "Four"));
		cards.add(new Card(5, Suit.Hearts, "Five"));
		cards.add(new Card(6, Suit.Hearts, "Six"));
		cards.add(new Card(7, Suit.Hearts, "Seven"));
		cards.add(new Card(8, Suit.Hearts, "Eight"));
		cards.add(new Card(9, Suit.Hearts, "Nine"));
		cards.add(new Card(10, Suit.Hearts, "Ten"));
		cards.add(new Card(11, Suit.Hearts, "Jack"));
		cards.add(new Card(12, Suit.Hearts, "Queen"));
		cards.add(new Card(13, Suit.Hearts, "King"));
		cards.add(new Card(14, Suit.Hearts, "Ace"));
		// Spades
		cards.add(new Card(2, Suit.Spades, "Two"));
		cards.add(new Card(3, Suit.Spades, "Three"));
		cards.add(new Card(4, Suit.Spades, "Four"));
		cards.add(new Card(5, Suit.Spades, "Five"));
		cards.add(new Card(6, Suit.Spades, "Six"));
		cards.add(new Card(7, Suit.Spades, "Seven"));
		cards.add(new Card(8, Suit.Spades, "Eight"));
		cards.add(new Card(9, Suit.Spades, "Nine"));
		cards.add(new Card(10, Suit.Spades, "Ten"));
		cards.add(new Card(11, Suit.Spades, "Jack"));
		cards.add(new Card(12, Suit.Spades, "Queen"));
		cards.add(new Card(13, Suit.Spades, "King"));
		cards.add(new Card(14, Suit.Spades, "Ace"));
		
		shuffle();
	}
	
	// A method to shuffle the ArrayList (use Collections.shuffle),
	//		call this as part of the constructor
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	/**
	 * A method to remove a Card from the deck and return it
	 * @return
	 */
	public Card deal()
	{
		Card temp = cards.remove(0);
		return temp;
	}
	
	/**
	 * toString method that prints out the cards
	 */
	public String toString()
	{
		return "" + cards + "\n";
	}
}//EOF
