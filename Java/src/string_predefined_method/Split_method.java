package string_predefined_method;

import java.util.Scanner;

public class Split_method {
	
	public static void main(String args[])
	{
		Split_method obj = new Split_method();
		             obj.split();
	}
	
//            ###                  Split method 	
	/*
	 * 		When ever space came in a given STRING
	 * 		That before space came character's all together and Store in array as a String
	 * 
	 *   INPUT - String s = "apple is an fruit"
	 *   
	 *   EXPECTED - IN_ARRAY |index|    | 0 |   | 1 |  | 2 |  | 3 | 
	 *                                | apple |  is  |  an  | fruit |
	 *                                
	 *   Without using split method to solving the In given string converting to STRING_ARRAY                             
	 *   
	 */                              
	public void split()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		sc.close();
		
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Space count = " + count);
		
		String a[] = new String[count+1];
		
		String z = "";
		int temp = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				z = z + s.charAt(i); 
			}
			if((s.charAt(i)==' ')||(s.length()-1==i))
			{
				a[temp] = z;
				temp++;
				z="";
			}
		}
		
			for(int i=0;i<a.length;i++)
			{
				System.out.println(i + "-index = " + a[i]);
			}
	}

}
