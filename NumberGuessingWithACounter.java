package lol;
import java.util.*;
import java.util.Random;

public class NumberGuessingWithACounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int randomnum = random.nextInt(10);
		int guess;
		int guesscount = 0;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		guess = keyboard.nextInt();
		guesscount++;
		
		while (guess != randomnum)
		{
			System.out.println("That is incorrect. Guess again.");
			guess = keyboard.nextInt();
			guesscount++;
		}
		
		if (guess == randomnum)
		{
			System.out.println("Taht's right! You're a good guesser. It only took you " + guesscount + " tries.");
		}
	}

}
