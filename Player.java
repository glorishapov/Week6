package com.promineotech;

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

//New class called Player
public class Player {
	
	//Creating a new list of Card to contain the cards in the player's hand
	List<Card> hand = new ArrayList<Card>(); 
	int score; 
	String name = "";
	
	//Prints Player and hand information
	public void describe() {
		
		System.out.println(name);
		System.out.println("Score: " + score);
		System.out.println(name + "'s Cards: ");
		
		//Printing the info of every card in the hand using an enhanced for loop
		for (Card card : hand) {
			card.describe();
		}
	}
	
	
	//Removes and returns the top card of the Player's hand
	public Card flip() {
		
		int index = 0; 
		
		//Returns the top card in the hand
		Card flippedCard = hand.get(0);
		
		//If the card is null, the card has already been pulled.
		//Moving through the deck until the next card is reached using an if statement.
		if(flippedCard == null) {
			index = index++;
			flippedCard = hand.get(index);
		}
		//Removing the 'flipped' card from the deck
		hand.remove(index);
		
		//Returning the value of the 'flipped' card
		return flippedCard;
		
	}
	
	
	//Draws a card from the deck and adds the card to the Player's hand.
	public void draw(Deck deckOfCards) {
		
		//Takes a card from the inputted deck
		Card drawnCard = deckOfCards.draw();
		
		//Adds the card to the player's hand
		hand.add(drawnCard);
		
	}
	
	
	//Adds a point to the Player's score. 
	public void incrementScore() {
		score = score + 1; 
	}
	
	
	//Returns the player's score
	public int getScore() {
		return score;
	}
	
	
	//Returns the player's inputted name
	public String getName() {
		return name;
	}
	
	
	//Sets the player's name using user input
	public void setName() {
		
		//Creating a new instance of Scanner for user input
		Scanner playerName = new Scanner(System.in);
		
		//Setting player name equal to the user-input
		name = playerName.nextLine();
	
	}
	
	

}
