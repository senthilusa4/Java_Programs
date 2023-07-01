package collection_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Remove_element {
	
	public static void main(String args[])
	{
		List_Remove_element o = new List_Remove_element();
		
		 List<Integer> w =  o.remove_first();
		 			   System.out.println(w);	              
		               
		 List<Integer> q =  o.remove_last();
		               System.out.println(q);
	}
	
	// In-Given list should remove first 4 elements in a given LIST 
	public List<Integer> remove_first()
	{
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		
		System.out.println(a);
		Iterator<Integer> i = a.iterator();
		
		int temp = 0;
		while(i.hasNext())  // hasNext() method return type boolean
		{
			i.next();      // next() method will return show the element
			i.remove();    // remove() method will remove element in a list
			temp++;
			if(temp==4)
			{
				break;
			}
		}
		System.out.println("Remove first 4 elements in given list");
	//	System.out.println(a);
		
		return a;
	}
	
					// In Given list Should remove last 4 element
					public List<Integer> remove_last()
					{
						List<Integer> a = new LinkedList<Integer>();
						a.add(1);
						a.add(2);
						a.add(3);
						a.add(4);
						a.add(5);
						a.add(6);
						a.add(7);
						a.add(8);
						
						// System.out.println(a);
						
						ListIterator<Integer> p = a.listIterator();
						
						while(p.hasNext())
						{
							p.next();
						}
						
							int temp = 0;
							while(p.hasPrevious())
							{
								p.previous();
								p.remove();
								temp++;
								
								if(temp==4)
								{
									break;
								}
						}
						System.out.println("Remove last 4 elements in given list");
					//	System.out.println(a);
						
						return a;
						
					}
}
