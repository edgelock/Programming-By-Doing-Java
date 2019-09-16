package lol;
import java.util.*;

public class BMICategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		double weight;
		double height;
		double bmi;
		System.out.println("What is your height?");
		height = keyboard.nextDouble();
		
		System.out.println("What is your weight?");
		weight = keyboard.nextDouble();
		
		bmi = weight / (height * height);
		
		if (bmi < 15)
		{
			System.out.println("Your BMI is " + BMI);
			System.out.println("very severely underweight.");
		}
		if (bmi >= 15 && bmi <=16)
		{
			System.out.println("severely underweight.");
		}
		if (bmi>= 16.1 && bmi <=18.4)
		{
			System.out.println("underweight.");
		}
		if (bmi >= 18.5 && bmi <=24.9)
		{
			System.out.println(" normal weight.");
		}
		if (bmi >= 25 && bmi<=29.9)
		{
			System.out.println("overweight.");
		}
		if (bmi >= 30 && bmi<=34.9)
		{
			System.out.println("moderately obese.");
		}
		if (bmi >= 35 && bmi<=39.9)
		{
			System.out.println("severely obese");
		}
		if (bmi >= 40)
		{
			System.out.println("very severely obese.");
		}
		}
	

}
