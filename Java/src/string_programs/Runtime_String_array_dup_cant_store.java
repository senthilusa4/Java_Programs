package string_programs;

import java.util.Scanner;

public class Runtime_String_array_dup_cant_store {
	
	public static void main(String args[])
	{
		Runtime_String_array_dup_cant_store obj = new Runtime_String_array_dup_cant_store();
											obj.stored_in_array();
	}
	
	/*
	 * 		CHECKING ||  GIVEN INPUT IS ALREADY PRESENT IN A ARRAY MEANS THAT ONE NOT STORE TO ARRAY
	 * 
	 * 		### In-RUNTIME CHECKING 
	 *      
	 *      IF GIVEN STRING IS ALREADY PRESENT IN A ARRAY MEAN'S THAT STRING_ELEMENT CAN'T STORE TO AN ARRAY
	 * 
	 * 		In runtime give input string value's (Using scanner)
	 *      Is already present means That element can't to array
	 */
	public void stored_in_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		String a[] = new String[n];
		
		System.out.println("Enter the String name's");
		for(int i=0;i<a.length;i++)
		{
			String s = sc.next();
			boolean f = false;
			
			for(int j=0;j<a.length;j++)
			{
				if(s.equals(a[j]))
				{
					f=true;
					break;
				}
			}
				if(f==false)
				{
					a[i]=s;
				}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	sc.close();	
	}

}
