package string_programs;

import java.util.Scanner;

public class Palindrome_or_not {
	
	public static void main(String[] args) {
		
		Palindrome_or_not obj = new Palindrome_or_not();
		boolean reverse = obj.reverse();
		System.out.println(reverse);
		
	}
	
	
		public boolean reverse()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string");
			String s = sc.nextLine();
			
			sc.close();
			
			String rev = "";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev = rev + s.charAt(i);
			}
			
			//System.out.print(rev);
			
			System.out.println("Reverse string is : ");
			for(int i=0;i<rev.length();i++)
			{
				System.out.print(rev.charAt(i));
			}
			System.out.println();
			
				if(s.equals(rev))
				{
					return true;
				}
				else
				{
					return false;
				}
		}		
		
}		

