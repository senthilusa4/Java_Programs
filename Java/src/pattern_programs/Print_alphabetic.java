package pattern_programs;

public class Print_alphabetic {
	
	public static void main(String args[])
	{
		Print_alphabetic obj = new Print_alphabetic();
		                 obj.number();
		                 obj.pattern();
	}
	
	public void number()
	{
		int n = 4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		      if(i==1)
		      {
		    	  System.out.print("a");
		      }
		       	else if(i==2)
		      	{
		    	     System.out.print("b");
		      	}
		      	  else if(i==3)
		      	  {
		      		  System.out.print("c");
		      	  }
		      	  	else
		      	  	{
		      	  		System.out.print("d");
		      	  	}
		      
		      }
			System.out.println();
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	/*         a a a a
	 *         b b b b
	 *         c c c c
	 *         d d d d
	 */
					public void pattern()
					{
						char var = 'a';
						int n = 4;
						for(int i=1;i<=n;i++)
						{
							for(int j=1;j<=n;j++)
							{
								System.out.print(var);
							}
							System.out.println();
							var++;	
						}

					}

					
}
