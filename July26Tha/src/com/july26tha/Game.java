package com.july26tha;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Deck deck = new Deck();

		Scanner input = new Scanner(System.in);	

		System.out.println("-------------------------------------------");
		System.out.println("          MANKATHA GAME      ");
		System.out.println("-------------------------------------------");
		System.out.println("Number of PLAYERS ");

		int players = input.nextInt();

		Random random = new Random();

		String host = String.valueOf(random.nextInt(1,players));

		boolean forward = true;

		Map<String,Player> playerDetails = new LinkedHashMap<String,Player>();

		int totalBet = 0;

		while(forward) {

			for(int player=1; player<=players; player++) {
				
				String name = "";
				
				 System.out.println("Player "+ player +" Enter name:  ");
				 name = input.nextLine();
				
				if(host != name){
					
					System.out.println("Player "+ name +"\n Enter your card (eg : 1 3) ");

					int rank = input.nextInt();
					int suit = input.nextInt();

					Card c = new Card(rank,suit);

					System.out.println("Player "+ name +"   Bet amount ??");
					int bet = input.nextInt();

					System.out.println("In Or Out ?? ");
					String chosenOrientation = input.next();

					Player p = new Player(name,bet,c,chosenOrientation);
					playerDetails.put(name, p);
					totalBet += p.getCoins();
				}


				else 
					playerDetails.put(name, null);

			}

			host = deck.deal(playerDetails);

			System.out.println("Player " + deck.deal(playerDetails) +" Is The Winner \n Bet amount won :  "+totalBet);
			System.out.println("You Are The New Host ");
			System.out.println("Continue(y/n)");
			host = deck.deal(playerDetails);
			if(!input.next().equalsIgnoreCase("Y")) {
				forward = false;
				System.out.println("Thank You for Playing");
			}	
		}
	}

}

