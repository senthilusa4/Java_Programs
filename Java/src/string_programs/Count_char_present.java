package string_programs;

import java.util.Scanner;

public class Count_char_present {
	
	private String virat;
	
	// Constructor
	Count_char_present(String virat)
	{
		this.virat = virat;
	}
	
			// Setter | Getter method
			public void set_virat(String virat)
			{
				this.virat = virat;
			}
			
			public String get_virat(String virat)
			{
				return virat;
			}
			
					// this method is for logic for finding the Given character how many time's present in the string
					/*
					 * 		n.charAt(i) 
					 *  
					 *      	# n - string
					 *          # charAt - In the string charAt present where
					 *          # i - iteration
					 */
					public int char_count(String n,char c)
					{	
						int count =0;
						for(int i=0;i<n.length();i++)
						{
							if(c==n.charAt(i))
							{
								count++;
							}
						}
					return count;
					}
	
	
	// Main method
					
	//	  ### In runtime gave the string
	//    ### And also runtime gave the character at present the string
	//    ### 				
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String n = sc.nextLine();
		
		System.out.println("Enter the searching charactor");
		char c = sc.next().charAt(0);
		
		sc.close();
		
		Count_char_present s = new Count_char_present(n);
		int answer = s.char_count(n,c);
		System.out.println(answer);
	}

}
