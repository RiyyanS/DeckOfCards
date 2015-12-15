import java.util.ArrayList;

public class HandTwo {
	
	private Deck deck = new Deck();
	private ArrayList<Integer>  handTwo = new ArrayList<Integer>(5);		//Hand Two array
	
////////////////////////////////////////////////////////////////CONSTRUCTOR/////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: Hand() - creates a hand for storing a collection of cards, initially empty
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output:
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output:
	 *
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output:
	 *                      
	 ******************************************************************/
	public HandTwo(){ 																			//stores the collection of cards
		
	}
////////////////////////////////////////////////////////////////CONSTRUCTOR/////////////////////////////////////////////////////
	
	public ArrayList<Integer> getHandTwo() {													//gets HandTwo array for another class
	       return handTwo;
	}
	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: displayHand – Display the player’s hand. If the hand is empty display a message indicating so. Otherwise display the hand as: {A, 2, 3, 4, 5}. If the user only holds 3 cards the display should only show three cards: {A, 2, 3}
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: hand
	 * Expected Output: Player’s hand is + hand
	 *
	 * Boundary Cases:
	 * Input: if(hand.size() == 0)
	 * Expected Output: Your hand is empty!
	 *
	 *
	 * Extreme Cases:
	 * Input: x
	 * Expected Output: ERROR;
	 *                      
	 ******************************************************************/
	public void displayHandTwo(){ 																//displays hand two
		//displays the players hand
		//if the hand is empty display the message indicating so
		
		System.out.println(getHandTwo());
		
		if(handTwo.size() == 0){
			System.out.println("Your hand is empty!");
		}
		
	}
	
////////////////////////////////////////////////////////////////Add||Drop///////////////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: addCard – Insert a card into the array of cards.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: hand.add(card)
	 * Expected Output:
	 *
	 * Boundary Cases:
	 * Input: hand.add(card)
	 * Expected Output:
	 *
	 *
	 * Extreme Cases:
	 * Input: y
	 * Expected Output: ERROR;
	 *                      
	 ******************************************************************/	
	public void addCardTwo(){																	//adds card hand two
		int temp = deck.drawCardTwo();
		handTwo.add(temp);
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: dropCard – Drop the card at position i (the method parameter). Swap the last card in the array with this position to keep all cards in the front of the array. When swapping keep in mind that the player’s hand may not be full so you don’t need the last position, rather the last card.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: hand.set(handIndex, hand.get(hand.size()-1));
	 *          hand.remove(hand.size()-1);
	 *
	 * Boundary Cases:
	 * Input:
	 * Expected Output: hand.set(handIndex, hand.get(hand.size()-1));
	 *          hand.remove(hand.size()-1);
	 *
	 *
	 * Extreme Cases:
	 * Input: Q
	 * Expected Output: ERROR;                      
	 ******************************************************************/	
	public void dropCardTwo(int index){															//drops card from hand two
		//drop card at position i
		//swap last card in array with dropped position
		//
		System.out.println();

	}
	
	public void containsCard(){																	//checks to see if card is there
		//return the index of card ?? why do we need this method
	}
////////////////////////////////////////////////////////////////Add||Drop///////////////////////////////////////////////////////////////////		
	
////////////////////////////////////////////////////////////////Sum And Product///////////////////////////////////////////////////////////////////	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: sumAndProduct – Using two output parameters calculate the sum and product of the hand. If the user holds an ace in their hand use aceValue to determine what they would like it to be represented by
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: sum / product of indexes
	 * Expected Output: sum / product does not satisfy target number!
	 *
	 * Boundary Cases:
	 * Input: sum / product of indexes
	 * Expected Output: sum / product does satisfy target number!
	 *
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output:
	 *                      
	 ******************************************************************/
	public int sum(){																			//checks sum of hand two

		int sum = 0;
		for(int i = 1; i < handTwo.size(); i++){
			sum += handTwo.get(i);
		}

		for(int j = 1; j < handTwo.size(); j++){
			//	product*=handOne.get(j);
		}
		return sum;
	}
	public int product(){																		//checks product of handtwo
		
		int product = 0;
		for(int i = 1; i < handTwo.size(); i++){
			product *= handTwo.get(i);
		}

		for(int j = 1; j < handTwo.size(); j++){
			//	product*=handOne.get(j);
		}
		return product;
	}

////////////////////////////////////////////////////////////////Sum And Product///////////////////////////////////////////////////////////////////
	
	public boolean isEmpty(){																	//checks to see if hand is empty
		// if the hand is empty return this value as true
		if(handTwo.size() == 0){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){																	//checks to see if hand is empty
		// if the hand contains 5 cards return true
		if(handTwo.size() == 5){
			return true;
		}
		return false;
	}


}
