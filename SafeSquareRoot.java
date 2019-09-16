package lol;
import java.util.*;
public class SafeSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		double num;
		
		

		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number: ");
		num = keyboard.nextDouble();
		
		while (num < 0)
		{
			System.out.println("You can't take the root of a negative number, silly.");
			System.out.println("Try again:");
			num = keyboard.nextDouble();
		}
		
		Math.sqrt(num);
		System.out.println("The square root of "+num+ " is "+ Math.sqrt(num));
		
	
	}

}
