package lol;

public class ElseAndIf {

	public static void main(String[] args) {
		
		int people = 30;
		int cars = 40;
		int buses = 15;
		// if you remove one of the "else" in the "else if" it just becomes another "if" statement and breaks the "If - else if - else" trio goingo n.
		if (cars > people)
		{
			System.out.println("We should take the cars.");
		}
		else if (cars < people) // I think the "else if" is a secondary case to the if that it follows.
		{
			System.out.println("We should not take the cars.");
		}
		else // I think the "else" is a 3rd case to the if that it follows.
		{
			System.out.println("we can't decide.");
		}
		if (buses > cars)
		{
			System.out.println("That's too many buses");
		}
		else if (buses < cars)
		{
			System.out.println("Maybe we could take teh buses");
		}
		else
		{
			System.out.println("We still can't decide.");
		}
		if (people > buses)
		{
			System.out.println("All right, lets just take the buses.");
		}
		else 
		{
			System.out.println("Fine let's stay home then.");
		}

	}

}
