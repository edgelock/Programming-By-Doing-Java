package lol;

public class MoreVariablesAndPrinting {

	public static void main(String[] args) {
		{
	        String Name, Eyes, Teeth, Hair;
	        int Age, Height, Weight;

	        Name = "Zed A. Shaw";
	        Age = 35;     // not a lie
	        Height = 74;  // inches
	        double Feet = Height / 12;
	        Weight = 180; // lbs
	        double Kilos = Weight / 2.2; 
	        Eyes = "Blue";
	        Teeth = "White";
	        Hair = "Brown";

	        System.out.println( "Let's talk about " + Name + "." );
	        System.out.println( "He's " + Height + " inches or " + Feet + " feet tall." );
	        System.out.println( "He's " + Weight + " pounds heavy or " + Kilos + " kilos");
	        System.out.println( "Actually, that's not too heavy." );
	        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
	        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

	        // This line is tricky; try to get it exactly right.
	        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
	            + " I get " + (Age + Height + Weight) + "." );

	}

}
}
