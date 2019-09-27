package compsciwork;
import java.util.*;
public class BasicArraysZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int[] arr; // declares an array of integers.
		
		arr = new int[9]; // allocate memorty for said ammount of integers
		
		arr[0] = -113; // initialize the elements within the array
		
		arr[1]= -113;
		arr[2]= -113;
		arr[3]= -113;
		arr[4]= -113;
		arr[5]= -113;
		arr[6]= -113;
		arr[7]= -113;
		arr[8]= -113;
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Slot " + i  + " contains a "+ arr[i]);
	
	}

}
