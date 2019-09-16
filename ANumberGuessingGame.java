package lol;
import java.util.*;
import java.util.Random;

public class ANumberGuessingGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int guess;
		int secretnum;
		
		secretnum = random.nextInt(10);
		
		System.out.println("Im thinking of a number from 1 to 10.");
		System.out.println("Your guess:");
		guess = keyboard.nextInt();
		
		if (guess == secretnum)
		{
			System.out.println("That's right! My secret number was " + secretnum);
		}
		else if (guess != secretnum);
		{
			System.out.println("Sorry, but I was really thinking of " + secretnum);
		}
		
		
		
		
		
		

	}

}
