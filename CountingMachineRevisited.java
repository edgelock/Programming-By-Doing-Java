package compsciwork;
import java.util.*;
public class CountingMachineRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int numberToCountFrom;
		int numberToCountTo;
		int numberToCountBy;
		int i;
		
		
		
		System.out.println("Count from : ");
		numberToCountFrom = keyboard.nextInt();
		System.out.println("Count to : ");
		numberToCountTo = keyboard.nextInt();
		System.out.println("Count by : ");
		numberToCountBy = keyboard.nextInt();
		
		for ( i = numberToCountFrom; i <= numberToCountTo; i = i + numberToCountBy) //Remember you can do stuff like this within a for loop.
		{
			System.out.println(i + " ");
		}
		System.out.println();
		
	}

}
