package pattern_programs;

public class Bottom_left_triangle {
	
	public static void main(String args[])
		{
		Bottom_left_triangle obj = new Bottom_left_triangle();
		         obj.print();
		         obj.print1();
		}
		
	/*     1 2 3 4 5
	 *     1 2 3 4 
	 *     1 2 3
	 *     1 2
	 *     1
	 */
	public void print()
	{
		int row = 5;
		while(1 <= row)
		   {
			int col = 1;
			while(col <= row)
			    {
				System.out.print(col + " ");
				col++;
			    }
			System.out.println();
			row--;
		   }
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////
	
	    /*      1 1 1 1 1
	     *      2 2 2 2
	     *      3 3 3 
	     *      4 4  
	     *      5        
	     */
	
				public void print1()
				{
					int row = 1;
					while(row <= 5)
						{
						int col = 5;
						while(col >= row)
							{
							System.out.print(row + " ");
							col--;
							}
						System.out.println();
						row++;
						}
				}

}
