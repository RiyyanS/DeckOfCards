import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Player {
	
	
	private Hand handOne = new Hand();
	private HandTwo handTwo = new HandTwo();//This is so that we can access the methods in the other classes
	private Deck deck = new Deck(); //This is so that we can access the methods in the other classes
	
	private String nameOne;
	private String nameTwo;
	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: Player(string name) - – creates a player object with an empty hand and name name 
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: this.targetNum = targetNum;
	            this.name = name;
	            hand = new Hand();
	            deck = new Deck();
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: this.targetNum = targetNum;
	            this.name = name;
	            hand = new Hand();
	            deck = new Deck();
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: this.targetNum = targetNum;
	            this.name = name;
	            hand = new Hand();
	            deck = new Deck();
	 ******************************************************************/
	public Player(String nameOne, String nameTwo){								 							//Constructor
		
			this.nameOne = nameOne;
			this.nameTwo = nameTwo;
		
			
			System.out.println("****************************************");
			System.out.println("The Target Number For This game is : " + deck.targetNum());
			System.out.println("****************************************");
			
			System.out.println("Deck size: "+ deck.getDeck().size());    									//remove 
			System.out.println("*The Deck has been Shuffled*\n");
			deck.shuffle();
			int counter = 3;
			while(takeTurn()==false && takeTurnTwo() ==false){
				
				System.out.println("");
				System.out.println("Turn "+counter+": ");takeTurn();
				counter++;
				System.out.println("");
				System.out.println("Turn "+counter+": ");takeTurnTwo();
			}
			
			System.out.println("End of game");
		
	}
////////////////////////////////////////////////////////Getters for names///////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: getName – Get the player’s name. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: return name;
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: return name;
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: return name;
	 ******************************************************************/	
	public String getNameOne() {																			//gets name of player 1
		return nameOne;
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: getName – Get the player’s name. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: return name;
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: return name;
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: return name;
	 ******************************************************************/
	public String getNameTwo() {																			//gets name of player two
		return nameTwo;
	}

////////////////////////////////////////////////////////Getters for names///////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////Take Turn//////////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * takeTurn – Displays the player’s hand and allows them to determine if they would like to pick up or        *drop a card. If the player’s hand is empty they must draw a card. If the player’s hand is full they must drop a card. Returns a boolean indicating if the player’s hand meets the target. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 
	 ******************************************************************/
	public boolean takeTurn(){																				//player one's turn
		
		System.out.print(nameOne+"'s hand is: "); displayHand();
		
			deck.getDeck();																			//gets deck
			pickUpOrDrop();																			//pickup or drop	
			if (completeTurnOne() == true){															//sum or product
				System.out.println(nameOne+", Congratulations. YOU'VE WON");
				return true;
			}																		
		
		return false;	
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * takeTurn – Displays the player’s hand and allows them to determine if they would like to pick up or        *drop a card. If the player’s hand is empty they must draw a card. If the player’s hand is full they must drop a card. Returns a boolean indicating if the player’s hand meets the target. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: Player 1’s Hand is: + (displayHand();)
	 
	 ******************************************************************/	
	public boolean takeTurnTwo(){																			//player two's turn
		
		System.out.print(nameTwo+"'s hand is: "); displayHand();
		
			deck.getDeck();																			//gets deck
			pickUpOrDropTwo();																			//pickup or drop	
			if (completeTurnTwo() == true){															//sum or product
				System.out.println(nameTwo+", Congratulations. YOU'VE WON");
				return true;
			}																		
		
		return false;	
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: completeTurn – Return true if the player’s hand reaches the target through sum or product, false otherwise ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: hand.sumAndProduct(targetNum)
	 * Expected Output: return true;
	 *
	 * Boundary Cases:
	 * Input: hand.sumAndProduct(targetNum)
	 * Expected Output: return false;
	 *
	 * Extreme Cases:
	 * Input: z
	 * Expected Output: ERROR;
	 ******************************************************************/	
	public boolean completeTurnOne(){																		//ends turn p1
		if (handOne.sum() == deck.targetNum() || handOne.product() == deck.targetNum()){
			return true;
		}
		return false;
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: completeTurn – Return true if the player’s hand reaches the target through sum or product, false otherwise ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: hand.sumAndProduct(targetNum)
	 * Expected Output: return true;
	 *
	 * Boundary Cases:
	 * Input: hand.sumAndProduct(targetNum)
	 * Expected Output: return false;
	 *
	 * Extreme Cases:
	 * Input: z
	 * Expected Output: ERROR;
	 ******************************************************************/	
	public boolean completeTurnTwo(){																		//end p2's turn
		if (handTwo.sum() == deck.targetNum() || handTwo.product() == deck.targetNum()){
			return true;
		}
		return false;
	}
////////////////////////////////////////////////////////////Take Turn//////////////////////////////////////////////////////////////	

/////////////////////////////////////////////////////////Pick Up Or Drop///////////////////////////////////////////////////////////	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: pickUpOrDrop – Determine if the user would like to pick up or drop a card, and call the *appropriate function to perform the selected action. Make sure that you check that their selection is *valid. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: P
	 * Expected Output: pickUp();
	 *
	 * Boundary Cases:
	 * Input: hand.isFull();
	 * Expected Output: drop();
	 *
	 * Extreme Cases:
	 * Input: x
	 * Expected Output: “ERROR: Please enter P or D: “
	 ******************************************************************/	
	public void pickUpOrDrop(){																//picks up card or drops it for p1
		
		Scanner sc = new Scanner(System.in);
		System.out.println(nameOne +  ", if you would like to "
				+ "pick up a card, press P. If you would like "
				+ "to drop a card, press D.");
		String answer = sc.nextLine();
		char ans = answer.charAt(0);
		
		switch (ans){
		
		case 'P': pickUpOne(); handOne.addCardOne();
					break;
		case 'p': pickUpOne(); handOne.addCardOne();
					break;	
		case 'D': dropOne();
					break;
		case 'd': dropOne();
					break;
					
		}
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: pickUpOrDrop – Determine if the user would like to pick up or drop a card, and call the *appropriate function to perform the selected action. Make sure that you check that their selection is *valid. ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: P
	 * Expected Output: pickUp();
	 *
	 * Boundary Cases:
	 * Input: hand.isFull();
	 * Expected Output: drop();
	 *
	 * Extreme Cases:
	 * Input: x
	 * Expected Output: “ERROR: Please enter P or D: “
	 ******************************************************************/	
	public void pickUpOrDropTwo(){															//picks up card or drops it for p2
		
		Scanner sc = new Scanner(System.in);
		System.out.println(nameTwo +  ", if you would like to "
				+ "pick up a card, press P. If you would like "
				+ "to drop a card, press D.");
		String answer = sc.nextLine();
		char ans = answer.charAt(0);
		
		switch (ans){
		
		case 'P': pickUpTwo(); handTwo.addCardTwo();
					break;
		case 'p': pickUpTwo(); handTwo.addCardTwo();
					break;	

		}
	}
	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: pickup – Draw a card from the deck, display the drawn card to the player, and add the *card to the player’s hand.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 ******************************************************************/
	public void pickUpOne(){																//picks up card

		deck.drawCardOne();																				//gets card from deck
		//displays it to player
		System.out.println("You picked up: "+ deck.drawCardOne());										//displays it to player
		// if card is -1 prompt them to change the value to 1 or 11
		int temp = deck.drawCardOne();
		handOne.getHandOne().add(temp);	
		deck.remove();//add card to players hand
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: pickup – Draw a card from the deck, display the drawn card to the player, and add the *card to the player’s hand.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: hand.addCard(deck.drawCard());
	 ******************************************************************/	
	public void pickUpTwo(){																//picks up card

		deck.drawCardTwo();																				//gets card from deck
		//displays it to player
		System.out.println("You picked up: "+ deck.drawCardTwo());										//displays it to player
		// if card is -1 prompt them to change the value to 1 or 11
		int temp = deck.drawCardTwo();
		handTwo.getHandTwo().add(temp);																	//add card to players hand
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: drop – Allow the user to select which card they would like to drop, ensure that the user *selects a card that they are holding.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: 3
	 * Expected Output: hand.dropCard(handIndex); *
	 * Boundary Cases:
	 * Input: 5
	 * Expected Output: hand.dropCard(handIndex);
	 *
	 * Extreme Cases:
	 * Input: 100
	 * Expected Output: ERROR: Card not found, retry.
	 ******************************************************************/	
	public int dropOne(){																	//drops card
		Scanner sc = new Scanner(System.in);
		//select which card to drop
		
		int ans;
		int index;
		do{
			System.out.println("This is your hand: ");displayHand();
			System.out.println("Which index would you like to drop(The first one is 0)");
			index = sc.nextInt();

			System.out.println("Are you sure you want to drop: " +(handOne.getHandOne()).get(index));
			System.out.println("Enter 1 to drop or 0 to keep it");
			ans = sc.nextInt();
			
		} while(ans == 0);																//prompting 
		
		return index;
		
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: drop – Allow the user to select which card they would like to drop, ensure that the user *selects a card that they are holding.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: 3
	 * Expected Output: hand.dropCard(handIndex); *
	 * Boundary Cases:
	 * Input: 5
	 * Expected Output: hand.dropCard(handIndex);
	 *
	 * Extreme Cases:
	 * Input: 100
	 * Expected Output: ERROR: Card not found, retry.
	 ******************************************************************/	
	public int dropTwo(){																	//drops card
		Scanner sc = new Scanner(System.in);
		//select which card to drop
		
		int ans;
		int index;
		do{
			System.out.println("This is your hand: ");displayHandTwo();
			System.out.println("Which index would you like to drop(The first one is 0)");
			index = sc.nextInt();

			System.out.println("Are you sure you want to drop: " +(handTwo.getHandTwo()).get(index));
			System.out.println("Enter 1 to drop or 0 to keep it");
			ans = sc.nextInt();
			
		} while(ans == 0);																//prompting 
		
		return index;
		
	}
	
/////////////////////////////////////////////////////////Pick Up Or Drop///////////////////////////////////////////////////////////		
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: displayHand – Display the player’s hand.  ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 ******************************************************************/		
	public void displayHand(){																//displays hand

		handOne.displayHand();

	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: displayHand – Display the player’s hand.  ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output: hand.displayHand();
	 ******************************************************************/	
	public void displayHandTwo(){															//displays hand2

		handTwo.displayHandTwo();

	}

}
