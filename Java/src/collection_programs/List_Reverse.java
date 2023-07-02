package collection_programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class List_Reverse {
	
	public static void main(String args[])
	{	
		List_Reverse obj = new List_Reverse();
		          List<String> a = obj.input_list();
		                           System.out.println(a);
		                           obj.reverse(a);
		                           obj.predefine_reverse(a);
		                           
	}

	// This method is for Input-List on runtime
	public List<String> input_list()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size (or) Length");
		int n = sc.nextInt();
		
		List<String> a = new LinkedList<String>();
		
		System.out.println("Enter " + n + "- String Elements ");
		for(int i=1;i<=n;i++)
		{
			String z = sc.next();
			a.add(z);
		}
		
		sc.close();
		return a;
	}
	
						// This method is for array elements store to list in a reverse order
						// INPUT - Array {1,2,3}
						// OUTPUT - List [3,2,1]
						public void reverse(List<String> l)
						{
							List<String> x = new LinkedList<String>();
							
							ListIterator<String> z = l.listIterator();
							
							while(z.hasNext())
							{
								z.next();
							}
							
							while(z.hasPrevious())
							{
								x.add(z.previous());
							}
							
							System.out.println();
							System.out.println("Reverse LIST ");
							System.out.println(x);
						    
						}
						
									// Predefine method based reverse a List
									public void predefine_reverse(List<String> l)
									{
										Collections.reverse(l);  // It provide Array --to-- ReverseList 
										
										System.out.println();
										System.out.println("Predefine method based reverse LIST"); 
										System.out.println(l);
									}
						
}