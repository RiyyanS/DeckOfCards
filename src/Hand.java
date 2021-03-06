import java.util.ArrayList;

public class Hand {
	
	private Deck deck = new Deck();
	private ArrayList<Integer>  handOne = new ArrayList<Integer>(5);		//Hand One array

////////////////////////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////////////////
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
	public Hand(){ //CONSTRUCCTOR
		
	}
////////////////////////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////////////////
	
	public ArrayList<Integer> getHandOne() {	//gets HandOne  array for another class
	       return handOne;
	}
	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: displayHand � Display the player�s hand. If the hand is empty display a message indicating so. Otherwise display the hand as: {A, 2, 3, 4, 5}. If the user only holds 3 cards the display should only show three cards: {A, 2, 3}
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: hand
	 * Expected Output: Player�s hand is + hand
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
	public void displayHand(){ 
		//displays the players hand
		//if the hand is empty display the message indicating so
		//addHandValue_one();
		System.out.println(getHandOne()); //try and get this method to take the index parameter
		
		if(handOne.size() == 0){
			System.out.println("Your hand is empty!");
		}
		
	}	
	
	
////////////////////////////////////////////////////////////////Add||Drop//////////////////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: addCard � Insert a card into the array of cards.
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
	public void addCardOne(){																				//adds card
		int temp = deck.drawCardOne();
		handOne.add(temp);
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: dropCard � Drop the card at position i (the method parameter). Swap the last card in the array with this position to keep all cards in the front of the array. When swapping keep in mind that the player�s hand may not be full so you don�t need the last position, rather the last card.
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
	public void dropCardOne(){																				//drops card
	
		
	}
	
	public void containsCard(){																				//returns index to drop or -1
	
		
	}
////////////////////////////////////////////////////////////////Add||Drop//////////////////////////////////////////////////////////////////////		

	
	
/////////////////////////////////////////////////////////////Sum And Product///////////////////////////////////////////////////////////////////		
	
	public int sum(){																						//fins sum of hand one
		
		int sum = 0;
		for(int i = 1; i < handOne.size(); i++){
		    sum += handOne.get(i);
		}
		
		return sum;
	}
	
	public int product(){																					//fins product of hand one

		int product = 0;
		for(int i = 1; i < handOne.size(); i++){
			product *= handOne.get(i);
		}

		return product;
	}
	
/////////////////////////////////////////////////////////////Sum And Product///////////////////////////////////////////////////////////////////		
	
	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: isEmpty � Returns true if the hand is empty, false otherwise.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: if(hand.size() == 0)
	 * Expected Output: return true;
	 *
	 * Boundary Cases:
	 * Input: if(hand.size() == 0)
	 * Expected Output: return true;
	 *
	 *
	 * Extreme Cases:
	 * Input: x
	 * Expected Output: ERROR;
	 *                      
	 ******************************************************************/	
	public boolean isEmpty(){																				//checks to see if hand is empty
		// if the hand is empty return this value as true
		if(handOne.size() == 0){
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
	 * Purpose: isFull � Returns true if the hand contains 5 cards, false otherwise.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input: if(hand.size() == 5)
	 * Expected Output: return true;
	 *
	 * Boundary Cases:
	 * Input: if(hand.size() == 5)
	 * Expected Output: return true;
	 *
	 *
	 * Extreme Cases:
	 * Input: z
	 * Expected Output: ERROR;
	 *                      
	 ******************************************************************/	
	public boolean isFull(){																				//checks to see if hand is empty
		// if the hand contains 5 cards return true	
		if(handOne.size() == 5){
			return true;
		}
		return false;
	}
	
}
