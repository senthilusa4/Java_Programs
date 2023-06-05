package array_programs;

public class Union_array_wtout_dup {
	
	public static void main(String args[])
	{
		Union_array_wtout_dup obj = new Union_array_wtout_dup();
		                   obj.merge_without_dup();
	}
	// Step-1  method is for UNION ARRAY (WITHOUT SHOWING THE DUPLICATE)
	//         first should create the result array(c)
	//              # First count how many duplicate present in the array
	//              # Then, ADD array1 length & array2 length and minus the count 
	//              # So that have to create actual result array (length)
	
	// Step-2  Store the first array(a) in to the result array(c)
	
	// Step-3  Store the second array(b) in to result array BUT,
	//         Repeat-eve elements can't store the result array(c) 
	//         so, Check the first-array(a) & second-array(b)
	//         if any equal came means bypass the step 
	//         if not equal came means store the element in result array(c)
	public void merge_without_dup()
	{
		int a[] = {1,2,3,4,5};
		int b[] = {1,6,7,2};
		
		// Count the duplicate elements
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}
		
	//	System.out.println(count);
		
		  int c[] = new int[(a.length+b.length)-count]; // ARRAY Creation
		 
		     	for(int i=0;i<a.length;i++) 
		  		{
		  			c[i] = a[i];
		  		}
		  		
		  		// Display the c-array | after a-array added System.out.println();
		  		System.out.println("c[i] array is"); 
		  		for(int i=0;i<c.length;i++) 
		  		{
		  			System.out.print(c[i] + " "); 
		  		}
		  		
		  				int temp = a.length;
		  				for(int i=0;i<b.length;i++)
		  				{
		  					boolean flag = false;
		  					for(int j=0;j<a.length;j++)
		  					{
		  						if(b[i]==a[j])
		  						{
		  							flag = true;  // whenever equal value came boolean will change to false
		  						}
		  					}
		  					if(flag==false) // whenever boolean equal to false means that is not a repeative element so element will store the result array
		  					{
		  						c[temp]= b[i];
		  						temp++;
		  					}
		  				}
		  				
		  							// Display the c-array | after a-array added System.out.println();
		  				            System.out.println();
		  							System.out.println("After c[i] array is"); 
		  							for(int i=0;i<c.length;i++) 
		  							{
		  								System.out.print(c[i] + " "); 
		  							}
		  					  		
		  							
	}

}



