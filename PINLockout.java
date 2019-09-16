package lol;
import java.util.*;
public class PINLockout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int pin = 12345;
		int tries = 0;
		int maxtries = 1;
		
		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.println("ENTER YOUR PIN:");
		int entry = keyboard.nextInt();
		tries++;
		maxtries++;
		while (entry != pin && tries <= maxtries)
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN:");
			entry = keyboard.nextInt();
			tries++;
		}
		if (entry == pin)
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCES TO YOUR ACCOUNT.");
		else if (tries >=maxtries)
				System.out.println("\nYOU HAVE RUN OUT OF TIES. ACCOUNT LOCKED.");
		
	}

}

