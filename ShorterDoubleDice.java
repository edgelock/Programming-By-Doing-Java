package lol;
import java.util.Random;

public class ShorterDoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random(6);
		
		int roll1;
		int roll2;
		int rollsum;
		
		roll1 = random.nextInt(6);
		roll2 = random.nextInt(6);
		rollsum = roll1 + roll2;
		
		System.out.println("Here comes the dice!");
		
		
		do 
		{
			roll1 = random.nextInt(6);
			roll2 = random.nextInt(6);
			rollsum = roll1 + roll2;
			
			System.out.println("Roll #1: " +roll1);
			System.out.println("Roll #2: " +roll2);
			System.out.println("The total is " +rollsum +" !");
			System.out.println("");
		}
		
		while (roll1 != roll2);
	}

}
