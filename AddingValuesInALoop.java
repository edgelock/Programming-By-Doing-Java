package lol;
import java.util.*;
public class AddingValuesInALoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int num;
		int sum = 0; 
		
		
	
		System.out.println("I will add up the numbers you give me");
		System.out.println("Number:");
		num = keyboard.nextInt();
		sum = num + sum;
		
				while (num != 0)
				{
					System.out.println("Number:");
					num = keyboard.nextInt();
					sum = num + sum;
					System.out.println("The total so far is " +sum);
					
				}
	}

}
