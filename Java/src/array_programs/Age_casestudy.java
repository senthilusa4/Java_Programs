package array_programs;

import java.util.Scanner;

public class Age_casestudy {
	
	public static void main(String args[])
	{
		Age_casestudy obj = new Age_casestudy();
		              obj.age();
	}

	
	public static void age()
	{
		// This is for get the input array length value 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length or size of giving person's age");
		int num_person = sc.nextInt();
		
		
		int a[] = new int[num_person];  // Array object creation & DEFINE array length
		
		    // Number of Persons AGE get the in runtime
		    System.out.println("Please enter " + num_person + " Persons AGE");
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			
			sc.close();
			
			    // Display user giving input age 
				System.out.println("Display the user giving age respectively ");
				for(int i=0;i<a.length;i++)
				{
					System.out.println((i+1) + "-Student age is " + a[i]);
				}
					
						// SUM-OF-AGE 
				        int sum = 0;
						System.out.println();
						for(int i=0;i<a.length;i++)
						{
							sum = sum + a[i];
						}
						System.out.println("Sum of the STUDENT AGE " + sum);
						
						
							// AVG | SUM-OF-AGE 
							System.out.println();
							int avg = 0;
							for(int i=0;i<a.length;i++)
							{
							avg = sum / a.length;
							}
						    System.out.println("AVERAGE of Sum STUDENT AGE " + avg);

						    
						    	// REV | Reverse the Respective given age order
						        System.out.println();
						        System.out.println("Reverse the RESPECTIVE GIVEN AGE ORDER");
						        for(int i=a.length-1;i>=0;i--)
						        {
						        	System.out.println((i+1) + "-Student age is " +a[i]);
						        }
						
					
						        	// PRINT EVEN index value
						            System.out.println();
						            System.out.println("EVEN index value");
						            for(int i=0;i<a.length;i++)
						            {
						            	if(i%2 == 0)
						            	{
						            		System.out.println(i + " index value is " + a[i] + " ");
						            	}
						            }
						            
						            	
						            	// PRINT ODD index value
						            	System.out.println();
						            	System.out.println("ODD index value");
						            	for(int i=0;i<a.length;i++)
						            	{
						            		if(i%2 != 0)
						            		{
						            			System.out.println(i + " index value is " + a[i] + " ");
						            		}
						            	}
						            	
						            	
						            			// PRINT SUM OF EVEN index value | SUM OF ODD index value
						            			System.out.println();
						            			int odd = 0;
						            			int even = 0;
						            			for(int i=0;i<a.length;i++)
						            			{
						            				if(i%2 != 0)
						            				{
						            					odd = odd + a[i];
						            				}
						            				else
						            				{
						            					even = even + a[i];
						            				}
						            			}
						            			
						            			System.out.println("Sum of odd index is " + odd);
						            			System.out.println("Sum of even index is " + even);
						            			
						            			// Difference between sum of odd & sum of even (odd-even)
						            			System.out.println();
						            			int diff = odd - even;
						            			System.out.println("Difference between sum of odd & sum of even is  "  + diff);
						            			
	}
	
}	





