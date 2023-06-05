package pattern_programs;

public class Down_pramid_star {
	
	/*
	 * 		* * * * *
	 *       * * * *
	 *        * * *
	 *         * *
	 *          *
	 */
	
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}	
				for(int k=i;k<=n;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
	}

}
