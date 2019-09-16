package lol;
import java.util.Scanner;
public class BMICalulator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		double mheight;
		float height, weight;
		double BMI;
		double kweight;
		 
		
		
		System.out.println("What is your height?");
		height = keyboard.nextFloat();
		mheight = (height * .03048);
		
		System.out.println("What is your weight?");
		weight = keyboard.nextFloat();
		kweight = (weight * 2.2);
		
		BMI = kweight/ (mheight * mheight);
		System.out.println("Your BMI is " + BMI);
	}

}
