package lol;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int randomnum = random.nextInt(10);
		int guess;
		int guesscount = 0;
		
		
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		guess = keyboard.nextInt();
		
		do
		{
			System.out.println("Your guess: "+guess);
			if (guess != randomnum)
			{
				System.out.println("That is incorrect. Guess again.");
				guesscount++;
				guess = keyboard.nextInt();
			}
			else if (guess == randomnum)
			{
				System.out.println("That's right. You're a good guesser.");
				guesscount++;
				System.out.println("It only took you "+guesscount+" tries.");
				break;
			}
			
		}
		while (guess != randomnum || guess == randomnum);
	}

}
