package simple_java;

import java.util.Scanner;

public class Tables {
	
	public static void main(String args[])
	{ 
		Tables obj = new Tables();      
		       obj.table();
	}
	
	    // Multiplication Table
		public void table()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the TABLE : ");
			int n = sc.nextInt();
			
			System.out.print("Enter the TABLE RANGE: ");
			int range = sc.nextInt();
			
				for(int i=1;i<=range;i++)
				{
					int a = i*n;
					System.out.println(i + "x" + n + "=" + a);
				}
		}
}


