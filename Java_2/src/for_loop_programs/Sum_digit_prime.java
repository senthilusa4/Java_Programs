package for_loop_programs;

public class Sum_digit_prime {
	
	public static void main(String args[])
	
	{
		Sum_digit_prime obj = new Sum_digit_prime();
		                obj.num(9839);
		                obj.num(253);
		                obj.num(-23);
	}

	public void num(int n)
	{
	if(n>9)
	{
		int given = n;
		int sum =0;
		int count = 0;
		
		for(int i=0;i<n;n=n/10)
		{
			int a = n%10;
			sum = sum +a;
		}
		int value = sum;
		
			for(int j=2;j<=sum;j++)
			{
				if(sum%j==0)
				{
					count++;
				}
			}
			
					if(count==1)
					{
						System.out.println(given + " -- is sum of " + value + " is Prime");
					}
					else
					{
						System.out.println(given + " -- is sum of " + value + " is Prime");
					}
	    }			
		else
		{
			System.out.println(n + " Check your given number");			
		}
	}
}

