package array_programs;

import java.util.Scanner;

public class Adjacent_element{
	
	// This method is for 
	//	   # check given element present in the array means provide the adjacent elements
	//     # check given element not-present means Should provide the output (NOT IN THE ARRAY)
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7};
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter element");
		int n = sc.nextInt();
		
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if((n==a[i]) && (i==0))  
			{
				flag = true;
				System.out.println("Left adjacent NOT available");
				System.out.println("Right adjacent is " + a[i+1]);//
			}
			if(n==a[i] && (i==a.length-1))
			{
				flag = true;
				System.out.println("left adjacent is " + a[i-1]);//
				System.out.println("Right adjacent element NOT available");	
			}
			if(n==a[i] && (i!=0) && (i!=a.length-1))
			{
				flag = true;
				System.out.println(" left adjacent is " + a[i-1]);//
				System.out.println("Right adjacent is " + a[i+1]);//
			}
		 }
		
		if(flag==false)
		{
			System.out.println("Given element is not in the array");
		}
		 
	}

}
