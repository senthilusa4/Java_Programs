package array_programs;

import java.util.Scanner;

public class SumOf_element_gap {
	
	public static void main(String args[])
	{
		SumOf_element_gap obj = new SumOf_element_gap();
		                  obj.gap();
	}
	
	// This method is used for
	// Adding array 3wise
	public void gap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Arry-size (or) Length");
		int size = sc.nextInt();
		
		int a[] = new int[size]; // Array creation
			
			System.out.println("Enter the Array-elements");
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			
				System.out.print("Array elements are : ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i] + " ");
				}
				
				System.out.println();
				for(int i=0;i<3;i++)
				{
					int ans = 0;
					for(int j=i;j<a.length;j=j+3)
					{
						// System.out.println(a[i] + " + ");
						ans = ans + a[j];
					} 
					System.out.println(ans);
				}
		sc.close();		
	}

}
