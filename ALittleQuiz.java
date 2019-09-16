package lol;
import java.util.Scanner;
public class ALittleQuiz {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int answer1;
		int answer2;
		int answer3;
		int count;
		count = 0;
		System.out.println("Are you ready for quiz?");
		keyboard.next();
		
		System.out.println("What is the capital of Alaska?");
		System.out.println("1. Melbourne 2. Anchorage 3. Juneau");
		answer1 = keyboard.nextInt();
		
		if (answer1 == 1)
		{
			System.out.println("That's wrong.");
			
		}
		else if (answer1 == 2)
		{
			System.out.println("That's wrong.");
			
		}
		else if (answer1 ==3)
		{
			System.out.println("That's Correct!");
			
			if (answer1 ==3)
			{
				count = 1;
			}
			else if (answer1==1)
			{
				count =0;
			}
			else if (answer1==2)
			{
				count=0;
			}
			
			
			
			
			
			
			
		}
		
		System.out.println("Can you store the value 'cat' in a variable type int?");
		System.out.println("1. Yes 2. No");
		answer2 = keyboard.nextInt();
		
		if (answer2 == 1)
		{
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
			
		}
		else if (answer2 ==2)
		{
			System.out.println("That's correct!");
			
		}
		
		
		if (answer2 ==2)
		{
			count = count + 1;
		}
		else if (answer2==1)
		{
			count = count;
		}
	
		
		
		
		
		
		
		System.out.println("What is the result of 9+6/3");
		System.out.println("1. 5 2. 11 3. 15/3");
		answer3= keyboard.nextInt();
		
		if (answer3 == 1)
		{
			System.out.println("That's wrong.");
			
		}
		else if (answer3 == 2)
		{
			System.out.println("That's wrong.");
			
		}
		else if (answer3 ==3)
		{
			System.out.println("That's correct!");
			
		}
		

		if (answer3 ==3)
		{
			count = count + 1;
		}
		else if (answer3==2)
		{
			count = count;
		}
		else if (answer3==1)
		{
			count = count;
		}
		
		
		
		
		
		if (count == 1)
		{
			System.out.println("Overall, you got 1 out of 3 correct.");
		}
		else if (count ==2)
		{
			System.out.println("Overall you got 2 out of 3 correct.");
		}
		else if (count ==3)
		{
			System.out.println("Overall you got 3 out of 3 correct.");
		}
		else if (count ==0)
		{
			System.out.println("Overall you got 0 out of 3 correct.");
		}
		

	}

}
