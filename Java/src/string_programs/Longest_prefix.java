package string_programs;

import java.util.Arrays;

public class Longest_prefix {

		public static void main(String args[])
		{
			Longest_prefix o = new Longest_prefix();
			System.out.println(o.prefix());
			
		}

		// TO FIND GIVEN STRING ARRAY || LONGEST PREFIX
		
		/*
		 * 		Step-1 - Arrays.sort [each string arrange lexographically order]
		 * 				 array change based on the Arrays.sort(lexographic) (attendance order)
		 * 
		 * 		Step-2 - check first index array & last index array string value's
		 * 
		 */
		
		public String prefix() {
			
			String strs[] = { "flower","flow","flight","float"};
			
			System.out.println("BEFORE Lexographically Based sort");
			for(int i=0;i<strs.length;i++)
			{
				System.out.println(strs[i]);
			}
			System.out.println();
			
			
				Arrays.sort(strs);
				
				System.out.println("AFTER Lexographically Based sort");
				for(int i=0;i<strs.length;i++)
				{
					System.out.println(strs[i]);
				}
				System.out.println();
				
				
				String str1 = strs[0];
				String str2 = strs[strs.length-1];
				
				System.out.println("Longest prefix is :");
				int i = 0;
				while(i<str1.length())
				{
				    if(str1.charAt(i)==str2.charAt(i))
				    {
				        i++;
				    }
				    else
				    {
				        break;
				    }
				}
				
				return i==0?"":str1.substring(0,i);  //   LIKE IF ELSE IF, i==0 means ? RETURN :
				    }                                //              ELSE, : AFTER WILL RETURN
}