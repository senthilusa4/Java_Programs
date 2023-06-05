package pattern_programs;

public class Top_right_triangle {

	public static void main(String args[])
	
		{
		Top_right_triangle obj = new Top_right_triangle();
		         obj.print();
		         obj.print1();
		}
	
      /*         1
       *       2 1
       *     3 2 1
       *   4 3 2 1 
       * 5 4 3 2 1
       */
	
	   public void print()
	   {
		int row = 1;   
		while(row <= 5)
			{
			int space = 4;
			while(row <= space)
				{
				System.out.print(" ");
				space--;
				}
					int col = 1;
					while(col <= row)
					    {
						System.out.print(col);
						col++;
					    }
			System.out.println();
			row++;			
			}
	   }
	   
	   
/////////////////////////////////////////////////////////////////////////////

      /*                    
       *                    1
       *                  2 2
       *                3 3 3
       *              4 4 4 4
       *            5 5 5 5 5
       */
	   				public void print1()
	   				{
	   				int row = 1;
	   				while(row <= 5)
	   					{
	   					int space = 4;
	   					while(row <= space)
	   						{
	   						System.out.print(" ");
	   						space--;
	   						} 
	   					        int col = 1;
	   							while(col <= row)
	   							    {
	   								System.out.print(row);
	   								col++;
	   							    }
	   					System.out.println();
	   					row++;
	   					}
	   				}
} 
