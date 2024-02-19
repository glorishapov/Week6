package com.promineotech;

import java.util.Scanner;

//New class named App
public class App {

	//Main method
	public static void main(String[] args) {
		
		//Creating a new instance of Scanner for user input
		Scanner game = new Scanner(System.in);
		
		//Setting up the application to continue to run if the user wants to play again. 
		int runGame = 1; 
		
		//While the variable runGame is equal to one, the application will continue
		//to run until the user closes the game. 
		while (runGame == 1) {
			
			//Instantiating a new deck
			Deck deck = new Deck();
			
			//Instantiating a two new players
			Player player1 = new Player();
			Player player2 = new Player();
			
			//Setting a name for both players based on user input
			System.out.print("Please enter a name for Player 1: ");
			player1.setName();
			System.out.print("Please enter a name for Player 2: ");
			player2.setName();
			
			//Making the console look presentable
			System.out.println();
			System.out.println("-------------------------------");
			
			//Shuffling the deck randomly
			deck.shuffle();
			
			// Dividing the deck between both players, switching between players every draw.
			for (int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					player1.draw(deck);
				}else {
					player2.draw(deck);
				}
			}
			
			//The meat and potatoes of the game
			//Using a for loop, each player draws a card. The values of both cards are compared: 
			//the player with the highest card value wins the turn and a point is added to their score
			for (int i = 1; i < 27; i++) {
				
				//Each player is pulling a card from the top of the deck
				Card card1 = player1.flip();
				Card card2 = player2.flip();
				
				//Keeping track of the turns in the game and printing turn to console
				System.out.println("Turn " + i + ":");
				System.out.println();
				
				//Printing the suite and rank of each card the players have pulled
				System.out.print(player1.getName() + " pulled ");
				card1.describe();
				System.out.print(player2.getName() + " pulled ");
				card2.describe();
				System.out.println();
				
				
				//Comparing the cards using an if-else statement
				if(card1.getValue() > card2.getValue()) {
					
					// If player1's card value is greater than player2's card, 
					// a point is added to player1's score and the winner of
					// the turn is printed to the console
					player1.incrementScore();
					System.out.println(player1.getName() + " wins this turn!");
					
					//At the end of each turn, the players' current scores are printed to the console
					System.out.println();
					System.out.println(player1.getName() + "'s current score  = " + player1.getScore());
					System.out.println(player2.getName() + "'s current score  = " + player2.getScore());
					
					//Dividing the turns
					System.out.println("-------------------------------");
					
					
				}else if(card1.getValue() < card2.getValue()) {
					
					// If player2's card value is greater than player1's card, 
					// a point is added to player2's score and the winner of
					// the turn is printed to the console
					player2.incrementScore();
					System.out.println(player2.getName() + " wins this turn!");
					
					//At the end of each turn, the players' current scores are printed to the console
					System.out.println();
					System.out.println(player1.getName() + "'s current score  = " + player1.getScore());
					System.out.println(player2.getName() + "'s current score  = " + player2.getScore());
					
					//Dividing the turns
					System.out.println("-------------------------------");
					
				}else {
					//If the values of both cards are the same, no point is awarded
					System.out.println("It's a tie! No point was awarded.");
					
					//At the end of each turn, the players' current scores are printed to the console
					System.out.println();
					System.out.println(player1.getName() + "'s current score  = " + player1.getScore());
					System.out.println(player2.getName() + "'s current score  = " + player2.getScore());
					
					//Dividing the turns
					System.out.println("-------------------------------");
					
				}
				
			}
			
			
			//Figuring out a winner
			System.out.println("Lets see who the final winner is!");
			System.out.println();
			
			//Printing both players' final scores to the console
			System.out.println(player1.getName() + "'s FINAL SCORE  = " + player1.getScore());
			System.out.println();
			System.out.println(player2.getName() + "'s FINAL SCORE  = " + player2.getScore());
			System.out.println();
			
			//Comparing the scores using an if-else statement
			//If player1's score is greater, player1 wins the game. 
			if(player1.getScore() > player2.getScore()) {
				
				System.out.println("*** " + player1.getName() + " has won the game! ***");
				System.out.println();
				
				//Asking the user if they want to continue playing by using an if-else statement
				System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
				runGame = game.nextInt();
				
				//if the user enter a 1, the game restarts
				if(runGame == 1) {
					
					runGame = 1;
				
				//If the user enters a 0, the application ends. 
				}else if(runGame == 0){
					System.out.println("Thank you for playing!");
					game.close();
					System.exit(0);
				
				//Checks to make sure the user entered the correct number
				}else {
					
					if(runGame != 0 || runGame != 1) {
						System.out.println("Your response was invalid. Please try again. ");
						System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
						runGame = game.nextInt();
						
					}
					
				}
			
			//If player2's score is greater, player2 wins the game. 
			}else if(player1.getScore() < player2.getScore()) {
				
				System.out.println("*** " + player2.getName() + " has won the game! ***");
				System.out.println();
				
				//Asking the user if they want to continue playing by using an if-else statement
				System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
				runGame = game.nextInt();
				
				//if the user enter a 1, the game restarts
				if(runGame == 1) {
					
					runGame = 1;
				
				//If the user enters a 0, the application ends. 	
				}else if(runGame == 0){
					System.out.println("Thank you for playing!");
					game.close();
					System.exit(0);
					
				//Checks to make sure the user entered the correct number	
				}else {
					
					if(runGame != 0 || runGame != 1) {
						System.out.println("Your response was invalid. Please try again. ");
						System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
						runGame = game.nextInt();
						
					}
					
				}
			
			//If the players' scores are the same, it's a draw	
			}else {

				System.out.println("*** It's a draw! ***");
				System.out.println();
				
				//Asking the user if they want to continue playing by using an if-else statement
				System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
				runGame = game.nextInt();
				
				//if the user enter a 1, the game restarts
				if(runGame == 1) {
					
					runGame = 1;
					
				//If the user enters a 0, the application ends. 		
				}else if(runGame == 0){
					System.out.println("Thank you for playing!");
					game.close();
					System.exit(0);
				
				//Checks to make sure the user entered the correct number		
				}else {
					
					if(runGame != 0 || runGame != 1) {
						System.out.println("Your response was invalid. Please try again. ");
						System.out.println("If you would like to play again, please enter 1. If you would like to exit, please enter 0: ");
						runGame = game.nextInt();
						
					}
					
				}
			}
		}
	}
}
