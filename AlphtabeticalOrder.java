package lol;
import java.util.*;
public class AlphtabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner keyboard = new Scanner(System.in);
				
		 
//		System.out.println("What's your name?");
//		String name;
//		name = keyboard.next();
//		
//		int checker;
//		
//		checker = name.compareTo("dog");
//
//		if (checker > 10)
//		{System.out.println(" It''s be a while.");}
//		else if (checker <=10 )
//		{System.out.println("It won't be long.");

		
		System.out.println("What's your last name?");
		String lastname;
		lastname = keyboard.next();
		
		
		int a,b,c,d;
		a = lastname.compareTo("Carsewell");
		b = lastname.compareTo("Jones");
		c = lastname.compareTo("Smith");
		d = lastname.compareTo("Young");
		
		if( a >= 0)
		{
			System.out.println("you don't have to wait long, " +lastname);
		}
		else if (b >=0)
		{
			System.out.println("that's not bad, " + lastname);
		}
		else if (c >=0)
		{
			System.out.println("looks liek a bit of a wait, " +lastname);
		}
		else if (d >=0)
		{
			System.out.println("it's gonna be a while" + lastname + ".");
		}
		else if (d <= 0)
		{
			System.out.println("not going anywhere for a while, " + lastname +"?");
		}
		
		
	}

}

	
