package for_loop_programs;

public class Print_factor {
	
	public static void main(String args[])
	
	{
		Print_factor obj = new Print_factor();             
		             obj.factors(20);
		             
	}
	
	public void factors(int n)
	{
		System.out.println(n + " Factors are : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				System.out.println(i);
			}
		}
	}

}
