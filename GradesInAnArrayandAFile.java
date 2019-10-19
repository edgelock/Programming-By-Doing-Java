package lol;
import java.util.*;
import java.util.Random;

public class GradesInAnArrayandAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		String name;
		String fileName;
		int arr[]= new int[5];
		
		System.out.println("Name (first last):");
		name = keyboard.next();
		System.out.println("File name:");
		fileName = keyboard.next();
		for(int i=0; i<arr.length; i++) {
			arr[i]= 1 + random.nextInt(100);
		}
			
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		System.out.println("Grade 1: "+arr[0]);
		System.out.println("Grade 2: "+arr[1]);
		System.out.println("Grade 3: "+arr[2]);
		System.out.println("Grade 4: "+arr[3]);
		System.out.println("Grade 5: "+arr[4]);
		System.out.println("Data saved in \""+fileName+".txt\".");
	}

}
