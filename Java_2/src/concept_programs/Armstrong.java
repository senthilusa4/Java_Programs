package concept_programs;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String args[])
	{
		Armstrong obj = new Armstrong();
		          //obj.number(153);
		          //obj.number(8208);
		          //obj.number(548834);
		Scanner sc = new Scanner(System.in);
		System.out.println("Checking given number is ARMSTRONG NUMBER OR NOT");
		System.out.print("Enter a number - ");
		int num = sc.nextInt();
		
		obj.number(num);
		          
	}
	
	// This method is for find a ARMSTRONG NUMBER
	// Find count of digit
	// Split the digit |  Each digit multiply count of digit times
	// Then sum the multiply digit value
	
	public void number(int num)
	{
		int given = num;
		int n = num;
		int count = 0;
		int sum = 0;
		
		// Count of digit
		for(int i=0;i<num;num=num/10)
		{
			count++;
		}		
		// System.out.println(count);
				    
			for(int j=0;j<n;n=n/10) // Split digit
			{
				int mod = n%10;
				int mul = 1;
		
				for(int k=1;k<=count;k++) // Multiply count of digit times
				{
					mul = mul * mod;    
				}
				
				sum = sum + mul;    // sum of Each digit multiply value 
			}
			
					if(sum == given)
					{
						System.out.println(given + " is ARMSTRONG NUMBER");
					}
					else
					{
						System.out.println(given + " is NOT A ARMSTRONG NUMBER");
					}
	}

}
