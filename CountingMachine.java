package compsciwork;
import java.util.*;
public class CountingMachine {

	public static void main(String[] args) {

		int num;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Count to:");
		num = keyboard.nextInt();
		
		for(int i = 0; i<=num ; i++) // This gotta be at 0 for it to work.
		{
			System.out.print(i+" "); // you're printing out the i not the number you entered. 
		}
		
	}

}
