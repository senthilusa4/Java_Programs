package for_loop_programs;

public class Prime_or_not {
	
	public static void main(String args[])
	{
		Prime_or_not obj = new Prime_or_not();
		             obj.prime(47);
		             obj.prime(4);
	}
	
	public void prime(int n)
	{
		int count = 0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.println(n + " is PRIME");
		}
		else
		{
			System.out.println(n + " is NOT A PRIME");
		}
	}

}
