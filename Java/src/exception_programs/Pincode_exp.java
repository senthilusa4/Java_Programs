package exception_programs;

import java.util.Scanner;

public class Pincode_exp {
	
	// Throw keyword
	// Used for can throw the User create customized exception  
	
	public void num(int a) 
	{
		int n = 600000;
		int m = 700000;
		try
		{
			if((n<=a) && (m>a))
			{
				System.out.println("Verified");
			}
				if((n>a)||(m<a))
				{
				throw new UnverifiedPincodeException("Not verified pincode number");
				}
		}
			catch(UnverifiedPincodeException e)
	     	{
				String s =e.getMessage();
				System.out.println(s);
		    }
	}
	
	
				public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("Please enter your pincode");
					int p = sc.nextInt();
					
					Pincode_exp obj = new Pincode_exp();
					            obj.num(p);
					            
					sc.close();            
					            
				}

}