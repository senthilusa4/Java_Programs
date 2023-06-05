package concept_programs;

import java.util.Scanner;

public class Rev_num_range {
	
	public static void main(String args[])
	{
		Rev_num_range obj = new Rev_num_range();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int n = sc.nextInt();
		  
		  obj.number(n);
	}
	
	    // This method is for REVERSE GIVEN NUMBER
	    // POSTIVE & NEGATIVE scenario
		public void number(int n)
		{
			int num = n;
			int rev = 0;
			
		if((n>9)||(n<9))
		{
			if(n>9)
			{
				for(int i=1;i<=n;n=n/10)
				{
					int mod = n%10;
					rev = (rev*10) + mod;
				}
				
				System.out.println(num + " Reverse is " + rev);
			}
			
			int num1= num;
			int rev1 = 0;
					if(n<-9)
					{
						for(int i=-1;i>=num1;num1=num1/10)   // -12/10 = -1  
						{
							int mod = num1%10;               // -12%10=-2  // -1%10 = -1
							rev1 = (rev1*10) + mod;          // -2         // -20 -1 = -21
						}
						
						System.out.println(num + " Reverse is " + rev1);
					}
		}			
		else
		{
			System.out.println("Please enter two digit number");
		}
					
			
		}

}
