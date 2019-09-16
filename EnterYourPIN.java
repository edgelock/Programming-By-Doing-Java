package lol;
import java.util.Scanner;

public class EnterYourPIN {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int pin = 12345;
		
		

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();

		
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		
		// a while loop is similar to an if statement because a condition has to be met for it to activate
		// a while loop is different from an if statement because it's continuous
		// because you already made it an int in the beginning of the code?
		// a while loop will be continous if you dont have a prompt to break it.
	}

}
