package lol;
import java.util.Scanner; 
public class NameAgeAndSalary {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		double age;
		int money;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi " + name + " How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + " ,eh? That's not old at all!");
		System.out.println("How much do you make" + name + "?");
		money = keyboard.nextInt();
		
		System.out.println(money + "! I hope that's per hour and not per year! LOL!");
		
		
	}

}
