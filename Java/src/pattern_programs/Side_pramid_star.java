package pattern_programs;

public class Side_pramid_star {
	

	public static void main(String args[])
	{
		Side_pramid_star obj = new Side_pramid_star();
		                 obj.right_pramid();
		                 obj.left_pramid();
	}
		/*
		 * 		*
		 * 		* *
		 * 		* * *
		 *      * * 
		 *      *
		 */
	
		// Math.abs mean whenever give negative value it change positive value
		// In this pattern once it goes increment after it goes decrement means only get the output
		//    # In the pattern row is increase up-to 3 and then it reduce up-to 1
		//    # So only used math.abs class 
		public void right_pramid()
		{
		    int n=2;
			for(int i=n;i>=-n;i--)
			{
				for(int j=n;j>=Math.abs(i);j--)
				{
					System.out.print("* ");
				}
			System.out.println();
			}
		}
		
				/*
				 * 		    *
				 * 		  * *
				 * 		* * *
				 *        * *
				 *          *
				 */
				public void left_pramid()
				{
					int n=2;
					for(int i=n;i>=-n;i--)
					{
						for(int j=0;j<Math.abs(i);j++)
						{
							System.out.print(" ");
						}
							for(int k=Math.abs(i);k<=n;k++)
							{
								System.out.print("*");
							}
					System.out.println();		
					}
					
				}
	
}
