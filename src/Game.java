import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nameOne;
		String nameTwo;
		
		
		System.out.print("Player 1: please enter your name: ");
		nameOne = sc.nextLine();
		System.out.print("Player 2: please enter your name: ");
		nameTwo = sc.nextLine();
		
		Player player = new Player(nameOne, nameTwo);
		nameOne = player.getNameOne();
		nameTwo = player.getNameTwo();
		

	}

}
