package lol;
import java.util.Scanner;
public class AskingQuestions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height, height2;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.next();

		System.out.print( "How many inches? " );
		height2 = keyboard.next();
		
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + height2 + " tall and " + weight + " heavy." );

	}

}
