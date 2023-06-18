package string_programs;

import java.util.Scanner;

public class First_letter_upperCase {
	
	public static void main(String[] args) {
		
		First_letter_upperCase obj = new First_letter_upperCase();
		                       obj.first_letter_upper();
								
	}
	
	
	// This method is for to change Each Word first letter should be a caps(Upper-case)
	
	/* 
	 * 		### First change a string to char array
	 *      
	 *          1. Followed by an space is change to caps
	 *          
	 *          ### first type-casting a char to int (respective char)  ||  
	 *              Then, that ascii_value minus 32(a-32) (a-ascii is 97)  97-32 means = 65
  	 *              
  	 *          ### Then again type_casting to int to char (respective int)
	 *              That ascii_value respective char will store in to same index
	 *              
	 *              --if--  whenever not equal space came & also that should lower_case char means it should change to UPPER_CASE
	 *                    
	 *              --else if-- Whenever space equal index came & also with in a range of lower_case ASCII-VALUE means only
	 *                          
	 *                          # Index+1 should change to caps(UPPERCASE) based on type_casting       
	 *          
	 */
	public void first_letter_upper()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		
		sc.close();
		
		//String s1 = "";
		
		char w[] = s.toCharArray(); 
		
		boolean flag = false;
		for(int i=0;i<w.length;i++)
		{
			if((w[i] != ' ') && (flag ==false))
			{
				flag = true;
				if((w[i]>=97) && (w[i]<=122))
				{	
					int n = ((int)w[i]) - 32;
					char c = (char)n;
					w[i]=c;
		     	}
		    }	
			
			else if((w[i]==' ') && (flag = true))
			{
				if((w[i+1]!=' ') && (w[i+1]>=97) && (w[i+1]<=122))
				{
					int n = ((int)w[i+1]) - 32;
					char c = (char)n;
					w[i+1]=c;
			    }
			}
		}
		
				for(int i=0;i<w.length;i++)
				{
					System.out.print(w[i]);
				}
		
	}	

}
