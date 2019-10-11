package compsciwork;

import java.util.Random;

public class BasicArraysThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		
		int arr[]; // declares an array of integers
		arr = new int[1000]; // declares space for 1000 elements
		
		
		
		for (int i=0; i<arr.length; i++) { // a for loop that traverses the array of 1000 elements
			
			arr[i] = 10 + random.nextInt(90); 
		// putting the i within the array will allow me to set every element in the array equal to a random number
		// also this is how you choose random numbers from a particular range
			System.out.println(arr[i] + "\t"); // I'm printing out the ith spot within the array because it'll always be randomized.
			}
			
			

		
		

	}

}
