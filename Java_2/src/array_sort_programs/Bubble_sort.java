package array_sort_programs;

public class Bubble_sort {
	
	public static void main(String args[])
	{
		Bubble_sort obj = new Bubble_sort();
		            obj.bubble_sort_asc();
		            obj.bubble_sort_desc();
	}
	
	// This method is for 
    // sorting the array in ascending order
	// 		# Comparing the 0^th index element | another elements
	//      # if 0^th index element value is greater_than another(up-coming element) means that value is swap to 0^th index
	//      # This iteration end got minimum value is store the 0^th index   | Then compare 1^st index ....
	public void bubble_sort_asc()
	{
		int a[] = {10,2,1,5,3,8,7,6};
		
		for(int i=0;i<a.length;i++)        
		{
			for(int j=i+1;j<a.length;j++)  
			{
				if(a[i]>a[j])              
				{
					//System.out.println(a[i]);
 					int temp = a[i];        
					a[i]=a[j];          
					a[j]= temp;           
				}
			}
		}
		  // Display the array in ascending order
		  System.out.println("Ascending order ");
		  for(int i=0;i<a.length;i++) 
		  {
		  System.out.print(a[i] + " "); 
		  }
	 }
	
					// This method is for 
	                // sorting the array in descending order
					//		# Comparing the 0^th index element | another elements
					//      # if 0^th index element value is lesser_than another(up-coming element) means that value is swap to 0^th index
					//      # This iteration end got maximun value is store the 0^th index   | Then compare 1^st index ....
					public void bubble_sort_desc()
					{
						int a[] = {9,2,4,3,0,5,7,6};
						
						for(int i=0;i<a.length;i++)
						{
							for(int j=i+1;j<a.length;j++)
							{
								if(a[i]<a[j])
								{
									int temp = a[i];
									a[i] = a[j];
									a[j]= temp;
								}
							}
						}
						
						  // Display the array in descending order
						  System.out.println();
						  System.out.println("Descending order ");
						  for(int i=0;i<a.length;i++) 
						  {
						  System.out.print(a[i] + " "); 
						  }
					}

}
