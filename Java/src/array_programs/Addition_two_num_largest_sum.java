package array_programs;

import java.util.Scanner;

public class Addition_two_num_largest_sum {
	
	public static void main(String args[])
	{
		Addition_two_num_largest_sum obj = new Addition_two_num_largest_sum();
		                             obj.largest_sumOf_two();
    }
	
	/*
	 *  This method is for finding the largest-two number addition
	 *  (EX) 12 31 10 6 40   |  add 12+31= 44   31+10 = 41  10+6=16    6+40=46  output is 46
	 *  (EX) 0 5 6 0 9 0 0 1  | add 0+5=5 5+6=11 6+0=6 0+9=9 9+0=9 0+0=0 0+1=1  output is 11   
	 */
	public void largest_sumOf_two()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Please enter the array " + n + " Values");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		        // Add first two value and set its max
		        // Then using Loop to add next two value's and it's goes to till end
		        // Checking (IF-condition) to first max is greater or second max is greater
				int max = a[0]+a[1];  
				for(int i=1;i<a.length-1;i++)
				{
					int max1 = a[i] + a[i+1];
			
					if(max < max1)  
					{
						max =max1;
					}
			 			
				}
		
				System.out.println("Largest ADDITION of two value's in given array "+max);
	}

}
