package lol;
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("WELCOME TO MITCHELL'S TINY AVENTURE!");
		
		System.out.println("You are in a creepy house!  Would you like to go 'upstairs' or into the 'kitchen?' "); //room1
		String answer1;
		String answer2;
		String answer3;
		
		answer1 = keyboard.next();
		
		if (answer1.equals("kitchen")) 
		{
			System.out.println("You're in the kitchen.");//room2
			System.out.println("Would you like to go to 'garage' or 'dum'?");
			answer2 = keyboard.next();
			if (answer2.equals("garage"))
			{
				System.out.println("You are in the garage.");//room5
			}
			else if (answer2.equals("dum"))
			{
				System.out.println("You are in the dum.");//room6
			}
		}
		else if (answer1.equals("upstairs"))
		{
			System.out.println("You're upstairs"); //room3
			System.out.println("Would you like to go to 'bathroom' or 'bedroom?");
			answer2 = keyboard.next();
			if (answer2.equals("bathroom"))
			{
				System.out.println("You are in the bathroom.");//room7
			}
			else if (answer2.equals("bedroom"))
			{
				System.out.println("You are in the bedroom.");//room8
			}
		}
		
	}

}
