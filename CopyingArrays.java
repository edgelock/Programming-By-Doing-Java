package lol;
import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		
		int arr[] = new int [10];
		int arr2[]= new int [10];
		
		for(int i=1; i<arr.length; i++) {
			arr[i]= 1+ random.nextInt(100);
			arr2[i]= arr[i];
			arr[9]= -7;
			
			System.out.println(arr[i] );
			
			System.out.println("	"+arr2[i]);
		}
		
	}
}
