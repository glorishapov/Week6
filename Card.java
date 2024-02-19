package com.promineotech;

//New Class called Card
public class Card {
	
	//Card Suite
	int name = 0; 
	
	//Card Rank
	int value = 0; 
	
	//Array of Card Ranks
	String[] cardValue = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	//Array of Card Suites
	String[] cardName = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	
	// The numbers 0-12 represent clubs, 13-25 diamonds, 
    // 26-38 hearts, and 39-51 spades. Within each suit,
    // the lowest number is the ace and highest is the king.
	
	//Constructor sets value and name of a card
	public Card(int v) {
		
		//If inputted number is between or equal to 0 thru 12, 
		//the card's name or 'suite' is set to Clubs
		if (v >= 0 && v <= 12) {
			
			//Card's name or 'suite' is set to Clubs
			name = 0;
			
			//Card's value or 'rank' is set to the value of the inputted number
			value = v; 			
		
		//If the inputted number is between or equal to 13 thru 25, 
		//the card's name or 'suite' is set to Diamonds
		}else if(v >= 13 && v <= 25) {
			
			//Card's name or 'suite' is set to Diamonds
			name = 1;
			
			//Card's value or 'rank' is set to the value of the inputted number % 13
			//which gives us the rank of the card within the suite
			value = v % 13; 
		
		//If the inputted number is between or equal to 26 thru 38, 
		//the card's name or 'suite' is set to Hearts	
		}else if (v >= 26 && v <= 38) {
			
			//Card's name or 'suite' is set to Hearts
			name = 2; 
			
			//Card's value or 'rank' is set to the value of the inputted number % 26
			//which gives us the rank of the card within the suite
			value = v % 26;
			
		//If the inputted number is between or equal to 39 thru 51, 
		//the card's name or 'suite' is set to Spades		
		}else if (v >= 39 && v <= 51) {
			
			//Card's name or 'suite' is set to Hearts
			name = 3; 
			
			//Card's value or 'rank' is set to the value of the inputted number % 39
			//which gives us the rank of the card within the suite
			value = v % 39; 
			
	}
	
	}


	//Gets value of card, names or 'suites' are not needed in the game. 
	public int getValue() {
        return value;
    }
	
	//Prints out card information to the console
	public void describe() {
        
    	System.out.println(cardValue[value] + " of " + cardName[name]);
    	
    }

}
