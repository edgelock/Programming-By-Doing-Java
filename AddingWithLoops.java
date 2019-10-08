package compsciwork;
import java.util.Scanner;		
public class AddingWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int num= 0; //setting variables
		int sum= 0;
		
		System.out.println("Number:");
		num = keyboard.nextInt(); // making one the num you put in
		sum = num + sum; // making one a variable so that you'll have the loop working for you.
		
		
		while (num != 0)
		{
			System.out.println("The total so far is "+sum+".");
			System.out.println("Number: ");
			num = keyboard.nextInt();
			
			sum = num + sum;
			
		}
		System.out.println();
		System.out.println("The total is" +sum+".");
		
		
		}

	}


