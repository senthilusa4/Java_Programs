package for_loop_programs;

public class Reverse_num_prime {
	
	public static void main(String args[])
	
	{
		Reverse_num_prime obj = new Reverse_num_prime();
		                  obj.number(74);
		                  obj.number(47);
	}

	public void number(int n)
	{
		int num = n;
		int count = 0;
		int rev = 0;
		
		for(int i=0;i<n;n=n/10)
		{
			int a = n%10;
			rev = (rev*10)+a;
		}
		    int temp = rev;
			for(int j=2;j<=rev;j++)
			{
				if(rev%j==0)
				{
					count++;
				}
			}
			
					if(count==1)
					{
						System.out.println(num + " Reverse of " + temp + " is PRIME");
					}
					else 
					{
						System.out.println(num + " Reverse of " + temp + " is NOT PRIME");
					}
     }
}
