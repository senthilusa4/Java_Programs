package pattern_programs;

public class Palindrome_pattern {
	
	public static void main(String[] args)
	{
		Palindrome_pattern obj = new Palindrome_pattern();
		                   obj.palin_pattern();
	}
	
	
	/* 
	 * 			    1
	 * 			  2 1 2
	 * 			3 2 1 2 3	
	 * 		  4 3 2 1 2 3 4
	 */
	public void palin_pattern()
	{
		int n = 4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
					for(int m=2;m<=i;m++)
					{
						System.out.print(m);
					}
		System.out.println();
		}
			
	}

}
