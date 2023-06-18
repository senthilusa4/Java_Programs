package string_programs;

import java.util.Scanner;

public class Split_String {
	
	public static void main(String[] args)
	{
		Split_String obj  = new Split_String();
		             obj.split();
	}
	
	/* 
	 * 		This method is for 
	 * 
	 *   ## Using SPLIT() method || convert string to string_array (Based on space to split) 
	 *   ## Then each string_array index string first character should change to caps(UPPERCASE)
	 */
		public void split()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String a = sc.nextLine();
			
			sc.close();
			
			String s[] = a.split(" ");
			
			for(String q : s)
			{
				System.out.println(q + " ");
			}
			
				for(int i=0;i<s.length;i++)
				{
					char c = s[i].charAt(0);
					int w = (int)c;
					if((w<=122) && (97<=w))
					{
						char c1 = (char)(w-32);
						s[i] = s[i].replace(c, c1);
					}
				}
				
			System.out.println();	
			System.out.println("After changes made a array is");
			for(String q : s)
			{
				System.out.println(q + " ");
			}
			
			
		}
}
