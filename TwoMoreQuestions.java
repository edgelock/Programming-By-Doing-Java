package lol;
import java.util.*;
public class TwoMoreQuestions {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String answer1;
		String answer2;
		
		System.out.println("Think of something and I'll try to guess it!");
		
		System.out.println("Does it stay inside or outside or both?");
		answer1 = keyboard.next();
		System.out.println("Is it a living thing?");
		answer2 = keyboard.next();
		
		if (answer1.equals("inside") && answer2.equals("not alive"))
		{
			System.out.println("It's a shower curtain.");
		}
		if(answer1.equals("inside") && answer2.equals("alive"))
		{
			System.out.println("It's a houseplant.");
		}
		if(answer1.equals("outside") && answer2.equals("not alive"))
		{
			System.out.println("It's a billboard.");
		}
		if(answer1.equals("outside") && answer2.equals("alive"))
		{
			System.out.println("It's a Bison.");
		}
		if(answer1.equals("both") && answer2.equals("alive"))
		{
			System.out.println("It's a Dog.");
		}
		if(answer1.equals("both") && answer2.equals("not alive"))
		{
			System.out.println("It's a cell phone.");
		}
		
	}

}
