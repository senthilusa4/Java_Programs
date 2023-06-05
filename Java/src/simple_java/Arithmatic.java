package simple_java;

import java.util.Scanner;

public class Arithmatic {
	
	public static void main(String args[])
	  {
		Arithmatic obj = new Arithmatic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value"); 
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		int ans = obj.mul(a, b);
		System.out.println(ans);

	//  System.out.println(obj.mul(a, b));
	  }
	
	public int mul(int a, int b)
	{
		int c = a*b;
		return c;
	}

}
