package lol;
import java.util.Scanner;
public class CountingWithAWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("HELLO! My name is Inigo Montoya. You killed my father; prepare to die.");
		System.out.println("How many times?");
		int n = keyboard.nextInt();
		
		int counter = 1;
		
		while (counter <= n)
		{
			System.out.println( (counter *10) + ". " +"HELLO! My name is Inigo Montoya. You killed my father; prepare to die.");
			counter++;
		}
		
	}

}
