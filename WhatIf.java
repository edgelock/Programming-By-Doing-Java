package lol;

public class WhatIf {

	public static void main(String[] args) {
	
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		if (people < cats) // I think the if prints out the sysout if the statement following "if" is true. // I think the purpose of the curly braces in the if statement is to show what code will be executed 
		{
				System.out.println("Too many cats! The world is doomed!");
		}
		if (people > cats)
		{
				System.out.println("Not many cats! The world is saved!");
		}
		if (people < dogs )
		{
				System.out.println("The world is drooled on!");
		}
		if (people > dogs)
		{
				System.out.println("The world is dry!");
		}
		
		dogs +=5;
		if (people >= dogs)
		{
				System.out.println("People are greater than or equal to dogs.");
		}
		if (people <= dogs)
		{
			System.out.println("People are less than or equal to dogs.");
		}
		if(people == dogs)
		{
			System.out.println("People are dogs.");
		}
	}

}
