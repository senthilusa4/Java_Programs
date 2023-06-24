package twoD_programs;

import java.util.Scanner;

public class Transpose_array {
	
	// Transpose the given array
	
	// 		# Input    - 1 2 3
	//                   4 5 6
	
	//      # OUTPUT   - 1 4
	//                   2 5
	//                   3 6
	public static void main(String args[])
	{
		Transpose_array obj = new Transpose_array();
		int input[][]=obj.transpose();
		              obj.result_transpose(input);
	}
	
		// This method is for
		// Gave the input (elements) while runtime
		public int[][] transpose()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row length");
			int r = sc.nextInt();
			
			System.out.println("Enter the coloumn length");
			int c = sc.nextInt();
			
			int a[][] = new int[r][c];
			
			    System.out.println();
			    System.out.println("GIVEN ARRAY ");
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						a[i][j] = sc.nextInt();
					}
					System.out.println();
				}
				
				// Display the 2D-array
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
				sc.close();
		return a;	
		}
					// This method is for 
					// TRANSPOSE the given array
					public void result_transpose(int a[][])
					{
						int result[][] = new int[a[0].length][a.length];
						
						for(int i=0;i<result.length;i++)
						{
							for(int j=0;j<result[i].length;j++)
							{
								result[i][j] = a[j][i];
							}
						System.out.println();	
						}
						
						// Display
						System.out.println("AFTER transpose array is");
						for(int i=0;i<result.length;i++)
						{
							for(int j=0;j<result[i].length;j++)
							{
								System.out.print(result[i][j] + " ");
							}
						System.out.println();
						}
					}

}
