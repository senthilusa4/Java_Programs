package array_programs;

import java.util.Scanner;

public class Natural_num {
	
	public static void main(String args[])
	{
		Natural_num obj = new Natural_num();
		            obj.natural();
	}
	
	    // This method print natural numbers
		public void natural()
		{
			// Array length get from the Runtime using Scanner class 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array size or length");
			int input = sc.nextInt();
			
			int a[] = new int[input];
			System.out.println("Enter value's");			
				
				for(int i=0;i<a.length;i++) // While runtime get a value from the user
				{
					a[i] = sc.nextInt();
				}
				
				System.out.println("Display User input value's ");
				
				for(int i=0;i<a.length;i++)  // Display the user input values
				{
					System.out.println(a[i]);
				}
		}

}
