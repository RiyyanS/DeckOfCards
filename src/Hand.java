import java.util.ArrayList;
//
public class Hand {

	private ArrayList<String> hand = new ArrayList<String>();
	
	
	public Hand(){ //stores the collection of cards
		
		System.out.println("Hello world, Hand");
		
	}
	
	public void displayHand(){ 
		//displays the players hand													[done]
		//if the hand is empty display the message indicating so					[done]
		
		if (hand.size() == 0){
			System.out.println("Your hand is empty");
		}else{
			for(int i = 0; i < hand.size(); i++){
				System.out.print(hand.get(i) );
			}
		}
		
	}
	
	public boolean isEmpty(){
		// if the hand is empty return this value as true							[progress]
		return false;
	}
	
	public boolean isFull(){
		// if the hand contains 5 cards return true									[progress]
		return false;
	}
	
	public int addCard(){
		//inserts card into the array of cards										[progress]
		return 0;
	}
	
	public int dropCard(){
		//drop the card which is at a specific location "i"							[progress]
		//swap the last card in the array to keep the cards position				[progress]
		
		return 0;
	}
	
	 public int sumAndProduct(){
		 //passes the target value to the method 									[progress]
		 //calculate the sum and product											[progress]
		 //checks to see if sum or product is same									[progress]
		 //if the user uses an ace in the hand calculate the value of the ace		[progress]
		 // use an array to pass back to parameters									[progress]
		 return 0;
	 }
	 
	 public int containsCard(){
		 // return the index of the card in the array if the card is in the hand	[progress]
		 // -1 otherwise															[progress]
		 return 0;
	 }
	 
	 public boolean aceValue(){
		 // use boolean to get true or false for ace value 1 or 10					[progress]
		 return false;
	 }

	
	
}
