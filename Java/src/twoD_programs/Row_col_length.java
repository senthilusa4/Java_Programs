package twoD_programs;

import java.util.Scanner;

public class Row_col_length {
	
	public static void main(String args[])
	{
		Row_col_length obj = new Row_col_length();
		int input[][] = obj.twoD_array();
		                obj.sum_of_row_length(input);
		                obj.sum_of_col_length(input);
	}
	
	
	// This method is for 2-D array input
	// Gave the input on runtime || Display the 2-D array
	public int[][] twoD_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row length");
		int r = sc.nextInt();
		
		System.out.println("Enter the coloumn length");
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
				// Display the 2D array
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
					 System.out.print(a[i][j] + " ");	
					}
					System.out.println();
				}
	return a;	
	}
	
				// This method is for 
				// Sum of the each row length 
				public void sum_of_row_length(int a[][])
				{
					System.out.println();
					for(int i=0;i<a.length;i++)
					{
						int sum =0;
						for(int j=0;j<a[i].length;j++)
						{
							sum = sum + a[i][j]; 
						}
						System.out.println(i + " row total is " + sum);
					}
				}
				
				
				// This method is for 
				// Sum of the each coloumn length 
				public void sum_of_col_length(int a[][])
				{
					System.out.println();
					for(int i=0;i<a[0].length;i++)
					{
						int col =0;
						for(int j=0;j<a.length;j++)
						{
							col = col + a[j][i]; 
						}
						System.out.println(i + "col total is " + col);
					}
				}


}
