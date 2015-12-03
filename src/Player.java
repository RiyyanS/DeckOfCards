import java.util.Scanner;
//
public class Player {
	Scanner user_input = new Scanner(System.in);

	public Player(){
		
		System.out.println("Hello world, Hand");
	}
	
	public String Player(){
		//creates a player object with an empty hand and name *name*
		String name = "bob";
		return name;
	}
	
	public void displayHand(){
		
		//Display player's hand

	}

	public String getName(){
		String getName;
		System.out.println("Enter your name: ");
		getName = user_input.nextLine();

		return getName;
	}
	
	public String pickUpOrDrop(){
		String AddOrDrop;
		System.out.println("Would you like to Pick up or Drop this card?: ");		
		AddOrDrop = user_input.nextLine();
		
		return AddOrDrop;
	}

	public String pickup(){
		String pickup = "1";
		//Draw a card, display card to player, add card to player's hand
		return pickup;
	}
	
	public String drop(){
		String drop = "1";
		//Allow the user to select which card they would like to drop, ensure that 
		//the user selects a card they are holding.
		return drop;		
	}
	
	public boolean completeTurn(){
		//Return true if the player's hand reaches the target through sum or product,
		//otherwise false.
		return false;
	}	
}