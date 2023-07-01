package collection_programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class List_Remove_dup {
	
	public static void main(String[] args)
	{
		List_Remove_dup obj = new List_Remove_dup();
		                List<Integer> a = obj.list();
		                System.out.println(a);
		                obj.remove_dup(a);
		                
		                
	}
	
	// This method is for INPUT-LIST
	public List<Integer> list()
	{
		List<Integer> l = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter List elements count");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + "- Integer Elements ");
		for(int i=1;i<=n;i++)
		{
			int z = sc.nextInt();
			l.add(z);
		}
		
		sc.close();
		return l;
	}
	
					// In given list remove DUPLICATE elements
					public void remove_dup(List<Integer> l)
					{
						for(int i=0;i<l.size()-1;i++)
						{
							for(int j=i+1;j<l.size();j++)
							{
								if(l.get(i)==l.get(j))
								{								  // Duplicate presence all are 	
									l.set(j, Integer.MIN_VALUE);  // Set to one constant value 
								}                                
							}
						}
								
								ListIterator<Integer> z = l.listIterator(); 
								
								// When-ever That changed value is equal to the element all remove
								while(z.hasNext())
								{
									if(z.next()==Integer.MIN_VALUE)
									{
										z.remove();
									}	
								}
											
								System.out.println(l);
					}
}
