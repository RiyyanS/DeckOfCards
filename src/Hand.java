import java.util.ArrayList;
//
public class Hand {

	private ArrayList<String> hand = new ArrayList<String>();
	
	
	public Hand(){ //stores the collection of cards
		
		System.out.println("Hello world, Hand");
		
	}
	
	public void displayHand(){ 
		//displays the players hand
		//if the hand is empty display the message indicating so
		
	}
	
	public boolean isEmpty(){
		// if the hand is empty return this value as true
		return false;
	}
	
	public boolean isFull(){
		// if the hand contains 5 cards return true
		return false;
	}
	
	public int addCard(){
		//inserts card into the array of cards
		return 0;
	}
	
	public int dropCard(){
		//drop the card which is at a specific location "i"
		//swap the last card in the array to keep the cards position
		
		return 0;
	}
	
	 public int sumAndProduct(){
		 //passes the target value to the method 
		 //calculate the sum and product
		 //checks to see if sum or product is same
		 //if the user uses an ace in the hand calculate the value of the ace
		 // use an array to pass back to parameters
		 return 0;
	 }
	 
	 public int containsCard(){
		 // return the index of the card in the array if the card is in the hand
		 // -1 otherwise
		 return 0;
	 }
	 
	 public boolean aceValue(){
		 // use boolean to get true or false for ace value 1 or 10
		 return false;
	 }

	
	
}
