package lol;
import java.util.*;
import java.util.Random;

public class OneShotHiLo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int randomnum;
		int guess;
		
		randomnum = random.nextInt(100);
		
		System.out.println("I'm thinking of a random number between 1-100. Try to guess it.");
		guess = keyboard.nextInt();
		
		if (guess == randomnum)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		else if (guess > randomnum)
		{
			System.out.println("Sorry, you are too high. I was thinking of " + randomnum);
		}
		else if (guess < randomnum)
		{
			System.out.println("Sorry, you are too low. I was thinking of " + randomnum);
		}
		
		
		
		

	}

}
