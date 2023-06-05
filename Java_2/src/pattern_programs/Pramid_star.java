package pattern_programs;

public class Pramid_star {
	
	public static void main(String args[])
	
	{
		Pramid_star obj = new Pramid_star();
		            obj.pramid_pattern_star();
	}
	
	/*
	 *    	    *
	 *    	   * * 
	 *   	  * * *
	 *  	 * * * *
	 * 		* * * * *
	 */
	
	public void pramid_pattern_star()
	{
		for(int row=1;row<=4;row++)
		{
			for(int space=4;space>row;space--)
			{
				System.out.print(" ");
			}
			
				for(int col=1;col<=row;col++)
				{
					System.out.print("*");
				}
				
					for(int temp=1;temp<row;temp++)
					{
						System.out.print("*");
					}
					
					System.out.println();
		}
	}

}
