package pattern_programs;

public class Pramid_num1 {
	
	public static void main(String args[])
	{
		Pramid_num1 obj = new Pramid_num1();
		            obj.pattern();
	}
	/*      
	 *         1
	 *       1 2 1 
	 *     1 2 3 2 1
	 */
	public void pattern()
	{
		int num = 3;
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			    for(int k=1;k<=i;k++)
			    {
			    	System.out.print(k);
			    }
			    
			    	for(int m=i-1;m>=1;m--)
			    	{
			    		System.out.print(m);
			    	}
			    	
			    	System.out.println();
		}
	}

}


