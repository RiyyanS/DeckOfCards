import java.util.Scanner;

public class Player {
	Scanner user_input = new Scanner(System.in);

	public Player(){

		System.out.println("Hello world, Hand");
	}

	public String Player(){
		//creates a player object with an empty hand and name *name*						[progress]
		System.out.println("Player 1 enter your name: ");
		String name1 = user_input.nextLine();

		System.out.println("Player 2 enter your name: ");
		String name2 = user_input.nextLine();
		return Player();																	//CHECK THE 
	}

	public void displayHand(){

		//Display player's hand																[progress]	

	}

	public String getName(){															//	[done]
		String getName;
		System.out.println("Enter your name: ");
		getName = user_input.nextLine();

		return getName;
	}
	public String getNameTwo(){															//	[done]
		String getNameTwo;
		System.out.println("Enter your name: ");
		getNameTwo = user_input.nextLine();

		return getNameTwo;
	}
	
	public boolean takeTurn(){
		
		
		return false;
		//pick up or drop a card
		//empty draw
		//full drop
		//boolean indicating if players hand meets target
	}
	

	public String pickUpOrDrop(){														//	[done]
		String AddOrDrop;
		System.out.println("Would you like to Pick up or Drop this card?: ");		
		AddOrDrop = user_input.nextLine();

		return AddOrDrop;
	}

	public String pickup(){
		String pickup = "1";
		//Draw a card, display card to player, add card to player's hand					[progress]
		return pickup;
	}

	public String drop(){
		String drop = "1";
		//Allow the user to select which card they would like to drop, ensure that 			[progress]
		//the user selects a card they are holding.											[progress]
		return drop;		
	}

	public boolean completeTurn(){
		//Return true if the player's hand reaches the target through sum or product,		[progress]
		//otherwise false.																	[progress]

		//if(hand = target we return true.)
		if( null != null){
			return true;
		}
		return false;
	}	
}
