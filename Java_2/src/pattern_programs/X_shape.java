package pattern_programs;

public class X_shape {
	
	public static void main(String args[])
	{
		X_shape obj = new X_shape();
		        obj.pattern();
	}
	
	public void pattern()
	{
		/*
		 *     *     *   (1,1)(1,5)=6
		 *      *   *    (2,2)(2,4)=6
		 *        *      (3,3)
		 *      *   *    (4,2)=6   (4,4)
		 *     *     *   (5,1)=6   (5,5)
		 */
		
		int row = 5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				// if((i==j) || (i==1 && j==5) || (i==2 && j==4) || (i==4 && j==2) || (i==5 && j==1)) 
				
				if((i+j == row+1) || (i==j)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
