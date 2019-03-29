public class Card {
	private Suit suit;
	private CardRank cardRank;
	
public enum Suit {
	   Clubs,
	   Diamonds,
	   Hearts,
	   Spades
}
/*---*/
/* Enum for Card Rankings/Number values */
public enum CardRank {
	Ace(1),
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13);
	
	private int cardRank;
	
	private CardRank (int rank) {
		this.cardRank = rank;
	}
	
	public int getCardRank() {
		return cardRank;
	}
} /* Enum for Card Rankings/Number ends */

/*Constructors*/
	public Card (CardRank cardRank, Suit suit) {
		this.cardRank = cardRank;
		this.suit = suit;
	}
	  public Suit getSuit()
	  {
	    return suit;
	  }
	 
	  public void setSuit(Suit suit)
	  {
		  this.suit = suit;
	  }
	 
	  public CardRank getCardRank()
	  {
	    return cardRank;
	  }
	 
	  public void setCardRank(CardRank cardRank)
	  {
	    this.cardRank = cardRank;
	  }
	  
	  public String toString() 
	  {
		 return cardRank+ " of "+suit;
	  }
	


}	