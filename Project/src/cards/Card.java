package cards;

/*-----------------------------------------------------------------------------
 *Ranks:
 *	11 = J
 *	12 = Q
 *	13 = K
 *	1 = A
 *
 *Suits:
 *	1 = H
 *	2 = D
 *	3 = C
 *	4 = S
 ------------------------------------------------------------------------------*/

public class Card {
	public int rank;
	public int suit;
	
	Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	//Translates rank integer to string
	private String rankToString(int rank){
		if(rank == 11)
			return "J";
		if(rank == 12)
			return "Q";
		if(rank == 13)
			return "K";
		if(rank == 1)
			return "A";
		else
			return String.valueOf(rank);
	}
	
	//Translates suit integer to string
	private String suitToString(int suit){
		if(suit == 1)
			return "H";
		if(suit == 2)
			return "D";
		if(suit == 3)
			return "C";
		if(suit == 4)
			return "S";
		return String.valueOf(suit);
	}

	//toString method for card object
	@Override
	public String toString() {
		String rank = rankToString(this.rank);
		String suit = suitToString(this.suit);
		return rank + suit;
	}
}
