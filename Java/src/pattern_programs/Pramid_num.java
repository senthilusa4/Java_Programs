package pattern_programs;

public class Pramid_num {
	
	public static void main(String args[])
	{
		Pramid_num obj = new Pramid_num();
		           obj.pattern_num();
	}
	
	/*        1
	 *      2 1 2
	 *    3 2 1 2 3
	 */
	
	public void pattern_num()
	{
		int num=3;
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>i;j--)
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
