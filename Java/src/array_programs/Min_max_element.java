package array_programs;

import java .util.Scanner;

public class Min_max_element {
	
	public static void main(String args[])
	{
		Min_max_element obj = new Min_max_element();
		int b[] = obj.given_array();
		
		int max_value = obj.max(b); 
		System.out.println("Ingiven array max element is " + max_value);
		
		int min_value = obj.min(b); 
		System.out.println("Ingiven array min element is " + min_value);
	}
	
	// This method is used for 
	// Gave size of array on runtime
	// Gave element value of the array on runtime
	public int[] given_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int a[] = new int[n]; //Array creation
		
		System.out.println("Enter the " + n + " element");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		    // Display array elements
			System.out.println("a[] array element's are ");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			sc.close();
			
			return a;
	}
	///////////////////////////////////////////////////////////////////////////
				// This method for finding the max element in given array
				public int max(int a[])
				{
					int max = Integer.MIN_VALUE;
				    for(int i=0;i<a.length;i++)
				    {
				    	if(max<a[i])
				    	{
				    		max = a[i];
				    	}
				    }
				return max;
				}
		////////////////////////////////////////////////////////////////////////////////////////////		
						// This method for finding the minimum element in the given array
						public int min(int a[])
						{
							int min = Integer.MAX_VALUE;
							for(int i=0;i<a.length;i++)
							{
								if(min>a[i])
								{
									min = a[i];
								}
							}
							return min;
						}

}
