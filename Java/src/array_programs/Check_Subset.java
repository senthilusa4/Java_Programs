package array_programs;

import java.util.Scanner;

public class Check_Subset {
	
	public static void main(String args[])
	{
		Check_Subset obj = new Check_Subset();
		               
		               Static.size();    // Static method  | is Calling for GAVE ARRAY length on runtime     
		               Static.element(); // Static method  | is Calling for GAVE ARRAY elements value on runtime
		               Static.display(); // Static method  | is Calling for DISPLAY the array elements 
	
	        	       obj.subset();             
	}
	
	
		    // This method is used for Checking the array is subset or not
			public void subset()
			{   
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the SUBSET size of array");
				int n = sc.nextInt();
				
				int b[] = new int[n];
				
				System.out.println("Enter the " + n + " Elements");
				for(int i=0;i<b.length;i++)
				{
					b[i] = sc.nextInt();
				}
				
				sc.close();
				
						// LOGIC for checking subset or not
				        // Checking Second_array elements to first_array elements
				        // if the element value is there means should increment the count otherwise do nothing
				        // So actually count is equal to the subset length means its a subset otherwise NOT A SUBSET
						int count =0;
						for(int j=0;j<b.length;j++)
						{
						    for(int i=0;i<Static.a.length;i++)
					      	{
								if(Static.a[i] == b[j])
								{
									count++;
									break;
								}
							}
							
						}
						
						if(count==b.length)
						{
							System.out.println("Given array is SUBSET of an array");
						}
						else
						{
							System.out.println("Given array is NOT A SUBSET of an array");
						}
			}

}


