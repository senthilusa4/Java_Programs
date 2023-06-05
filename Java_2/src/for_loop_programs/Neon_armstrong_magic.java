package for_loop_programs;

public class Neon_armstrong_magic {
	
	public static void main(String args[])
	{
		Neon_armstrong_magic obj = new Neon_armstrong_magic();
		                     obj.for_neon(9);
		                     obj.for_neon(19);
		              ///////////////////////////////////
		                     obj.for_armstrong(153);
		                     obj.for_armstrong(256);
		             ////////////////////////////////////        
		                     obj.for_magic(1458);
		                     obj.for_magic(18);
	}
	
	public void for_neon(int n)
	{
		int num = n*n;
		int sum = 0;
		
		for(int i=0;i<num;num=num/10)
		{
			int a = num%10;
			sum = sum + a;
		}
		
			if(n == sum)
			{
				System.out.println(n + " is NEON");
			}
			else
			{
				System.out.println(n + " is NOT NEON");
			}
	}
	
///////////////////////////////////////////////////////////////////////
	
				public void for_armstrong(int n)
				{
					int given = n;
					int sum = 0;
					
					for(int i=0;i<n;n=n/10)
					{
						int a = n%10;
						int cube = a*a*a;
						sum = sum + cube;
					}
					
					if(given == sum)
					{
						System.out.println(given + " is ARMSTRONG NUMBER");
					}
					else
					{
						System.out.println(given + " is NOT ARMSTRONG NUMBER");
					}
				}
				
/////////////////////////////////////////////////////////////////////////////////////
				
						public void for_magic(int n)
						{
						  int num = n;
						  int sum = 0;
						  int rev = 0;
						  for(int i=0;i<n;n=n/10)
						  {
							  int a = n%10;
							  sum = sum + a;
						  }
						  int value = sum;
						  		for(int j=0;j<sum;sum=sum/10)
						  		{
						  			int b = sum%10;
						  			rev = (rev*10) + b;
						  		}
						  		
						  				int magic = value * rev;
						  				
						  				if(num == magic)
						  				{
						  					System.out.println(num +" is MAGIC NUMBER");
						  				}
						  				else
						  				{
						  					System.out.println(num + " is NOT A MAGIC NUMBER");
						  				}
						}
				

}
