package lol;
import java.util.*;
import java.util.Random;

public class KeepGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int randomnum;
		int guess;
		
		randomnum = random.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		guess = keyboard.nextInt();
		
		while (guess != randomnum)
		{
			System.out.println("\nThat is incorrect. Keep guessing. ");
			guess = keyboard.nextInt();
		}
		if(guess == randomnum);
		{
			System.out.println("That's right! You're a good guesser.");
		}
		
	}

}
