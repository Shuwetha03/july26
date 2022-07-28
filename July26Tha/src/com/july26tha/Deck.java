package com.july26tha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
	
	public String deal(Map<String, Player> playerDetails) {
		List<Card> list = shuffle();
		String host = "";
			Card in = list.remove(0);
			Card out = list.remove(0);
			for(Map.Entry<String, Player> element : playerDetails.entrySet()) {
				if(element.getValue() == null) {
					host = element.getKey();
				}
				else if((in.equals(element.getValue().getChosenCard()) && element.getValue().getOrientation().equalsIgnoreCase("IN"))
						|| (out.equals(element.getValue().getChosenCard()) && element.getValue().getOrientation().equalsIgnoreCase("OUT"))) {
					return element.getKey();
				}
			}
			return host;
	}
}
