package twoD_programs;

import java.util.Scanner;

public class Sum_pro_diff_two_array {
	
	// This method is for
	// | Sum | Difference | Product | of the 2D-array
	public static void main(String args[])
	{
		Sum_pro_diff_two_array obj = new Sum_pro_diff_two_array();
		int first[][] = obj.first_array();
		int second[][] = obj.second_array();
		                 obj.sum_two_array(first,second);
		                 obj.diff_two_array(first,second);
		                 obj.pro_two_array(first,second);
	}
	
	// This method is for Gave the 2D array input (Elements) while runtime
	public int[][] first_array()
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
	return a;	
	}
	
				public int[][] second_array()
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
				return a;	
				}
				
							// Sum the given two array 
							public void sum_two_array(int a[][],int b[][])
							{
								int c[][] = new int[a.length][a[0].length];
								
								for(int i=0;i<a.length;i++)
								{
									for(int j=0;j<a[i].length;j++)
									{
										c[i][j] = b[i][j] + a[i][j];
									}
								}
								System.out.println();
								System.out.println("SUM OF TWO ARRAY is " );
								for(int i=0;i<a.length;i++)
								{
									for(int j=0;j<a[i].length;j++)
									{
										System.out.print(c[i][j] + " ");
									}
									System.out.println();
								}
								
							}
							
										// Difference the given two array
										public void diff_two_array(int a[][],int b[][])
										{
											int c[][] = new int[a.length][a[0].length];
											
											for(int i=0;i<a.length;i++)
											{
												for(int j=0;j<a[i].length;j++)
												{
													c[i][j] = b[i][j] - a[i][j];
												}
											}
											System.out.println();
											System.out.println("DIFFERENCE OF TWO ARRAY is " );
											for(int i=0;i<a.length;i++)
											{
												for(int j=0;j<a[i].length;j++)
												{
													System.out.print(c[i][j] + " ");
												}
												System.out.println();
											}
											
										}

													// Product the given two array
													public void pro_two_array(int a[][],int b[][])
													{
														int c[][] = new int[a.length][a[0].length];
														
														for(int i=0;i<a.length;i++)
														{
															for(int j=0;j<a[i].length;j++)
															{
																c[i][j] = b[i][j] * a[i][j];
															}
														}
														System.out.println();
														System.out.println("PRODUCT OF TWO ARRAY is " );
														for(int i=0;i<a.length;i++)
														{
															for(int j=0;j<a[i].length;j++)
															{
																System.out.print(c[i][j] + " ");
															}
															System.out.println();
														}
														
													}
}
