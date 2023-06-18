package string_programs;

import java.util.Scanner;

public class Reverse_string {
	
	public static void main(String[] args) {
		
		Reverse_string obj = new Reverse_string();
		               obj.reverse();
	}
	
	public void reverse()
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
		
	}

}
