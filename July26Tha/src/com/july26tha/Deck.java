package com.july26tha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
	
	List<Card> cards;
	
	public Deck(){
		setCards();
	}
	
	protected List<Card> getCards() {
		return cards;
	}

	protected void setCards() {
		List<Card> addCards = new ArrayList<Card>();
		for(int i = 1; i < 14; i++) {
			for(int j = 1; j < 5; j++) {
				addCards.add(new Card(i,j));
			}
		}
		this.cards = addCards;
	}

	public List<Card> shuffle(){
		List<Card> shuffledCards = new ArrayList<>(getCards());
		Collections.shuffle(shuffledCards);
		return shuffledCards;
	}
	
	public Card deal(List<Card> cards) {
		return cards.remove(0);
	}
}
