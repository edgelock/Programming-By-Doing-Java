package compsciwork;
import java.util.*;
public class CollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int num;
		int steps = 0;
		
		
		System.out.println("Starting number:");
		num = keyboard.nextInt();
		
		
		do 
		{
			if (num%2 ==0)
			{
				num = num/2;
				System.out.println("	"+num);
				steps++;
			}
			else if (num%2 != 0)
			{
				num = (num*3)+1;
				System.out.println("	"+num);	
				steps++;
			}
			
		}
		while (num !=1);
		
		
		
		
		System.out.println("Terminated in "+steps+" steps.");
		
			
		
		
		
		
	}

}
