import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	
	//private Hand hand = new Hand();
	private ArrayList<Integer>  deck = new ArrayList<Integer>();
	private ArrayList<Integer> scrapDeck = new ArrayList<Integer>();

/////////////////////////////////////////////////////////////CONSTRUCTOR/////////////////////////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: Deck() – Constructor which initializes the deck to the full deck of 52 cards, the scrap deck to be empty, and then shuffles the deck.
	 ****************************************************************
	 * Test Suite:
	 * **************************************************************
	 * Normal Cases:
	 * Input:
	 * Expected Output: addDeckValue();
	 *          //adds values to deck array so that we can see it
	 *          System.out.println(deck.size());
	 *          System.out.println("Target Number: " + Game.targetNum());
	 *
	 * Boundary Cases:
	 * Input:  
	 * Expected Output: : addDeckValue();
	 *          //adds values to deck array so that we can see it
	 *          System.out.println(deck.size());
	 *          System.out.println("Target Number: " + Game.targetNum());
	 *
	 *
	 *
	 * Extreme Cases:
	 * Input:
	 * Expected Output:
	 *                      
	 ******************************************************************/	
	public Deck(){ 

		addDeckValue(); //adds values to deck array so that we can see it		
	}
/////////////////////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////////////////////////
	
	public ArrayList<Integer> getDeck() { 													//returns the deck value for other classes
	       return deck;
	}
	
	public static int targetNum(){															//target number
		Random randomizer = new Random();
		int target_num = randomizer.nextInt(50);
		while(target_num < 10){
			target_num = randomizer.nextInt(50);			
		}

		return target_num;
	}
	
	public ArrayList<Integer> addDeckValue(){ 												// Hard coded deck arrayList
		
		deck.add(-1); //A's
		deck.add(-1); //A's
		deck.add(-1); //A's
		deck.add(-1); //A's
		
		deck.add(2);
		deck.add(2);
		deck.add(2);
		deck.add(2);
		
		deck.add(3);
		deck.add(3);
		deck.add(3);
		deck.add(3);
		
		deck.add(4);
		deck.add(4);
		deck.add(4);
		deck.add(4);
		
		deck.add(5);
		deck.add(5);
		deck.add(5);
		deck.add(5);
		
		deck.add(6);
		deck.add(6);
		deck.add(6);
		deck.add(6);
		
		deck.add(7);
		deck.add(7);
		deck.add(7);
		deck.add(7);
		
		deck.add(8);
		deck.add(8);
		deck.add(8);
		deck.add(8);
		
		deck.add(9);
		deck.add(9);
		deck.add(9);
		deck.add(9);
		
		deck.add(10);
		deck.add(10);
		deck.add(10);
		deck.add(10);
		
		deck.add(10);//jacks
		deck.add(10);//jacks
		deck.add(10);//jacks
		deck.add(10);//jacks
		
		deck.add(10);//queen
		deck.add(10);//queen
		deck.add(10);//queen
		deck.add(10);//queen
		
		deck.add(10);//king
		deck.add(10);//king
		deck.add(10);//king
		deck.add(10);//king
		

		return deck;
		
	}

///////////////////////////////////////////////////////////////Deck Manip///////////////////////////////////////////////////////////////////	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: isEmpty – Returns true if the deck to draw from is empty, false otherwise.
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
	public boolean isEmpty(){ 																//checks deck size
		if (deck.size()== 0){
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
	 * Purpose: swapDecks – Switch the deck and scrap deck. Shuffle the deck.
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
	public int swapDecks(){																	//[Progress]swaps normal deck for scrap deck
		
		return 0;
	}
///////////////////////////////////////////////////////////////Deck Manip///////////////////////////////////////////////////////////////////	
	
////////////////////////////////////////////////////////////////Add||Drop///////////////////////////////////////////////////////////////////	
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: drawCard – Return the first card on the deck. If the deck is empty, swap the deck with the scrap deck before returning a card.
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
	public int drawCardOne(){																//draws card from deck																
		if(isEmpty() == true){																//if deck is empty isEmpty()	
			swapDecks();																	//swap deck	
		}
		int temp = deck.get(1);
		scrapDeck.add(temp);
		return temp;																		//return first card on deck
		
	}
	
	public void remove(){																	//removes card from deck
		deck.remove(1);
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: drawCard – Return the first card on the deck. If the deck is empty, swap the deck with the scrap deck before returning a card.
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
	public int drawCardTwo(){																//draws card for hand two
		if(isEmpty() == true){																//if deck is empty isEmpty()	
			swapDecks();																	//swap deck	
		}
		int temp = deck.get(1);
		scrapDeck.add(temp);
		deck.remove(1);
		return temp;
	}
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: insertCard – Insert a discarded card into the scrap deck.
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
	public void insertCard(){																//inserts card from hand to deck
		//scrapDeck.add(hand.dropCardOne());
	}
////////////////////////////////////////////////////////////////Add||Drop///////////////////////////////////////////////////////////////////
	/****************************************************************
	 * Name: Riyyan Sharrif & Anthony Tomaselli
	 * Course: IOOP
	 * Section: 07
	 * Date: 12/13/15
	 ****************************************************************
	 * ID: Lab# 7
	 * Purpose: shuffle – Using random, loop through the cards in the deck swapping positions. Perform the loop three times (simulating shuffling three times).
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
	 ******************************************************************/
	public void shuffle(){																	//shuffles deck
		Collections.shuffle(deck);
	}

}
