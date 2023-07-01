package collection_programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Add_element_next {
	
	public static void main(String[] args)
	{
		List_Add_element_next obj = new List_Add_element_next();
		                      obj.add_next();
		                      obj.previous_next();
	}
	
	// In List element-5 came means add 999 next to it
	// Example -- [1,5,7,5,5]
	// Output --[1,5,999,7,5,999,5,999]  ADD-NEXT-TO-IT
	public void add_next()
	{
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(5);
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(5);
		l.add(5);
		
		int n = 5;
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==n)
			{
				l.add(i+1, 999);
			}
		}
		
		System.out.println(l);
	}
						// In List element-5 came means add 999 next_previous to it
						// Example -- [1,5,7,5,5]
						// Output --[1,999,5,7,999,5,999,5]  ADD-NEXT_PREVIOUS-TO-IT
						public void previous_next()
						{
							List<Integer> l = new LinkedList<Integer>();
							
							l.add(5);
							l.add(2);
							l.add(5);
							l.add(7);
							l.add(8);
							l.add(5);
							l.add(5);
							
							ListIterator<Integer> z = l.listIterator();
							
							while(z.hasNext())
							{
								z.next();
							}
							
							while(z.hasPrevious())
							{
								if(z.previous()==5)
								{
									z.add(888);
								}
							}
							
							System.out.println(l);
						}

}
