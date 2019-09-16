package lol;

public class NumbersAndMath {

	public static void main(String[] args) {
		System.out.println( "I will now count my chickens:" );

		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) ); // Divides 30 by 6 and adds it to 25
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) ); // Multiplies 25 times 3, then gets 75 moudulous 4, and subtractcs the mob from 100

		System.out.println( "Now I will count the eggs:" );

		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4.0 + 6 ); //PEMDAS; Parentheses Exponents Multiplication Division Modulous Division Addition Subtraction 
																	 //If you change something like "3" to "3.0" you can get a float for more precision. Division only gets you whole numbers.
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		System.out.println( 3 + 2 < 5 - 7 ); // If you type in an inequality into the sys.out you'll get whether its true or false.

		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) ); // You can do math on the sides of lines that you print out
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		System.out.println( "Oh, that's why it's false." ); 

		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
		

	}

}
