package lol;
import java.util.Scanner;
public class HowOldAreYou {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		
		if ( age < 16)
		{
			System.out.println("You can't drive " + name + ".");
		}
		if (age < 18)
		{
			System.out.println("You can't vote " + name + ".");
		}
		if (age < 25)
		{
			System.out.println("You can't rent a car " + name + ".");
		}
		if (age >= 25)
		{
			System.out.println("You can do anything that's legal " + name + ".");
		}
		

	}

}
