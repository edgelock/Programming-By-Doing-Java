package lol;
import java.util.*;
public class TheWorstNumberGuessingGameEver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int secretnum;
		int guess;
		
		secretnum = 4;
		System.out.println("TEH WORST NUBER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("I\"M THKING OF A NBR FROM 1-10. TRY 2 GESS!");
		guess = keyboard.nextInt();
		
		if (guess == secretnum)
		{
			System.out.println("LOL!!! U GOT IT! i CANT BELEIVE U GESSED IT WAS " +secretnum);
		}
		else if (guess != secretnum)
		{
			System.out.println("W00T!  U SUX0R!!! I PWN J00!!! IT WAS " +secretnum);
		}
	
	}

}
