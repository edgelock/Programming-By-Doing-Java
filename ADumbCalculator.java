package lol;
import java.util.Scanner;
public class ADumbCalculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		float num1, num2, num3, answ;
		
		System.out.println("What is your first number?");
		num1= keyboard.nextFloat();
		System.out.println("What is your second number?");
		num2= keyboard.nextFloat();
		System.out.println("What is your third number?");
		num3= keyboard.nextFloat();
		
		answ= (num1 +num2 + num3)/ 2;
		System.out.println("( " + num1 + " + " + num2 + " + " + num3 + " + " + ")/2 is... " + answ);
		
		
	}

}
