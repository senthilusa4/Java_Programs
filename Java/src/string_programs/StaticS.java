package string_programs;

import java.util.Scanner;

public class StaticS {
	
	public static String s;
	
	public static void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string");
		s = sc.nextLine();
		
		sc.close();
	}

}
