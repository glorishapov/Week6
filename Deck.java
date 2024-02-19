package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//New Class called Deck
public class Deck {
	
	//Creating a new list of Card to contain the cards in the deck
	List<Card> cards = new ArrayList<Card>(); 
	
	//creating a variable to store the number of cards in a deck.
	//I set this as a final variable so the initial number of cards 
	//in the deck could not be changed. 
	static final int numberOfCards = 52; 
	
	
	//Initializing a deck of cards in the constructor
	public Deck() {
		
		//Populating the deck with 52 cards
		for (int i = 0; i < numberOfCards; i++) {
			
			//Creating a new instance of the class Card
			Card card = new Card(i); 
			
			//Adding the card to the deck
			cards.add(card);
			
		}
		
		
	}
	
	//Shuffles deck of cards randomly using the shuffle method in java.util.Collections
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Returns the top card in the deck
	public Card draw() {
		
		int index = 0;
		//Drawing the card at the first index. 
		Card drawnCard = cards.get(0);
		
		//If the card is null, the card has already been pulled.
		//Moving through the deck until the next card is reached using an if statement.
		if (drawnCard == null) {
			index = index++;
			drawnCard = cards.get(index);
		}
		
		//Removing the drawn card from the deck
		cards.remove(index);
		
		//Returning the value of the drawn card. 
		return drawnCard; 
	}

}
