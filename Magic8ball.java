package lol;
import java.util.Random; //input this for you to create a random number picker
public class Magic8ball {

	public static void main(String[] args) {
		
		
		Random r = new Random(); //input this like you do with scanner; so you can use it.
		
		int choice = 1 + r.nextInt(20);
		String response = "";
		
		if ( choice == 1 )
			response = "It is certain";
		else if ( choice == 2 )
			response = "It is decidedly so";
		else if ( choice == 3 )
			response = "Without a doubt";
		else if ( choice == 4 )
			response = "Yes - definitely";
		else if ( choice == 5 )
			response = "You may rely on it";
		else if ( choice == 6 )
			response = "As I see it, yes";
		else if ( choice == 7 )
			response = "Most likely";
		else if ( choice == 8 )
			response = "Outlook good";
		else if ( choice == 9 )
			response = "Signs point to yes";
		else if ( choice == 10 )
			response = "Yes";
		else if ( choice == 11 )
			response = "Reply hazy, try again";
		else if ( choice == 12 )
			response = "Ask again later";
		else if ( choice == 13 )
			response = "Better not tell you now";
		else if ( choice == 14 )
			response = "Cannot predict now";
		else if ( choice == 15 )
			response = "Don't count on it.";
		else if ( choice == 16 )
			response = "My reply is no.";//1
		else if ( choice == 17 )
			response = "My resources say no.";
		else if ( choice == 18 )
			response = "Out look not so good";
		else if ( choice == 19 )
			response = "Very doubtful.";
		else if ( choice == 20 )
			response = "Concentrate and ask again";
		else 
			
			response = "8-BALL ERROR!";

		System.out.println( "MAGIC 8-BALL SAYS: " + response );
	}

}
