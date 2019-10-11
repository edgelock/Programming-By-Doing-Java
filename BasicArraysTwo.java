package compsciwork;
import java.util.*;

public class BasicArraysTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random(); // creating random number generator
		int randomNum;
		randomNum = random.nextInt(100); // the 100 in parenthesis determines the amount of numbers that the randomizer can choose from.
		
		int arr[]; // declares an array of integers
		arr = new int[10]; // allocate memory for said amount of integers in array.
		
		arr[0] = random.nextInt(100);// I'm setting all of the elements of the array to equal a random number from 1-100
		arr[1] = random.nextInt(100);
		arr[2] = random.nextInt(100);
		arr[3] = random.nextInt(100);
		arr[4] = random.nextInt(100);
		arr[5] = random.nextInt(100);
		arr[6] = random.nextInt(100);
		arr[7] = random.nextInt(100);
		arr[8] = random.nextInt(100);
		arr[9] = random.nextInt(100);
		
		for (int i=0 ; i< arr.length ; i++) {
			
			// for loop that goes through the length of the array. It should go through 10 times for all the elemnents of the array.
			System.out.println("Slot "+i+" cointains a "+arr[i]);
		}
	}

}
