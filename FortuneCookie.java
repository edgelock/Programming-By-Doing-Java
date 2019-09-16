package lol;
import java.util.*;
import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int fortune;
		fortune = random.nextInt(7);
		
		if (fortune == 1)
		{
			System.out.println("You'll die happy with millions");
		}
		else if (fortune == 2)
		{
			System.out.println("You'll die happy with children");
		}
		else if (fortune == 3)
		{
			System.out.println("You'll die happy with a lover");
		}
		else if (fortune == 4)
		{
			System.out.println("You'll die happy with a mistress");
		}
		else if (fortune == 5)
		{
			System.out.println("You'll die happy with a belly full of food");
		}
		else if (fortune == 6)
		{
			System.out.println("You'll die happy with a best friend.");
		}
		else if (fortune == 7)
		{
			System.out.println("Stick with your wife. 13 - 44 - 19 -37 -29 -17");
		}
		
		
	}

}
