package lol;
import java.util.*;
public class RightTriangleChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int side1=0;
		int side2 = 0;
		int side3;

		System.out.println("Enter three integers:");
		System.out.println("Side 1:");
		side1 = keyboard.nextInt(); //take input for side 1
		
		System.out.println("Side2:");
		side2 = keyboard.nextInt();// take input for side 2
		
		while (side2 < side1) //check for if side 2 is less than side 1
		{
			System.out.println(side2+" is smaller than " + side1 + " try again." ); // continually prompt until side 2 > = side 1
			System.out.println("Side 2:");
			side2 = keyboard.nextInt();
			
		}
		System.out.println("Side3:");
		side3 = keyboard.nextInt();// take input for side 3
		
		while (side3 < side2)
		{
			System.out.println(side3+" is smaller than " + side2 + " try again." ); // continually prompt until side 3 > = side 2
			side3 = keyboard.nextInt();
			
		}
		
		System.out.println("Your three sides are " +side1+", "+side2+ ", and "+side3+ "." );
		
		if (side1 == side2 || side2 == side3)
		{
			System.out.println("NO! These sides do not make a right triangle.");
			
		}
		else if(side1 < side2 && side2 < side3)
		{
			System.out.println("These do make a right triangle. Yippy-skippy!");
		}
	}

}
