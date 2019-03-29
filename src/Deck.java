import java.util.*;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		    for(int i=1; i<13; i++) {
		    	Card.CardRank rank = Card.CardRank.values()[i];
		    	
		        for(int j=0; j<=4; j++) {
		            Card card = new Card(rank, Card.Suit.values()[j]);
		            this.deck.add(card);
		        }
		    }
		    
		Collections.shuffle(deck);
		Iterator<Card> cardIterator = deck.iterator();
	    while (cardIterator.hasNext())
	    {
	      Card aCard = (Card) cardIterator.next();
	      System.out.println(aCard.getCardRank() + " of " + aCard.getSuit());
	    }
		
	}


	
}