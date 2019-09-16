package lol;
import java.util.Scanner;
public class HowOldAreYouSpecifically {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("Hey, what's your name? (Sorry, I keep forgetting.");
		name = keyboard.next();
		
		System.out.println("Ok, " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if (age < 16)
		{
			System.out.println("You can't drive.");
		}
		else if ( age == 16)
		{
			System.out.println("You can drive but not vote");
		}
		else if (age == 17)
		{
			System.out.println("You can drive but not vote");
		}	
		else if (age == 18)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 19)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 20)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 21)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 22)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 23)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age == 24)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else
		{
			System.out.println("You can do pretty much anything.");
		}
	
	
	
	}
	
		
		

}
