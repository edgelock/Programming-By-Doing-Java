package lol;
import java.util.Random;
import java.util.Scanner;
public class FindingAValueInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		int arr[] = new int [10];
		int valueToFind;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= 1 + random.nextInt(50);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Value to find: ");
		valueToFind = keyboard.nextInt();
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == valueToFind) {
				System.out.println(valueToFind+" is in the array.");
				System.out.println(valueToFind+" is in the array.");
				System.out.println(valueToFind+" is in the array.");
			
			}
		}
		
	}

}
