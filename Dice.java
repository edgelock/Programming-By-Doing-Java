package lol;
import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int roll;
		int sroll;
		int rollsum;
		
		roll = random.nextInt(6);
		sroll = random.nextInt(6);
		rollsum = roll + sroll;
		
		System.out.println("HERE COMES THE DICE!");
		
		System.out.println("Roll #1: " + roll);
		System.out.println("Roll #2: " + sroll);
		System.out.println("The total is " + rollsum + ".");
	}

}
