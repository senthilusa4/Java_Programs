package twoD_programs;

import java.util.Scanner;

public class Jagged_array {
	
	// This method is for 
	// How to input the jagged array
	// How to sum the jagged array
	public static void main(String args[])
	{
		Jagged_array obj = new Jagged_array();
		             obj.jagged();
	}
	
		public void jagged()
		{
			Scanner sc = new Scanner(System.in);
			
			int a[][] = new int[3][];
			a[0] = new int[1];
			a[1] = new int[2];
			a[2] = new int[3];
			
			System.out.println("Enter the array a[3][] element");
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]= sc.nextInt();
				}
				System.out.println();
			}
			
			// Display the array
			System.out.println("Display the a[][] jagged array is");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
	
					int b[][] = new int[3][];
					b[0] = new int[1];
					b[1] = new int[2];
					b[2] = new int[3];
					
					System.out.println("Enter the array a[3][] element");
					
					for(int i=0;i<b.length;i++)
					{
						for(int j=0;j<b[i].length;j++)
						{
							b[i][j]= sc.nextInt();
						}
						System.out.println();
					}
					
					// Display the array
					System.out.println("Display the b[][] jagged array is");
					for(int i=0;i<b.length;i++)
					{
						for(int j=0;j<b[i].length;j++)
						{
							System.out.print(b[i][j] + " ");
						}
						System.out.println();
					}
					
							int c[][] = new int[3][];
							c[0] = new int[1];
							c[1] = new int[2];
							c[2] = new int[3];
							
							for(int i=0;i<c.length;i++)
							{
								for(int j=0;j<c[i].length;j++)
								{
									c[i][j]= a[i][j] + b[i][j];
								}
								System.out.println();
							}
							
							// Display the Sum of jagged array
							System.out.println("Display the b[][] jagged array is");
							for(int i=0;i<c.length;i++)
							{
								for(int j=0;j<c[i].length;j++)
								{
									System.out.print(c[i][j] + " ");
								}
								System.out.println();
							}
		
		}

}
