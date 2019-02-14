/**
 * Client tester
 * @author Mikael Hinton
 *
 */

public class ClientTester {

	public static void main(String[] args) {

					//CARD CLASS
		
		// Show method in Card class
		System.out.println("\tShow method in Card class");
		System.out.println("Correct output: Five Of Spades ");
		Card show = new Card(5, Suit.Spades, "Five");
		System.out.print("Actual output:" ); 
		show.show();
		System.out.println();
		
		// Hide method in Card class
		System.out.println("\tHide method in Card class");
		System.out.println("Correct output: ");
		Card hide = new Card(2, Suit.Clubs, "Two");
		System.out.println("Actual output: ");
		hide.hide();
		System.out.println();
		
		// toString method in Card class
		System.out.println("\ttoString method in Card class");
		System.out.println("Correct output: Ace Of Diamonds");
		Card toString = new Card(14, Suit.Diamonds, "Ace");
		System.out.print("Actual output: ");
		toString.show();
		toString.toString();
		System.out.println();

		// compareTo method in Card class
		System.out.println("\tcompareTo method in Card class");
		Card compCard = new Card(2, Suit.Diamonds, "Two");
		System.out.println("Correct output: 0");
		System.out.print("Actual output: ");
		Card card = new Card(2, Suit.Diamonds, "Two");
		System.out.println(card.compareTo(compCard));
		System.out.println();
		
					//DECK CLASS
		
		// Deck method in Deck class
		System.out.println("\tDeck method in Deck class");
		Deck deck = new Deck();
		System.out.println("Print full deck: " + deck);
		System.out.println();
		
		// Shuffle method in Deck class
		System.out.println("\tShuffle method in Deck class");
		Deck shuffleDeck = new Deck();
		System.out.println("Deck before shuffle: " + shuffleDeck);
		shuffleDeck.shuffle();
		System.out.println("Deck after shuffle: " + shuffleDeck);
		System.out.println();
		
		// Deal method in Deck class
		System.out.println("\tDeal method in Deck class");
		Deck deal = new Deck();
		System.out.println("Correct output: Two Of Clubs");
		System.out.print("Actual output: ");
		deal.deal();
		System.out.println();
		
		// toString method in Deck class
		System.out.println("\ttoString method in Deck class");
		Deck toStringD = new Deck();
		System.out.println("Correct output: Prints out whole deck");
		System.out.println("Actual output: " + toStringD.toString());
		System.out.println();
		
					//DEALER CLASS
		
		// dealToPlayer method in Dealer class
		System.out.println("\tdealToPlayer method in Dealer class");
		System.out.println("Correct output: Two Of Clubs");
		Dealer player1 = new Dealer(null, 0);
		System.out.print("Actual output: ");
		player1.dealToPlayer(player1);
		System.out.println();
		
					//PLAYER CLASS
		
		// Bet method in Player class
		System.out.println("\tBet method in Player class");
		System.out.println("Correct output: 100");
		System.out.print("Actual output: ");
		Player player9 = new Player();
		player9.setStash(1000);
		System.out.println(player1.bet());
		System.out.println();
		
		// fold method in Player class
		System.out.println("\tfold method in Player class");
		System.out.println("Correct output: ");
		Player folding = new Player("Carl", 100);
		System.out.println(folding);
		folding.fold();
		System.out.println(folding);
		System.out.println();
		
		// scoreHand method in Player class
		System.out.println("scoreHand method in Player class");
		System.out.println("Correct output: 5");
		Player playerM = new Player("Mikael", 111);
		Card card1 = new Card(2, Suit.Diamonds, "Two");
		Card card2 = new Card(3, Suit.Diamonds, "Three");
		Card card3 = new Card(5, Suit.Diamonds, "Five");
		Card card4 = new Card(6, Suit.Diamonds, "Six");
		Card card5 = new Card(7, Suit.Diamonds, "Seven");
		playerM.addToHand(card1);
		playerM.addToHand(card2);
		playerM.addToHand(card3);
		playerM.addToHand(card4);
		playerM.addToHand(card5);
		System.out.print("Actual output: ");
		System.out.println(playerM.scoreHand());
		System.out.println();

		// toString method in Player class
		System.out.println("\ttoString method in Player class");
		System.out.println("Correct output: \nName: Gary\nHand: [Two of Diamonds, Three of Diamonds, Four of Diamonds, Five of Diamonds, Six of Diamonds]\nStash: 1000\n");
		System.out.println("Actual output: \n" + playerM.toString());
		System.out.println();

		// sortByValue method in Player class
		System.out.println("\tsortByValue method in Player class");
		System.out.println("Correct output: \nName: Mikael\nHand: [Two of Diamonds, Three of Diamonds, Five of Diamonds, Six of Diamonds, Seven of Diamonds]\nStash: 111");
		playerM.sortByValue();
		System.out.println(playerM);
		System.out.println();
		playerM.fold();

		// sortBySuit method in Player class
		System.out.println("\tsortBySuit method in Player class");
		System.out.println("Correct output: ");
		Player playerSuit= new Player("Suit", 8111);
		Card card16 = new Card(2, Suit.Diamonds, "Two");
		Card card17 = new Card(3, Suit.Hearts, "Three");
		Card card18 = new Card(9, Suit.Diamonds, "Nine");
		Card card19 = new Card(6, Suit.Spades, "Six");
		Card card20 = new Card(7, Suit.Spades, "Seven");
		playerSuit.addToHand(card16);
		playerSuit.addToHand(card17);
		playerSuit.addToHand(card18);
		playerSuit.addToHand(card19);
		playerSuit.addToHand(card20);
		playerSuit.sortBySuit();
		System.out.println(playerSuit);
		System.out.println();
		playerSuit.fold();
		System.out.println();
		
				//TABLE CLASS
		
		// declareWinner method in Table Class
		System.out.println("\tdeclareWinner method in Table class");
		System.out.println("Correct output: Dealer");
		Player player4 = new Player("Joe", 100);
		Dealer dealer4 = new Dealer("Dealer", 10000);
		Card card6 = new Card(2, Suit.Diamonds, "Two");
		Card card7 = new Card(3, Suit.Diamonds, "Three");
		Card card8 = new Card(5, Suit.Diamonds, "Five");
		Card card9 = new Card(6, Suit.Diamonds, "Six");
		Card card10 = new Card(7, Suit.Diamonds, "Seven");
		player4.addToHand(card6);
		player4.addToHand(card7);
		player4.addToHand(card8);
		player4.addToHand(card9);
		player4.addToHand(card10);
		Card card11 = new Card(2, Suit.Clubs, "Two");
		Card card12 = new Card(3, Suit.Diamonds, "Three");
		Card card13 = new Card(4, Suit.Spades, "Four");
		Card card14 = new Card(5, Suit.Diamonds, "Five");
		Card card15 = new Card(6, Suit.Hearts, "Six");
		dealer4.addToHand(card11);
		dealer4.addToHand(card12);
		dealer4.addToHand(card13);
		dealer4.addToHand(card14);
		dealer4.addToHand(card15);
		Table table = new Table(player4, dealer4);
		System.out.println(table.declareWinner());
		System.out.println();
		
		// show method in Table Class
		System.out.println("\tshow method in Table class");
		System.out.println("Correct output: \nTwo Of Diamonds");
		Player playerHide = new Player("Show", 10000);
		playerHide.addToHand(card11);
		playerHide.addToHand(card12);
		playerHide.addToHand(card13);
		playerHide.addToHand(card14);
		playerHide.addToHand(card15);
		card11.hide();
		System.out.println("Actual output:");
		table.show();
		System.out.println();
}

	
}//EOF
