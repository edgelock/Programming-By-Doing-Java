package lol;
import java.util.*;
import java.util.Random;

public class HiLoWithLimitedTries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		int guess;
		int guesscount;
		int randomnum;
		
		randomnum = random.nextInt(100);
		
		guesscount = 1;
		
		System.out.println("I'm thinking of a ranom number from 1-100. You have 7 guesses");
		System.out.println("First Guess: ");
		guess = keyboard.nextInt();
		
		guesscount++;
		while ( guesscount <= 7 && guess != randomnum )
		{
			System.out.println("Try again.");
			guess = keyboard.nextInt();
			guesscount++;
			
			if (guess < randomnum)
			{
				System.out.println("Sorry, you are too low.");
				System.out.println("Guess #" + guesscount + ": " + guess);
				if (guesscount == 7)
				{
					System.out.println("Sorry you didn't guess it in 7 tries. You lose.");
				}
			}
			else if (guess > randomnum)
			{
				System.out.println("Sorry, that guess it too high.");
				System.out.println("Guess #" + guesscount + ": " + guess);
				if(guesscount == 7)
				{
					System.out.println("Sorry you didn't guess it in 7 tries. You lose.");
				}
			}
			
			
		
		}
	
	}

}
