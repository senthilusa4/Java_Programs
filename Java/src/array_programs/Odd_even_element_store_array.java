package array_programs;

public class Odd_even_element_store_array {
	
	public static void main(String args[])
	{
		Odd_even_element_store_array obj = new Odd_even_element_store_array();
		                             Static.size();
		                             Static.element();
		                             Static.display();
		                          // obj.split_array_odd_even_elementwise();
		                             obj.another_way();
	}
	
	// This method is for
	//     # Check the given array | EXTRACT ODD element in one array & EVEN elements in one array
	//     # EXPECTATION - odd element are should store in one array  | even elements should store in one array
	//     # OUTPUT - Given array[1,2,3,4,5] | EXPECT - ODD array[1,3,5] even array[2,4]
	public void split_array_odd_even_elementwise()
	{
		int b[] = Static.a;
		//int bk[] = b;   backup array
		
		int odd_count = 0;
		int even_count = 0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("ODD element present " + odd_count +" Times");
		System.out.println("EVEN element present " + even_count + " Times");
		
				int odd[] = new int[odd_count];
				int even[] = new int[even_count];
				
				System.out.println();
				
				System.out.println(odd.length);
				System.out.println(even.length);
				
				int s=0;
				for(int i=0;i<b.length;i++)
				{
					if(b[i]%2==0)
					{
					  even[s]=b[i];
					  s++;
				    }
				}	
				
					int z=0;
					for(int i=0;i<b.length;i++)
					{
						if(b[i]%2!=0)
						{
						   odd[z]=b[i];
						   z++;
						}
					}
					
					        // Display | ODD & EVEN - ARRAY
							System.out.println();
							System.out.println("ODD elements ARRAY is");
							for(int i=0;i<odd.length;i++)
							{
								System.out.print(odd[i]+ " ");
							}
							
							System.out.println();
							System.out.println("EVEN elements ARRAY is");
							for(int i=0;i<even.length;i++)
							{
								System.out.print(even[i]+ " ");
							}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public void another_way()
	{
		int b[] = Static.a;
	//	int bk[] = b;  backup array
		
		int odd_count = 0;
		int even_count = 0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("ODD element present " + odd_count +" Times");
		System.out.println("EVEN element present " + even_count + " Times");
		
				int odd[] = new int[odd_count];
				int even[] = new int[even_count];
				
				System.out.println();
				
				System.out.println("ODD LENGTH is " + odd.length);
				System.out.println("EVEN LENGTH is " + even.length);
				
				int o=0;
				int e=0;
				for(int i=0;i<b.length;i++)
				{
					if(b[i]%2==0)
					{
						even[e]=b[i];
						e++;
					}
					else
					{
						odd[o]=b[i];
						o++;
					}
				}
				
							// Display | ODD & EVEN - ARRAY
							System.out.println();
							System.out.println("ODD elements ARRAY is");
							for(int i=0;i<odd.length;i++)
							{
								System.out.print(odd[i]+ " ");
							}
							
							System.out.println();
							System.out.println("EVEN elements ARRAY is");
							for(int i=0;i<even.length;i++)
							{
								System.out.print(even[i]+ " ");
							}
	}

}
