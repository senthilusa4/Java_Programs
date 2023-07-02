package collection_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L_Array_to_list {
	
	public static void main(String[] args)
	{
		L_Array_to_list obj = new L_Array_to_list();
		     int a[] =  obj.input_array();  // return type
		                obj.array_to_list(a);
	}
	
	/*
	 * 		GIVEN = Array ||  EXPECTED is Array should convert LIST
	 * 
	 * 		### INPUT = {1,2,3,4,5} ARRAY
	 * 
	 * 		### OUTPUT = [1,2,3,4,5]  LIST
	 * 
	 */
	
	public int[] input_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size (or) Length");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter "+ n + "-elements");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}

			System.out.println("Entered element array is");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i] + " ");
			}
		
		sc.close();
		return a;
	}
	
	public void array_to_list(int a[])
	{
		List<Integer> l = new ArrayList<Integer>();
		
		//	List l = Arrays.asList(a);  // ## This predefined method is convert ARRAY to LIST
		
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
		// l.add(10);
		
		System.out.println();
		System.out.println("Array converting to List is");
		System.out.println(l);
	}

}