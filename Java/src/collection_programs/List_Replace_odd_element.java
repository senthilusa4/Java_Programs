package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class List_Replace_odd_element {
	
	public static void main(String[] args) 
	{
		List_Replace_odd_element obj = new List_Replace_odd_element();
		                         obj.replace();
	}
	
	// In list when_ever odd element came that element should replace to 99,
	//		# Example  [1,2,3,4,5]
	//      # Output   [99,2,99,4,99]
	public void replace()
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(9);
		l.add(7);
		l.add(8);
		l.add(99);
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)%2!=0)
			{
				l.set(i, 99);
			}
		}
		
		System.out.println("In a LIST Every odd element value change to 99 ");
		System.out.println(l);
	}

}
