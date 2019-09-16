package lol;
import java.util.*;
public class AgeMessagesThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		if (age< 16)
		{
			System.out.println("You can't drive.");
		}
		else if (age <= 17)
		{
			System.out.println("You can dive but not vote");
		}
		else if (age>= 18 && age <=24 )
		{
			System.out.println("You can vote but not rent a car");}
		else if (age >= 18  && age <=25 )
		{
			System.out.println("You can do pretty much anything");
		}
		
		
		

	}

}
