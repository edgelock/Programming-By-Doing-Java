package lol;
import java.util.*;
import java.util.Random;

public class ThreeCardMonte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int randomcard;
		int guess;
		
		randomcard = random.nextInt(3);
		
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		
		System.out.println("Which one is the ace?");
		System.out.println(" 1 2 3");
		System.out.println(">"); guess = keyboard.nextInt();
		
		
		if (guess == randomcard)
		{
			System.out.println("You nailed it! Fast Eddie reluctatnly hands over your winnings, scowling.");
		}
		else if (guess != randomcard)
		{
			System.out.println("Fast Eddie wins again! The ace was card numer " + randomcard);
		}
		
				
	}

}
