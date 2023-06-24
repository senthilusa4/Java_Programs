package array_programs;

import java.util.Scanner;

public class Find_element {
	
	public static void main(String args[])
	{
		Find_element obj = new Find_element();
		             obj.find();
	}

	/*
	 *  This method is used for finding element Present in the array or not
	 */
	
	public void find()
	{
		// Runtime gave size or length of the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = sc.nextInt();
		
		int a[] = new int[n];  // array creation
		
		    // Gave the element value in runtime
			System.out.println("Please enter " + n + " elements");
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			
			
			// Display the array elements
			System.out.println();
			System.out.println("Array elements");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(i + " index-element " + a[i]);
			}
		
			    // Gave the element in runtime for (Find the element is present in the array or not)
			    System.out.println();
				System.out.println("Please enter find a element");
				int given = sc.nextInt();
				
					// Checking the element present in the array or not
					int count = 0;
					for(int i=0;i<a.length;i++)
					{
						if(given == a[i])
						{
							count++;
						}
					}
		
		// Written for the present or not element in the array condition	
		if(count == 1)
		{
			System.out.println(given + " is PRESENT in the array");
		}
		else
		{
			System.out.println(given + " is NOT PRESENT in the array");
		}
	sc.close();
	}

}

		