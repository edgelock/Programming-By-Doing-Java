package lol;
import java.util.*;
public class FlipAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
		

//		while ( again.equals("y") )
		do
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}
		while ( again.equals("y") );
			
	}

}

// it'll run  the progam when I change string back because the do while loop wants to run the block of code first before it checks the condition.