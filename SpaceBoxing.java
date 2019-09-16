package lol;
import java.util.Scanner;
public class SpaceBoxing {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double earthweight;
		double planetnumber;
		double weight;
		double venus, mars, jupiter, saturn, uranus, neptune;
		venus = .78;
		mars = .39;
		jupiter = 2.65;
		saturn = 1.17;
		uranus = 1.05;
		neptune = 1.23;
		
		
		System.out.println("Please enter your current earth weight:");
		earthweight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets:"
				+ "1. Venus	2. Mars 	3. Jupiter"
				+ "4. Saturn	5. Uranus	6. Neptune");
		System.out.println("Which planet are you visiting?");
		planetnumber = keyboard.nextDouble();
		
		if (planetnumber <= 1)
		{
			weight = (earthweight * venus);
			System.out.println("Your weight would be " + weight );
		}
		else if (planetnumber == 2 )
		{
			
			weight = (earthweight * mars);
			System.out.println("Your weight would be " + weight );
		}
		
		else if (planetnumber == 3 )
		{
			
			weight = (earthweight * jupiter);
			System.out.println("Your weight would be " + weight );
		}
		
		else if (planetnumber == 4 )
		{
			
			weight = (earthweight * uranus);
			System.out.println("Your weight would be " + weight );
		}
		
		else if (planetnumber == 5 )
		{
			
			weight = (earthweight * neptune);
			System.out.println("Your weight would be " + weight );
		}
		else
		{
			System.out.println("");
		}
		
		
		
		
		
	}

}
