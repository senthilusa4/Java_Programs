package array_programs;

import java.util.Scanner;

public class Within_range_elements {
	
	public static void main(String args[])
	{
		Within_range_elements obj = new Within_range_elements();
	                          obj.range_between_value();	   
	}
	
	
	// This method is for finding or print within a range elements in a given array
	//     # OUTPUT - if user giving range 5 to 10 means probable chance (6,7,8,9) 
	//                In array (6,7,8,9) is anyone or more elements there means that all are within range.
	
	//       int a[] = {1,2,3,4,5}; user give range 2 to 4
	//     # EXPECT_OUTPUT - 3 
	public void range_between_value()
	{
		int a[] = {7,4,5,9,8,1,0};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the left range value");
		int x = sc.nextInt();
		
		System.out.println("Enter the Right range value");
		int y = sc.nextInt();
	
		System.out.println("Left range number " + x);
		System.out.println("Right range number " + y);
		
		System.out.println();
		System.out.println(x + " and "+ y + " with in a range array value's are");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=x+1;j<y;j++)
			{
				if(a[i]==j)
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
