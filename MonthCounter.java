package lol;

public class MonthCounter {
	public static String month_name( int month ) // the letters indicate that you have a function made with this name
												// that indicates for you to call said function your call must have the same name
	{
		String result ="";
		
		if (month==1) {
			result = "Janurary";
		}
		else if (month==2) {
			result = "feb";
		}
		else if (month ==3) {
			result = "mar";
		}
		else if (month ==4) {
			result = "apr";
		}
		else if (month ==5) {
			result = "may";
		}
		else if (month ==6) {
			result = "jun";
		}
		else if (month ==7) {
			result = "july";
		}
		else if (month ==8) {
			result = "aug";
		}
		else if (month ==9) {
			result = "sep";
		}
		else if (month ==10) {
			result = "oct";
		}
		else if (month ==11) {
			result = "nov";
		}
		else if (month ==12) {
				result = "dec";
		}
		else if (month ==43) {
			result = "error";
		}		
		return result;
	}


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );// the number in the parthenthesis is what it being passed into the function
		System.out.println( "Month 2: " + month_name(2) );// so that means your function should have a kind of statement that responds to ints
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );

}
}
