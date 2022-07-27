package com.july26tha;


public class Player {

	private String name;
	private int coins;
	private String chosenCard;
	private String orientation;
	
	public Player() {
	
	}

	public Player(String name, int coins, String chosenCard, String orientation) {
		this.name = name;
		this.coins = coins;
		this.chosenCard = chosenCard;
		this.orientation = orientation;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getCoins() {
		return coins;
	}

	protected void setCoins(int coins) {
		this.coins = coins;
	}

	protected String getChosenCard() {
		return chosenCard;
	}

	protected void setChosenCard(String chosenCard) {
		this.chosenCard = chosenCard;
	}

	protected String getOrientation() {
		return orientation;
	}

	protected void setChosenOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	public int betCoins(int coins) {
		if(coins > this.coins) {
			System.out.println("Coins are in sufficient");
		}
		this.coins -= coins;
		return coins;
	}
	
	public void addWinnings(int coins) {
		this.coins += coins;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", coins=" + coins + ", chosenCard=" + chosenCard + ",Orientation="
				+ orientation + "]";
	}
}