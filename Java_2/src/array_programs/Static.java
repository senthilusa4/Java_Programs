package array_programs;

import java.util.Scanner;

public class Static {
	
	static int n;
	static int a[];
	
	public static void main(String args[])
	{
		// System.out.println(n);
		// System.out.println(a);
		
		Static obj = new Static();
		       size();
		       element();
		       display();
		
       // System.out.println(n);
	   // System.out.println(a.length);
				       
		       
	}
	
	// This method is used for
	// Gave the array length on runtime  |  ARRAY CREATION
	public static void size()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
	    n = sc.nextInt();
		
	    a = new int[n]; //Array creation
	}
	
	        // This method is used for
	        // Gave the array element value on runtime
			public static void element()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the " + n + " element");
				for(int i=0;i<a.length;i++)
				{
					a[i]= sc.nextInt();
				}
			}
			
					// This method is used for
			        // Display the ARRAY ELEMENTS PRESENT IN THE ARRAY
					public static void display()
					{
						System.out.println("a[] array element's are ");
						for(int i=0;i<a.length;i++)
						{
							System.out.println(a[i]);
						}
					}

}
