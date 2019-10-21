package compsciwork;
import java.util.Random;
public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int arr[];
		arr = new int[10];
		int arrTwo[];
		arrTwo = new int[10];
		
		for (int i=0; i<arr.length; i++) {	//for loop to randomize 10 elements within arr1	
			arr[i]= 1+random.nextInt(100);
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for (int i=0; i<arr.length;i++) {
			arrTwo[i]=arr[i];
			arrTwo[9]= -7;
			System.out.print(arrTwo[i]+" ");
		}
	}
}
