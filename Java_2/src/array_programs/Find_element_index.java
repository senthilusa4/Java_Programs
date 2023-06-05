package array_programs;

import java.util.Scanner;

public class Find_element_index {
	
	public static void main(String args[])
	{
		Find_element_index obj = new Find_element_index();
		                   obj.index();
	}
	
		public void index()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of the array ");
			int size = sc.nextInt();
			
			int a[] = new int[size];
			
			System.out.println("Enter the elements");
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			
			 	for(int i=0;i<a.length;i++)
			 	{
			 		System.out.println(a[i]);
			 	}
			 	
			 	System.out.println("Please enter the search element");
			 	int search_num = sc.nextInt();
			 	System.out.println(search_num);

			 	    // Logic for finding the search number present in which index
			 	    boolean flag = false;
			 		for(int i=0;i<a.length;i++)
			 		{
			 			if(search_num == a[i])
			 			{
			 				flag = true;
			 				System.out.println(search_num + " Present in " + i + " Index");
			 				break;
			 			}
			 		}
			 		
			 			if(flag == false)
			 			{
			 				System.out.println(search_num + " Not present in the array");
			 			}
			 			
			 						
		}
}

