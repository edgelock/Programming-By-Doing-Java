package lol;
import java.util.Scanner;
public class TwentyQuestionsWellActuallyJustTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String answer1;
		String answer2;
		
		System.out.println("animal, vegeteble, or mineral?");
		answer1 = keyboard.next();
		
	
		if (answer1.equals("animal"))
			
		{
			System.out.println("is it bigger than a breadbox?");
			answer2 =keyboard.next();
			
			if(answer2.equals("yes"))
				
			{
				System.out.println("My guess is that you are thinking of a moose.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
			else if (answer2.equals("no"))
			{
				System.out.println("My Guess is that you are thinking of a squirrel.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
		}
		
		else if (answer1.equals("vegeteble"))
		{
			System.out.println("is it bigger than a breadbox?");
			answer2 = keyboard.next();
			
			if(answer2.equals("yes"))
			{
				System.out.println("My guess is that you are thinking of a watermelon.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
			else if (answer2.equals("no"))
			{
				System.out.println("My guess is that you are thinking of a carrot.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
			
		}
		
		else if (answer1.equals("mineral"))
		{
			System.out.println("is it bigger than a breadbox?");
			answer2= keyboard.next();
			
			if(answer2.equals("yes"))
			{
				System.out.println("My guess is that you are thinking of a Camaro.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
			else if (answer2.equals("no"))
			{
				System.out.println("My guess is that you are thinking of a paper clip.");
				System.out.println("I would as you if I'm right, but I don't actually care.");
			}
			
		}
	}

}
