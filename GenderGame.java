package lol;
import java.util.*;

public class GenderGame {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	String gender;
	String name;
	String lname;
	int age;
	String response;
		System.out.println("What is your gender (M or F)");
		gender = keyboard.next();
		System.out.println("What is your first name?");
		name = keyboard.next();
		System.out.println("What is your last name?");
		lname = keyboard.next();
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		
		
		if (gender.equals("F") && age >= 20)
		{
			System.out.println("Are you married, " + name + "? (Y or N)");
			response = keyboard.next();
			if (response.equals("Y"))
			{System.out.println("Then I shall call you Mrs. " + lname);}
			else
			{System.out.println("Then I shall call you " + name + lname);}
		}
		if (gender.equals("F") && age < 20)
		{
			System.out.println("Then I shall call you " + name + lname);
		}
		
		if (gender.equals("M") && age >= 20)
		{
			System.out.println("Then I shall call you Mr. "  + lname);
		}
		if (gender.equals("M") && age <20)
		{
			System.out.println("Then I shall call you " + name + lname);
		}
		
		
		

	}

}
