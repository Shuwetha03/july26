package com.july26tha;

public class Card {

	private int rank;
	private int suit;
	private final static String[] cardSuit = {"Clubs", "Spades", "Diamonds", "Hearts"};
	private final static String[] cardRank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card() {
		
	}

	public Card(int rank, int suit) {
		setRank(rank);
		setSuit(suit);
	}

	protected int getRank() {
		return rank;
	}

	protected void setRank(int rank) {
		if((rank > 0) || (rank < 14)) {
			this.rank = rank;
		}
		else {
			System.out.println("Invalid Rank");
		}
	}

	protected int getSuit() {
		return suit;
	}

	protected void setSuit(int suit) {
		if((suit > 0) || (suit < 5)) {
			this.suit = suit;
		}
		else {
			System.out.println("Invalid Suit");
		}
	}

	@Override
	public String toString() {
		return cardRank[rank - 1] + " of " + cardSuit[suit - 1];
	}
}
