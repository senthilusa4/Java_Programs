package pattern_programs;

public class Butterfly_pattern {
	
	public static void main(String args[])
	{
		Butterfly_pattern obj = new Butterfly_pattern();
		                  obj.butterfly();
	}

	/*
	 * 
	 * 		*           *
	 * 		  *	      *
	 * 		*	*   *   *
	 * 		  *   *   *  
	 * 		*  	*   *   *
	 * 		  *       *
	 * 		*           *
	 */
	
	public void butterfly()
	{
		int n = 7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n+1;j++)
			{
				if(i%2!=0)
				{
					if((i+j == n+1) || (i == j) || (j==1) || (j==7))
					{
					System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				else if(i%2==0)
				{
					if((i+j == n+1)  || (i == j) || (j==2) || (j==6))
					{
					System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
