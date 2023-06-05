package array_programs;

import java.util.Scanner;

public class Count_element {
	
	public static void main(String args[])
	{
		Count_element obj = new Count_element();
		              obj.count();
	}
	
	public void count()
	{
	// Runtime gave the size
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array ");
	int size = sc.nextInt();
	
	int a[] = new int[size]; // ARRAY CREATION
	
	// Runtime gave the element
	System.out.println("Enter the elements");
	for(int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	    // Display the array
	 	for(int i=0;i<a.length;i++)
	 	{
	 		System.out.println(i + " index -" + a[i]);
	 	}
	 	
	 	System.out.println("Please enter the search element");
	 	int given = sc.nextInt();
	 	System.out.println("Search element is " + given);
	 	
	        // LOGIC for count of the element 	
	 		int count = 0;
	 		for(int i=0;i<a.length;i++)
	 		{
	 			if(given == a[i])
	 			{
	 				count++;
	 			}
	 		}
	 	
	 		    // CHECKING THE COUNT OF THE ELEMENT OR NOT PRESENT LOGIC
	 			if(count > 0) {
	 				System.out.println(given + " present " + count + " times");
	 			}
	 			else {
	 				System.out.println(given +" -element is Not present in the array");
	 			}
	 	

	}	
}
