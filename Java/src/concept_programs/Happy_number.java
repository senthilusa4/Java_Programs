package concept_programs;

import java.util.Scanner;

public class Happy_number {
	
	public static void main(String[] args) 
	{
		Happy_number obj = new Happy_number();
		             obj.happy();
	}
	
			// This method is for CHECKING THE HAPPY NUMBER
			/*
			 * 		# HAPPY NUMBER LOGIC
			 *      
			 *      ###  Square the each digit
			 *      ###  Sum of Square the each digit
			 *      ###  Then, SUM OF DIGIT until it become a single digit
			 *      ###  That single digit result become 1 Means its a HAPPY_NUMBER otherwise NOT 
			 */
			public void happy()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number");
				int n = sc.nextInt();
				int given = n;
				
				sc.close();
				
				int total = 0;
				for(int i=0;i<n;)
				{
					int mod = n%10;
					int sum = mod * mod;
					total = total + sum;
					n=n/10;
					
					if((n==0)&&(total>9))
					{
						n = total;
						total = 0;
					}
				}
				
				if(total==1)
				{
					System.out.println(given + " is HAPPY NUMBER");
				}
				else
				{
					System.out.println(given + " is NOT A HAPPY NUMBER");
				}
			}

}
