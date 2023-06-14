package array_sort_programs;

import java.util.Scanner;

public class Binary_search {
	
	    //     This method is for searching given number is present or not
	
	    //                           BINARY SEARCH
	
	/*
	 * 		   ### Before Search a element should sort in the array | ascending order
	 * 		     
	 * 		  STEP_1 - Checking find element is equal to the mid value means 
	 *                 | Number is find_ed |
	 * 
	 * 		  STEP_2 - Checking find element is greater_than the mid value
	 *                 min value should change to mid_value +1
	 *                 
	 *        STEP_3 - Checking find element is Lesser_than the mid value
	 *                 max value should change to mid_value -1         
	 */
	
	public static void main(String args[])
	{
		Binary_search obj = new Binary_search();
		int ascending[] = obj.ascending_order();
		              //    obj.search(ascending);
		               obj.search1(ascending);
	}
	
	public int[] ascending_order()
	{
		int a[] = {9,3,6,2,5,8,1,-8,4,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
				System.out.println("AFTER ASCENDING ORDERED ARRAY");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i] + " ");
				}
	return a;			
	}
	
	
				public void search(int a[])
				{
					System.out.println();
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter searching element ");
					int find = sc.nextInt();
					
					int min = 0;
					int max = a.length-1;
					
                    int mid =  (min+max)/2;
					
					boolean flag = false;
					for(int i=min;i<=max;)
					{
						mid =(min + max) /2;
						
						if(a[mid]==find)
						{
							flag = true;
							break;
						}
						if(min==max)
						{
							break;
						}
						
							if(a[mid]<find)
							{
								min = mid +1;
							}
								if(a[mid]>find)
								{
									max = mid-1;
								}
					}
								// Checking the searching element is present in the array or not
								if(flag==true)
								{
									System.out.println(find + " is present " + mid + " -index in a array");
								}
								else
								{
									System.out.println(find + " is not present in the array");
								}
				}
				
		/////////////////////////////////////////////////////////////////////////////////////////////		
				
				// This method is for using while loop search a number (BINARY SEARCH) 		
				public void search1(int[] a)
				{
					System.out.println();
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter searching element ");
					int find = sc.nextInt();
					
					int min = 0;
					int max = a.length-1;

					int mid = (min + max) /2;
					
					int count = 0;
					while(true)
					{
						mid = (min + max) /2;
						if(a[mid]==find)
						{
							count++;
							break;
						}
						if(min==max)
						{
							break;
						}
						
							if(a[mid]<find) // FIND above the mid value means
							{
								min = mid +1;
							}
							
								if(a[mid]>find)  // FIND below the mid value means
								{
									max = mid -1;
								}
					}
					
					// Checking the searching element is present in the array or not
					if(count>0)
					{
						System.out.println(find + " is present in "+ mid + " a array");
					}
					else
					{
						System.out.println(find + " is not present in the array");
					}
				}

}
