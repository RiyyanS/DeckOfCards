import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
	
	
	
	private int[] cardValue = {11, 10, 9, 8, 7, 6, 5,
							   4, 3, 2, 1};
	
	
	private ArrayList<int[]> deck = new
			ArrayList<int[]>(51);	
	//(51) because the index starts at 0 not 1.

	private ArrayList<String> pickUp = new 
			ArrayList<String>();
	
	private ArrayList<String> drop = new 
			ArrayList<String>();
	
	public Deck(){
		System.out.println("Hello world, Deck");
		pickUp = new ArrayList<String>();
		drop = new ArrayList<String>();
		deck = new ArrayList<int[]>();
		
	}
	
	
	public ArrayList<String> getPickUp(){
		return pickUp;
	}
	
	public ArrayList<String> getDrop(){
		return drop;
	}
	
	public void insertCard(String card){
		//inserts a discarded card into the scrap deck										[done]
		drop.add(card);
		
	}
	
	public String drawCard(){
		//returns the first card on the deck												[done]
		//if the deck is empty access "isEmpty()", "swapDecks()", "shuffle()"				[done]
		
		//if the normal deck is empty(true), then swap the decks, and shuffle the new one
		if(isEmpty() == true){
			swapDecks();
			shuffle();
		}
		return pickUp.remove(0);
	}
	
	public boolean isEmpty(){
		//checks if deck size is empty														[done]
		//will return true if the deck is empty												[done]
		
		if(pickUp.isEmpty()){
			return true;
		}
		
		return false;
	}
	
	public void swapDecks(){
		//swaps the old deck for the new one												[done]
		//shuffles the deck																	[done]
		
		//double check to see if this is a proper switching of array lists...
		
		ArrayList<String> temp = drop;
		drop = pickUp;
		pickUp = temp;
	}
	
	public void shuffle(){
		//Using random, loop through the cards in the deck 									[done]
		//swapping positions. Perform the loop three times 									[done]
		//(simulating shuffling THREE times).												[done]
		

		Collections.shuffle(drop);														//CHECK AFTER RUNNING PROGRAM,
																						//MAY NEED TO ADD MORE TO THIS
		
		//Collections.shuffle(arg0, arg1);
		Random rand = new Random();
		rand.nextInt(52);
		
	}
	
}

