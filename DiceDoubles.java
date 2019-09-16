package lol;
import java.util.*;
import java.util.Random;

public class DiceDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int roll;
		int roll2;
		int rollsum;
		
		
		
		
		
		roll = random.nextInt(6);
		roll2 = random.nextInt(6);
		
		rollsum = roll + roll2;
		 
		System.out.println("HERE COMES THE DICE!");
		
		System.out.println("Roll #1 is: " + roll);
		System.out.println("Roll #2 is: " + roll2);
		System.out.println("The total is: " + rollsum);
		
		while(roll != roll2)
		{
			roll = random.nextInt(6);
			roll2 = random.nextInt(6);
			System.out.println("Roll #1 is: " + roll);
			System.out.println("Roll #2 is: " + roll2);
			System.out.println("The total is: " + rollsum);
		}
		
		
		

	
		
	}

}
